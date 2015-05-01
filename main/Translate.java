// import ANTLR's runtime libraries
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Translate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// create a CharStream that reads from standard input
		InputStream GEMInputStream = new FileInputStream(new File(args[0]));
		ANTLRInputStream input = new ANTLRInputStream(GEMInputStream);
		// create a lexer that feeds off of input CharStream 
		GEMLexer lexer = new GEMLexer(input);
		// create a buffer of tokens pulled from the lexer 
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer 
		GEMParser parser = new GEMParser(tokens);
		ParseTree tree = parser.compilationUnit(); // begin parsing at rule
		//ParseTree tree = parser.variableDeclaration();
		// Create a generic parse tree walker that can trigger callbacks
		//ParseTreeWalker walker = new ParseTreeWalker();
		// Walk the tree created during the parse, trigger callbacks 
		//walker.walk(new GEMExtendListener(), tree);
		
		GEMExtendedVisitor translator = new GEMExtendedVisitor();
		translator.visit(tree);
		System.out.println(); // print a \n after translation
	}

}
