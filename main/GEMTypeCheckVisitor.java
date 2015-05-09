import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import org.antlr.v4.runtime.misc.NotNull;

@SuppressWarnings("unchecked")

public class GEMTypeCheckVisitor extends GEMBaseVisitor <Object> {
	private static final Integer VAR_UNDEFINED = 1;
	private static final Integer VAR_DEFINED = 2;
	private static final Integer INVALID_OP = 3;
	private static final Integer RETURN_MISMATCH = 4;
	private static final Integer PARAS_MISMATCH = 5;
	private static final Integer ILLEGAL_NAME = 6;
	private static final Integer INVALID_UOP = 7;
	private LinkedList<HashMap<String, VariableSymbol>> symbols = new LinkedList<HashMap<String, VariableSymbol>>();
	private HashMap<String, VariableSymbol> globalSymbols = new HashMap<String, VariableSymbol>();
	private LinkedList<VariableSymbol> lastType = new LinkedList<VariableSymbol>();
	private static final HashMap<Integer, String> errorMessage;
	static {
		errorMessage = new HashMap<Integer, String>();
		errorMessage.put(VAR_DEFINED, "Duplicate definition of %s.\n");
		errorMessage.put(INVALID_OP, "Invalid operation on %s and %s.\n");
		errorMessage.put(INVALID_UOP, "Invalid operation on %s.\n");
	}
	
	private void ce(int row, int col, int errno, String msg) {
		System.err.print("GEM Error on line " + row + " at position " + col + ": ");
		System.err.printf(errorMessage.get(errno), msg);
	}
	
	private void ce(int row, int col, int errno, VariableSymbol vs1) {
		System.err.print("GEM Error on line " + row + " at position " + col + ": ");
		StringBuilder arrayBrackets = new StringBuilder();
		for (int i = 0; i < vs1.arrayDimension; i++) {
			arrayBrackets.append("[]");
		}
		System.err.printf(errorMessage.get(errno), vs1.type + arrayBrackets.toString());
	}
	
	private void ce(int row, int col, int errno, VariableSymbol vs1, VariableSymbol vs2) {
		System.err.print("GEM Error on line " + row + " at position " + col + ": ");
		StringBuilder arrayBrackets1 = new StringBuilder();
		for (int i = 0; i < vs1.arrayDimension; i++) {
			arrayBrackets1.append("[]");
		}
		StringBuilder arrayBrackets2 = new StringBuilder();
		for (int i = 0; i < vs1.arrayDimension; i++) {
			arrayBrackets2.append("[]");
		}
		System.err.printf(errorMessage.get(errno), vs1.type + arrayBrackets1.toString(), vs2.type + arrayBrackets2.toString());
	}
	
	private boolean checkType(VariableSymbol vs1, VariableSymbol vs2) {
		if (vs1.type.equals(vs2.type) && vs1.arrayDimension == vs2.arrayDimension) {
			return true;
		}
		return false;
	}
	
	private VariableSymbol seekVar(String id) {
		int i;
		for (i = symbols.size()-1; i >= 0; i--) {
			HashMap<String, VariableSymbol> scope = symbols.get(i);
			if (scope.containsKey(id)) {
				VariableSymbol res = scope.get(id);
				return res;
			}
		}
		return seekVarGlobal(id);
	}
	
	private VariableSymbol seekVarGlobal(String id) {
		if (globalSymbols.containsKey(id)) {
			return globalSymbols.get(id);
		}
		return null;
	}
	
	@Override public VariableSymbol visitCompilationUnit(@NotNull GEMParser.CompilationUnitContext ctx) {
		for (GEMParser.OutervariableDeclarationContext vd: ctx.outervariableDeclaration()) {
			visit(vd);
		}
		for (GEMParser.MethodDeclarationContext md : ctx.methodDeclaration()) {
			visit(md);
		}
		return null;
	}
	
	@Override public Object visitMethodDeclaration(@NotNull GEMParser.MethodDeclarationContext ctx) {
		HashMap<String, VariableSymbol> scope = new HashMap<String, VariableSymbol>();
		symbols.push(scope);
		VariableSymbol varTemplate = null;
		if (ctx.type() != null) {
			varTemplate = (VariableSymbol) visit(ctx.type());
			varTemplate.isFunction = true;
		} else {
			varTemplate = new VariableSymbol("void", true, null);
		}
		lastType.push(varTemplate);
		ArrayList<VariableSymbol> paras = (ArrayList<VariableSymbol>) visit(ctx.parameters());
		varTemplate.paras = paras;
		if (ctx.methodBody() != null) {
			visit(ctx.methodBody());
		}
		lastType.pop();
		symbols.pop();
		return null;
	}
	
