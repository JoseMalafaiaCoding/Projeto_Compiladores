// Generated from enunciado_condicional.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class enunciado_condicionalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		CARACTERE=32, LITERAL_TEXTO=33, LITERAL_NUMERICO=34, IDENTIFICADOR=35, 
		Ws=36;
	public static final int
		RULE_init = 0, RULE_condicao = 1, RULE_instrucao_condicional = 2, RULE_literal_booleano = 3, 
		RULE_literal = 4, RULE_operador_aritmetico = 5, RULE_operador_relacional = 6, 
		RULE_operador_logico = 7, RULE_fim_linha = 8, RULE_tipo_inteiro = 9, RULE_tipo_decimal = 10, 
		RULE_tipo_texto = 11, RULE_tipo_caractere = 12, RULE_expressao_aritmetica = 13, 
		RULE_expressao_relacional = 14, RULE_expressao_logica = 15, RULE_instrucao_atribuicao = 16, 
		RULE_atribuicao_inteiros = 17, RULE_atribuicao_decimal = 18, RULE_atribuicao_booleana = 19, 
		RULE_atribuicao_texto = 20, RULE_atribuicao_caractere = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "condicao", "instrucao_condicional", "literal_booleano", "literal", 
			"operador_aritmetico", "operador_relacional", "operador_logico", "fim_linha", 
			"tipo_inteiro", "tipo_decimal", "tipo_texto", "tipo_caractere", "expressao_aritmetica", 
			"expressao_relacional", "expressao_logica", "instrucao_atribuicao", "atribuicao_inteiros", 
			"atribuicao_decimal", "atribuicao_booleana", "atribuicao_texto", "atribuicao_caractere"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'se'", "'('", "')'", "'entao'", "'{'", "'}'", "'senao'", "'verdadeiro'", 
			"'falso'", "'+'", "'-'", "'/'", "'*'", "'>'", "'<'", "'<='", "'>='", 
			"'&&'", "'||'", "'!'", "'.'", "'inteiro'", "'longo'", "'curto'", "'byte'", 
			"'decimal'", "'flutuante'", "'texto'", "'caractere'", "':='", "'booleano'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "CARACTERE", "LITERAL_TEXTO", 
			"LITERAL_NUMERICO", "IDENTIFICADOR", "Ws"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "enunciado_condicional.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public enunciado_condicionalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public Instrucao_condicionalContext instrucao_condicional() {
			return getRuleContext(Instrucao_condicionalContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			instrucao_condicional();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicaoContext extends ParserRuleContext {
		public Literal_booleanoContext literal_booleano() {
			return getRuleContext(Literal_booleanoContext.class,0);
		}
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_condicao);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				literal_booleano();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				expressao_relacional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				expressao_logica();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instrucao_condicionalContext extends ParserRuleContext {
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public Instrucao_atribuicaoContext instrucao_atribuicao() {
			return getRuleContext(Instrucao_atribuicaoContext.class,0);
		}
		public List<Instrucao_condicionalContext> instrucao_condicional() {
			return getRuleContexts(Instrucao_condicionalContext.class);
		}
		public Instrucao_condicionalContext instrucao_condicional(int i) {
			return getRuleContext(Instrucao_condicionalContext.class,i);
		}
		public Instrucao_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterInstrucao_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitInstrucao_condicional(this);
		}
	}

	public final Instrucao_condicionalContext instrucao_condicional() throws RecognitionException {
		Instrucao_condicionalContext _localctx = new Instrucao_condicionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucao_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(T__1);
			setState(53);
			condicao();
			setState(54);
			match(T__2);
			setState(55);
			match(T__3);
			setState(56);
			match(T__4);
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__30:
				{
				setState(57);
				instrucao_atribuicao();
				}
				break;
			case T__0:
				{
				setState(58);
				instrucao_condicional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(61);
			match(T__5);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(62);
				match(T__6);
				setState(63);
				match(T__4);
				setState(64);
				instrucao_condicional();
				setState(65);
				match(T__5);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_booleanoContext extends ParserRuleContext {
		public Literal_booleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterLiteral_booleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitLiteral_booleano(this);
		}
	}

	public final Literal_booleanoContext literal_booleano() throws RecognitionException {
		Literal_booleanoContext _localctx = new Literal_booleanoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode LITERAL_TEXTO() { return getToken(enunciado_condicionalParser.LITERAL_TEXTO, 0); }
		public TerminalNode LITERAL_NUMERICO() { return getToken(enunciado_condicionalParser.LITERAL_NUMERICO, 0); }
		public TerminalNode CARACTERE() { return getToken(enunciado_condicionalParser.CARACTERE, 0); }
		public Literal_booleanoContext literal_booleano() {
			return getRuleContext(Literal_booleanoContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_literal);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(LITERAL_TEXTO);
				}
				break;
			case LITERAL_NUMERICO:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(LITERAL_NUMERICO);
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(CARACTERE);
				}
				break;
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				literal_booleano();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_aritmeticoContext extends ParserRuleContext {
		public Operador_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterOperador_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitOperador_aritmetico(this);
		}
	}

	public final Operador_aritmeticoContext operador_aritmetico() throws RecognitionException {
		Operador_aritmeticoContext _localctx = new Operador_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operador_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_relacionalContext extends ParserRuleContext {
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitOperador_relacional(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_logicoContext extends ParserRuleContext {
		public Operador_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterOperador_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitOperador_logico(this);
		}
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fim_linhaContext extends ParserRuleContext {
		public Fim_linhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fim_linha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterFim_linha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitFim_linha(this);
		}
	}

	public final Fim_linhaContext fim_linha() throws RecognitionException {
		Fim_linhaContext _localctx = new Fim_linhaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fim_linha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_inteiroContext extends ParserRuleContext {
		public Tipo_inteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterTipo_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitTipo_inteiro(this);
		}
	}

	public final Tipo_inteiroContext tipo_inteiro() throws RecognitionException {
		Tipo_inteiroContext _localctx = new Tipo_inteiroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_inteiro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_decimalContext extends ParserRuleContext {
		public Tipo_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterTipo_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitTipo_decimal(this);
		}
	}

	public final Tipo_decimalContext tipo_decimal() throws RecognitionException {
		Tipo_decimalContext _localctx = new Tipo_decimalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_textoContext extends ParserRuleContext {
		public Tipo_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterTipo_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitTipo_texto(this);
		}
	}

	public final Tipo_textoContext tipo_texto() throws RecognitionException {
		Tipo_textoContext _localctx = new Tipo_textoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_caractereContext extends ParserRuleContext {
		public Tipo_caractereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_caractere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterTipo_caractere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitTipo_caractere(this);
		}
	}

	public final Tipo_caractereContext tipo_caractere() throws RecognitionException {
		Tipo_caractereContext _localctx = new Tipo_caractereContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo_caractere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public List<TerminalNode> LITERAL_NUMERICO() { return getTokens(enunciado_condicionalParser.LITERAL_NUMERICO); }
		public TerminalNode LITERAL_NUMERICO(int i) {
			return getToken(enunciado_condicionalParser.LITERAL_NUMERICO, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(enunciado_condicionalParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(enunciado_condicionalParser.IDENTIFICADOR, i);
		}
		public List<Operador_aritmeticoContext> operador_aritmetico() {
			return getRuleContexts(Operador_aritmeticoContext.class);
		}
		public Operador_aritmeticoContext operador_aritmetico(int i) {
			return getRuleContext(Operador_aritmeticoContext.class,i);
		}
		public Expressao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterExpressao_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitExpressao_aritmetica(this);
		}
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==LITERAL_NUMERICO || _la==IDENTIFICADOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				{
				setState(94);
				operador_aritmetico();
				setState(95);
				_la = _input.LA(1);
				if ( !(_la==LITERAL_NUMERICO || _la==IDENTIFICADOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_relacionalContext extends ParserRuleContext {
		public List<TerminalNode> LITERAL_NUMERICO() { return getTokens(enunciado_condicionalParser.LITERAL_NUMERICO); }
		public TerminalNode LITERAL_NUMERICO(int i) {
			return getToken(enunciado_condicionalParser.LITERAL_NUMERICO, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(enunciado_condicionalParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(enunciado_condicionalParser.IDENTIFICADOR, i);
		}
		public List<Operador_relacionalContext> operador_relacional() {
			return getRuleContexts(Operador_relacionalContext.class);
		}
		public Operador_relacionalContext operador_relacional(int i) {
			return getRuleContext(Operador_relacionalContext.class,i);
		}
		public Expressao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterExpressao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitExpressao_relacional(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressao_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==LITERAL_NUMERICO || _la==IDENTIFICADOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				{
				setState(103);
				operador_relacional();
				setState(104);
				_la = _input.LA(1);
				if ( !(_la==LITERAL_NUMERICO || _la==IDENTIFICADOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_logicaContext extends ParserRuleContext {
		public List<Literal_booleanoContext> literal_booleano() {
			return getRuleContexts(Literal_booleanoContext.class);
		}
		public Literal_booleanoContext literal_booleano(int i) {
			return getRuleContext(Literal_booleanoContext.class,i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(enunciado_condicionalParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(enunciado_condicionalParser.IDENTIFICADOR, i);
		}
		public List<Operador_logicoContext> operador_logico() {
			return getRuleContexts(Operador_logicoContext.class);
		}
		public Operador_logicoContext operador_logico(int i) {
			return getRuleContext(Operador_logicoContext.class,i);
		}
		public Expressao_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterExpressao_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitExpressao_logica(this);
		}
	}

	public final Expressao_logicaContext expressao_logica() throws RecognitionException {
		Expressao_logicaContext _localctx = new Expressao_logicaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressao_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(111);
				match(T__19);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				{
				setState(117);
				literal_booleano();
				}
				break;
			case IDENTIFICADOR:
				{
				setState(118);
				match(IDENTIFICADOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) {
				{
				{
				setState(121);
				operador_logico();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__19) {
					{
					{
					setState(122);
					match(T__19);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
				case T__8:
					{
					setState(128);
					literal_booleano();
					}
					break;
				case IDENTIFICADOR:
					{
					setState(129);
					match(IDENTIFICADOR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instrucao_atribuicaoContext extends ParserRuleContext {
		public Atribuicao_inteirosContext atribuicao_inteiros() {
			return getRuleContext(Atribuicao_inteirosContext.class,0);
		}
		public Atribuicao_decimalContext atribuicao_decimal() {
			return getRuleContext(Atribuicao_decimalContext.class,0);
		}
		public Atribuicao_textoContext atribuicao_texto() {
			return getRuleContext(Atribuicao_textoContext.class,0);
		}
		public Atribuicao_booleanaContext atribuicao_booleana() {
			return getRuleContext(Atribuicao_booleanaContext.class,0);
		}
		public Atribuicao_caractereContext atribuicao_caractere() {
			return getRuleContext(Atribuicao_caractereContext.class,0);
		}
		public Instrucao_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterInstrucao_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitInstrucao_atribuicao(this);
		}
	}

	public final Instrucao_atribuicaoContext instrucao_atribuicao() throws RecognitionException {
		Instrucao_atribuicaoContext _localctx = new Instrucao_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_instrucao_atribuicao);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				atribuicao_inteiros();
				}
				break;
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				atribuicao_decimal();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				atribuicao_texto();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				atribuicao_booleana();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				atribuicao_caractere();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atribuicao_inteirosContext extends ParserRuleContext {
		public Tipo_inteiroContext tipo_inteiro;
		public Token IDENTIFICADOR;
		public Expressao_aritmeticaContext expressao_aritmetica;
		public Tipo_inteiroContext tipo_inteiro() {
			return getRuleContext(Tipo_inteiroContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_condicionalParser.IDENTIFICADOR, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Atribuicao_inteirosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_inteiros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterAtribuicao_inteiros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitAtribuicao_inteiros(this);
		}
	}

	public final Atribuicao_inteirosContext atribuicao_inteiros() throws RecognitionException {
		Atribuicao_inteirosContext _localctx = new Atribuicao_inteirosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atribuicao_inteiros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((Atribuicao_inteirosContext)_localctx).tipo_inteiro = tipo_inteiro();
			setState(145);
			((Atribuicao_inteirosContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(146);
			match(T__29);
			setState(147);
			((Atribuicao_inteirosContext)_localctx).expressao_aritmetica = expressao_aritmetica();
			setState(148);
			fim_linha();

			    if ((((Atribuicao_inteirosContext)_localctx).tipo_inteiro!=null?_input.getText(((Atribuicao_inteirosContext)_localctx).tipo_inteiro.start,((Atribuicao_inteirosContext)_localctx).tipo_inteiro.stop):null).equals("inteiro")) System.out.println("int " + (((Atribuicao_inteirosContext)_localctx).IDENTIFICADOR!=null?((Atribuicao_inteirosContext)_localctx).IDENTIFICADOR.getText():null) + "=" + (((Atribuicao_inteirosContext)_localctx).expressao_aritmetica!=null?_input.getText(((Atribuicao_inteirosContext)_localctx).expressao_aritmetica.start,((Atribuicao_inteirosContext)_localctx).expressao_aritmetica.stop):null) + ";");
			    if ((((Atribuicao_inteirosContext)_localctx).tipo_inteiro!=null?_input.getText(((Atribuicao_inteirosContext)_localctx).tipo_inteiro.start,((Atribuicao_inteirosContext)_localctx).tipo_inteiro.stop):null).equals("longo")) System.out.println("long " + (((Atribuicao_inteirosContext)_localctx).IDENTIFICADOR!=null?((Atribuicao_inteirosContext)_localctx).IDENTIFICADOR.getText():null) + "=" + (((Atribuicao_inteirosContext)_localctx).expressao_aritmetica!=null?_input.getText(((Atribuicao_inteirosContext)_localctx).expressao_aritmetica.start,((Atribuicao_inteirosContext)_localctx).expressao_aritmetica.stop):null) + ";");
			    if ((((Atribuicao_inteirosContext)_localctx).tipo_inteiro!=null?_input.getText(((Atribuicao_inteirosContext)_localctx).tipo_inteiro.start,((Atribuicao_inteirosContext)_localctx).tipo_inteiro.stop):null).equals("curto")) System.out.println("short " + (((Atribuicao_inteirosContext)_localctx).IDENTIFICADOR!=null?((Atribuicao_inteirosContext)_localctx).IDENTIFICADOR.getText():null) + "=" + (((Atribuicao_inteirosContext)_localctx).expressao_aritmetica!=null?_input.getText(((Atribuicao_inteirosContext)_localctx).expressao_aritmetica.start,((Atribuicao_inteirosContext)_localctx).expressao_aritmetica.stop):null) + ";");
			    if ((((Atribuicao_inteirosContext)_localctx).tipo_inteiro!=null?_input.getText(((Atribuicao_inteirosContext)_localctx).tipo_inteiro.start,((Atribuicao_inteirosContext)_localctx).tipo_inteiro.stop):null).equals("byte")) System.out.println("byte " + (((Atribuicao_inteirosContext)_localctx).IDENTIFICADOR!=null?((Atribuicao_inteirosContext)_localctx).IDENTIFICADOR.getText():null) + "=" + (((Atribuicao_inteirosContext)_localctx).expressao_aritmetica!=null?_input.getText(((Atribuicao_inteirosContext)_localctx).expressao_aritmetica.start,((Atribuicao_inteirosContext)_localctx).expressao_aritmetica.stop):null) + ";");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atribuicao_decimalContext extends ParserRuleContext {
		public Tipo_decimalContext tipo_decimal;
		public Token IDENTIFICADOR;
		public Expressao_aritmeticaContext expressao_aritmetica;
		public Tipo_decimalContext tipo_decimal() {
			return getRuleContext(Tipo_decimalContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_condicionalParser.IDENTIFICADOR, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Atribuicao_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterAtribuicao_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitAtribuicao_decimal(this);
		}
	}

	public final Atribuicao_decimalContext atribuicao_decimal() throws RecognitionException {
		Atribuicao_decimalContext _localctx = new Atribuicao_decimalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atribuicao_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			((Atribuicao_decimalContext)_localctx).tipo_decimal = tipo_decimal();
			setState(152);
			((Atribuicao_decimalContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(153);
			match(T__29);
			setState(154);
			((Atribuicao_decimalContext)_localctx).expressao_aritmetica = expressao_aritmetica();
			setState(155);
			fim_linha();

			    if ((((Atribuicao_decimalContext)_localctx).tipo_decimal!=null?_input.getText(((Atribuicao_decimalContext)_localctx).tipo_decimal.start,((Atribuicao_decimalContext)_localctx).tipo_decimal.stop):null).equals("flutuante")) System.out.println("float " + (((Atribuicao_decimalContext)_localctx).IDENTIFICADOR!=null?((Atribuicao_decimalContext)_localctx).IDENTIFICADOR.getText():null) + "=" + (((Atribuicao_decimalContext)_localctx).expressao_aritmetica!=null?_input.getText(((Atribuicao_decimalContext)_localctx).expressao_aritmetica.start,((Atribuicao_decimalContext)_localctx).expressao_aritmetica.stop):null) + ";");
			    if ((((Atribuicao_decimalContext)_localctx).tipo_decimal!=null?_input.getText(((Atribuicao_decimalContext)_localctx).tipo_decimal.start,((Atribuicao_decimalContext)_localctx).tipo_decimal.stop):null).equals("decimal")) System.out.println("double " + (((Atribuicao_decimalContext)_localctx).IDENTIFICADOR!=null?((Atribuicao_decimalContext)_localctx).IDENTIFICADOR.getText():null) + "=" + (((Atribuicao_decimalContext)_localctx).expressao_aritmetica!=null?_input.getText(((Atribuicao_decimalContext)_localctx).expressao_aritmetica.start,((Atribuicao_decimalContext)_localctx).expressao_aritmetica.stop):null) + ";");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atribuicao_booleanaContext extends ParserRuleContext {
		public Token IDENTIFICADOR;
		public Expressao_logicaContext expressao_logica;
		public Expressao_relacionalContext expressao_relacional;
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_condicionalParser.IDENTIFICADOR, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public Atribuicao_booleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_booleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterAtribuicao_booleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitAtribuicao_booleana(this);
		}
	}

	public final Atribuicao_booleanaContext atribuicao_booleana() throws RecognitionException {
		Atribuicao_booleanaContext _localctx = new Atribuicao_booleanaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_atribuicao_booleana);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__30);
			setState(159);
			((Atribuicao_booleanaContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(160);
			match(T__29);
			System.out.print("boolean " + (((Atribuicao_booleanaContext)_localctx).IDENTIFICADOR!=null?((Atribuicao_booleanaContext)_localctx).IDENTIFICADOR.getText():null) + "=");
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				{
				setState(162);
				((Atribuicao_booleanaContext)_localctx).expressao_logica = expressao_logica();
				setState(163);
				fim_linha();
				}
				System.out.println((((Atribuicao_booleanaContext)_localctx).expressao_logica!=null?_input.getText(((Atribuicao_booleanaContext)_localctx).expressao_logica.start,((Atribuicao_booleanaContext)_localctx).expressao_logica.stop):null) + ";");
				}
				break;
			case 2:
				{
				{
				setState(167);
				((Atribuicao_booleanaContext)_localctx).expressao_relacional = expressao_relacional();
				setState(168);
				fim_linha();
				}
				System.out.println((((Atribuicao_booleanaContext)_localctx).expressao_relacional!=null?_input.getText(((Atribuicao_booleanaContext)_localctx).expressao_relacional.start,((Atribuicao_booleanaContext)_localctx).expressao_relacional.stop):null) + ";");
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atribuicao_textoContext extends ParserRuleContext {
		public Token IDENTIFICADOR;
		public Token LITERAL_TEXTO;
		public Tipo_textoContext tipo_texto() {
			return getRuleContext(Tipo_textoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_condicionalParser.IDENTIFICADOR, 0); }
		public TerminalNode LITERAL_TEXTO() { return getToken(enunciado_condicionalParser.LITERAL_TEXTO, 0); }
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Atribuicao_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterAtribuicao_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitAtribuicao_texto(this);
		}
	}

	public final Atribuicao_textoContext atribuicao_texto() throws RecognitionException {
		Atribuicao_textoContext _localctx = new Atribuicao_textoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atribuicao_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			tipo_texto();
			setState(175);
			((Atribuicao_textoContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(176);
			match(T__29);
			setState(177);
			((Atribuicao_textoContext)_localctx).LITERAL_TEXTO = match(LITERAL_TEXTO);
			setState(178);
			fim_linha();
			System.out.println("String " + (((Atribuicao_textoContext)_localctx).IDENTIFICADOR!=null?((Atribuicao_textoContext)_localctx).IDENTIFICADOR.getText():null)  + "=" + (((Atribuicao_textoContext)_localctx).LITERAL_TEXTO!=null?((Atribuicao_textoContext)_localctx).LITERAL_TEXTO.getText():null) + ";");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atribuicao_caractereContext extends ParserRuleContext {
		public Token IDENTIFICADOR;
		public Token CARACTERE;
		public Tipo_caractereContext tipo_caractere() {
			return getRuleContext(Tipo_caractereContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_condicionalParser.IDENTIFICADOR, 0); }
		public TerminalNode CARACTERE() { return getToken(enunciado_condicionalParser.CARACTERE, 0); }
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Atribuicao_caractereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_caractere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).enterAtribuicao_caractere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_condicionalListener ) ((enunciado_condicionalListener)listener).exitAtribuicao_caractere(this);
		}
	}

	public final Atribuicao_caractereContext atribuicao_caractere() throws RecognitionException {
		Atribuicao_caractereContext _localctx = new Atribuicao_caractereContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atribuicao_caractere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			tipo_caractere();
			setState(182);
			((Atribuicao_caractereContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(183);
			match(T__29);
			setState(184);
			((Atribuicao_caractereContext)_localctx).CARACTERE = match(CARACTERE);
			setState(185);
			fim_linha();
			System.out.println("char " + (((Atribuicao_caractereContext)_localctx).IDENTIFICADOR!=null?((Atribuicao_caractereContext)_localctx).IDENTIFICADOR.getText():null) + "=" + (((Atribuicao_caractereContext)_localctx).CARACTERE!=null?((Atribuicao_caractereContext)_localctx).CARACTERE.getText():null) + ";");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\5\3\64\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4F\n\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17"+
		"d\n\17\f\17\16\17g\13\17\3\20\3\20\3\20\3\20\7\20m\n\20\f\20\16\20p\13"+
		"\20\3\21\7\21s\n\21\f\21\16\21v\13\21\3\21\3\21\5\21z\n\21\3\21\3\21\7"+
		"\21~\n\21\f\21\16\21\u0081\13\21\3\21\3\21\5\21\u0085\n\21\7\21\u0087"+
		"\n\21\f\21\16\21\u008a\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u0091\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00af\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,\2\t\3\2\n\13\3\2\f\17\3\2\20\23\3\2\24\26\3\2\30\33\3\2\34\35\3"+
		"\2$%\2\u00bb\2.\3\2\2\2\4\63\3\2\2\2\6\65\3\2\2\2\bG\3\2\2\2\nM\3\2\2"+
		"\2\fO\3\2\2\2\16Q\3\2\2\2\20S\3\2\2\2\22U\3\2\2\2\24W\3\2\2\2\26Y\3\2"+
		"\2\2\30[\3\2\2\2\32]\3\2\2\2\34_\3\2\2\2\36h\3\2\2\2 t\3\2\2\2\"\u0090"+
		"\3\2\2\2$\u0092\3\2\2\2&\u0099\3\2\2\2(\u00a0\3\2\2\2*\u00b0\3\2\2\2,"+
		"\u00b7\3\2\2\2./\5\6\4\2/\3\3\2\2\2\60\64\5\b\5\2\61\64\5\36\20\2\62\64"+
		"\5 \21\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\65\66"+
		"\7\3\2\2\66\67\7\4\2\2\678\5\4\3\289\7\5\2\29:\7\6\2\2:=\7\7\2\2;>\5\""+
		"\22\2<>\5\6\4\2=;\3\2\2\2=<\3\2\2\2>?\3\2\2\2?E\7\b\2\2@A\7\t\2\2AB\7"+
		"\7\2\2BC\5\6\4\2CD\7\b\2\2DF\3\2\2\2E@\3\2\2\2EF\3\2\2\2F\7\3\2\2\2GH"+
		"\t\2\2\2H\t\3\2\2\2IN\7#\2\2JN\7$\2\2KN\7\"\2\2LN\5\b\5\2MI\3\2\2\2MJ"+
		"\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\13\3\2\2\2OP\t\3\2\2P\r\3\2\2\2QR\t\4\2"+
		"\2R\17\3\2\2\2ST\t\5\2\2T\21\3\2\2\2UV\7\27\2\2V\23\3\2\2\2WX\t\6\2\2"+
		"X\25\3\2\2\2YZ\t\7\2\2Z\27\3\2\2\2[\\\7\36\2\2\\\31\3\2\2\2]^\7\37\2\2"+
		"^\33\3\2\2\2_e\t\b\2\2`a\5\f\7\2ab\t\b\2\2bd\3\2\2\2c`\3\2\2\2dg\3\2\2"+
		"\2ec\3\2\2\2ef\3\2\2\2f\35\3\2\2\2ge\3\2\2\2hn\t\b\2\2ij\5\16\b\2jk\t"+
		"\b\2\2km\3\2\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\37\3\2\2\2p"+
		"n\3\2\2\2qs\7\26\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uy\3\2\2\2"+
		"vt\3\2\2\2wz\5\b\5\2xz\7%\2\2yw\3\2\2\2yx\3\2\2\2z\u0088\3\2\2\2{\177"+
		"\5\20\t\2|~\7\26\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0084\3\2\2\2\u0081\177\3\2\2\2\u0082\u0085\5\b\5\2\u0083"+
		"\u0085\7%\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0087\3\2"+
		"\2\2\u0086{\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089!\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0091\5$\23\2\u008c"+
		"\u0091\5&\24\2\u008d\u0091\5*\26\2\u008e\u0091\5(\25\2\u008f\u0091\5,"+
		"\27\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091#\3\2\2\2\u0092\u0093\5\24\13"+
		"\2\u0093\u0094\7%\2\2\u0094\u0095\7 \2\2\u0095\u0096\5\34\17\2\u0096\u0097"+
		"\5\22\n\2\u0097\u0098\b\23\1\2\u0098%\3\2\2\2\u0099\u009a\5\26\f\2\u009a"+
		"\u009b\7%\2\2\u009b\u009c\7 \2\2\u009c\u009d\5\34\17\2\u009d\u009e\5\22"+
		"\n\2\u009e\u009f\b\24\1\2\u009f\'\3\2\2\2\u00a0\u00a1\7!\2\2\u00a1\u00a2"+
		"\7%\2\2\u00a2\u00a3\7 \2\2\u00a3\u00ae\b\25\1\2\u00a4\u00a5\5 \21\2\u00a5"+
		"\u00a6\5\22\n\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\25\1\2\u00a8\u00af\3"+
		"\2\2\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\5\22\n\2\u00ab\u00ac\3\2\2\2"+
		"\u00ac\u00ad\b\25\1\2\u00ad\u00af\3\2\2\2\u00ae\u00a4\3\2\2\2\u00ae\u00a9"+
		"\3\2\2\2\u00af)\3\2\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\7%\2\2\u00b2"+
		"\u00b3\7 \2\2\u00b3\u00b4\7#\2\2\u00b4\u00b5\5\22\n\2\u00b5\u00b6\b\26"+
		"\1\2\u00b6+\3\2\2\2\u00b7\u00b8\5\32\16\2\u00b8\u00b9\7%\2\2\u00b9\u00ba"+
		"\7 \2\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd\b\27\1\2"+
		"\u00bd-\3\2\2\2\17\63=EMenty\177\u0084\u0088\u0090\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}