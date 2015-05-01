import org.antlr.v4.runtime.misc.NotNull;


public class HelloWorldListener extends GEMBaseListener{
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
		System.out.print("{");
	}
	
	@Override public void exitBlock(@NotNull GEMParser.BlockContext ctx) {
		System.out.print("}");
	}
	
	@Override public void enterStatement(@NotNull GEMParser.StatementContext ctx) {
		if (ctx.getText().startsWith("print")) {
			System.out.print("System.out.println(");
		}
	}
	
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
