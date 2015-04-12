// Generated from Function.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionParser}.
 */
public interface FunctionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull FunctionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull FunctionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull FunctionParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull FunctionParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#methodDeclarationRest}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationRest(@NotNull FunctionParser.MethodDeclarationRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#methodDeclarationRest}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationRest(@NotNull FunctionParser.MethodDeclarationRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull FunctionParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull FunctionParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull FunctionParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull FunctionParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull FunctionParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull FunctionParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull FunctionParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull FunctionParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull FunctionParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull FunctionParser.FunctionContext ctx);
}