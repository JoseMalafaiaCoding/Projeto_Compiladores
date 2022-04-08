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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, CARACTERE=24, 
		LITERAL_TEXTO=25, LITERAL_NUMERICO=26, IDENTIFICADOR=27, Ws=28;
	public static final int
		RULE_init = 0, RULE_literal_booleano = 1, RULE_literal = 2, RULE_operador_aritmetico = 3, 
		RULE_operador_relacional = 4, RULE_operador_logico = 5, RULE_tipo_inteiro = 6, 
		RULE_tipo_decimal = 7, RULE_tipo_texto = 8, RULE_tipo_caractere = 9, RULE_expressao_aritmetica = 10, 
		RULE_expressao_relacional = 11, RULE_expressao_logica = 12, RULE_instrucao_atribuicao = 13, 
		RULE_atribuicao_inteiros = 14, RULE_atribuicao_decimal = 15, RULE_atribuicao_booleana = 16, 
		RULE_atribuicao_texto = 17, RULE_atribuicao_caractere = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "literal_booleano", "literal", "operador_aritmetico", "operador_relacional", 
			"operador_logico", "tipo_inteiro", "tipo_decimal", "tipo_texto", "tipo_caractere", 
			"expressao_aritmetica", "expressao_relacional", "expressao_logica", "instrucao_atribuicao", 
			"atribuicao_inteiros", "atribuicao_decimal", "atribuicao_booleana", "atribuicao_texto", 
			"atribuicao_caractere"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'verdadeiro'", "'falso'", "'+'", "'-'", "'/'", "'*'", "'>'", "'<'", 
			"'<='", "'>='", "'&&'", "'||'", "'!'", "'inteiro'", "'longo'", "'curto'", 
			"'byte'", "'decimal'", "'flutuante'", "'texto'", "'caractere'", "':='", 
			"'booleano'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"CARACTERE", "LITERAL_TEXTO", "LITERAL_NUMERICO", "IDENTIFICADOR", "Ws"
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
			setState(38);
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
			setState(40);
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(LITERAL_TEXTO);
				}
				break;
			case LITERAL_NUMERICO:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(LITERAL_NUMERICO);
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(CARACTERE);
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
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
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterOperador_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitOperador_aritmetico(this);
		}
	}

	public final Operador_aritmeticoContext operador_aritmetico() throws RecognitionException {
		Operador_aritmeticoContext _localctx = new Operador_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operador_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitOperador_relacional(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterOperador_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitOperador_logico(this);
		}
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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

	public static class Tipo_inteiroContext extends ParserRuleContext {
		public Tipo_inteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterTipo_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitTipo_inteiro(this);
		}
	}

	public final Tipo_inteiroContext tipo_inteiro() throws RecognitionException {
		Tipo_inteiroContext _localctx = new Tipo_inteiroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_inteiro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
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

	public static class Tipo_decimalContext extends ParserRuleContext {
		public Tipo_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterTipo_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitTipo_decimal(this);
		}
	}

	public final Tipo_decimalContext tipo_decimal() throws RecognitionException {
		Tipo_decimalContext _localctx = new Tipo_decimalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
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
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterTipo_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitTipo_texto(this);
		}
	}

	public final Tipo_textoContext tipo_texto() throws RecognitionException {
		Tipo_textoContext _localctx = new Tipo_textoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__19);
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
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterTipo_caractere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitTipo_caractere(this);
		}
	}

	public final Tipo_caractereContext tipo_caractere() throws RecognitionException {
		Tipo_caractereContext _localctx = new Tipo_caractereContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_caractere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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

	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public List<TerminalNode> LITERAL_NUMERICO() { return getTokens(enunciado_atribuicaoParser.LITERAL_NUMERICO); }
		public TerminalNode LITERAL_NUMERICO(int i) {
			return getToken(enunciado_atribuicaoParser.LITERAL_NUMERICO, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(enunciado_atribuicaoParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(enunciado_atribuicaoParser.IDENTIFICADOR, i);
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
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterExpressao_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitExpressao_aritmetica(this);
		}
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==LITERAL_NUMERICO || _la==IDENTIFICADOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				{
				setState(63);
				operador_aritmetico();
				setState(64);
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
				setState(70);
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
		public Operador_relacionalContext operador_relacional() {
			return getRuleContext(Operador_relacionalContext.class,0);
		}
		public List<TerminalNode> LITERAL_NUMERICO() { return getTokens(enunciado_atribuicaoParser.LITERAL_NUMERICO); }
		public TerminalNode LITERAL_NUMERICO(int i) {
			return getToken(enunciado_atribuicaoParser.LITERAL_NUMERICO, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(enunciado_atribuicaoParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(enunciado_atribuicaoParser.IDENTIFICADOR, i);
		}
		public Expressao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterExpressao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitExpressao_relacional(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressao_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==LITERAL_NUMERICO || _la==IDENTIFICADOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72);
			operador_relacional();
			setState(73);
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
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(enunciado_atribuicaoParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(enunciado_atribuicaoParser.IDENTIFICADOR, i);
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
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterExpressao_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitExpressao_logica(this);
		}
	}

	public final Expressao_logicaContext expressao_logica() throws RecognitionException {
		Expressao_logicaContext _localctx = new Expressao_logicaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressao_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(75);
				match(T__12);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				{
				setState(81);
				literal_booleano();
				}
				break;
			case IDENTIFICADOR:
				{
				setState(82);
				match(IDENTIFICADOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				{
				setState(85);
				operador_logico();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(86);
					match(T__12);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
					{
					setState(92);
					literal_booleano();
					}
					break;
				case IDENTIFICADOR:
					{
					setState(93);
					match(IDENTIFICADOR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(100);
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
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterInstrucao_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitInstrucao_atribuicao(this);
		}
	}

	public final Instrucao_atribuicaoContext instrucao_atribuicao() throws RecognitionException {
		Instrucao_atribuicaoContext _localctx = new Instrucao_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instrucao_atribuicao);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				atribuicao_inteiros();
				}
				break;
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				atribuicao_decimal();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				atribuicao_texto();
				}
				break;
			case T__22:
			case LITERAL_NUMERICO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				atribuicao_booleana();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
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
		public Tipo_inteiroContext tipo_inteiro() {
			return getRuleContext(Tipo_inteiroContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_atribuicaoParser.IDENTIFICADOR, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Atribuicao_inteirosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_inteiros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterAtribuicao_inteiros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitAtribuicao_inteiros(this);
		}
	}

	public final Atribuicao_inteirosContext atribuicao_inteiros() throws RecognitionException {
		Atribuicao_inteirosContext _localctx = new Atribuicao_inteirosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atribuicao_inteiros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			tipo_inteiro();
			setState(109);
			match(IDENTIFICADOR);
			setState(110);
			match(T__21);
			setState(111);
			expressao_aritmetica();
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
		public Tipo_decimalContext tipo_decimal() {
			return getRuleContext(Tipo_decimalContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_atribuicaoParser.IDENTIFICADOR, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Atribuicao_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterAtribuicao_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitAtribuicao_decimal(this);
		}
	}

	public final Atribuicao_decimalContext atribuicao_decimal() throws RecognitionException {
		Atribuicao_decimalContext _localctx = new Atribuicao_decimalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atribuicao_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			tipo_decimal();
			setState(114);
			match(IDENTIFICADOR);
			setState(115);
			match(T__21);
			setState(116);
			expressao_aritmetica();
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
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_atribuicaoParser.IDENTIFICADOR, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
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
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterAtribuicao_booleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitAtribuicao_booleana(this);
		}
	}

	public final Atribuicao_booleanaContext atribuicao_booleana() throws RecognitionException {
		Atribuicao_booleanaContext _localctx = new Atribuicao_booleanaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atribuicao_booleana);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(T__22);
				setState(119);
				match(IDENTIFICADOR);
				setState(120);
				match(T__21);
				setState(121);
				expressao_logica();
				}
				break;
			case LITERAL_NUMERICO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				expressao_relacional();
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

	public static class Atribuicao_textoContext extends ParserRuleContext {
		public Tipo_textoContext tipo_texto() {
			return getRuleContext(Tipo_textoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_atribuicaoParser.IDENTIFICADOR, 0); }
		public TerminalNode LITERAL_TEXTO() { return getToken(enunciado_atribuicaoParser.LITERAL_TEXTO, 0); }
		public Atribuicao_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterAtribuicao_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitAtribuicao_texto(this);
		}
	}

	public final Atribuicao_textoContext atribuicao_texto() throws RecognitionException {
		Atribuicao_textoContext _localctx = new Atribuicao_textoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atribuicao_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			tipo_texto();
			setState(126);
			match(IDENTIFICADOR);
			setState(127);
			match(T__21);
			setState(128);
			match(LITERAL_TEXTO);
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
		public Tipo_caractereContext tipo_caractere() {
			return getRuleContext(Tipo_caractereContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_atribuicaoParser.IDENTIFICADOR, 0); }
		public TerminalNode CARACTERE() { return getToken(enunciado_atribuicaoParser.CARACTERE, 0); }
		public Atribuicao_caractereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_caractere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterAtribuicao_caractere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitAtribuicao_caractere(this);
		}
	}

	public final Atribuicao_caractereContext atribuicao_caractere() throws RecognitionException {
		Atribuicao_caractereContext _localctx = new Atribuicao_caractereContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atribuicao_caractere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			tipo_caractere();
			setState(131);
			match(IDENTIFICADOR);
			setState(132);
			match(T__21);
			setState(133);
			match(CARACTERE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7"+
		"\fE\n\f\f\f\16\fH\13\f\3\r\3\r\3\r\3\r\3\16\7\16O\n\16\f\16\16\16R\13"+
		"\16\3\16\3\16\5\16V\n\16\3\16\3\16\7\16Z\n\16\f\16\16\16]\13\16\3\16\3"+
		"\16\5\16a\n\16\7\16c\n\16\f\16\16\16f\13\16\3\17\3\17\3\17\3\17\3\17\5"+
		"\17m\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\5\22~\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\t\3\2"+
		"\3\4\3\2\5\b\3\2\t\f\3\2\r\17\3\2\20\23\3\2\24\25\3\2\34\35\2\u0084\2"+
		"(\3\2\2\2\4*\3\2\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f\66\3\2\2"+
		"\2\168\3\2\2\2\20:\3\2\2\2\22<\3\2\2\2\24>\3\2\2\2\26@\3\2\2\2\30I\3\2"+
		"\2\2\32P\3\2\2\2\34l\3\2\2\2\36n\3\2\2\2 s\3\2\2\2\"}\3\2\2\2$\177\3\2"+
		"\2\2&\u0084\3\2\2\2()\5\34\17\2)\3\3\2\2\2*+\t\2\2\2+\5\3\2\2\2,\61\7"+
		"\33\2\2-\61\7\34\2\2.\61\7\32\2\2/\61\5\4\3\2\60,\3\2\2\2\60-\3\2\2\2"+
		"\60.\3\2\2\2\60/\3\2\2\2\61\7\3\2\2\2\62\63\t\3\2\2\63\t\3\2\2\2\64\65"+
		"\t\4\2\2\65\13\3\2\2\2\66\67\t\5\2\2\67\r\3\2\2\289\t\6\2\29\17\3\2\2"+
		"\2:;\t\7\2\2;\21\3\2\2\2<=\7\26\2\2=\23\3\2\2\2>?\7\27\2\2?\25\3\2\2\2"+
		"@F\t\b\2\2AB\5\b\5\2BC\t\b\2\2CE\3\2\2\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2"+
		"FG\3\2\2\2G\27\3\2\2\2HF\3\2\2\2IJ\t\b\2\2JK\5\n\6\2KL\t\b\2\2L\31\3\2"+
		"\2\2MO\7\17\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QU\3\2\2\2RP\3"+
		"\2\2\2SV\5\4\3\2TV\7\35\2\2US\3\2\2\2UT\3\2\2\2Vd\3\2\2\2W[\5\f\7\2XZ"+
		"\7\17\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\`\3\2\2\2][\3\2\2"+
		"\2^a\5\4\3\2_a\7\35\2\2`^\3\2\2\2`_\3\2\2\2ac\3\2\2\2bW\3\2\2\2cf\3\2"+
		"\2\2db\3\2\2\2de\3\2\2\2e\33\3\2\2\2fd\3\2\2\2gm\5\36\20\2hm\5 \21\2i"+
		"m\5$\23\2jm\5\"\22\2km\5&\24\2lg\3\2\2\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2"+
		"lk\3\2\2\2m\35\3\2\2\2no\5\16\b\2op\7\35\2\2pq\7\30\2\2qr\5\26\f\2r\37"+
		"\3\2\2\2st\5\20\t\2tu\7\35\2\2uv\7\30\2\2vw\5\26\f\2w!\3\2\2\2xy\7\31"+
		"\2\2yz\7\35\2\2z{\7\30\2\2{~\5\32\16\2|~\5\30\r\2}x\3\2\2\2}|\3\2\2\2"+
		"~#\3\2\2\2\177\u0080\5\22\n\2\u0080\u0081\7\35\2\2\u0081\u0082\7\30\2"+
		"\2\u0082\u0083\7\33\2\2\u0083%\3\2\2\2\u0084\u0085\5\24\13\2\u0085\u0086"+
		"\7\35\2\2\u0086\u0087\7\30\2\2\u0087\u0088\7\32\2\2\u0088\'\3\2\2\2\13"+
		"\60FPU[`dl}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}