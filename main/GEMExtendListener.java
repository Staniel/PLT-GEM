import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.antlr.v4.runtime.misc.NotNull;


public class GEMExtendListener extends GEMBaseListener {
	LinkedList<HashMap<String, VariableSymbol>> symbols = new LinkedList<HashMap<String, VariableSymbol>>();
	
	private void ce() {
		print("Compile Error.\n");
	}
	
	private void print(String str) {
		System.out.print(str);
	}
	
	private void printSp(String str) {
		System.out.print(str + " ");
	}
	
	@Override public void enterCompilationUnit(@NotNull GEMParser.CompilationUnitContext ctx) {
		System.out.println("public class Main {");
	}
	
	@Override public void exitCompilationUnit(@NotNull GEMParser.CompilationUnitContext ctx) {
		System.out.println("}");
	}
	
	@Override
	public void enterMethodDeclaration(GEMParser.MethodDeclarationContext ctx) {
		if (ctx.Identifier().getText().equals("main")) {
			System.out.print("public static ");
		} else {
			System.out.print("public ");
		}
		
		String type = "void";
		if (ctx.type() != null) {
			type = ctx.type().getText();
		}
		System.out.print(type + " " + ctx.Identifier().getText());
	}
	
	@Override
	public void exitMethodDeclaration(GEMParser.MethodDeclarationContext ctx) {
		if (ctx.methodBody() == null) {
			System.out.print(';');
		}
	}
	
	@Override public void enterParameters(@NotNull GEMParser.ParametersContext ctx) {
		System.out.print("(");
	}
	
	@Override public void exitParameters(@NotNull GEMParser.ParametersContext ctx) {
		System.out.print(")");
	}
	
	@Override public void enterParameter(@NotNull GEMParser.ParameterContext ctx) {
		System.out.print(ctx.type().getText() + " " + ctx.variableDeclaratorId().getText());
	}
	
	@Override public void enterBlock(@NotNull GEMParser.BlockContext ctx) {
		HashMap<String, VariableSymbol> scope = new HashMap<String, VariableSymbol>();
		symbols.push(scope);
		System.out.print("{");
	}
	
	@Override public void exitBlock(@NotNull GEMParser.BlockContext ctx) {
		System.out.print("}");
		symbols.pop();
	}
	
	@Override public void enterStatement(@NotNull GEMParser.StatementContext ctx) {
		printStatement(ctx, true);
	}
	
	@Override public void exitStatement(@NotNull GEMParser.StatementContext ctx) {
		printStatement(ctx, false);
		System.out.print(";");
	}
	
	private boolean printStatement(GEMParser.StatementContext ctx, boolean isEnter) {
		if (ctx.getText().startsWith("print")) {
			if (isEnter) {
				System.out.print("System.out.println(");
			} else {
				System.out.print(")");
			}
			return true;
		}
		return false;
	}
	
	private boolean inputStatement(GEMParser.StatementContext ctx, boolean isEnter) {
		if (ctx.getText().startsWith("input")) {
			if (isEnter) {
				Scanner input = new Scanner(System.in);
			}
			return true;
		}
		return false;
	}
	
	@Override public void enterVariableDeclaration(@NotNull GEMParser.VariableDeclarationContext ctx) {
		int arrayDimension = (ctx.type().getChildCount()-1)/2;
		String type = null;
		if (ctx.type().primitiveType() != null) {
			type = ctx.type().primitiveType().getText();
		} else if (ctx.type().eventType() != null) {
			type = ctx.type().eventType().getText();
		} else if (ctx.type().specialType() != null){
			type = ctx.type().specialType().getText();
		}
		printSp(type);
		List<GEMParser.VariableDeclaratorContext> varList = ctx.variableDeclarators().variableDeclarator();
		for (int i = 0; i < varList.size(); i++) {
			GEMParser.VariableDeclaratorContext vdCtx = varList.get(i);
			String id = vdCtx.variableDeclaratorId().Identifier().getText();
			Object value = null;
			if (vdCtx.variableInitializer() != null) {
				// Initialization to be continued
			}
			VariableSymbol var = new VariableSymbol(type, value, arrayDimension);
			if (symbols.peek().containsKey(id)) {
				ce();
			}
			symbols.peek().put(id, var);
			print(id);
			if (i < varList.size()-1) {
				print(",");
			}
		}
	}
	@Override public void exitVariableDeclaration(@NotNull GEMParser.VariableDeclarationContext ctx) {
		print(";");
	}
	
	@Override public void enterLiteral(@NotNull GEMParser.LiteralContext ctx) {
		System.out.print(ctx.getText());
	}
}
