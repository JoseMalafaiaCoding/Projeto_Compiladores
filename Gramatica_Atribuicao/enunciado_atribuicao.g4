//Defino um nome para nossa gramática
grammar enunciado_atribuicao;

//O token init indica a raiz da nossa gramatica
init: instrucao_atribuicao;

//Um caractere é composto por 1 único digito numérico ou caractere ASCII entre aspas simples
CARACTERE: [a-zA-Z0-9];

//Um literal textual é composto por caracteres e também números entre aspas duplas
LITERAL_TEXTO: '"' [a-zA-Z]+ '"';

//um literal numérico corresponde a um literal composto somente por números e sem aspas, também pode ter ponto caso senha decimal
LITERAL_NUMERICO: [0-9]+ (. [0-9]+)?;

//literal booleano é a palavra verdadeiro ou a palavra falso
literal_booleano: 'verdadeiro' | 'falso';

//literal é um token com todas os tipos literais aceitos por java
literal: LITERAL_TEXTO | LITERAL_NUMERICO | CARACTERE | literal_booleano;

//um operador pode ser qualquer operador aritmético, condicional ou operador lógico
operador: '+' | '-' | '*' | '/' | '<' | '>' | '<=' | '>=';

//Identificador pode ser uma variável, método, array
IDENTIFICADOR: [a-zA-Z0-9]+;

//uma expressão começa com uma "expressão" um operador no meio e outra "expressao" (algo assim) (e colocar a parte do operador entre parenteses)
expressao: (literal | (('!')? (literal | IDENTIFICADOR) operador ('!')? (literal | IDENTIFICADOR))))  | expressao;

//A sintaxe da instrução(enunciado) de atribuição em java é composta por tipo, identificador da variavel sendo criada e uma expressão que, quando avaliada retorne um valor do tipo especificado
instrucao_atribuicao: tipo IDENTIFICADOR ':=' expressao;

//tipo são todos os tipos aceitos por java
tipo: 'inteiro' | 'decimal' | 'caractere' | 'cadeia' | 'booleano';

//comando para ignorar espaços, tabulações, carriage return e pulo de linha
Ws: [ \t\r\n]+ -> skip;