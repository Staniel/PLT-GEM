// Generated from Function.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionParser}.
 */
public interface FunctionListener extends ParseTreeListener {
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