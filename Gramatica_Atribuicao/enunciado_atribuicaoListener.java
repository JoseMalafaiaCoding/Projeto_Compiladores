// Generated from enunciado_atribuicao.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link enunciado_atribuicaoParser}.
 */
public interface enunciado_atribuicaoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(enunciado_atribuicaoParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(enunciado_atribuicaoParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#literal_booleano}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_booleano(enunciado_atribuicaoParser.Literal_booleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#literal_booleano}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_booleano(enunciado_atribuicaoParser.Literal_booleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(enunciado_atribuicaoParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(enunciado_atribuicaoParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico(enunciado_atribuicaoParser.Operador_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico(enunciado_atribuicaoParser.Operador_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(enunciado_atribuicaoParser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(enunciado_atribuicaoParser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(enunciado_atribuicaoParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(enunciado_atribuicaoParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#tipo_inteiro}.
	 * @param ctx the parse tree
	 */
	void enterTipo_inteiro(enunciado_atribuicaoParser.Tipo_inteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#tipo_inteiro}.
	 * @param ctx the parse tree
	 */
	void exitTipo_inteiro(enunciado_atribuicaoParser.Tipo_inteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#tipo_decimal}.
	 * @param ctx the parse tree
	 */
	void enterTipo_decimal(enunciado_atribuicaoParser.Tipo_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#tipo_decimal}.
	 * @param ctx the parse tree
	 */
	void exitTipo_decimal(enunciado_atribuicaoParser.Tipo_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#tipo_texto}.
	 * @param ctx the parse tree
	 */
	void enterTipo_texto(enunciado_atribuicaoParser.Tipo_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#tipo_texto}.
	 * @param ctx the parse tree
	 */
	void exitTipo_texto(enunciado_atribuicaoParser.Tipo_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#tipo_caractere}.
	 * @param ctx the parse tree
	 */
	void enterTipo_caractere(enunciado_atribuicaoParser.Tipo_caractereContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#tipo_caractere}.
	 * @param ctx the parse tree
	 */
	void exitTipo_caractere(enunciado_atribuicaoParser.Tipo_caractereContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aritmetica(enunciado_atribuicaoParser.Expressao_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aritmetica(enunciado_atribuicaoParser.Expressao_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_relacional(enunciado_atribuicaoParser.Expressao_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_relacional(enunciado_atribuicaoParser.Expressao_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_logica(enunciado_atribuicaoParser.Expressao_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_logica(enunciado_atribuicaoParser.Expressao_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#instrucao_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao_atribuicao(enunciado_atribuicaoParser.Instrucao_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#instrucao_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao_atribuicao(enunciado_atribuicaoParser.Instrucao_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#atribuicao_inteiros}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_inteiros(enunciado_atribuicaoParser.Atribuicao_inteirosContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#atribuicao_inteiros}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_inteiros(enunciado_atribuicaoParser.Atribuicao_inteirosContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#atribuicao_decimal}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_decimal(enunciado_atribuicaoParser.Atribuicao_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#atribuicao_decimal}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_decimal(enunciado_atribuicaoParser.Atribuicao_decimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#atribuicao_booleana}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_booleana(enunciado_atribuicaoParser.Atribuicao_booleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#atribuicao_booleana}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_booleana(enunciado_atribuicaoParser.Atribuicao_booleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#atribuicao_texto}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_texto(enunciado_atribuicaoParser.Atribuicao_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#atribuicao_texto}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_texto(enunciado_atribuicaoParser.Atribuicao_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#atribuicao_caractere}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_caractere(enunciado_atribuicaoParser.Atribuicao_caractereContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#atribuicao_caractere}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_caractere(enunciado_atribuicaoParser.Atribuicao_caractereContext ctx);
}