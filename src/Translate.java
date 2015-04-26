// import ANTLR's runtime libraries
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Translate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		// create a lexer that feeds off of input CharStream 
		GEMLexer lexer = new GEMLexer(input);
		// create a buffer of tokens pulled from the lexer 
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer 
		GEMParser parser = new GEMParser(tokens);
		ParseTree tree = parser.compilationUnit(); // begin parsing at rule
		// Create a generic parse tree walker that can trigger callbacks
		ParseTreeWalker walker = new ParseTreeWalker();
		// Walk the tree created during the parse, trigger callbacks 
		walker.walk(new HelloWorldListener(), tree); 
		System.out.println(); // print a \n after translation
	}

}
