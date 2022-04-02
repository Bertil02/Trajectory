
grammar Trajectory;

@header {
    package antlr;
}

//start symbol
trajectory: (object)* EOF;

//lexer rules
object: identifier body;

identifier: 'ID:' ID;

body: '{' (entry)* '};';

entry: 'entry(' entry_declaration '),';

entry_declaration: position ',' FACING ',' TIME ',' DATE;

position: '('longitude','latitude','ELEVATION')';

longitude: DEGREES ':' MINUTES ':' SECONDS;
latitude: DEGREES ':' MINUTES ':' SECONDS;


//TOKENS
TIME : [0-9][0-9]':'[0-9][0-9]':'[0-9][0-9]':'[0-9][0-9][0-9];

DATE : [0-9][0-9]':'[0-9][0-9]':'[0-9][0-9][0-9][0-9];

FACING :[0-9][0-9][0-9];

DEGREES : [1-9]
        | [0-9][0-9]
        | [0-9][0-9][0-9]
        ;

MINUTES : [1-9]'`'
        | [0-9][0-9]'`'
        | [0-9][0-9][0-9]'`'
        ;

SECONDS : [1-9]'``'
        | [0-9][0-9]'``'
        | [0-9][0-9][0-9]'``'
        ;

ELEVATION : '0' | '-'?[1-9][0-9]*'m';

ID : [a-zA-Z0-9]*;

COMMENT : '--' ~[\r\n]* -> skip;

WS : [ \t\n]+ -> skip;