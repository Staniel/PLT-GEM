// Generated from GEM.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GEMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GEMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GEMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(@NotNull GEMParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull GEMParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#battleArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBattleArguments(@NotNull GEMParser.BattleArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#battleConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBattleConstructor(@NotNull GEMParser.BattleConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#specialType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialType(@NotNull GEMParser.SpecialTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull GEMParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link GEMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull GEMParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull GEMParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bs}
	 * labeled alternative in {@link GEMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBs(@NotNull GEMParser.BsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(@NotNull GEMParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull GEMParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#heroConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeroConstructor(@NotNull GEMParser.HeroConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull GEMParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull GEMParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#nextStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextStatement(@NotNull GEMParser.NextStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(@NotNull GEMParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#eventBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBlock(@NotNull GEMParser.EventBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(@NotNull GEMParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link GEMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull GEMParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link GEMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(@NotNull GEMParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementExpr}
	 * labeled alternative in {@link GEMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpr(@NotNull GEMParser.StatementExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#monsterConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonsterConstructor(@NotNull GEMParser.MonsterConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(@NotNull GEMParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link GEMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(@NotNull GEMParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#eventExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventExpressionList(@NotNull GEMParser.EventExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(@NotNull GEMParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link GEMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull GEMParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull GEMParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(@NotNull GEMParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(@NotNull GEMParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull GEMParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull GEMParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#eventType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventType(@NotNull GEMParser.EventTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#monsterArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonsterArguments(@NotNull GEMParser.MonsterArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull GEMParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull GEMParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(@NotNull GEMParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#eventArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventArguments(@NotNull GEMParser.EventArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(@NotNull GEMParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(@NotNull GEMParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link GEMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(@NotNull GEMParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GEMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull GEMParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#heroArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeroArguments(@NotNull GEMParser.HeroArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link GEMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(@NotNull GEMParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull GEMParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(@NotNull GEMParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(@NotNull GEMParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link GEMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull GEMParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull GEMParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(@NotNull GEMParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull GEMParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GEMParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(@NotNull GEMParser.SwitchBlockStatementGroupContext ctx);
}