grammar GEM;

fragment
GemLetter
    :   [a-zA-Z$_]
    ;

fragment
GemLetterOrDigit
    :   [a-zA-Z0-9$_]
    ;

BooleanLiteral: 'true' | 'false';
IntegerLiteral: DecimalNumeral;
fragment Digit: '0' | NonZeroDigit;
fragment NonZeroDigit: [1-9];
fragment Digits: Digit+;
fragment DecimalNumeral: '0' | NonZeroDigit Digits?;

FloatingPointLiteral: Digits '.' Digits+;

StringLiteral
 	: '\'' ( STRING_ESCAPE_SEQ | ~[\\\r\n'] )* '\''
 	| '"' ( STRING_ESCAPE_SEQ | ~[\\\r\n"] )* '"'
 	;
 	
Identifier
    :   GemLetter GemLetterOrDigit*
    ;
 	
fragment STRING_ESCAPE_SEQ
 	: '\\' .
 	;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

COMMENT
	: '/*' .*? '*/' -> skip
	;

LINE_COMMENT
	: '//' ~[\r\n]* -> skip
	;



compilationUnit: (outervariableDeclaration | methodDeclaration)* methodDeclaration EOF;

outervariableDeclaration 
	: type variableDeclarators ';'
	;
	
variableDeclaration
	: type variableDeclarators ';'
    ;

methodDeclaration
    :   (type | 'void') Identifier parameters
        (   methodBody
        |   ';'
        )
    ;

methodBody
    :   block
    ;

expression :   primary #primaryExpr
    |   expression '[' expression ']' #arrayExpr
    |   expression '(' expressionList? ')' #funcExpr
    |   'new' constructor #constructorExpr
    |	'inputNumber' #inputNumberExpr
    |   'inputStr' #inputStrExpr
    |   ('+'|'-') expression #unaryExpr
    |   ('!') expression #unaryRelExpr
    |   expression ('*'|'/'|'%') expression #binTopExpr
    |   expression ('+'|'-') expression #binLowExpr
    |   expression ('<=' | '>=' | '>' | '<') expression #binRelExpr
    |   expression ('==' | '!=') expression #binEqExpr
    |   expression '&&' expression #binAndExpr
    |   expression '||' expression #binOrExpr
    |	expression 'trigger' expression 	#triggerExpr
    |   <assoc=right> expression 
        (   '='
        |   '+='
        |   '-='
        |   '*='
        |   '/='
        |   '%=' 
        )
        expression #assignExpr
;


type
    :	eventType ('[' ']')*
    |   specialType ('[' ']')*
    |   primitiveType ('[' ']')*
    ;


constructor: unitConstructor
		   | battleConstructor
		   | eventConstructor
		   | skillConstructor
		   ;

eventConstructor:	'Event' eventArguments eventBlock
				;
				
eventArguments	:	'(' eventExpressionList ')'
				;

eventExpressionList
	:	expression ',' expression ',' expression (',' expressionList)?
	;

eventBlock: '{' blockStatement*
				nextStatement '}'
				;

unitConstructor	: 'Unit' unitArguments
				;

unitArguments: '(' expression ',' expression ',' expression ',' expression ',' expression ',' expression ')';

battleConstructor: 'Battle' battleArguments
				 ;

battleArguments	: '(' expression ',' expression ')'
				;

skillConstructor: 'Skill' skillArguments
				;

skillArguments	: '(' expression ',' expression ',' expression ',' expression ',' expression ',' expression ')'
				;

arguments
    :   '(' expressionList? ')'
    ;

expressionList
    :   expression (',' expression)*
    ;

block
    :   '{' blockStatement* '}'
    ;

blockStatement
    :   statement
    |   variableDeclaration
    ;

variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    :   Identifier
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}' #arrayInitializer1
    |    'array' type ('[' expression ']')+ #arrayInitializer2 
    ;

statement	:   block	#bs
			|   'if' parExpression statement ('else' statement)?	#ifStatement
			|   'for' '(' forControl ')' statement	#forStatement
			|   'while' parExpression statement	#whileStatement
			|   'switch' parExpression '{' switchBlockStatementGroup* switchLabel* '}'	#switchStatement
			|   'return' expression? ';'	#returnStatement
			|	'print' expression ';'	#printStatement
			|   'break' ';'	#breakStatement
			|   'continue' ';'	#continueStatement
			|	'run' expression ';'	#runStatement
			|   ';'	#emptyStatement
			|   statementExpression ';'	#statementExpr
			;

nextStatement:
		'next' expression ';';

switchBlockStatementGroup
    :   switchLabel+ blockStatement+
    ;

switchLabel
    :   'case' expression ':'
    |   'default' ':'
    ;

parExpression
    :   '(' expression ')'
    ;
    
forControl
    :   forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   expressionList
    ;

forUpdate
    :   expressionList
    ;

statementExpression
    :   expression
    ;

eventType: 'Event';

specialType: 'Unit' | 'Battle' | 'Skill'; 

primitiveType
	:   'boolean'
    |   'int'
    |   'double'
    |	'String'
    ;

parameters
	:	'(' parameterList? ')'
	;

parameterList
	:	parameter (',' parameter)*
	;

parameter
	:	type variableDeclaratorId
	;

primary
    :   '(' expression ')'
    |   Identifier
    |   literal
    ;

literal
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   StringLiteral
    |   BooleanLiteral
    |   'null'
    ;

