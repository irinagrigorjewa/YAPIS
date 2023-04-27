grammar Grammar;
program : 'main' (subprogram_non_return|subprogram_return)*block;

block :BEGIN statement* END;

statement :
assign_var |
assign_string |
assign_string_array |
print |
operations |
operarions_with_string_array |
assign_var_method_invocation |
while_cycle |
if_else |
method_invocation |
for_each;


BEGIN : 'begin';

IF : 'if';
PRINT : 'print';
FOR: 'for';
ELSE : 'else';
END : 'end';
CONST : 'const';
WHILE : 'while';
INT : 'int';
CHAR : 'char';
ADD : 'add';
REMOVE : 'remove';
STRING : 'string';
STRING_ARRAY : 'stringArray';
RETURN : 'return';
CALL : 'call';
GLOBAL : 'global';
VOID: 'void';
DOT : '.';
DOT_COMMA : ';';
COLON : ':';



PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
AND: '&';

NEGATION : '!';
EQUAL: '==';
NON_EQUAL: '!=';
LESS: '<';
LESS_OR_EQUALS: '<=';
GREATER: '>';
GREATER_OR_EQUALS: '>=';

O_BRACKET : '(';
C_BRACKET : ')';

K_O_BRACKET : '{';
K_C_BRACKET : '}';

SQ_O_BRACKET : '[';
SQ_C_BRACKET : ']';


LINE : '"'(.)+?'"';
NUMBER : [0-9]+;
SYMBOL : '\''(.)'\'';
ID : [a-zA-Z_][a-zA-Z_0-9]*;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

expression:	expression (MULTIPLY|AND) expression
    |	expression (PLUS|MINUS) expression
    |	ID
    |	O_BRACKET expression C_BRACKET
    | NUMBER
    ;

   intialize_char: SYMBOL;
   initialize_string: LINE|(ID(MULTIPLY|AND|PLUS|MINUS)ID);
   initialize_string_array : (SQ_O_BRACKET SQ_C_BRACKET)|(SQ_O_BRACKET (ID ',')* ID SQ_C_BRACKET);

   global_assign_var : GLOBAL assign_var;
   global_assign_string : GLOBAL assign_string;
   global_assign_string_array : GLOBAL assign_string_array;

   print : PRINT O_BRACKET (ID|NUMBER|LINE) C_BRACKET DOT_COMMA;

   assign_var_method_invocation : type CONST? ID '=' method_invocation;
   assign_string : STRING CONST? ID '=' (initialize_string) DOT_COMMA;
   assign_string_array : STRING_ARRAY CONST? ID '=' (initialize_string_array) DOT_COMMA;
   assign_var : simple_type CONST? ID '=' (expression|intialize_char) DOT_COMMA;

   operarions_with_string_array: ID DOT (ADD|REMOVE) (O_BRACKET ID C_BRACKET) DOT_COMMA;


    operations : ID '=' expression DOT_COMMA;
    simple_compare : (expression) (EQUAL|NON_EQUAL|LESS|GREATER|LESS_OR_EQUALS|GREATER_OR_EQUALS) (expression);
    multi_compare : NEGATION? O_BRACKET simple_compare C_BRACKET;

    while_cycle: WHILE O_BRACKET (simple_compare|multi_compare) C_BRACKET block;
    if_else: IF O_BRACKET (simple_compare|multi_compare) C_BRACKET block ELSE block;
    for_each: FOR O_BRACKET ID COLON ID C_BRACKET block;

    type: INT|CHAR|STRING|STRING_ARRAY;
    simple_type: INT|CHAR;
    signature: (O_BRACKET (type ID ',')* (type ID) C_BRACKET);
    subprogram_return : 'func' type ID (signature|(O_BRACKET C_BRACKET)) block_return;
    subprogram_non_return : VOID ID (signature|(O_BRACKET C_BRACKET)) (block_non_return|block);

    block_return : BEGIN statement* RETURN ID DOT_COMMA END;
    block_non_return : BEGIN statement* RETURN DOT_COMMA END;

    signature_method_invocation: (O_BRACKET (ID ',')* (ID) C_BRACKET);
    method_invocation :  ID (signature_method_invocation|(O_BRACKET C_BRACKET)) DOT_COMMA;

    global_program: (global_assign_var|global_assign_string|global_assign_string_array)*program;



