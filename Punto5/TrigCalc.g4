grammar TrigCalc;

// Tokens
SIN : 'Sin';
COS : 'Cos';
TAN : 'Tan';
LPAREN : '(';
RPAREN : ')';
NUMBER : [0-9]+ ('.' [0-9]+)?;
WS : [ \t\n\r]+ -> skip;

// Reglas del parser
expr : SIN LPAREN expr RPAREN
     | COS LPAREN expr RPAREN
     | TAN LPAREN expr RPAREN
     | NUMBER
     ;

calculation : expr+;
