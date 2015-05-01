import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

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
		if (ctx.getText().startsWith("print")) {
			System.out.print("System.out.println(");
		}
	}
	
	@Override public void enterVariableDeclaration(@NotNull GEMParser.VariableDeclarationContext ctx) {
		
		if (ctx.type().primitiveType() != null) {
			
		}
		String type = ctx.type().getText();
		List<GEMParser.VariableDeclaratorContext> varList = ctx.variableDeclarators().variableDeclarator();
		for (GEMParser.VariableDeclaratorContext vdCtx : varList) {
			String id = vdCtx.variableDeclaratorId().Identifier().getText();
			Object value = null;
			if (vdCtx.variableInitializer() != null) {
				// Initialization to be continued
			}
			VariableSymbol var = new VariableSymbol(type, value);
			if (symbols.peek().containsKey(id)) {
				ce();
			}
			symbols.peek().put(id, var);
		}
		printSp(type);
	}
	@Override public void exitVariableDeclaration(@NotNull GEMParser.VariableDeclarationContext ctx) { }
	
	@Override public void exitStatement(@NotNull GEMParser.StatementContext ctx) {
		if (ctx.getText().startsWith("print")) {
			System.out.print(")");
		}
		System.out.print(";");
	}
	
	@Override public void enterLiteral(@NotNull GEMParser.LiteralContext ctx) {
		System.out.print(ctx.getText());
	}
}
