import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.misc.NotNull;

public class GEMExtendedVisitor extends GEMBaseVisitor<Void> {
	private void ce() {
		print("Compile Error.\n");
	}
	
	private void print(String str) {
		System.out.print(str);
	}
	
	private void printSp(String str) {
		System.out.print(str + " ");
	}
	
	@Override public Void visitCompilationUnit(@NotNull GEMParser.CompilationUnitContext ctx) {
		print("import java.util.*;");
		print("public class Main {\n");
		print("public static Scanner scanner = new Scanner(System.in);");
		for (GEMParser.VariableDeclarationContext vd: ctx.variableDeclaration()) {
			visit(vd);
		}
		for (GEMParser.MethodDeclarationContext md : ctx.methodDeclaration()) {
			visit(md);
		}
		print("}\n");
		return null;
	}
	
	@Override public Void visitMethodDeclaration(@NotNull GEMParser.MethodDeclarationContext ctx) {
		if (ctx.Identifier().getText().equals("main")) {
			printSp("public static");
		} else {
			printSp("public");
		}
		
		if (ctx.type() != null) {
			visit(ctx.type());
			print(" " + ctx.Identifier().getText());
		} else {
			print("void " + ctx.Identifier().getText());
		}
		visit(ctx.parameters());
		if (ctx.methodBody() == null) {
			print(";\n");
		} else {
			visit(ctx.methodBody());
		}
		return null;
	}
	
	@Override public Void visitParameters(@NotNull GEMParser.ParametersContext ctx) {
		print("(");
		visit(ctx.parameterList());
		print(")");
		return null;
	}
	
	@Override public Void visitParameterList(@NotNull GEMParser.ParameterListContext ctx) {
		for (int i = 0; i < ctx.parameter().size(); i++) {
			GEMParser.ParameterContext para = ctx.parameter(i);
			visit(para);
			if (i < ctx.parameter().size()-1) {
				printSp(",");
			}
		}
		return null;
	}
	
	@Override public Void visitParameter(@NotNull GEMParser.ParameterContext ctx) {
		visit(ctx.type());
		print(" " + ctx.variableDeclaratorId().Identifier().getText());
		return null;
	}
	
	@Override public Void visitMethodBody(@NotNull GEMParser.MethodBodyContext ctx) {
		return visit(ctx.block());
	}
	
	@Override public Void visitBlock(@NotNull GEMParser.BlockContext ctx) {
		print("{\n");
		for (GEMParser.BlockStatementContext bs : ctx.blockStatement()) {
			visit(bs);
		}
		print("}\n");
		return null;
	}
	
	@Override public Void visitBlockStatement(@NotNull GEMParser.BlockStatementContext ctx) {
		if (ctx.variableDeclaration() != null) {
			return visit(ctx.variableDeclaration());
		} else {
			return visit(ctx.statement());
		}
	}
	
	@Override public Void visitVariableDeclaration(@NotNull GEMParser.VariableDeclarationContext ctx) {
		visit(ctx.type());
		print(" ");
		visit(ctx.variableDeclarators());
		print(";\n");
		return null;
	}
	
	@Override public Void visitVariableDeclarators(@NotNull GEMParser.VariableDeclaratorsContext ctx) {
		for (int i = 0; i < ctx.variableDeclarator().size(); i++) {
			GEMParser.VariableDeclaratorContext vd = ctx.variableDeclarator(i);
			visit(vd);
			if (i < ctx.variableDeclarator().size()-1) {
				printSp(",");
			}
		}
		return null;
	}
	

	@Override public Void visitForStatement(@NotNull GEMParser.ForStatementContext ctx) { 
		print("for ( ");
		visit(ctx.forControl());
		print(" )");
		visit(ctx.statement());
		return null;
	}
	@Override public Void visitForControl(@NotNull GEMParser.ForControlContext ctx) {
		if (ctx.forInit() != null)
			visit(ctx.forInit());
		print(";");
		if (ctx.expression() != null)
			visit(ctx.expression());
		print(";");
		if (ctx.forUpdate() != null)
			visit(ctx.forUpdate());
		return null;
	}
	@Override public Void visitForInit(@NotNull GEMParser.ForInitContext ctx) {
		visit(ctx.expressionList());
		return null;
	}
	@Override public Void visitForUpdate(@NotNull GEMParser.ForUpdateContext ctx) {
		visit(ctx.expressionList());
		return null;
	}
	@Override public Void visitExpressionList(@NotNull GEMParser.ExpressionListContext ctx) {
		for (int i = 0; i < ctx.expression().size(); i++) {
			visit(ctx.expression(i));
			if (i < ctx.expression().size()-1) {
				print(",");
			}
		}
		return null;
	}
	@Override public Void visitVariableDeclarator(@NotNull GEMParser.VariableDeclaratorContext ctx) {
		visit(ctx.variableDeclaratorId());
		if (ctx.variableInitializer() != null) {
			print("=");
			visit(ctx.variableInitializer());

		}
		return null;
	}
	
	@Override public Void visitVariableDeclaratorId(@NotNull GEMParser.VariableDeclaratorIdContext ctx) {
		print(ctx.Identifier().getText());
		return null;
	}
	
