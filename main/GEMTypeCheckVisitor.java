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
	private LinkedList<HashMap<String, VariableSymbol>> symbols = new LinkedList<HashMap<String, VariableSymbol>>();
	private HashMap<String, VariableSymbol> globalSymbols = new HashMap<String, VariableSymbol>();
	private LinkedList<VariableSymbol> lastType = new LinkedList<VariableSymbol>();
	private static final HashMap<Integer, String> errorMessage;
	static {
		errorMessage = new HashMap<Integer, String>();
		errorMessage.put(VAR_DEFINED, "Duplicate definition of %s.\n");
		errorMessage.put(INVALID_OP, "Invalid operation on %s and %s.\n");
	}
	
	private void ce(int row, int col, int errno, String msg) {
		System.err.print("GEM Error on line " + row + " at position " + col + ": ");
		System.err.printf(errorMessage.get(errno), msg);
	}
	
	private void ce(int row, int col, int errno, VariableSymbol vs1) {
		System.err.print("GEM Error on line " + row + " at position " + col + ": ");
		System.err.printf(errorMessage.get(errno), vs1.type);
	}
	
	private void ce(int row, int col, int errno, VariableSymbol vs1, VariableSymbol vs2) {
		System.err.print("GEM Error on line " + row + " at position " + col + ": ");
		System.err.printf(errorMessage.get(errno), vs1.type, vs2.type);
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
//	private boolean checkParas(ArrayList<VariableSymbol> p1, ArrayList<VariableSymbol> p2) {
//		boolean flag = true;
//		if (p1.size() != p2.size()) {
//			flag = false;
//		}
//		for (int i = 0; i < p1.size(); i++) {
//			flag = checkType(p1.get(i), p2.get(i));
//		}
//		return flag;
//	}
	
	@Override public VariableSymbol visitCompilationUnit(@NotNull GEMParser.CompilationUnitContext ctx) {
		for (GEMParser.OutervariableDeclarationContext vd: ctx.outervariableDeclaration()) {
			visit(vd);
		}
		for (GEMParser.MethodDeclarationContext md : ctx.methodDeclaration()) {
			visit(md);
		}
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
		if(leftOperand.type.equals("String")||leftOperand.type.equals("boolean")||leftOperand.type.equals("null")||rightOperand.type.equals("String")||rightOperand.type.equals("boolean")||rightOperand.type.equals("null")){
			ce();
			res = new VariableSymbol("boolean", 0);
		}
		return null;
	}

}
