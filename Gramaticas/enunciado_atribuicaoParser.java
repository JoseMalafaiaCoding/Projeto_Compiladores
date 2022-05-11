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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		CARACTERE=25, LITERAL_TEXTO=26, LITERAL_NUMERICO=27, IDENTIFICADOR=28, 
		Ws=29;
	public static final int
		RULE_init = 0, RULE_literal_booleano = 1, RULE_literal = 2, RULE_operador_aritmetico = 3, 
		RULE_operador_relacional = 4, RULE_operador_logico = 5, RULE_fim_linha = 6, 
		RULE_tipo_inteiro = 7, RULE_tipo_decimal = 8, RULE_tipo_texto = 9, RULE_tipo_caractere = 10, 
		RULE_expressao_aritmetica = 11, RULE_expressao_relacional = 12, RULE_expressao_logica = 13, 
		RULE_instrucao_atribuicao = 14, RULE_atribuicao_inteiros = 15, RULE_atribuicao_decimal = 16, 
		RULE_atribuicao_booleana = 17, RULE_atribuicao_texto = 18, RULE_atribuicao_caractere = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "literal_booleano", "literal", "operador_aritmetico", "operador_relacional", 
			"operador_logico", "fim_linha", "tipo_inteiro", "tipo_decimal", "tipo_texto", 
			"tipo_caractere", "expressao_aritmetica", "expressao_relacional", "expressao_logica", 
			"instrucao_atribuicao", "atribuicao_inteiros", "atribuicao_decimal", 
			"atribuicao_booleana", "atribuicao_texto", "atribuicao_caractere"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'verdadeiro'", "'falso'", "'+'", "'-'", "'/'", "'*'", "'>'", "'<'", 
			"'<='", "'>='", "'&&'", "'||'", "'!'", "'.'", "'inteiro'", "'longo'", 
			"'curto'", "'byte'", "'decimal'", "'flutuante'", "'texto'", "'caractere'", 
			"':='", "'booleano'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "CARACTERE", "LITERAL_TEXTO", "LITERAL_NUMERICO", "IDENTIFICADOR", 
			"Ws"
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
			setState(40);
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
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__0);
				System.out.print("true");
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__1);
				System.out.print("false");
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
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(LITERAL_TEXTO);
				}
				break;
			case LITERAL_NUMERICO:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(LITERAL_NUMERICO);
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(CARACTERE);
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
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
			setState(54);
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
			setState(56);
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
			setState(58);
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

	public static class Fim_linhaContext extends ParserRuleContext {
		public Fim_linhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fim_linha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterFim_linha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitFim_linha(this);
		}
	}

	public final Fim_linhaContext fim_linha() throws RecognitionException {
		Fim_linhaContext _localctx = new Fim_linhaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fim_linha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__13);
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
		enterRule(_localctx, 14, RULE_tipo_inteiro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_tipo_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
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
		enterRule(_localctx, 18, RULE_tipo_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
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
		enterRule(_localctx, 20, RULE_tipo_caractere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__21);
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
		enterRule(_localctx, 22, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==LITERAL_NUMERICO || _la==IDENTIFICADOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				{
				setState(71);
				operador_aritmetico();
				setState(72);
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
				setState(78);
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
		public List<TerminalNode> LITERAL_NUMERICO() { return getTokens(enunciado_atribuicaoParser.LITERAL_NUMERICO); }
		public TerminalNode LITERAL_NUMERICO(int i) {
			return getToken(enunciado_atribuicaoParser.LITERAL_NUMERICO, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(enunciado_atribuicaoParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(enunciado_atribuicaoParser.IDENTIFICADOR, i);
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
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).enterExpressao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_atribuicaoListener ) ((enunciado_atribuicaoListener)listener).exitExpressao_relacional(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressao_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==LITERAL_NUMERICO || _la==IDENTIFICADOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				{
				setState(80);
				operador_relacional();
				setState(81);
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
				setState(87);
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
		public Token IDENTIFICADOR;
		public Operador_logicoContext operador_logico;
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
		enterRule(_localctx, 26, RULE_expressao_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(88);
				match(T__12);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				{
				setState(94);
				literal_booleano();
				}
				break;
			case IDENTIFICADOR:
				{
				setState(95);
				((Expressao_logicaContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				System.out.println((((Expressao_logicaContext)_localctx).IDENTIFICADOR!=null?((Expressao_logicaContext)_localctx).IDENTIFICADOR.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				{
				setState(99);
				((Expressao_logicaContext)_localctx).operador_logico = operador_logico();
				System.out.print((((Expressao_logicaContext)_localctx).operador_logico!=null?_input.getText(((Expressao_logicaContext)_localctx).operador_logico.start,((Expressao_logicaContext)_localctx).operador_logico.stop):null));
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(101);
					match(T__12);
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
					{
					setState(107);
					literal_booleano();
					}
					break;
				case IDENTIFICADOR:
					{
					setState(108);
					((Expressao_logicaContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
					System.out.println((((Expressao_logicaContext)_localctx).IDENTIFICADOR!=null?((Expressao_logicaContext)_localctx).IDENTIFICADOR.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(116);
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
		enterRule(_localctx, 28, RULE_instrucao_atribuicao);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				atribuicao_inteiros();
				}
				break;
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				atribuicao_decimal();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				atribuicao_texto();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				atribuicao_booleana();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
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
		enterRule(_localctx, 30, RULE_atribuicao_inteiros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			((Atribuicao_inteirosContext)_localctx).tipo_inteiro = tipo_inteiro();
			setState(125);
			((Atribuicao_inteirosContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(126);
			match(T__22);
			setState(127);
			((Atribuicao_inteirosContext)_localctx).expressao_aritmetica = expressao_aritmetica();
			setState(128);
			match(T__13);

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
		enterRule(_localctx, 32, RULE_atribuicao_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((Atribuicao_decimalContext)_localctx).tipo_decimal = tipo_decimal();
			setState(132);
			((Atribuicao_decimalContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(133);
			match(T__22);
			setState(134);
			((Atribuicao_decimalContext)_localctx).expressao_aritmetica = expressao_aritmetica();
			setState(135);
			match(T__13);

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
		public Expressao_relacionalContext expressao_relacional;
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_atribuicaoParser.IDENTIFICADOR, 0); }
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
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
		enterRule(_localctx, 34, RULE_atribuicao_booleana);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__23);
			setState(139);
			((Atribuicao_booleanaContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(140);
			match(T__22);
			System.out.print("boolean " + (((Atribuicao_booleanaContext)_localctx).IDENTIFICADOR!=null?((Atribuicao_booleanaContext)_localctx).IDENTIFICADOR.getText():null) + "=");
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				{
				setState(142);
				((Atribuicao_booleanaContext)_localctx).expressao_relacional = expressao_relacional();
				setState(143);
				match(T__13);
				}
				System.out.println((((Atribuicao_booleanaContext)_localctx).expressao_relacional!=null?_input.getText(((Atribuicao_booleanaContext)_localctx).expressao_relacional.start,((Atribuicao_booleanaContext)_localctx).expressao_relacional.stop):null) + ";");
				}
				break;
			case 2:
				{
				{
				setState(147);
				expressao_logica();
				setState(148);
				match(T__13);
				}
				System.out.println(";");
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
		enterRule(_localctx, 36, RULE_atribuicao_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			tipo_texto();
			setState(155);
			((Atribuicao_textoContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(156);
			match(T__22);
			setState(157);
			((Atribuicao_textoContext)_localctx).LITERAL_TEXTO = match(LITERAL_TEXTO);
			setState(158);
			match(T__13);
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
		enterRule(_localctx, 38, RULE_atribuicao_caractere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			tipo_caractere();
			setState(162);
			((Atribuicao_caractereContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(163);
			match(T__22);
			setState(164);
			((Atribuicao_caractereContext)_localctx).CARACTERE = match(CARACTERE);
			setState(165);
			match(T__13);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4"+
		"\3\4\3\4\3\4\5\4\67\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\7\rM\n\r\f\r\16\rP\13\r\3\16\3\16"+
		"\3\16\3\16\7\16V\n\16\f\16\16\16Y\13\16\3\17\7\17\\\n\17\f\17\16\17_\13"+
		"\17\3\17\3\17\3\17\5\17d\n\17\3\17\3\17\3\17\7\17i\n\17\f\17\16\17l\13"+
		"\17\3\17\3\17\3\17\5\17q\n\17\7\17s\n\17\f\17\16\17v\13\17\3\20\3\20\3"+
		"\20\3\20\3\20\5\20}\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u009b\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(\2\b\3\2\5\b\3\2\t\f\3\2\r\17\3\2\21\24\3\2"+
		"\25\26\3\2\35\36\2\u00a6\2*\3\2\2\2\4\60\3\2\2\2\6\66\3\2\2\2\b8\3\2\2"+
		"\2\n:\3\2\2\2\f<\3\2\2\2\16>\3\2\2\2\20@\3\2\2\2\22B\3\2\2\2\24D\3\2\2"+
		"\2\26F\3\2\2\2\30H\3\2\2\2\32Q\3\2\2\2\34]\3\2\2\2\36|\3\2\2\2 ~\3\2\2"+
		"\2\"\u0085\3\2\2\2$\u008c\3\2\2\2&\u009c\3\2\2\2(\u00a3\3\2\2\2*+\5\36"+
		"\20\2+\3\3\2\2\2,-\7\3\2\2-\61\b\3\1\2./\7\4\2\2/\61\b\3\1\2\60,\3\2\2"+
		"\2\60.\3\2\2\2\61\5\3\2\2\2\62\67\7\34\2\2\63\67\7\35\2\2\64\67\7\33\2"+
		"\2\65\67\5\4\3\2\66\62\3\2\2\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2"+
		"\2\67\7\3\2\2\289\t\2\2\29\t\3\2\2\2:;\t\3\2\2;\13\3\2\2\2<=\t\4\2\2="+
		"\r\3\2\2\2>?\7\20\2\2?\17\3\2\2\2@A\t\5\2\2A\21\3\2\2\2BC\t\6\2\2C\23"+
		"\3\2\2\2DE\7\27\2\2E\25\3\2\2\2FG\7\30\2\2G\27\3\2\2\2HN\t\7\2\2IJ\5\b"+
		"\5\2JK\t\7\2\2KM\3\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\31\3"+
		"\2\2\2PN\3\2\2\2QW\t\7\2\2RS\5\n\6\2ST\t\7\2\2TV\3\2\2\2UR\3\2\2\2VY\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2X\33\3\2\2\2YW\3\2\2\2Z\\\7\17\2\2[Z\3\2\2\2"+
		"\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^c\3\2\2\2_]\3\2\2\2`d\5\4\3\2ab\7\36\2"+
		"\2bd\b\17\1\2c`\3\2\2\2ca\3\2\2\2dt\3\2\2\2ef\5\f\7\2fj\b\17\1\2gi\7\17"+
		"\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kp\3\2\2\2lj\3\2\2\2mq\5\4"+
		"\3\2no\7\36\2\2oq\b\17\1\2pm\3\2\2\2pn\3\2\2\2qs\3\2\2\2re\3\2\2\2sv\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2u\35\3\2\2\2vt\3\2\2\2w}\5 \21\2x}\5\"\22\2"+
		"y}\5&\24\2z}\5$\23\2{}\5(\25\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2"+
		"|{\3\2\2\2}\37\3\2\2\2~\177\5\20\t\2\177\u0080\7\36\2\2\u0080\u0081\7"+
		"\31\2\2\u0081\u0082\5\30\r\2\u0082\u0083\7\20\2\2\u0083\u0084\b\21\1\2"+
		"\u0084!\3\2\2\2\u0085\u0086\5\22\n\2\u0086\u0087\7\36\2\2\u0087\u0088"+
		"\7\31\2\2\u0088\u0089\5\30\r\2\u0089\u008a\7\20\2\2\u008a\u008b\b\22\1"+
		"\2\u008b#\3\2\2\2\u008c\u008d\7\32\2\2\u008d\u008e\7\36\2\2\u008e\u008f"+
		"\7\31\2\2\u008f\u009a\b\23\1\2\u0090\u0091\5\32\16\2\u0091\u0092\7\20"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\23\1\2\u0094\u009b\3\2\2\2\u0095"+
		"\u0096\5\34\17\2\u0096\u0097\7\20\2\2\u0097\u0098\3\2\2\2\u0098\u0099"+
		"\b\23\1\2\u0099\u009b\3\2\2\2\u009a\u0090\3\2\2\2\u009a\u0095\3\2\2\2"+
		"\u009b%\3\2\2\2\u009c\u009d\5\24\13\2\u009d\u009e\7\36\2\2\u009e\u009f"+
		"\7\31\2\2\u009f\u00a0\7\34\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00a2\b\24\1"+
		"\2\u00a2\'\3\2\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\7\36\2\2\u00a5\u00a6"+
		"\7\31\2\2\u00a6\u00a7\7\33\2\2\u00a7\u00a8\7\20\2\2\u00a8\u00a9\b\25\1"+
		"\2\u00a9)\3\2\2\2\r\60\66NW]cjpt|\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}