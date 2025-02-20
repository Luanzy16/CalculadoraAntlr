grammar calculadora;

expresion: expresion op=('*'|'/') expresion   # MultiplicacionDivision
         | expresion op=('+'|'-') expresion   # SumaResta
         | '(' expresion ')'                  # Parentesis
         | NUMERO                              # Numero
         ;

NUMERO: [0-9]+ ('.' [0-9]+)?;
ESPACIO: [ \t\r\n]+ -> skip;