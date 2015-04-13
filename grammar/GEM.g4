grammar GEM;

SpecialType: 'Monster' | 'Hero' | 'Battle' | 'Item';
EventType: 'Event';
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

compilationUnit: typeDeclaration * EOF;
typeDeclaration: ;
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

constructor: SpecialType '(' parameterListOpt ')' specialBlock        //how to check?
		   | EventType '(' eventParameterList ')' block;

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

expressionList: expression (',' expression)*
    ;



