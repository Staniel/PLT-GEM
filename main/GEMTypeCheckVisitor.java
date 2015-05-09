import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import buildinClass.Skill;

@SuppressWarnings("unchecked")

public class GEMTypeCheckVisitor extends GEMBaseVisitor <Object> {
	private static final Integer VAR_UNDEFINED = 1;
	private static final Integer VAR_DEFINED = 2;
	private static final Integer INVALID_OP = 3;
	private static final Integer RETURN_MISMATCH = 4;
	private static final Integer PARAS_MISMATCH = 5;
	private static final Integer ILLEGAL_NAME = 6;
	private static final Integer INVALID_UOP = 7;
	private static final Integer METHOD_UNDEFINED = 8;
	private static final Integer RETURN_MISSING = 9;
	private static final Integer INVALID_INDEX = 10;
	private LinkedList<HashMap<String, VariableSymbol>> symbols = new LinkedList<HashMap<String, VariableSymbol>>();
	private LinkedList<VariableSymbol> lastType = new LinkedList<VariableSymbol>();
	private static final HashMap<Integer, String> errorMessage;
	static {
		errorMessage = new HashMap<Integer, String>();
		errorMessage.put(VAR_UNDEFINED, "%s is not defined.\n");
		errorMessage.put(VAR_DEFINED, "Duplicate definition of %s.\n");
		errorMessage.put(INVALID_OP, "Invalid operation on %s and %s.\n");
		errorMessage.put(RETURN_MISMATCH, "Return type %s does not match %s.\n");
		errorMessage.put(INVALID_UOP, "Invalid operation on %s.\n");
		errorMessage.put(PARAS_MISMATCH, "Mismatch parameters %s\n");
		errorMessage.put(METHOD_UNDEFINED, "Undefined method on %s.\n");
		errorMessage.put(RETURN_MISSING, "No return statement for type %s.\n");
		errorMessage.put(INVALID_INDEX, "Array Index type error on %s.\n");
		errorMessage.put(PARAS_MISMATCH, "Parameters mismatch%s.\n");
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
		return null;
	}
	
	@Override public VariableSymbol visitCompilationUnit(@NotNull GEMParser.CompilationUnitContext ctx) {
		HashMap<String, VariableSymbol> scope = new HashMap<String, VariableSymbol>();
		symbols.push(scope);
		for (GEMParser.OutervariableDeclarationContext vd: ctx.outervariableDeclaration()) {
			visit(vd);
		}
		for (GEMParser.MethodDeclarationContext md : ctx.methodDeclaration()) {
			visit(md);
		}
		symbols.pop();
		return null;
	}
	
