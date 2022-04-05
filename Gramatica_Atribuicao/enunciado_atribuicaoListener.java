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
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(enunciado_atribuicaoParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(enunciado_atribuicaoParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(enunciado_atribuicaoParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(enunciado_atribuicaoParser.ExpressaoContext ctx);
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
	 * Enter a parse tree produced by {@link enunciado_atribuicaoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(enunciado_atribuicaoParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link enunciado_atribuicaoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(enunciado_atribuicaoParser.TipoContext ctx);
}