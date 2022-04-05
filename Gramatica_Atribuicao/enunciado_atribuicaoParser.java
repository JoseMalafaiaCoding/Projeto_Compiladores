// Generated from enunciado_atribuicao.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class enunciado_atribuicaoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		CARACTERE=18, LITERAL_TEXTO=19, LITERAL_NUMERICO=20, IDENTIFICADOR=21, 
		Ws=22;
	public static final int
		RULE_init = 0, RULE_literal_booleano = 1, RULE_literal = 2, RULE_operador = 3, 
		RULE_expressao = 4, RULE_instrucao_atribuicao = 5, RULE_tipo = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "literal_booleano", "literal", "operador", "expressao", "instrucao_atribuicao", 
			"tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'verdadeiro'", "'falso'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", 
			"'<='", "'>='", "'!'", "':='", "'inteiro'", "'decimal'", "'caractere'", 
			"'cadeia'", "'booleano'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "CARACTERE", "LITERAL_TEXTO", "LITERAL_NUMERICO", 
			"IDENTIFICADOR", "Ws"
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
	public String getGrammarFileName() { return "enunciado_atribuicao.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public enunciado_atribuicaoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public Instrucao_atribuicaoContext instrucao_atribuicao() {
			return getRuleContext(Instrucao_atribuicaoContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			instrucao_atribuicao();
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
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterLiteral_booleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitLiteral_booleano(this);
		}
	}

	public final Literal_booleanoContext literal_booleano() throws RecognitionException {
		Literal_booleanoContext _localctx = new Literal_booleanoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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
		public TerminalNode LITERAL_TEXTO() { return getToken(enunciado_atribuicaoParser.LITERAL_TEXTO, 0); }
		public TerminalNode LITERAL_NUMERICO() { return getToken(enunciado_atribuicaoParser.LITERAL_NUMERICO, 0); }
		public TerminalNode CARACTERE() { return getToken(enunciado_atribuicaoParser.CARACTERE, 0); }
		public Literal_booleanoContext literal_booleano() {
			return getRuleContext(Literal_booleanoContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(LITERAL_TEXTO);
				}
				break;
			case LITERAL_NUMERICO:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(LITERAL_NUMERICO);
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(CARACTERE);
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
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

	public static class OperadorContext extends ParserRuleContext {
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitOperador(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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

	public static class ExpressaoContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(enunciado_atribuicaoParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(enunciado_atribuicaoParser.IDENTIFICADOR, i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressao);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(27);
					match(T__10);
					}
				}

				setState(32);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case CARACTERE:
				case LITERAL_TEXTO:
				case LITERAL_NUMERICO:
					{
					setState(30);
					literal();
					}
					break;
				case IDENTIFICADOR:
					{
					setState(31);
					match(IDENTIFICADOR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(34);
				operador();
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(35);
					match(T__10);
					}
				}

				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case CARACTERE:
				case LITERAL_TEXTO:
				case LITERAL_NUMERICO:
					{
					setState(38);
					literal();
					}
					break;
				case IDENTIFICADOR:
					{
					setState(39);
					match(IDENTIFICADOR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	public static class Instrucao_atribuicaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_atribuicaoParser.IDENTIFICADOR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Instrucao_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterInstrucao_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitInstrucao_atribuicao(this);
		}
	}

	public final Instrucao_atribuicaoContext instrucao_atribuicao() throws RecognitionException {
		Instrucao_atribuicaoContext _localctx = new Instrucao_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instrucao_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			tipo();
			setState(45);
			match(IDENTIFICADOR);
			setState(46);
			match(T__11);
			setState(47);
			expressao();
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\5\4\31\n\4\3\5\3\5\3\6\3\6\5\6\37\n\6\3\6\3\6\5\6#\n\6\3\6\3\6"+
		"\5\6\'\n\6\3\6\3\6\5\6+\n\6\5\6-\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\2"+
		"\2\t\2\4\6\b\n\f\16\2\5\3\2\3\4\3\2\5\f\3\2\17\23\2\66\2\20\3\2\2\2\4"+
		"\22\3\2\2\2\6\30\3\2\2\2\b\32\3\2\2\2\n,\3\2\2\2\f.\3\2\2\2\16\63\3\2"+
		"\2\2\20\21\5\f\7\2\21\3\3\2\2\2\22\23\t\2\2\2\23\5\3\2\2\2\24\31\7\25"+
		"\2\2\25\31\7\26\2\2\26\31\7\24\2\2\27\31\5\4\3\2\30\24\3\2\2\2\30\25\3"+
		"\2\2\2\30\26\3\2\2\2\30\27\3\2\2\2\31\7\3\2\2\2\32\33\t\3\2\2\33\t\3\2"+
		"\2\2\34-\5\6\4\2\35\37\7\r\2\2\36\35\3\2\2\2\36\37\3\2\2\2\37\"\3\2\2"+
		"\2 #\5\6\4\2!#\7\27\2\2\" \3\2\2\2\"!\3\2\2\2#$\3\2\2\2$&\5\b\5\2%\'\7"+
		"\r\2\2&%\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(+\5\6\4\2)+\7\27\2\2*(\3\2\2\2"+
		"*)\3\2\2\2+-\3\2\2\2,\34\3\2\2\2,\36\3\2\2\2-\13\3\2\2\2./\5\16\b\2/\60"+
		"\7\27\2\2\60\61\7\16\2\2\61\62\5\n\6\2\62\r\3\2\2\2\63\64\t\4\2\2\64\17"+
		"\3\2\2\2\b\30\36\"&*,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}