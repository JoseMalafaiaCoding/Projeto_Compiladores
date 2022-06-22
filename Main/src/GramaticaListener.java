// Generated from Gramatica.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(GramaticaParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(GramaticaParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#classe_principal}.
	 * @param ctx the parse tree
	 */
	void enterClasse_principal(GramaticaParser.Classe_principalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#classe_principal}.
	 * @param ctx the parse tree
	 */
	void exitClasse_principal(GramaticaParser.Classe_principalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#nome_classe}.
	 * @param ctx the parse tree
	 */
	void enterNome_classe(GramaticaParser.Nome_classeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#nome_classe}.
	 * @param ctx the parse tree
	 */
	void exitNome_classe(GramaticaParser.Nome_classeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(GramaticaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(GramaticaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo_inteiro}.
	 * @param ctx the parse tree
	 */
	void enterTipo_inteiro(GramaticaParser.Tipo_inteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo_inteiro}.
	 * @param ctx the parse tree
	 */
	void exitTipo_inteiro(GramaticaParser.Tipo_inteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo_decimal}.
	 * @param ctx the parse tree
	 */
	void enterTipo_decimal(GramaticaParser.Tipo_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo_decimal}.
	 * @param ctx the parse tree
	 */
	void exitTipo_decimal(GramaticaParser.Tipo_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo_texto}.
	 * @param ctx the parse tree
	 */
	void enterTipo_texto(GramaticaParser.Tipo_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo_texto}.
	 * @param ctx the parse tree
	 */
	void exitTipo_texto(GramaticaParser.Tipo_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo_booleano}.
	 * @param ctx the parse tree
	 */
	void enterTipo_booleano(GramaticaParser.Tipo_booleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo_booleano}.
	 * @param ctx the parse tree
	 */
	void exitTipo_booleano(GramaticaParser.Tipo_booleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#literal_inteiro}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_inteiro(GramaticaParser.Literal_inteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#literal_inteiro}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_inteiro(GramaticaParser.Literal_inteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#literal_decimal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_decimal(GramaticaParser.Literal_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#literal_decimal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_decimal(GramaticaParser.Literal_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#literal_booleano}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_booleano(GramaticaParser.Literal_booleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#literal_booleano}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_booleano(GramaticaParser.Literal_booleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#literal_texto}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_texto(GramaticaParser.Literal_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#literal_texto}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_texto(GramaticaParser.Literal_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico(GramaticaParser.Operador_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico(GramaticaParser.Operador_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(GramaticaParser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(GramaticaParser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(GramaticaParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(GramaticaParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operador_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterOperador_atribuicao(GramaticaParser.Operador_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operador_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitOperador_atribuicao(GramaticaParser.Operador_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operador_concatenacao}.
	 * @param ctx the parse tree
	 */
	void enterOperador_concatenacao(GramaticaParser.Operador_concatenacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operador_concatenacao}.
	 * @param ctx the parse tree
	 */
	void exitOperador_concatenacao(GramaticaParser.Operador_concatenacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#abre_parenteses}.
	 * @param ctx the parse tree
	 */
	void enterAbre_parenteses(GramaticaParser.Abre_parentesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#abre_parenteses}.
	 * @param ctx the parse tree
	 */
	void exitAbre_parenteses(GramaticaParser.Abre_parentesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fecha_parenteses}.
	 * @param ctx the parse tree
	 */
	void enterFecha_parenteses(GramaticaParser.Fecha_parentesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fecha_parenteses}.
	 * @param ctx the parse tree
	 */
	void exitFecha_parenteses(GramaticaParser.Fecha_parentesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#abre_chaves}.
	 * @param ctx the parse tree
	 */
	void enterAbre_chaves(GramaticaParser.Abre_chavesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#abre_chaves}.
	 * @param ctx the parse tree
	 */
	void exitAbre_chaves(GramaticaParser.Abre_chavesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fim_linha}.
	 * @param ctx the parse tree
	 */
	void enterFim_linha(GramaticaParser.Fim_linhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fim_linha}.
	 * @param ctx the parse tree
	 */
	void exitFim_linha(GramaticaParser.Fim_linhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_aritmetica_inteiro}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aritmetica_inteiro(GramaticaParser.Expressao_aritmetica_inteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_aritmetica_inteiro}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aritmetica_inteiro(GramaticaParser.Expressao_aritmetica_inteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_aritmetica_decimal}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aritmetica_decimal(GramaticaParser.Expressao_aritmetica_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_aritmetica_decimal}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aritmetica_decimal(GramaticaParser.Expressao_aritmetica_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_concatenacao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_concatenacao(GramaticaParser.Expressao_concatenacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_concatenacao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_concatenacao(GramaticaParser.Expressao_concatenacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_relacional(GramaticaParser.Expressao_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_relacional(GramaticaParser.Expressao_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_logica(GramaticaParser.Expressao_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_logica(GramaticaParser.Expressao_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_condicao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_condicao(GramaticaParser.Expressao_condicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_condicao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_condicao(GramaticaParser.Expressao_condicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(GramaticaParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(GramaticaParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucao_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_declaracao(GramaticaParser.Instrucao_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucao_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_declaracao(GramaticaParser.Instrucao_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucao_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_atribuicao(GramaticaParser.Instrucao_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucao_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_atribuicao(GramaticaParser.Instrucao_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucao_declaracao_inteiro}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_declaracao_inteiro(GramaticaParser.Instrucao_declaracao_inteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucao_declaracao_inteiro}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_declaracao_inteiro(GramaticaParser.Instrucao_declaracao_inteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucao_atribuicao_inteiro}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_atribuicao_inteiro(GramaticaParser.Instrucao_atribuicao_inteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucao_atribuicao_inteiro}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_atribuicao_inteiro(GramaticaParser.Instrucao_atribuicao_inteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucao_declaracao_decimal}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_declaracao_decimal(GramaticaParser.Instrucao_declaracao_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucao_declaracao_decimal}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_declaracao_decimal(GramaticaParser.Instrucao_declaracao_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucao_atribuicao_decimal}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_atribuicao_decimal(GramaticaParser.Instrucao_atribuicao_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucao_atribuicao_decimal}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_atribuicao_decimal(GramaticaParser.Instrucao_atribuicao_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucao_declaracao_texto}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_declaracao_texto(GramaticaParser.Instrucao_declaracao_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucao_declaracao_texto}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_declaracao_texto(GramaticaParser.Instrucao_declaracao_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucao_atribuicao_texto}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_atribuicao_texto(GramaticaParser.Instrucao_atribuicao_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucao_atribuicao_texto}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_atribuicao_texto(GramaticaParser.Instrucao_atribuicao_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucao_condicional}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_condicional(GramaticaParser.Instrucao_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucao_condicional}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_condicional(GramaticaParser.Instrucao_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(GramaticaParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(GramaticaParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucao_repeticao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_repeticao(GramaticaParser.Instrucao_repeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucao_repeticao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_repeticao(GramaticaParser.Instrucao_repeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#separacao_argumentos}.
	 * @param ctx the parse tree
	 */
	void enterSeparacao_argumentos(GramaticaParser.Separacao_argumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#separacao_argumentos}.
	 * @param ctx the parse tree
	 */
	void exitSeparacao_argumentos(GramaticaParser.Separacao_argumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracao_para}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_para(GramaticaParser.Declaracao_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracao_para}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_para(GramaticaParser.Declaracao_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#repeticao_para}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao_para(GramaticaParser.Repeticao_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#repeticao_para}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao_para(GramaticaParser.Repeticao_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#repeticao_enquanto}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao_enquanto(GramaticaParser.Repeticao_enquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#repeticao_enquanto}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao_enquanto(GramaticaParser.Repeticao_enquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#meio_ciclo}.
	 * @param ctx the parse tree
	 */
	void enterMeio_ciclo(GramaticaParser.Meio_cicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#meio_ciclo}.
	 * @param ctx the parse tree
	 */
	void exitMeio_ciclo(GramaticaParser.Meio_cicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#repeticao_ciclo}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao_ciclo(GramaticaParser.Repeticao_cicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#repeticao_ciclo}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao_ciclo(GramaticaParser.Repeticao_cicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucao_varredura}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_varredura(GramaticaParser.Instrucao_varreduraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucao_varredura}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_varredura(GramaticaParser.Instrucao_varreduraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#nova_varredura}.
	 * @param ctx the parse tree
	 */
	void enterNova_varredura(GramaticaParser.Nova_varreduraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#nova_varredura}.
	 * @param ctx the parse tree
	 */
	void exitNova_varredura(GramaticaParser.Nova_varreduraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#proximo_inteiro}.
	 * @param ctx the parse tree
	 */
	void enterProximo_inteiro(GramaticaParser.Proximo_inteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#proximo_inteiro}.
	 * @param ctx the parse tree
	 */
	void exitProximo_inteiro(GramaticaParser.Proximo_inteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#proximo_decimal}.
	 * @param ctx the parse tree
	 */
	void enterProximo_decimal(GramaticaParser.Proximo_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#proximo_decimal}.
	 * @param ctx the parse tree
	 */
	void exitProximo_decimal(GramaticaParser.Proximo_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#proximo_texto}.
	 * @param ctx the parse tree
	 */
	void enterProximo_texto(GramaticaParser.Proximo_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#proximo_texto}.
	 * @param ctx the parse tree
	 */
	void exitProximo_texto(GramaticaParser.Proximo_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucao_imprecao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_imprecao(GramaticaParser.Instrucao_imprecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucao_imprecao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_imprecao(GramaticaParser.Instrucao_imprecaoContext ctx);
}