	@Override public Object visitMethodDeclaration(@NotNull GEMParser.MethodDeclarationContext ctx) {		
		// type
		VariableSymbol method = null;
		if (ctx.type() != null) {
			method = (VariableSymbol) visit(ctx.type());
			method.isFunction = true;
		} else {
			method = new VariableSymbol("void", true, null);
		}
		lastType.push(method);
		
		// Identifier (method name)
		String varName = ctx.Identifier().getText();
		if (seekVar(varName) != null) {
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), VAR_DEFINED, varName);
			return null;
		}
		symbols.peek().put(varName, method);
		
		// parameters
		HashMap<String, VariableSymbol> scope = new HashMap<String, VariableSymbol>();
		symbols.push(scope);
		ArrayList<VariableSymbol> paras = (ArrayList<VariableSymbol>) visit(ctx.parameters());
		method.paras = paras;
		
		// method body
		if (ctx.methodBody() != null) {
			VariableSymbol returnType = (VariableSymbol) visit(ctx.methodBody());
			if (returnType == null && !method.type.equals("void")) {
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), RETURN_MISSING, method);
			}
		}
		lastType.pop();
		symbols.pop();
		return null;
	}
	
	@Override public Object visitMethodBody(@NotNull GEMParser.MethodBodyContext ctx) {
		return visit(ctx.block());
	}
	
	@Override public VariableSymbol visitBlock(@NotNull GEMParser.BlockContext ctx) {
		HashMap<String, VariableSymbol> scope = new HashMap<String, VariableSymbol>();
		symbols.push(scope);
		for (GEMParser.BlockStatementContext bs : ctx.blockStatement()) {
			VariableSymbol returnType = (VariableSymbol) visit(bs);
			if (returnType != null) {
				symbols.pop();
				return returnType;
			}
		}
		symbols.pop();
		return null;
	}
	
	@Override public VariableSymbol visitBlockStatement(@NotNull GEMParser.BlockStatementContext ctx) {
		if (ctx.variableDeclaration() != null) {
			return (VariableSymbol) visit(ctx.variableDeclaration());
		} else {
			return (VariableSymbol) visit(ctx.statement());
		}
	}
	
	@Override public VariableSymbol visitReturnStatement(@NotNull GEMParser.ReturnStatementContext ctx) {
		VariableSymbol returnType = new VariableSymbol("void");
		if (ctx.expression() != null) {
			returnType = (VariableSymbol) visit(ctx.expression());
			if (!checkType(lastType.peek(), returnType)) {
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), RETURN_MISMATCH, 
						lastType.peek(), returnType);
			}
		} else {
			if (lastType.peek().type != "void") {
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), RETURN_MISMATCH, 
						lastType.peek(), returnType);
			}
		}
		return returnType;
	}
	
	@Override public ArrayList<VariableSymbol> visitParameters(@NotNull GEMParser.ParametersContext ctx) {
		if (ctx.parameterList() != null) {
			return (ArrayList<VariableSymbol>) visit(ctx.parameterList());
		}
		return new ArrayList<VariableSymbol>();
	}
	
	@Override public ArrayList<VariableSymbol> visitParameterList(@NotNull GEMParser.ParameterListContext ctx) {
		ArrayList<VariableSymbol> paras = new ArrayList<VariableSymbol>();
		for (int i = 0; i < ctx.parameter().size(); i++) {
			VariableSymbol para = (VariableSymbol) visit(ctx.parameter(i));
			if (para != null)
				paras.add(para);
		}
		return paras;
	}
	
	@Override public VariableSymbol visitParameter(@NotNull GEMParser.ParameterContext ctx) {
		VariableSymbol parameter = (VariableSymbol) visit(ctx.type());
		String varName = (String) visit(ctx.variableDeclaratorId());
		if (varName != null) {
			if (seekVar(varName) == null) {
				symbols.peek().put(varName, parameter);
				return parameter;
			}
		}
		return null;
	}
	
	@Override public Object visitOutervariableDeclaration(@NotNull GEMParser.OutervariableDeclarationContext ctx){
		VariableSymbol varTemplate = (VariableSymbol) visit(ctx.type());
		// Put type in the lastType stack
		lastType.push(varTemplate);
		visit(ctx.variableDeclarators());
		lastType.pop();
		return null;
	}
	
	@Override public Void visitVariableDeclaration(@NotNull GEMParser.VariableDeclarationContext ctx) {
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
		symbols.peek().put(varName, new VariableSymbol(lastType.peek()));
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
			if (v == null) {
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), VAR_UNDEFINED, varName);
				v = new VariableSymbol("error");
			}
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
		return new VariableSymbol("error");
	}
	@Override public VariableSymbol visitUnaryRelExpr(@NotNull GEMParser.UnaryRelExprContext ctx){
		VariableSymbol v = (VariableSymbol) visit(ctx.expression()); 
		if (v.type.equals("boolean") || v.type.equals("error"))
			return v;
		ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_UOP, v.type);
		return new VariableSymbol("error");
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
	@Override public VariableSymbol visitBattleConstructor(@NotNull GEMParser.BattleConstructorContext ctx) {
		VariableSymbol v = new VariableSymbol("error");
		String[] args = {"String", "Unit"};
		if (ctx.battleArguments() != null) {
			ArrayList<VariableSymbol> paraList = (ArrayList<VariableSymbol>) visit(ctx.battleArguments());
			if (paraList.size() != 2)
			{
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), PARAS_MISMATCH, "");
				return v;
			}
			for (int i=0;i<2;i++)
			{
				if (paraList.get(i).type.equals("error"))
					return v;
				if (!paraList.get(i).type.equals(args[i]) || paraList.get(i).arrayDimension != 0){
					ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), PARAS_MISMATCH, "");
					return v;
				}
			}
		}
		return new VariableSymbol("Battle");
	}
	@Override public VariableSymbol visitUnitConstructor(@NotNull GEMParser.UnitConstructorContext ctx) {
		VariableSymbol v = new VariableSymbol("error");
		String[] args = {"String" , "double" , "double" , "double" , "int" , "Skill" };
		if (ctx.unitArguments() != null) {
			ArrayList<VariableSymbol> paraList = (ArrayList<VariableSymbol>) visit(ctx.unitArguments());
			if (paraList.size() != 6)
			{
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), PARAS_MISMATCH, "");
				return v;
			}
			for (int i=0;i<6;i++)
			{
				if (paraList.get(i).type.equals("error"))
					return v;
				if (!paraList.get(i).type.equals(args[i])){
					{
						if ((i == 6 && !(paraList.get(i).arrayDimension != 1))
							|| paraList.get(i).arrayDimension != 0)
						{
							ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), PARAS_MISMATCH, "");
							return v;
						}
					}
				}
			}
		}
		return new VariableSymbol("Unit");
	}
	
	@Override public VariableSymbol visitSkillConstructor(@NotNull GEMParser.SkillConstructorContext ctx) {
		VariableSymbol v = new VariableSymbol("error");
		String[] args = {"String" , "double" , "int" , "double" , "double" , "int" };
		if (ctx.skillArguments() != null) {
			ArrayList<VariableSymbol> paraList = (ArrayList<VariableSymbol>) visit(ctx.skillArguments());
			if (paraList.size() != 6)
			{
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), PARAS_MISMATCH, "");
				return v;
			}
			for (int i=0;i<6;i++)
			{
				if (paraList.get(i).type.equals("error"))
					return v;
				if (!paraList.get(i).type.equals(args[i]) || paraList.get(i).arrayDimension != 0){
					ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), PARAS_MISMATCH, "");
					return v;
				}
			}
		}
		return new VariableSymbol("Skill");
	}
	@Override public ArrayList<VariableSymbol> visitSkillArguments(@NotNull GEMParser.SkillArgumentsContext ctx){
		VariableSymbol v = new VariableSymbol("error");
		ArrayList<VariableSymbol> paraList = new ArrayList<VariableSymbol>();
		if (ctx.expression() != null)
		{
			for (GEMParser.ExpressionContext x: ctx.expression())
				{
					VariableSymbol vs = (VariableSymbol) visit(x);
					paraList.add(vs);
				}
		}
		return paraList;	
	}
	@Override public ArrayList<VariableSymbol> visitUnitArguments(@NotNull GEMParser.UnitArgumentsContext ctx) {
		VariableSymbol v = new VariableSymbol("error");
		ArrayList<VariableSymbol> paraList = new ArrayList<VariableSymbol>();
		if (ctx.expression() != null)
		{
			for (GEMParser.ExpressionContext x: ctx.expression())
				{
					VariableSymbol vs = (VariableSymbol) visit(x);
					paraList.add(vs);
				}
		}
		return paraList;	
	}
	@Override public ArrayList<VariableSymbol> visitBattleArguments(@NotNull GEMParser.BattleArgumentsContext ctx) {
		VariableSymbol v = new VariableSymbol("error");
		ArrayList<VariableSymbol> paraList = new ArrayList<VariableSymbol>();
		if (ctx.expression() != null)
		{
			for (GEMParser.ExpressionContext x: ctx.expression())
				{
					VariableSymbol vs = (VariableSymbol) visit(x);
					paraList.add(vs);
				}
		}
		return paraList;	
	}

	
	@Override public ArrayList<VariableSymbol> visitExpressionList(@NotNull GEMParser.ExpressionListContext ctx) {
		ArrayList<VariableSymbol> res = new ArrayList<VariableSymbol>();
		for (int i = 0; i < ctx.expression().size(); i++) {
			VariableSymbol tmp = (VariableSymbol) visit(ctx.expression(i));
			res.add(tmp);
		}
		return res;
	}
	
	@Override public VariableSymbol visitFuncExpr(@NotNull GEMParser.FuncExprContext ctx){
		VariableSymbol res = new VariableSymbol("error");
		VariableSymbol functionName = (VariableSymbol) visit(ctx.expression());
		if(functionName.type.equals("error")){
			return res;
		}
		if(!functionName.isFunction){
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), METHOD_UNDEFINED, functionName);
			return res;
		}
		if(ctx.expressionList()==null){
			if(functionName.paras.size()!=0){
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), PARAS_MISMATCH, functionName);
				return res;
			}
			else{
				res = new VariableSymbol(functionName.type, 0);
				return res;
			}
		}
		ArrayList<VariableSymbol> functionParams = (ArrayList<VariableSymbol>) visit(ctx.expressionList());
		ArrayList<VariableSymbol> functionDefParams = functionName.paras;
		if(functionParams.size() != functionDefParams.size()){
			ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), PARAS_MISMATCH, functionName);
			return res;
		}
		for(int i=0;i<functionParams.size();i++){
			if(!functionParams.get(i).type.equals(functionDefParams.get(i).type)||functionParams.get(i).isFunction){
				System.err.print(functionParams.get(i).type);
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), PARAS_MISMATCH, functionName);
				return res;
			}
			if(functionParams.get(i).arrayDimension != functionDefParams.get(i).arrayDimension){
				System.err.print(2);
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), PARAS_MISMATCH, functionName);
				return res;
			}
		}
		res = new VariableSymbol(functionName.type, 0);
		return res;
	}
	
	@Override public Object visitForStatement(@NotNull GEMParser.ForStatementContext ctx) {
		visit(ctx.forControl());
		visit(ctx.statement());
		return null;
	}
	
	@Override public Object visitForControl(@NotNull GEMParser.ForControlContext ctx) {
		if (ctx.forInit() != null)
			visit(ctx.forInit());
		if (ctx.expression() != null)
			visit(ctx.expression());
		if (ctx.forUpdate() != null)
			visit(ctx.forUpdate());
		return null;
	}
	
	@Override public Object visitForInit(@NotNull GEMParser.ForInitContext ctx) {
		visit(ctx.expressionList());
		return null;
	}
	
	@Override public Object visitForUpdate(@NotNull GEMParser.ForUpdateContext ctx) {
		visit(ctx.expressionList());
		return null;
	}
	
	@Override public VariableSymbol visitPrintStatement(@NotNull GEMParser.PrintStatementContext ctx) {
		VariableSymbol vs = (VariableSymbol) visit(ctx.expression());
		return null;
	}
	
	@Override public Object visitSwitchStatement(@NotNull GEMParser.SwitchStatementContext ctx) { 
		visit(ctx.parExpression());
		List<GEMParser.SwitchBlockStatementGroupContext> switchBlockStmtGroupList = ctx.switchBlockStatementGroup();
		for(GEMParser.SwitchBlockStatementGroupContext tmp : switchBlockStmtGroupList){
			visit(tmp);
		}
		List<GEMParser.SwitchLabelContext> switchLabelList = ctx.switchLabel();
		for(GEMParser.SwitchLabelContext tmp : switchLabelList){
			visit(tmp);
		}
		return null;
	}
	
	@Override public Object visitSwitchBlockStatementGroup(@NotNull GEMParser.SwitchBlockStatementGroupContext ctx) {
		List<GEMParser.SwitchLabelContext> switchLabelList = ctx.switchLabel();
		for(GEMParser.SwitchLabelContext tmp : switchLabelList){
			visit(tmp);
		}
		List<GEMParser.BlockStatementContext> blockStmtList = ctx.blockStatement();
		for(GEMParser.BlockStatementContext tmp : blockStmtList){
			visit(tmp);
		}
		return null;
	}
	
	@Override public Object visitSwitchLabel(@NotNull GEMParser.SwitchLabelContext ctx) {
		String text = ctx.getText();
		if(text.startsWith("case")){
			visit(ctx.expression());
		}
		return null;
	}
	
	@Override public Object visitIfStatement(@NotNull GEMParser.IfStatementContext ctx) {
		VariableSymbol parExpr = (VariableSymbol) visit(ctx.parExpression());
		List<GEMParser.StatementContext> stmtList = ctx.statement();
		visit(stmtList.get(0));
		if(stmtList.size() > 1){
			visit(stmtList.get(1));
		}
		return null;
	}

	@Override public VariableSymbol visitArrayInitializer1(@NotNull GEMParser.ArrayInitializer1Context ctx) {
		VariableSymbol v = new VariableSymbol("error");
		return v;
	}
	@Override public VariableSymbol visitArrayInitializer2(@NotNull GEMParser.ArrayInitializer2Context ctx) {
		VariableSymbol v = new VariableSymbol("error");
//		List<GEMParser.ExpressionContext> lst = ctx.expression();
		for (GEMParser.ExpressionContext x: ctx.expression()){
			VariableSymbol t = (VariableSymbol) visit(x);
			if (t.type.equals("error"))
				return t;
			if (!t.type.equals("int")){
				ce(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), INVALID_INDEX, t);
				return v;
			}
		}
		return new VariableSymbol(ctx.type().getText(), ctx.expression().size());
	}
	@Override public VariableSymbol visitWhileStatement(@NotNull GEMParser.WhileStatementContext ctx){
		visit(ctx.parExpression());
		visit(ctx.statement());
		return null;
	}
	
	@Override public VariableSymbol visitParExpression(@NotNull GEMParser.ParExpressionContext ctx) { 
		visit(ctx.expression());
		return null;

	}
}
