//#1---Definição do nome da gramática e regra inicial---------------------------------------------------------------------------------------------------------
grammar Gramatica;

init: classe_principal;
//-----------------------------------------------------------------------------------------------------------------------------------------------------------

//#2---Regras para a declaração da classe principal que contem o método main-----------------------------------------------------------------------------------
classe_principal: 'classe' nome_classe instrucao* 'fim classe';
nome_classe: NOME_CLASSE;
NOME_CLASSE: [A-Z][a-z0-9]*;
//-----------------------------------------------------------------------------------------------------------------------------------------------------------

//#3---Definição da expressão regular de um identificador------------------------------------------------------------------------------------------------------
ID: [a-zA-Z]+ [0-9]*;
id: ID;
//-----------------------------------------------------------------------------------------------------------------------------------------------------------

//#4---Definição das expressoes regulares dos tipos--------------------------------------------------------------------------------------------------------------------------
tipo_inteiro: 'inteiro';
tipo_decimal: 'decimal';
tipo_texto: 'texto';
tipo_booleano: 'verdadeiro' | 'falso';
//-----------------------------------------------------------------------------------------------------------------------------------------------------------

//#5---Definição das expressões regulares dos Literais---------------------------------------------------------------------------------------------------------
LITERAL_INTEIRO: [0-9]+;
literal_inteiro: LITERAL_INTEIRO;

LITERAL_DECIMAL: [0-9]* '.' [0-9]+;
literal_decimal: LITERAL_DECIMAL;

literal_booleano: 'verdadeiro' | 'falso';

LITERAL_TEXTO: '"' [a-zA-Z0-9 ]+ '"';
literal_texto: LITERAL_TEXTO;
//------------------------------------------------------------------------------------------------------------------------------------------------------------

//#6---Definição das expressões para operadores e fim de linha------------------------------------------------------------------------------------------------
operador_aritmetico: '+' | '-' | '/' | '*';
operador_relacional: '<' | '>' | '<=' | '>=' | '==' | '!=';
operador_logico: '&&' | '||' | '^';
operador_atribuicao: ':=';
operador_concatenacao: '<>';
abre_parenteses:;
fecha_parenteses:;
abre_chaves:;
fim_linha: '.';
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

//#7---Definição das regras de expressões------------------------------------------------------------------------------------------------------------------------
expressao_aritmetica_inteiro: (literal_inteiro|id) operador_aritmetico ((literal_inteiro|id) | expressao_aritmetica_inteiro);
expressao_aritmetica_decimal: (literal_decimal|literal_inteiro | id) operador_aritmetico ((literal_decimal | literal_inteiro |id) | expressao_aritmetica_decimal);
expressao_concatenacao:(literal_texto | id) (operador_concatenacao ((literal_texto | id) | expressao_concatenacao))*;
expressao_relacional: (id | literal_inteiro | literal_decimal) operador_relacional ((id | literal_inteiro | literal_decimal) | expressao_relacional)+;
expressao_logica: (id | literal_booleano | expressao_relacional) operador_logico ((id | literal_booleano | expressao_relacional) | expressao_relacional)+;
expressao_condicao: expressao_relacional | expressao_logica | literal_booleano;
//expressao: ((expressao_relacional | expressao_logica | expressao_aritmetica_inteiro | expressao_aritmetica_decimal) fim_linha);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

//#8----------------------------------------------Instruções-----------------------------------------------------------------------------------------------------

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//#8.1---Definição da regra de instruções--------------------------------------------------------------------------------------------------------------------------
instrucao: instrucao_declaracao | instrucao_atribuicao fim_linha | instrucao_condicional | instrucao_repeticao | instrucao_imprecao | instrucao_varredura;
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

//#8.2---Definição das regras das instruções de declaração e atribuição--------------------------------------------------------------------------------------------
instrucao_declaracao: (instrucao_declaracao_inteiro | instrucao_declaracao_decimal | instrucao_declaracao_texto) fim_linha;
instrucao_atribuicao: (instrucao_atribuicao_inteiro | instrucao_atribuicao_decimal | instrucao_atribuicao_texto);

instrucao_declaracao_inteiro: (tipo_inteiro id) | (tipo_inteiro id operador_atribuicao (((id | literal_inteiro) | expressao_aritmetica_inteiro) | proximo_inteiro));
instrucao_atribuicao_inteiro: id operador_atribuicao (((id | literal_inteiro) | expressao_aritmetica_inteiro) | proximo_inteiro);

instrucao_declaracao_decimal: (tipo_decimal id) | (tipo_decimal id operador_atribuicao (((id | literal_decimal) | expressao_aritmetica_decimal) | proximo_decimal));
instrucao_atribuicao_decimal: id operador_atribuicao (((id | literal_decimal) | expressao_aritmetica_decimal) | proximo_decimal);

instrucao_declaracao_texto: (tipo_texto id) | (tipo_texto id operador_atribuicao (id | literal_texto | proximo_texto | expressao_concatenacao));
instrucao_atribuicao_texto: id operador_atribuicao (id | literal_texto | proximo_texto | expressao_concatenacao);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

//#8.3---Definição da instrucao se senao---------------------------------------------------------------------------------------------------------------------------
instrucao_condicional: 'se' abre_parenteses expressao_condicao fecha_parenteses 'entao' abre_chaves instrucao* 'fim se' senao;
senao: 'senao' instrucao* 'fim senao'|;
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

//#8.4---Definição das instruções de repetição---------------------------------------------------------------------------------------------------------------------
instrucao_repeticao: repeticao_para | repeticao_enquanto | repeticao_ciclo;
separacao_argumentos: ','; 
declaracao_para: instrucao_declaracao_inteiro | instrucao_declaracao_decimal | instrucao_declaracao_texto | instrucao_atribuicao_inteiro | instrucao_atribuicao_decimal | instrucao_atribuicao_texto;
repeticao_para: 'para' abre_parenteses (declaracao_para | ) separacao_argumentos (expressao_condicao|) separacao_argumentos (instrucao_atribuicao_inteiro |) fecha_parenteses 'rode' abre_chaves instrucao* 'fim para';
repeticao_enquanto: 'enquanto' abre_parenteses expressao_condicao fecha_parenteses 'rode' abre_chaves instrucao* 'fim enquanto';
meio_ciclo:;
repeticao_ciclo: 'cicle' instrucao* 'fim ciclo' 'enquanto' meio_ciclo abre_parenteses expressao_condicao fecha_parenteses fim_linha;
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

//#8.5---Definição da instrução de leitura de dados -------------------------------------------------------------------------------------------------------------------------
instrucao_varredura: 'varrer' id operador_atribuicao nova_varredura fim_linha;
nova_varredura: 'nova varredura';
proximo_inteiro: id 'proximo inteiro';
proximo_decimal: id 'proximo decimal';
proximo_texto: id 'proximo texto'; 
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

//#8.6---Definição da regra de impressão---------------------------------------------------------------------------------------------------------------------------
instrucao_imprecao: 'imprima' (id | expressao_concatenacao)* '.';
//------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

//#9---Regra para ignorar espaços returns e tabulações-----------------------------------------------------------------------------------------------------------
Ws: [ \t\n\r] -> skip;


