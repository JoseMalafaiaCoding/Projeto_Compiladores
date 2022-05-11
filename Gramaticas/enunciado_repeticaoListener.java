// Generated from enunciado_repeticao.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link enunciado_repeticaoParser}.
 */
public interface enunciado_repeticaoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(enunciado_repeticaoParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(enunciado_repeticaoParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#instrucao_repeticao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_repeticao(enunciado_repeticaoParser.Instrucao_repeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#instrucao_repeticao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_repeticao(enunciado_repeticaoParser.Instrucao_repeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#repeticao_para}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao_para(enunciado_repeticaoParser.Repeticao_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#repeticao_para}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao_para(enunciado_repeticaoParser.Repeticao_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(enunciado_repeticaoParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(enunciado_repeticaoParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#instrucao_condicional}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_condicional(enunciado_repeticaoParser.Instrucao_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#instrucao_condicional}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_condicional(enunciado_repeticaoParser.Instrucao_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#literal_booleano}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_booleano(enunciado_repeticaoParser.Literal_booleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#literal_booleano}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_booleano(enunciado_repeticaoParser.Literal_booleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(enunciado_repeticaoParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(enunciado_repeticaoParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico(enunciado_repeticaoParser.Operador_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico(enunciado_repeticaoParser.Operador_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(enunciado_repeticaoParser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(enunciado_repeticaoParser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(enunciado_repeticaoParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(enunciado_repeticaoParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#fim_linha}.
	 * @param ctx the parse tree
	 */
	void enterFim_linha(enunciado_repeticaoParser.Fim_linhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#fim_linha}.
	 * @param ctx the parse tree
	 */
	void exitFim_linha(enunciado_repeticaoParser.Fim_linhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#tipo_inteiro}.
	 * @param ctx the parse tree
	 */
	void enterTipo_inteiro(enunciado_repeticaoParser.Tipo_inteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#tipo_inteiro}.
	 * @param ctx the parse tree
	 */
	void exitTipo_inteiro(enunciado_repeticaoParser.Tipo_inteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#tipo_decimal}.
	 * @param ctx the parse tree
	 */
	void enterTipo_decimal(enunciado_repeticaoParser.Tipo_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#tipo_decimal}.
	 * @param ctx the parse tree
	 */
	void exitTipo_decimal(enunciado_repeticaoParser.Tipo_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#tipo_texto}.
	 * @param ctx the parse tree
	 */
	void enterTipo_texto(enunciado_repeticaoParser.Tipo_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#tipo_texto}.
	 * @param ctx the parse tree
	 */
	void exitTipo_texto(enunciado_repeticaoParser.Tipo_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#tipo_caractere}.
	 * @param ctx the parse tree
	 */
	void enterTipo_caractere(enunciado_repeticaoParser.Tipo_caractereContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#tipo_caractere}.
	 * @param ctx the parse tree
	 */
	void exitTipo_caractere(enunciado_repeticaoParser.Tipo_caractereContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aritmetica(enunciado_repeticaoParser.Expressao_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aritmetica(enunciado_repeticaoParser.Expressao_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_relacional(enunciado_repeticaoParser.Expressao_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_relacional(enunciado_repeticaoParser.Expressao_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_logica(enunciado_repeticaoParser.Expressao_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_logica(enunciado_repeticaoParser.Expressao_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#instrucao_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_atribuicao(enunciado_repeticaoParser.Instrucao_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#instrucao_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_atribuicao(enunciado_repeticaoParser.Instrucao_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#atribuicao_inteiros}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_inteiros(enunciado_repeticaoParser.Atribuicao_inteirosContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#atribuicao_inteiros}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_inteiros(enunciado_repeticaoParser.Atribuicao_inteirosContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#atribuicao_decimal}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_decimal(enunciado_repeticaoParser.Atribuicao_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#atribuicao_decimal}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_decimal(enunciado_repeticaoParser.Atribuicao_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#atribuicao_booleana}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_booleana(enunciado_repeticaoParser.Atribuicao_booleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#atribuicao_booleana}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_booleana(enunciado_repeticaoParser.Atribuicao_booleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#atribuicao_texto}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_texto(enunciado_repeticaoParser.Atribuicao_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#atribuicao_texto}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_texto(enunciado_repeticaoParser.Atribuicao_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_repeticaoParser#atribuicao_caractere}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_caractere(enunciado_repeticaoParser.Atribuicao_caractereContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_repeticaoParser#atribuicao_caractere}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_caractere(enunciado_repeticaoParser.Atribuicao_caractereContext ctx);
}