	@Override public Void visitVariableInitializer(@NotNull GEMParser.VariableInitializerContext ctx) {
		print(ctx.getText());
		return null;
	}
	
	@Override public Void visitPrintStatement(@NotNull GEMParser.PrintStatementContext ctx) {
		print("System.out.println(");
		visit(ctx.expression());
		print(");\n");
		return null;
	}
	

	@Override public Void visitParExpression(@NotNull GEMParser.ParExpressionContext ctx) { 
		print("(");
		visit(ctx.expression());
		print(")");
		return null;
	}
	@Override public Void visitBreakStatement(@NotNull GEMParser.BreakStatementContext ctx) {
		print("break;");
		return null;
	}
	@Override public Void visitContinueStatement(@NotNull GEMParser.ContinueStatementContext ctx) {
		print("continue;");
		return null;
	}
	@Override public Void visitIfStatement(@NotNull GEMParser.IfStatementContext ctx) {
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
	@Override public Void visitAssignExpr(@NotNull GEMParser.AssignExprContext ctx){
		
		visit(ctx.expression(0));
		print(" "+ctx.getChild(1).getText()+" ");
		visit(ctx.expression(1));
		return null;
	}

	@Override public Void visitBinTopExpr(@NotNull GEMParser.BinTopExprContext ctx)  {
		visit(ctx.expression(0));
		print(" "+ctx.getChild(1).getText()+" ");
		visit(ctx.expression(1));
		return null;
	}

	@Override public Void visitBinRelExpr(@NotNull GEMParser.BinRelExprContext ctx) {
		visit(ctx.expression(0));
		print(" "+ctx.getChild(1).getText()+" ");
		visit(ctx.expression(1));
		return null;
	}
	@Override public Void visitBinLowExpr(@NotNull GEMParser.BinLowExprContext ctx){
		visit(ctx.expression(0));
		print(" "+ctx.getChild(1).getText()+" ");
		visit(ctx.expression(1));
		return null;
	}
	
	@Override public Void visitBinEqExpr(@NotNull GEMParser.BinEqExprContext ctx){
		visit(ctx.expression(0));
		print(" "+ctx.getChild(1).getText()+" ");
		visit(ctx.expression(1));
		return null;
	}
	
	@Override public Void visitBinAndExpr(@NotNull GEMParser.BinAndExprContext ctx){
		print("( ");
		visit(ctx.expression(0));
		print(" )");
		print(" "+ctx.getChild(1).getText()+" ");
		print("( ");
		visit(ctx.expression(1));
		print(" )");
		return null;
	}

	@Override public Void visitBinOrExpr(@NotNull GEMParser.BinOrExprContext ctx){
		print("( ");
		visit(ctx.expression(0));
		print(" )");
		print(" "+ctx.getChild(1).getText()+" ");
		print("( ");
		visit(ctx.expression(1));
		print(" )");
		return null;
	}
	
	@Override public Void visitUnaryExpr(@NotNull GEMParser.UnaryExprContext ctx){
		print(ctx.getChild(0).getText());
		print("( ");
		visit(ctx.expression());
		print(" )");
		return null;
	}
	
	@Override public Void visitInputNumberExpr(@NotNull GEMParser.InputNumberExprContext ctx) { 
		print("scanner.nextInt()");
		return null;
	}
	
	@Override public Void visitInputStrExpr(@NotNull GEMParser.InputStrExprContext ctx) { 
		print("scanner.next()");
		return null;
	}
	@Override public Void visitUnaryRelExpr(@NotNull GEMParser.UnaryRelExprContext ctx){
		print(ctx.getChild(0).getText());
		print("( ");
		visit(ctx.expression());
		print(" )");
		return null;
	}
	
	@Override public Void visitSwitchLabel(@NotNull GEMParser.SwitchLabelContext ctx) {
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
	
	@Override public Void visitSwitchBlockStatementGroup(@NotNull GEMParser.SwitchBlockStatementGroupContext ctx) {
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
	
	@Override public Void visitSwitchStatement(@NotNull GEMParser.SwitchStatementContext ctx) { 
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
		print("}");
		return null;
		
	}
	
	@Override public Void visitReturnStatement(@NotNull GEMParser.ReturnStatementContext ctx) {
		print("return");
		if (ctx.expression() != null) {
			print(" ");
			visit(ctx.expression());
		}
		print(";");
		return null;
	}
	

	@Override public Void visitPrimary(@NotNull GEMParser.PrimaryContext ctx) {
		if (ctx.expression() != null) {
			print("(");
			visit(ctx.expression());
			print(")");
		} else if (ctx.literal() != null) {
			visit(ctx.literal());
		} else if (ctx.Identifier() != null) {
			print(ctx.Identifier().getText());
		}
		return null;
	}
	
	@Override public Void visitLiteral(@NotNull GEMParser.LiteralContext ctx) {
		print(ctx.getText());
		return null;
	}
	
	@Override public Void visitType(@NotNull GEMParser.TypeContext ctx) {
		print(ctx.getText());
		return null;
	}
	@Override public Void visitStatementExpr(@NotNull GEMParser.StatementExprContext ctx) {
		visit(ctx.statementExpression());
		print(";");
		return null;	
	}
	
}
