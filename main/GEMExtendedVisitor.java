import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;


public class GEMExtendedVisitor extends GEMBaseVisitor<String> {
	private void ce() {
		print("Compile Error.\n");
	}
	
	private void print(String str) {
		System.out.print(str);
	}
	
	private void printSp(String str) {
		System.out.print(str + " ");
	}
	
	@Override public String visitCompilationUnit(@NotNull GEMParser.CompilationUnitContext ctx) {
		print("public class Main {\n");
		for (GEMParser.VariableDeclarationContext vd: ctx.variableDeclaration()) {
			visit(vd);
		}
		for (GEMParser.MethodDeclarationContext md : ctx.methodDeclaration()) {
			visit(md);
		}
		print("}\n");
		return null;
	}
	
	@Override public String visitMethodDeclaration(@NotNull GEMParser.MethodDeclarationContext ctx) {
		if (ctx.Identifier().getText().equals("main")) {
			printSp("public static");
		} else {
			printSp("public");
		}
		
		String type = "void";
		if (ctx.type() != null) {
			type = visit(ctx.type());
		}
		print(type + " " + ctx.Identifier().getText());
		visit(ctx.parameters());
		if (ctx.methodBody() == null) {
			print(";");
		} else {
			visit(ctx.methodBody());
		}
		return null;
	}
	
	@Override public String visitParameters(@NotNull GEMParser.ParametersContext ctx) {
		print("(");
		visit(ctx.parameterList());
		print(")");
		return null;
	}
	
	
	@Override public String visitParameterList(@NotNull GEMParser.ParameterListContext ctx) {
		for (int i = 0; i < ctx.parameter().size(); i++) {
			GEMParser.ParameterContext para = ctx.parameter(i);
			visit(para);
			if (i < ctx.parameter().size()-1) {
				printSp(",");
			}
		}
		return null;
	}
	
	@Override public String visitParameter(@NotNull GEMParser.ParameterContext ctx) {
		String type = visit(ctx.type());
		print(type + " " + ctx.variableDeclaratorId().Identifier().getText());
		return null;
	}
	
	@Override public String visitMethodBody(@NotNull GEMParser.MethodBodyContext ctx) {
		return visit(ctx.block());
	}
	
	@Override public String visitBlock(@NotNull GEMParser.BlockContext ctx) {
		print("{");
		for (GEMParser.BlockStatementContext bs : ctx.blockStatement()) {
			visit(bs);
		}
		print("}");
		return null;
	}
	
	@Override public String visitBlockStatement(@NotNull GEMParser.BlockStatementContext ctx) {
		if (ctx.variableDeclaration() != null) {
			visit(ctx.variableDeclaration());
		} else {
			visit(ctx.statement());
		}
		return null;
	}
	
	@Override public String visitPrintStatement(@NotNull GEMParser.PrintStatementContext ctx) {
		String expr = visit(ctx.expression());
		print("System.out.println(" + expr + ");");
		return null;
	}
	
	@Override public String visitForStatement(@NotNull GEMParser.ForStatementContext ctx) { 
		print("for ( ");
		visit(ctx.forControl());
		print(" )");
		visit(ctx.statement());
		return null;
	}
	@Override public String visitForControl(@NotNull GEMParser.ForControlContext ctx) {
		if (ctx.forInit() != null)
			visit(ctx.forInit());
		print(";");
		if (ctx.expression() != null)
			visit(ctx.expression());
		print(";");
		if (ctx.forUpdate() != null)
			visit(ctx.forUpdate());
		print(";");
		return null;
	}
	@Override public String visitForInit(@NotNull GEMParser.ForInitContext ctx) {
		visit(ctx.expressionList());
		return null;
	}
	@Override public String visitForUpdate(@NotNull GEMParser.ForUpdateContext ctx) {
		visit(ctx.expressionList());
		return null;
	}
	@Override public String visitExpressionList(@NotNull GEMParser.ExpressionListContext ctx) {
		for (int i = 0; i < ctx.expression().size(); i++) {
			visit(ctx.expression(i));
			if (i < ctx.expression().size()-1) {
				print(",");
			}
		}
		return null;
	}
	
	@Override public String visitPrimary(@NotNull GEMParser.PrimaryContext ctx) {
		return ctx.literal().getText();
	}
	
	@Override public String visitType(@NotNull GEMParser.TypeContext ctx) {
		if (ctx != null) {
			return ctx.getText();
		}
		return null;
	}
	@Override public String visitAssignExpr(@NotNull GEMParser.AssignExprContext ctx){
		visit(ctx.expression(0));
		for (TerminalNode n : ctx.getTokens(1))
			print(n.getText());
		visit(ctx.expression(1));
		return null;
	}
	
	
}