	@Override public ArrayList<VariableSymbol> visitParameters(@NotNull GEMParser.ParametersContext ctx) {
		return (ArrayList<VariableSymbol>) visit(ctx.parameterList());
	}
	
	@Override public ArrayList<VariableSymbol> visitParameterList(@NotNull GEMParser.ParameterListContext ctx) {
		ArrayList<VariableSymbol> paras = new ArrayList<VariableSymbol>();
		for (int i = 0; i < ctx.parameter().size(); i++) {
			VariableSymbol para = (VariableSymbol) visit(ctx.parameter(i));
			paras.add(para);
		}
		return paras;
	}
	
	@Override public Void visitParameter(@NotNull GEMParser.ParameterContext ctx) {
		VariableSymbol varTemplate = (VariableSymbol) visit(ctx.type());
		
		return null;
	}
	
	@Override public VariableSymbol visitOutervariableDeclaration(@NotNull GEMParser.OutervariableDeclarationContext ctx){
		VariableSymbol varTemplate = (VariableSymbol) visit(ctx.type());
		// Put type in the lastType stack
		lastType.push(varTemplate);
		visit(ctx.variableDeclarators());
		lastType.pop();
		return null;
	}
	
	@Override public Object visitVariableDeclarators(@NotNull GEMParser.VariableDeclaratorsContext ctx) {
		for (int i = 0; i < ctx.variableDeclarator().size(); i++) {
			GEMParser.VariableDeclaratorContext vd = ctx.variableDeclarator(i);
			visit(vd);
		}
		return null;
	}
	
