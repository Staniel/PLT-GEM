import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ParserMain {

	/**
	 * Run the parser on a provided source file.  Largely take from the
	 * Antlr book (https://pragprog.com/book/tpantlr2/the-definitive-antlr-4-reference) p33
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		//Create a charstream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		
		//create a lexer that feeds off of input CharStream
		FunctionLexer lexer = new FunctionLexer(input);

	    // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        FunctionParser parser = new FunctionParser(tokens);

        ParseTree tree = parser.function(); // begin parsing at ' rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	}

}
