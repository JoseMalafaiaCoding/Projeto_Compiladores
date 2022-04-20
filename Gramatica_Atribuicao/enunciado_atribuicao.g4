//Defino um nome para nossa gramática
grammar enunciado_atribuicao;

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//O token init indica a raiz da nossa gramatica
init: instrucao_atribuicao;

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Um caractere é composto por 1 único digito numérico ou caractere ASCII entre aspas simples
CARACTERE: [a-zA-Z0-9];

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Um literal textual é composto por caracteres e também números entre aspas duplas
LITERAL_TEXTO: '"' [a-zA-Z0-9]+ '"';

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//um literal numérico corresponde a um literal composto somente por números e sem aspas, também pode ter ponto caso senha decimal
LITERAL_NUMERICO: [0-9]+ | [0-9]? . [0-9]+;

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//literal booleano é a palavra verdadeiro ou a palavra falso
literal_booleano: 'verdadeiro' | 'falso';

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//literal é um token com todas os tipos literais aceitos por java
literal: LITERAL_TEXTO | LITERAL_NUMERICO | CARACTERE | literal_booleano;

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Operadores aritmeticos mais, menos, divisão e multiplicação
operador_aritmetico: '+' | '-' | '/' | '*';

//Operadores relacionais maior que, menor que, menor ou igual, maior ou igual
operador_relacional: '>' | '<' | '<=' | '>=';

//Operadores logicos AND, OR, XOR e NOT
operador_logico: '&&' | '||' | '!';

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Lexema . representa fim da linha de comando
fim_linha: '.';

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Identificador pode ser uma variável, método, array
IDENTIFICADOR: [a-zA-Z][a-zA-Z0-9]*;


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//tipo são todos os tipos aceitos por java
//tipo: 'decimal' | 'caractere' | 'cadeia' | 'booleano';
tipo_inteiro: 'inteiro' | 'longo' | 'curto' | 'byte';
tipo_decimal: 'decimal' | 'flutuante';
tipo_texto: 'texto';
tipo_caractere: 'caractere';

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Uma expressão começa com uma "expressão" um operador no meio e outra "expressao" (algo assim)
/*Expressoes serão divididas em dois tipos, as expressoes artmeticas que envolvem números, variaveis numericas e operadores aritmeticos e também em expressoes logicas
(ou booleanas) que são as expressoes com operadores relacionais, logicos, variaveis e valores booleanos*/
//expressao: expressao_aritmetica | expressao_relacional | expressao_logica;

//Abaixo a expressão numérica
expressao_aritmetica: (LITERAL_NUMERICO|IDENTIFICADOR) (operador_aritmetico (LITERAL_NUMERICO|IDENTIFICADOR))*;

//Abaixo a expressão relacional
expressao_relacional: (LITERAL_NUMERICO|IDENTIFICADOR) operador_relacional (LITERAL_NUMERICO|IDENTIFICADOR);

//Abaixo a expressão lógica
expressao_logica: '!'*(literal_booleano|IDENTIFICADOR) (operador_logico '!'*(literal_booleano|IDENTIFICADOR))*;

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//A sintaxe da instrução(enunciado) de atribuição em java é composta por tipo, identificador da variavel sendo criada e uma expressão que, quando avaliada retorne um valor do tipo especificado
instrucao_atribuicao: atribuicao_inteiros | atribuicao_decimal | atribuicao_texto | atribuicao_booleana | atribuicao_caractere;

//Todos os tipos de atribuições abaixo
atribuicao_inteiros: tipo_inteiro IDENTIFICADOR ':=' expressao_aritmetica fim_linha {
    if ($tipo_inteiro.text.equals("inteiro")) System.out.println("int " + $IDENTIFICADOR.text + "=" + $expressao_aritmetica.text + ";");
    if ($tipo_inteiro.text.equals("longo")) System.out.println("long " + $IDENTIFICADOR.text + "=" + $expressao_aritmetica.text + ";");
    if ($tipo_inteiro.text.equals("curto")) System.out.println("short " + $IDENTIFICADOR.text + "=" + $expressao_aritmetica.text + ";");
    if ($tipo_inteiro.text.equals("byte")) System.out.println("byte " + $IDENTIFICADOR.text + "=" + $expressao_aritmetica.text + ";");};
atribuicao_decimal: tipo_decimal IDENTIFICADOR ':=' expressao_aritmetica fim_linha;
atribuicao_booleana: 'booleano' IDENTIFICADOR ':=' expressao_logica | expressao_relacional fim_linha;
atribuicao_texto: tipo_texto IDENTIFICADOR ':=' LITERAL_TEXTO fim_linha;
atribuicao_caractere: tipo_caractere IDENTIFICADOR ':=' CARACTERE fim_linha;

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

//comando para ignorar espaços, tabulações e carriage return
Ws: [ \t\r\n]+ -> skip;

