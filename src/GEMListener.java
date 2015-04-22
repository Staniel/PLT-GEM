// Generated from GEM.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GEMParser}.
 */
public interface GEMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GEMParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull GEMParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull GEMParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull GEMParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull GEMParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull GEMParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull GEMParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull GEMParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull GEMParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull GEMParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull GEMParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#eventExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterEventExpressionList(@NotNull GEMParser.EventExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#eventExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitEventExpressionList(@NotNull GEMParser.EventExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#specialBlock}.
	 * @param ctx the parse tree
	 */
	void enterSpecialBlock(@NotNull GEMParser.SpecialBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#specialBlock}.
	 * @param ctx the parse tree
	 */
	void exitSpecialBlock(@NotNull GEMParser.SpecialBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull GEMParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull GEMParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#specialType}.
	 * @param ctx the parse tree
	 */
	void enterSpecialType(@NotNull GEMParser.SpecialTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#specialType}.
	 * @param ctx the parse tree
	 */
	void exitSpecialType(@NotNull GEMParser.SpecialTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull GEMParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull GEMParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull GEMParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull GEMParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull GEMParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull GEMParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull GEMParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull GEMParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull GEMParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull GEMParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull GEMParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull GEMParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull GEMParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull GEMParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull GEMParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull GEMParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull GEMParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull GEMParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull GEMParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull GEMParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull GEMParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull GEMParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(@NotNull GEMParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(@NotNull GEMParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull GEMParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull GEMParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#eventType}.
	 * @param ctx the parse tree
	 */
	void enterEventType(@NotNull GEMParser.EventTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#eventType}.
	 * @param ctx the parse tree
	 */
	void exitEventType(@NotNull GEMParser.EventTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull GEMParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull GEMParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull GEMParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull GEMParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull GEMParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull GEMParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull GEMParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull GEMParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull GEMParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull GEMParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull GEMParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull GEMParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull GEMParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull GEMParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull GEMParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull GEMParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull GEMParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull GEMParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull GEMParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull GEMParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#eventArguments}.
	 * @param ctx the parse tree
	 */
	void enterEventArguments(@NotNull GEMParser.EventArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#eventArguments}.
	 * @param ctx the parse tree
	 */
	void exitEventArguments(@NotNull GEMParser.EventArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull GEMParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull GEMParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEMParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull GEMParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEMParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull GEMParser.PrimaryContext ctx);
}