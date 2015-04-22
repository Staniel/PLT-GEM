grammar GEM;

Identifier
    :   GemLetter GemLetterOrDigit*
    ;

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
 	
fragment STRING_ESCAPE_SEQ
 	: '\\' .
 	;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

compilationUnit: (variableDeclaration | methodDeclaration)* methodDeclaration EOF;

variableDeclaration
	: type variableDeclarators ';'
    ;

methodDeclaration
    :   (type|'void') Identifier '(' parameterList? ')'
        (   methodBody
        |   ';'
        )
    ;

methodBody
    :   block
    ;

expression
    :   primary
    |   expression '[' expression ']'
    |   expression '(' expressionList? ')'
    |   'new' constructor
    |   ('+'|'-') expression
    |   ('~'|'!') expression
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<=' | '>=' | '>' | '<') expression
    |   expression ('==' | '!=') expression
    |   expression '&&' expression
    |   expression '||' expression
    |   <assoc=right> expression
        (   '='
        |   '+='
        |   '-='
        |   '*='
        |   '/='
        |   '%='
        )
        expression
;

type
    :	eventType ('[' ']')*
    |   specialType ('[' ']')*
    |   primitiveType ('[' ']')*
    ;

constructor: specialType arguments specialBlock        //how to check?
		   | eventType eventArguments block;

arguments
    :   '(' expressionList? ')'
    ;

expressionList
    :   expression (',' expression)*
    ;

eventArguments
	:	'(' eventExpressionList ')'
	;

eventExpressionList
	:	expression ',' expression (',' expressionList)?
	;

block
    :   '{' blockStatement* '}'
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   statement
    |   variableDeclaration
    ;

specialBlock
	:	statementExpression*
	;

localVariableDeclarationStatement
    :    localVariableDeclaration ';'
    ;

localVariableDeclaration
    :   type variableDeclarators
    ;

variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    :   Identifier ('[' ']')*
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

statement
    :   block
    |   'if' parExpression statement ('else' statement)?
    |   'for' '(' forControl ')' statement
    |   'while' parExpression statement
    |   'switch' parExpression '{' switchBlockStatementGroup* switchLabel* '}'
    |   'return' expression? ';'
    |	'next' expression ';'
    |	'print' expression ';'
    |   'break' ';'
    |   'continue' ';'
    |   ';'
    |   statementExpression ';'
    ;

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
    :   localVariableDeclaration
    |   expressionList
    ;

forUpdate
    :   expressionList
    ;

statementExpression
    :   expression
    ;

specialType: 'Monster' | 'Hero' | 'Battle' | 'Item';
eventType: 'Event';
primitiveType
	:   'boolean'
    |   'int'
    |   'float'
    |	'String'
    ;

parameterList
	: parameter (',' parameter)*
	;

parameter
	: type variableDeclaratorId
	;

primary
    :   '(' expression ')'
    |   literal
    |   Identifier
    ;

literal
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   StringLiteral
    |   BooleanLiteral
    |   'null'
    ;



