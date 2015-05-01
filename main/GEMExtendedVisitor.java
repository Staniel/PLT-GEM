import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;


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
	
	@Override public String visitParExpression(@NotNull GEMParser.ParExpressionContext ctx) { 
		print("(");
		visit(ctx.expression());
		print(")");
		return null;
	}
	
	@Override public String visitIfStatement(@NotNull GEMParser.IfStatementContext ctx) {
		print("if");
		visit(ctx.parExpression());
		List<GEMParser.StatementContext> stmtList = ctx.statement();
		visit(stmtList.get(0));
		if(stmtList.size() > 1){
			print("else");
			visit(stmtList.get(1));
		}
		return null;
	}
	
	@Override public String visitSwitchLabel(@NotNull GEMParser.SwitchLabelContext ctx) {
		String text = ctx.getText();
		if(text.startsWith("case")){
			printSp("case");
			visit(ctx.expression());
			print(":");
		}
		else if(text.startsWith("default")){
			print("default");
			print(":");
		}
		return null;
	}
	
	@Override public String visitSwitchBlockStatementGroup(@NotNull GEMParser.SwitchBlockStatementGroupContext ctx) {
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
	
	@Override public String visitSwitchStatement(@NotNull GEMParser.SwitchStatementContext ctx) { 
		print("switch");
		visit(ctx.parExpression());
		print("{");
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
	
	@Override public String visitExpression(@NotNull GEMParser.ExpressionContext ctx) {
		return visit(ctx.primary());
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
	
	
}
