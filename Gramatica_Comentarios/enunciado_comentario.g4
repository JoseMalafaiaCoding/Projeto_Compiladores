//Definida a gramatica
grammar: enunciado_comentario;

//Raiz da gramatica definica como comentario
init: cometario;

//Expressão regular para comentario de uma linha
LINHA_UNICA: '/''/'[a-zA-Z0-9]*;

//Expressão regular para comentario de mais de uma linha
LINHAS_MULTIPLAS: /'*' [a-zA-Z0-9]  '*'/;