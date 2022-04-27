// Generated from enunciado_condicional.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link enunciado_condicionalParser}.
 */
public interface enunciado_condicionalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(enunciado_condicionalParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(enunciado_condicionalParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(enunciado_condicionalParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(enunciado_condicionalParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#instrucao_condicional}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_condicional(enunciado_condicionalParser.Instrucao_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#instrucao_condicional}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_condicional(enunciado_condicionalParser.Instrucao_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#literal_booleano}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_booleano(enunciado_condicionalParser.Literal_booleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#literal_booleano}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_booleano(enunciado_condicionalParser.Literal_booleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(enunciado_condicionalParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(enunciado_condicionalParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico(enunciado_condicionalParser.Operador_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico(enunciado_condicionalParser.Operador_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(enunciado_condicionalParser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(enunciado_condicionalParser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(enunciado_condicionalParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(enunciado_condicionalParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#fim_linha}.
	 * @param ctx the parse tree
	 */
	void enterFim_linha(enunciado_condicionalParser.Fim_linhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#fim_linha}.
	 * @param ctx the parse tree
	 */
	void exitFim_linha(enunciado_condicionalParser.Fim_linhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#tipo_inteiro}.
	 * @param ctx the parse tree
	 */
	void enterTipo_inteiro(enunciado_condicionalParser.Tipo_inteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#tipo_inteiro}.
	 * @param ctx the parse tree
	 */
	void exitTipo_inteiro(enunciado_condicionalParser.Tipo_inteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#tipo_decimal}.
	 * @param ctx the parse tree
	 */
	void enterTipo_decimal(enunciado_condicionalParser.Tipo_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#tipo_decimal}.
	 * @param ctx the parse tree
	 */
	void exitTipo_decimal(enunciado_condicionalParser.Tipo_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#tipo_texto}.
	 * @param ctx the parse tree
	 */
	void enterTipo_texto(enunciado_condicionalParser.Tipo_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#tipo_texto}.
	 * @param ctx the parse tree
	 */
	void exitTipo_texto(enunciado_condicionalParser.Tipo_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#tipo_caractere}.
	 * @param ctx the parse tree
	 */
	void enterTipo_caractere(enunciado_condicionalParser.Tipo_caractereContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#tipo_caractere}.
	 * @param ctx the parse tree
	 */
	void exitTipo_caractere(enunciado_condicionalParser.Tipo_caractereContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aritmetica(enunciado_condicionalParser.Expressao_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aritmetica(enunciado_condicionalParser.Expressao_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_relacional(enunciado_condicionalParser.Expressao_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_relacional(enunciado_condicionalParser.Expressao_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_logica(enunciado_condicionalParser.Expressao_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_logica(enunciado_condicionalParser.Expressao_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#instrucao_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_atribuicao(enunciado_condicionalParser.Instrucao_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#instrucao_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_atribuicao(enunciado_condicionalParser.Instrucao_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#atribuicao_inteiros}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_inteiros(enunciado_condicionalParser.Atribuicao_inteirosContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#atribuicao_inteiros}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_inteiros(enunciado_condicionalParser.Atribuicao_inteirosContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#atribuicao_decimal}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_decimal(enunciado_condicionalParser.Atribuicao_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#atribuicao_decimal}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_decimal(enunciado_condicionalParser.Atribuicao_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#atribuicao_booleana}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_booleana(enunciado_condicionalParser.Atribuicao_booleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#atribuicao_booleana}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_booleana(enunciado_condicionalParser.Atribuicao_booleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#atribuicao_texto}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_texto(enunciado_condicionalParser.Atribuicao_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#atribuicao_texto}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_texto(enunciado_condicionalParser.Atribuicao_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_condicionalParser#atribuicao_caractere}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_caractere(enunciado_condicionalParser.Atribuicao_caractereContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_condicionalParser#atribuicao_caractere}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_caractere(enunciado_condicionalParser.Atribuicao_caractereContext ctx);
}