import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

//import GEMParser.VariableInitializerContext;

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
		print("import java.util.*;\n");
		print("import buildinClass.*;\n");
		print("public class Main {\n");
		print("public static Scanner scanner = new Scanner(System.in);\n");
		for (GEMParser.OutervariableDeclarationContext vd: ctx.outervariableDeclaration()) {
			visit(vd);
		}
		for (GEMParser.MethodDeclarationContext md : ctx.methodDeclaration()) {
			visit(md);
		}
		print("}\n");
		return null;
	}
	
	@Override public Void visitMethodDeclaration(@NotNull GEMParser.MethodDeclarationContext ctx) {
		printSp("public static");
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
	
	@Override public Void visitOutervariableDeclaration(@NotNull GEMParser.OutervariableDeclarationContext ctx){
		print("public static ");
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
			print(" = ");
			visit(ctx.variableInitializer());
		}
		return null;
	}
	
	@Override public Void visitVariableDeclaratorId(@NotNull GEMParser.VariableDeclaratorIdContext ctx) {
		print(ctx.Identifier().getText());
		return null;
	}
	
	@Override public Void visitVariableInitializer(@NotNull GEMParser.VariableInitializerContext ctx) {
		visit(ctx.getChild(0));
		return null;
	}
	
	@Override public Void visitPrintStatement(@NotNull GEMParser.PrintStatementContext ctx) {
		print("System.out.println(");
		visit(ctx.expression());
		print(");\n");
		return null;
	}
	
	@Override public Void visitConstructorExpr(@NotNull GEMParser.ConstructorExprContext ctx) {
		print("new ");
		visit(ctx.constructor());
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
		visit(ctx.expression(0));
		print(" "+ctx.getChild(1).getText()+" ");
		visit(ctx.expression(1));
		return null;
	}

	@Override public Void visitBinOrExpr(@NotNull GEMParser.BinOrExprContext ctx){
		visit(ctx.expression(0));
		print(" "+ctx.getChild(1).getText()+" ");
		visit(ctx.expression(1));
		return null;
	}
	
	@Override public Void visitUnaryExpr(@NotNull GEMParser.UnaryExprContext ctx){
		print(ctx.getChild(0).getText());
		print("(");
		visit(ctx.expression());
		print(")");
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
		print("(");
		visit(ctx.expression());
		print(")");
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
	
	@Override public Void visitConstructor(@NotNull GEMParser.ConstructorContext ctx) {
		visit(ctx.getChild(0));
		return null;
	}
	
	@Override public Void visitEventConstructor(@NotNull GEMParser.EventConstructorContext ctx) {
		print("Event ");
		visit(ctx.eventArguments());
		visit(ctx.eventBlock());
		return null;
	}
	
	@Override public Void visitEventArguments(@NotNull GEMParser.EventArgumentsContext ctx) {
		print("(");
		visit(ctx.eventExpressionList());
		print(")");
		return null;
	}
	
	@Override public Void visitEventExpressionList(@NotNull GEMParser.EventExpressionListContext ctx) {
		visit(ctx.expression(0));
		print(", ");
		visit(ctx.expression(1));
		if (ctx.expressionList() != null) {
			print(", ");
			visit(ctx.expressionList());
		}
		return null;
	}
	
	@Override public Void visitBattleConstructor(@NotNull GEMParser.BattleConstructorContext ctx) {
		print("Battle");
		visit(ctx.battleArguments());
		return null;
	}
	@Override public Void visitArrayExpr(@NotNull GEMParser.ArrayExprContext ctx) {
		visit(ctx.expression(0));
		print("[");
		visit(ctx.expression(1));
		print("]");
		return null;
	}
	@Override public Void visitFuncExpr(@NotNull GEMParser.FuncExprContext ctx){
		visit(ctx.expression());
		print("(");
		visit(ctx.expressionList());
		print(")");
		return null;
	}
	@Override public Void visitArrayInitializer1(@NotNull GEMParser.ArrayInitializer1Context ctx)  {
		print("{ ");
		int size = ctx.variableInitializer().size();
		for (int i=0;i<size-1;i++){
			visit(ctx.variableInitializer(i));
			print(", ");
		}
		visit(ctx.variableInitializer(size-1));
		print(" }");
//		'{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
	return null;
}
	@Override public Void visitArrayInitializer2(@NotNull GEMParser.ArrayInitializer2Context ctx)  {
			print("new ");
			visit(ctx.type());
			print("[ ");
			visit(ctx.expression());
			print(" ]");
//			'{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
		return null;
	}
	@Override public Void visitBattleArguments(@NotNull GEMParser.BattleArgumentsContext ctx) {
		print("(");
		visit(ctx.expression(0));
		print(", ");
		visit(ctx.expression(1));
		print(")");
		return null;
	}
	@Override public Void visitWhileStatement(@NotNull GEMParser.WhileStatementContext ctx){
		print("while ( ");
		visit(ctx.parExpression());
		print(" )");
		visit(ctx.statement());
		return null;
	}
}
