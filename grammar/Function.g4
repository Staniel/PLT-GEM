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
 
function: 'void' ID formalParameters methodDeclarationRest ;
formalParameters: '()' ;
methodDeclarationRest: methodBody ;
methodBody: block ;
block: '{' blockStatement* '}' ;
blockStatement: statement ;
statement: 'print' expression ;
expression: ID ;
 
//r  : 'hello' ID ;         // match keyword hello followed by an identifier
ID : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
