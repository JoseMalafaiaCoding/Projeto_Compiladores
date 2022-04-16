// Generated from /home/jose-carlos/Java/antlr/Projeto_Compiladores/Gramatica_Atribuicao/enunciado_atribuicao.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
	}

	public final Literal_booleanoContext literal_booleano() throws RecognitionException {
		Literal_booleanoContext _localctx = new Literal_booleanoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(LITERAL_TEXTO);
				}
				break;
			case LITERAL_NUMERICO:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(LITERAL_NUMERICO);
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(CARACTERE);
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
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
	}

	public final Operador_aritmeticoContext operador_aritmetico() throws RecognitionException {
		Operador_aritmeticoContext _localctx = new Operador_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operador_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
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
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
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
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
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
	}

	public final Fim_linhaContext fim_linha() throws RecognitionException {
		Fim_linhaContext _localctx = new Fim_linhaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fim_linha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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
	}

	public final Tipo_inteiroContext tipo_inteiro() throws RecognitionException {
		Tipo_inteiroContext _localctx = new Tipo_inteiroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_inteiro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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
	}

	public final Tipo_decimalContext tipo_decimal() throws RecognitionException {
		Tipo_decimalContext _localctx = new Tipo_decimalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
	}

	public final Tipo_textoContext tipo_texto() throws RecognitionException {
		Tipo_textoContext _localctx = new Tipo_textoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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
	}

	public final Tipo_caractereContext tipo_caractere() throws RecognitionException {
		Tipo_caractereContext _localctx = new Tipo_caractereContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo_caractere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
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
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
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
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				{
				setState(67);
				operador_aritmetico();
				setState(68);
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
				setState(74);
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
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressao_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
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
			operador_relacional();
			setState(77);
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
	}

	public final Expressao_logicaContext expressao_logica() throws RecognitionException {
		Expressao_logicaContext _localctx = new Expressao_logicaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressao_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(79);
				match(T__12);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				{
				setState(85);
				literal_booleano();
				}
				break;
			case IDENTIFICADOR:
				{
				setState(86);
				match(IDENTIFICADOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				{
				setState(89);
				operador_logico();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(90);
					match(T__12);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
					{
					setState(96);
					literal_booleano();
					}
					break;
				case IDENTIFICADOR:
					{
					setState(97);
					match(IDENTIFICADOR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(104);
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
	}

	public final Instrucao_atribuicaoContext instrucao_atribuicao() throws RecognitionException {
		Instrucao_atribuicaoContext _localctx = new Instrucao_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instrucao_atribuicao);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				atribuicao_inteiros();
				}
				break;
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				atribuicao_decimal();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				atribuicao_texto();
				}
				break;
			case T__23:
			case LITERAL_NUMERICO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				atribuicao_booleana();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
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
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Atribuicao_inteirosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_inteiros; }
	}

	public final Atribuicao_inteirosContext atribuicao_inteiros() throws RecognitionException {
		Atribuicao_inteirosContext _localctx = new Atribuicao_inteirosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atribuicao_inteiros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((Atribuicao_inteirosContext)_localctx).tipo_inteiro = tipo_inteiro();
			setState(113);
			((Atribuicao_inteirosContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(114);
			match(T__22);
			setState(115);
			((Atribuicao_inteirosContext)_localctx).expressao_aritmetica = expressao_aritmetica();
			setState(116);
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
		public Tipo_decimalContext tipo_decimal() {
			return getRuleContext(Tipo_decimalContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_atribuicaoParser.IDENTIFICADOR, 0); }
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
	}

	public final Atribuicao_decimalContext atribuicao_decimal() throws RecognitionException {
		Atribuicao_decimalContext _localctx = new Atribuicao_decimalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atribuicao_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			tipo_decimal();
			setState(120);
			match(IDENTIFICADOR);
			setState(121);
			match(T__22);
			setState(122);
			expressao_aritmetica();
			setState(123);
			fim_linha();
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
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Atribuicao_booleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_booleana; }
	}

	public final Atribuicao_booleanaContext atribuicao_booleana() throws RecognitionException {
		Atribuicao_booleanaContext _localctx = new Atribuicao_booleanaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atribuicao_booleana);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__23);
				setState(126);
				match(IDENTIFICADOR);
				setState(127);
				match(T__22);
				setState(128);
				expressao_logica();
				}
				break;
			case LITERAL_NUMERICO:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				expressao_relacional();
				setState(130);
				fim_linha();
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
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Atribuicao_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_texto; }
	}

	public final Atribuicao_textoContext atribuicao_texto() throws RecognitionException {
		Atribuicao_textoContext _localctx = new Atribuicao_textoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atribuicao_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			tipo_texto();
			setState(135);
			match(IDENTIFICADOR);
			setState(136);
			match(T__22);
			setState(137);
			match(LITERAL_TEXTO);
			setState(138);
			fim_linha();
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
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Atribuicao_caractereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_caractere; }
	}

	public final Atribuicao_caractereContext atribuicao_caractere() throws RecognitionException {
		Atribuicao_caractereContext _localctx = new Atribuicao_caractereContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_atribuicao_caractere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			tipo_caractere();
			setState(141);
			match(IDENTIFICADOR);
			setState(142);
			match(T__22);
			setState(143);
			match(CARACTERE);
			setState(144);
			fim_linha();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0095\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4\63"+
		"\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\7\rI\n\r\f\r\16\rL\13\r\3\16\3\16\3\16\3\16\3\17\7\17"+
		"S\n\17\f\17\16\17V\13\17\3\17\3\17\5\17Z\n\17\3\17\3\17\7\17^\n\17\f\17"+
		"\16\17a\13\17\3\17\3\17\5\17e\n\17\7\17g\n\17\f\17\16\17j\13\17\3\20\3"+
		"\20\3\20\3\20\3\20\5\20q\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0087"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\t\3\2\3\4\3\2\5"+
		"\b\3\2\t\f\3\2\r\17\3\2\21\24\3\2\25\26\3\2\35\36\2\u008e\2*\3\2\2\2\4"+
		",\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f8\3\2\2\2\16:\3\2\2"+
		"\2\20<\3\2\2\2\22>\3\2\2\2\24@\3\2\2\2\26B\3\2\2\2\30D\3\2\2\2\32M\3\2"+
		"\2\2\34T\3\2\2\2\36p\3\2\2\2 r\3\2\2\2\"y\3\2\2\2$\u0086\3\2\2\2&\u0088"+
		"\3\2\2\2(\u008e\3\2\2\2*+\5\36\20\2+\3\3\2\2\2,-\t\2\2\2-\5\3\2\2\2.\63"+
		"\7\34\2\2/\63\7\35\2\2\60\63\7\33\2\2\61\63\5\4\3\2\62.\3\2\2\2\62/\3"+
		"\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\7\3\2\2\2\64\65\t\3\2\2\65\t\3\2"+
		"\2\2\66\67\t\4\2\2\67\13\3\2\2\289\t\5\2\29\r\3\2\2\2:;\7\20\2\2;\17\3"+
		"\2\2\2<=\t\6\2\2=\21\3\2\2\2>?\t\7\2\2?\23\3\2\2\2@A\7\27\2\2A\25\3\2"+
		"\2\2BC\7\30\2\2C\27\3\2\2\2DJ\t\b\2\2EF\5\b\5\2FG\t\b\2\2GI\3\2\2\2HE"+
		"\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\31\3\2\2\2LJ\3\2\2\2MN\t\b\2\2"+
		"NO\5\n\6\2OP\t\b\2\2P\33\3\2\2\2QS\7\17\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2"+
		"\2\2TU\3\2\2\2UY\3\2\2\2VT\3\2\2\2WZ\5\4\3\2XZ\7\36\2\2YW\3\2\2\2YX\3"+
		"\2\2\2Zh\3\2\2\2[_\5\f\7\2\\^\7\17\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2"+
		"_`\3\2\2\2`d\3\2\2\2a_\3\2\2\2be\5\4\3\2ce\7\36\2\2db\3\2\2\2dc\3\2\2"+
		"\2eg\3\2\2\2f[\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\35\3\2\2\2jh\3\2"+
		"\2\2kq\5 \21\2lq\5\"\22\2mq\5&\24\2nq\5$\23\2oq\5(\25\2pk\3\2\2\2pl\3"+
		"\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\37\3\2\2\2rs\5\20\t\2st\7\36\2\2"+
		"tu\7\31\2\2uv\5\30\r\2vw\5\16\b\2wx\b\21\1\2x!\3\2\2\2yz\5\22\n\2z{\7"+
		"\36\2\2{|\7\31\2\2|}\5\30\r\2}~\5\16\b\2~#\3\2\2\2\177\u0080\7\32\2\2"+
		"\u0080\u0081\7\36\2\2\u0081\u0082\7\31\2\2\u0082\u0087\5\34\17\2\u0083"+
		"\u0084\5\32\16\2\u0084\u0085\5\16\b\2\u0085\u0087\3\2\2\2\u0086\177\3"+
		"\2\2\2\u0086\u0083\3\2\2\2\u0087%\3\2\2\2\u0088\u0089\5\24\13\2\u0089"+
		"\u008a\7\36\2\2\u008a\u008b\7\31\2\2\u008b\u008c\7\34\2\2\u008c\u008d"+
		"\5\16\b\2\u008d\'\3\2\2\2\u008e\u008f\5\26\f\2\u008f\u0090\7\36\2\2\u0090"+
		"\u0091\7\31\2\2\u0091\u0092\7\33\2\2\u0092\u0093\5\16\b\2\u0093)\3\2\2"+
		"\2\13\62JTY_dhp\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}