	@Override public String visitVariableDeclarator(@NotNull GEMParser.VariableDeclaratorContext ctx) {
		String varName = (String) visit(ctx.variableDeclaratorId());
		if (ctx.variableInitializer() != null) {
			VariableSymbol init = (VariableSymbol) visit(ctx.variableInitializer());
			if (!checkType(lastType.peek(), init)) {
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, lastType.peek(), init);
			}
		}
		globalSymbols.put(varName, new VariableSymbol(lastType.peek()));
		return varName;
	}
	
	@Override public VariableSymbol visitVariableInitializer(@NotNull GEMParser.VariableInitializerContext ctx) {
		return (VariableSymbol) visit(ctx.getChild(0));
	}
	
	@Override public String visitVariableDeclaratorId(@NotNull GEMParser.VariableDeclaratorIdContext ctx) {
		String varName = ctx.Identifier().getText();
		if (seekVar(varName) != null) {
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), VAR_DEFINED, varName);
			return null;
		}
		return varName;
	}
	
	@Override public VariableSymbol visitType(@NotNull GEMParser.TypeContext ctx) {
		int arrayD = (ctx.getChildCount() - 1) / 2;
		VariableSymbol type = new VariableSymbol(ctx.getChild(0).getText(), arrayD);
		return type;
	}
	
	@Override public VariableSymbol visitPrimary(@NotNull GEMParser.PrimaryContext ctx) {
		VariableSymbol v = null;
		if (ctx.expression() != null) {
			v = (VariableSymbol) visit(ctx.expression());
		} else if (ctx.literal() != null) {
			v = (VariableSymbol) visit(ctx.literal());
		} else if (ctx.Identifier() != null) {
			String varName = ctx.Identifier().getText();
			v = seekVar(varName);
		}
		return v;
	}
	
	@Override public VariableSymbol visitLiteral(@NotNull GEMParser.LiteralContext ctx) {
		VariableSymbol v = null;
		if (ctx.IntegerLiteral() != null) {
			v = new VariableSymbol("int");
		} else if (ctx.FloatingPointLiteral() != null) {
			v = new VariableSymbol("double");
		} else if (ctx.StringLiteral() != null) {
			v = new VariableSymbol("String");
		} else if (ctx.BooleanLiteral() != null) {
			v = new VariableSymbol("boolean");
		} else if (ctx.getText().equals("null")) {
			v = new VariableSymbol("null");
		}
		return v;
	}
	
	@Override public VariableSymbol visitBinRelExpr(@NotNull GEMParser.BinRelExprContext ctx) {
		VariableSymbol leftOperand = (VariableSymbol) visit(ctx.expression(0));
		VariableSymbol rightOperand = (VariableSymbol) visit(ctx.expression(1));
		VariableSymbol res = new VariableSymbol("error");
		if(leftOperand.type.equals("error")||rightOperand.type.equals("error")){
			res = new VariableSymbol("error");
			return res;
		}
		if(leftOperand.type.equals("String")||leftOperand.type.equals("boolean")||leftOperand.type.equals("null")||rightOperand.type.equals("String")||rightOperand.type.equals("boolean")||rightOperand.type.equals("null")){
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, leftOperand, rightOperand);
			res = new VariableSymbol("boolean", 0);
		}
		return res;
	}
	
	@Override public VariableSymbol visitBinEqExpr(@NotNull GEMParser.BinEqExprContext ctx){
		VariableSymbol res = null;
		VariableSymbol leftOperand = (VariableSymbol) visit(ctx.expression(0));
		VariableSymbol rightOperand = (VariableSymbol) visit(ctx.expression(1));
		if(leftOperand.type.equals("error")||rightOperand.type.equals("error")){
			res = new VariableSymbol("error");
			return res;
		}
		if(leftOperand.arrayDimension>0||rightOperand.arrayDimension>0){
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, leftOperand, rightOperand);
			res = new VariableSymbol("error");
			return res;
		}
		if(leftOperand.type.equals(rightOperand.type)||(((leftOperand.type.equals("int")||leftOperand.type.equals("double"))&&((rightOperand.type.equals("int")||rightOperand.type.equals("double")))))){
			res = new VariableSymbol("boolean", 0);
			return res;
		}
		ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, leftOperand, rightOperand);
		return res;
	}
	
	@Override public VariableSymbol visitBinAndExpr(@NotNull GEMParser.BinAndExprContext ctx){
		VariableSymbol res = null;
		VariableSymbol leftOperand = (VariableSymbol) visit(ctx.expression(0));
		VariableSymbol rightOperand = (VariableSymbol) visit(ctx.expression(1));
		if(leftOperand.type.equals("error")||rightOperand.type.equals("error")){
			res = new VariableSymbol("error");
			return res;
		}
		if(leftOperand.arrayDimension>0||rightOperand.arrayDimension>0){
			res = new VariableSymbol("error");
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, leftOperand, rightOperand);
			return res;
		}
		if(!leftOperand.type.equals("boolean")||!rightOperand.type.equals("boolean")){
			res = new VariableSymbol("error");
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, leftOperand, rightOperand);
			return res;
		}
		res = new VariableSymbol("boolean",0);
		return res;
	}

	@Override public VariableSymbol visitBinOrExpr(@NotNull GEMParser.BinOrExprContext ctx){
		VariableSymbol res = null;
		VariableSymbol leftOperand = (VariableSymbol) visit(ctx.expression(0));
		VariableSymbol rightOperand = (VariableSymbol) visit(ctx.expression(1));
		if(leftOperand.type.equals("error")||rightOperand.type.equals("error")){
			res = new VariableSymbol("error");
			return res;
		}
		if(leftOperand.arrayDimension>0||rightOperand.arrayDimension>0){
			res = new VariableSymbol("error");
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, leftOperand, rightOperand);
			return res;
		}
		if(!leftOperand.type.equals("boolean")||!rightOperand.type.equals("boolean")){
			res = new VariableSymbol("error");
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, leftOperand, rightOperand);
			return res;
		}
		res = new VariableSymbol("boolean",0);
		return res;
	}
	
	@Override public VariableSymbol visitAssignExpr(@NotNull GEMParser.AssignExprContext ctx){
		VariableSymbol res = null;
		VariableSymbol leftOperand = (VariableSymbol) visit(ctx.expression(0));
		VariableSymbol rightOperand = (VariableSymbol) visit(ctx.expression(1));
		if(leftOperand.type.equals("error")||rightOperand.type.equals("error")){
			res = new VariableSymbol("error");
			return res;
		}
		if((leftOperand.type.equals("int")||leftOperand.type.equals("double"))&&(rightOperand.type.equals("int")||rightOperand.type.equals("double")))
		{
			if(leftOperand.type.equals("double")||rightOperand.type.equals("double")){
				res = new VariableSymbol("double", 0);
			}
			else{
				res = new VariableSymbol("int", 0);
			}
			return res;
		}
		if(leftOperand.arrayDimension!=rightOperand.arrayDimension||!leftOperand.type.equals(rightOperand.type)){
			res = new VariableSymbol("error");
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, leftOperand, rightOperand);
			return res;
		}
		res = new VariableSymbol(leftOperand.type, leftOperand.arrayDimension);
		return res;
	}

	@Override public VariableSymbol visitUnaryExpr(@NotNull GEMParser.UnaryExprContext ctx){
		VariableSymbol v = (VariableSymbol) visit(ctx.expression()); 
		if (v.type.equals("int") || v.type.equals("double") || v.type.equals("error"))
			return v;
		ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_UOP, v.type);
		v.type = "error";
		return v;
	}
	@Override public VariableSymbol visitUnaryRelExpr(@NotNull GEMParser.UnaryRelExprContext ctx){
		VariableSymbol v = (VariableSymbol) visit(ctx.expression()); 
		if (v.type.equals("boolean") || v.type.equals("error") || v.type.equals("int"))
			return v;
		ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_UOP, v.type);
		v.type = "error";
		return v;
	}
	@Override public VariableSymbol visitBinTopExpr(@NotNull GEMParser.BinTopExprContext ctx) {
		VariableSymbol vs1 = (VariableSymbol) visit(ctx.expression(0));
		VariableSymbol vs2 = (VariableSymbol) visit(ctx.expression(1));
		VariableSymbol v = new VariableSymbol("error"); 
		if (vs1.type.equals("error") || vs2.type.equals("error"))
			return v;
		if (vs1.arrayDimension != 0 || vs2.arrayDimension != 0 )
			{
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, vs1, vs2);
				return v;
			}
		if (vs1.type.equals("String") || vs2.type.equals("String"))
			{
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, vs1, vs2);
				return v;
			}
		if (vs1.type.equals(vs2.type))
			{
				if (vs1.type.equals("int") || vs1.type.equals("double"))	
					return vs1;
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, vs1, vs2);
				return v;
			}
		else{
			if (vs1.type.equals("int") && vs2.type.equals("double") || vs2.type.equals("int") && vs1.type.equals("double"))
				return new VariableSymbol("double");
		}
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, vs1, vs2);
			return v;
	}
	
	@Override public VariableSymbol visitBinLowExpr(@NotNull GEMParser.BinLowExprContext ctx) {
		VariableSymbol vs1 = (VariableSymbol) visit(ctx.expression(0));
		VariableSymbol vs2 = (VariableSymbol) visit(ctx.expression(1));
		VariableSymbol v = new VariableSymbol("error"); 
		if (vs1.type.equals("error") || vs2.type.equals("error"))
			return v;
		if (vs1.arrayDimension != 0 || vs2.arrayDimension != 0 )
			{
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, vs1, vs2);
				return v;
			}
		if (ctx.getChild(1).getText().equals("+") && (vs1.type.equals("String") || vs2.type.equals("String")))
			{
				return new VariableSymbol("String");
			}
		if (vs1.type.equals(vs2.type))
			{
				if (vs1.type.equals("int") || vs1.type.equals("double"))	
					return vs1;
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, vs1, vs2);
				return v;
			}
		else{
			if (vs1.type.equals("int") && vs2.type.equals("double") || vs2.type.equals("int") && vs1.type.equals("double"))
				return new VariableSymbol("double");
		}
		ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_OP, vs1, vs2);
		return v;
	}
	@Override public VariableSymbol visitArrayExpr(@NotNull GEMParser.ArrayExprContext ctx) {
		VariableSymbol v = new VariableSymbol("error"); 
		VariableSymbol vs1 = (VariableSymbol) visit(ctx.expression(0));
		VariableSymbol vs2 = (VariableSymbol) visit(ctx.expression(1));
		if (vs1.type.equals("error") || vs2.type.equals("error"))
			return v;
		if (vs1.arrayDimension < 1)
		{
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_UOP, vs2);
			return v;
		}
		if (vs2.arrayDimension != 0 || !vs2.type.equals("int"))
		{
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_UOP, vs2);
			return v;
		}
		vs1.arrayDimension -= 1;
		return vs1;
	}
}
