//Nome para a gramática condicional
grammar enunciado_condicional;

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//importa as regras criadas para a gramática de atribuição colocar -lib e o caminho da gramatica importada como parametro ao executar o camando antlr4 no terminal

import enunciado_atribuicao;

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Defino a regra raiz da gramática
init:{System.out.println("");} instrucao_condicional;

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//condicao é a expressao que vai entre parenteses na instrução se-entao-senao
condicao: literal_booleano | expressao_relacional {System.out.println($expressao_relacional.text);}| expressao_logica;

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

//instrucao_condicional é referenciada na regra raiz e define a sintaxe da instrução se-entao-senao da gramatica
//a regra começa com a palavra reservada se seguida de abre parênteses, condicao, fecha parênteses, entao mais abre chaves
//em seguida, dentro do bloco da condicional pode ser inserida qualquer tipo de instrução ou expressão presentes em java, como outra instrução condcional ou uma instrução de atribuição
//caso a condição seja falsa o bloco do entao é ignorado e o codigo do senao é executado e dentro deste podem ocorrer novas instruções e expressões
//abre e fecha chaves estão ao inicio e final de cada bloco da instrução condicional para facilitar a leitura
instrucao_condicional: 'se' '(' {System.out.print("if (");}condicao')' {System.out.println(") {");}'logo''{'(instrucao_atribuicao | instrucao_condicional)*'}' {System.out.println("} ");}( 'tirante' {System.out.println(" else { ");}'{' (instrucao_atribuicao | instrucao_condicional)* '}' {System.out.println("}");})?;