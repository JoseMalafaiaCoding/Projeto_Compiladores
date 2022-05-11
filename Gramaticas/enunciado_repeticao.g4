grammar enunciado_repeticao;

//Importa a gramatica da instrução condicional que importa as demais gramáticas
import enunciado_condicional;

//Raiz da nossa gramática de repetição
init: instrucao_repeticao;

//Regra contendo as sintaxes das instruções de repetição da linguagem
instrucao_repeticao: repeticao_para;

/*Instrução da repetição "para" da linguagem, as expressões são respectivamente de declaração e atribuição, condição da repetição e incremento ou decremento(mas também pode ser qualquer expressão de atribuição a uma variável)*/
repeticao_para: 'para' '('instrucao_atribuicao ',' condicao ',' ('soma' IDENTIFICADOR | 'subtrai' IDENTIFICADOR)')' 'siga' '{'(repeticao_para | instrucao_condicional | instrucao_atribuicao)* '}';

