 /*
 * By default, Antlr puts generated java files into the default java package.
 * That's not really best practice and makes 
 */
/* @header{ 
	package antler4; 
} */

/** Grammars always start with a grammar header. This grammar is called
       *  ArrayInit and must match the filename: ArrayInit.g4
       */
 grammar Function ;

 // parser rules start with lowercase letters, lexer rules with uppercase
 
 function : 'void' ('')' '{' statement '}' ;

 statement : 'print' BODY';' ;