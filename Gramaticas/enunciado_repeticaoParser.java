// Generated from enunciado_repeticao.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class enunciado_repeticaoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, CARACTERE=37, LITERAL_TEXTO=38, 
		LITERAL_NUMERICO=39, IDENTIFICADOR=40, Ws=41;
	public static final int
		RULE_init = 0, RULE_instrucao_repeticao = 1, RULE_repeticao_para = 2, 
		RULE_condicao = 3, RULE_instrucao_condicional = 4, RULE_literal_booleano = 5, 
		RULE_literal = 6, RULE_operador_aritmetico = 7, RULE_operador_relacional = 8, 
		RULE_operador_logico = 9, RULE_fim_linha = 10, RULE_tipo_inteiro = 11, 
		RULE_tipo_decimal = 12, RULE_tipo_texto = 13, RULE_tipo_caractere = 14, 
		RULE_expressao_aritmetica = 15, RULE_expressao_relacional = 16, RULE_expressao_logica = 17, 
		RULE_instrucao_atribuicao = 18, RULE_atribuicao_inteiros = 19, RULE_atribuicao_decimal = 20, 
		RULE_atribuicao_booleana = 21, RULE_atribuicao_texto = 22, RULE_atribuicao_caractere = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "instrucao_repeticao", "repeticao_para", "condicao", "instrucao_condicional", 
			"literal_booleano", "literal", "operador_aritmetico", "operador_relacional", 
			"operador_logico", "fim_linha", "tipo_inteiro", "tipo_decimal", "tipo_texto", 
			"tipo_caractere", "expressao_aritmetica", "expressao_relacional", "expressao_logica", 
			"instrucao_atribuicao", "atribuicao_inteiros", "atribuicao_decimal", 
			"atribuicao_booleana", "atribuicao_texto", "atribuicao_caractere"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'para'", "'('", "','", "'soma'", "'subtrai'", "')'", "'siga'", 
			"'{'", "'}'", "'se'", "'logo'", "'tirante'", "'verdadeiro'", "'falso'", 
			"'+'", "'-'", "'/'", "'*'", "'>'", "'<'", "'<='", "'>='", "'&&'", "'||'", 
			"'!'", "'.'", "'inteiro'", "'longo'", "'curto'", "'byte'", "'decimal'", 
			"'flutuante'", "'texto'", "'caractere'", "':='", "'booleano'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
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
	public String getGrammarFileName() { return "enunciado_repeticao.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public enunciado_repeticaoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public Instrucao_repeticaoContext instrucao_repeticao() {
			return getRuleContext(Instrucao_repeticaoContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			instrucao_repeticao();
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

	public static class Instrucao_repeticaoContext extends ParserRuleContext {
		public Repeticao_paraContext repeticao_para() {
			return getRuleContext(Repeticao_paraContext.class,0);
		}
		public Instrucao_repeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterInstrucao_repeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitInstrucao_repeticao(this);
		}
	}

	public final Instrucao_repeticaoContext instrucao_repeticao() throws RecognitionException {
		Instrucao_repeticaoContext _localctx = new Instrucao_repeticaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucao_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			repeticao_para();
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

	public static class Repeticao_paraContext extends ParserRuleContext {
		public List<Instrucao_atribuicaoContext> instrucao_atribuicao() {
			return getRuleContexts(Instrucao_atribuicaoContext.class);
		}
		public Instrucao_atribuicaoContext instrucao_atribuicao(int i) {
			return getRuleContext(Instrucao_atribuicaoContext.class,i);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_repeticaoParser.IDENTIFICADOR, 0); }
		public List<Repeticao_paraContext> repeticao_para() {
			return getRuleContexts(Repeticao_paraContext.class);
		}
		public Repeticao_paraContext repeticao_para(int i) {
			return getRuleContext(Repeticao_paraContext.class,i);
		}
		public List<Instrucao_condicionalContext> instrucao_condicional() {
			return getRuleContexts(Instrucao_condicionalContext.class);
		}
		public Instrucao_condicionalContext instrucao_condicional(int i) {
			return getRuleContext(Instrucao_condicionalContext.class,i);
		}
		public Repeticao_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterRepeticao_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitRepeticao_para(this);
		}
	}

	public final Repeticao_paraContext repeticao_para() throws RecognitionException {
		Repeticao_paraContext _localctx = new Repeticao_paraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_repeticao_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			match(T__1);
			setState(54);
			instrucao_atribuicao();
			setState(55);
			match(T__2);
			setState(56);
			condicao();
			setState(57);
			match(T__2);
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(58);
				match(T__3);
				setState(59);
				match(IDENTIFICADOR);
				}
				break;
			case T__4:
				{
				setState(60);
				match(T__4);
				setState(61);
				match(IDENTIFICADOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(64);
			match(T__5);
			setState(65);
			match(T__6);
			setState(66);
			match(T__7);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35))) != 0)) {
				{
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(67);
					repeticao_para();
					}
					break;
				case T__9:
					{
					setState(68);
					instrucao_condicional();
					}
					break;
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__35:
					{
					setState(69);
					instrucao_atribuicao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__8);
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
		public Expressao_relacionalContext expressao_relacional;
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicao);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				literal_booleano();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				((CondicaoContext)_localctx).expressao_relacional = expressao_relacional();
				System.out.print((((CondicaoContext)_localctx).expressao_relacional!=null?_input.getText(((CondicaoContext)_localctx).expressao_relacional.start,((CondicaoContext)_localctx).expressao_relacional.stop):null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
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
		public List<Instrucao_atribuicaoContext> instrucao_atribuicao() {
			return getRuleContexts(Instrucao_atribuicaoContext.class);
		}
		public Instrucao_atribuicaoContext instrucao_atribuicao(int i) {
			return getRuleContext(Instrucao_atribuicaoContext.class,i);
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterInstrucao_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitInstrucao_condicional(this);
		}
	}

	public final Instrucao_condicionalContext instrucao_condicional() throws RecognitionException {
		Instrucao_condicionalContext _localctx = new Instrucao_condicionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instrucao_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__9);
			setState(85);
			match(T__1);
			System.out.print("if (");
			setState(87);
			condicao();
			setState(88);
			match(T__5);
			System.out.println(") {");
			setState(90);
			match(T__10);
			setState(91);
			match(T__7);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35))) != 0)) {
				{
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__35:
					{
					setState(92);
					instrucao_atribuicao();
					}
					break;
				case T__9:
					{
					setState(93);
					instrucao_condicional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__8);
			System.out.println("} ");
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(101);
				match(T__11);
				System.out.println(" else { ");
				setState(103);
				match(T__7);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35))) != 0)) {
					{
					setState(106);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__26:
					case T__27:
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case T__33:
					case T__35:
						{
						setState(104);
						instrucao_atribuicao();
						}
						break;
					case T__9:
						{
						setState(105);
						instrucao_condicional();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__8);
				System.out.println("}");
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterLiteral_booleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitLiteral_booleano(this);
		}
	}

	public final Literal_booleanoContext literal_booleano() throws RecognitionException {
		Literal_booleanoContext _localctx = new Literal_booleanoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_literal_booleano);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(T__12);
				System.out.print("true");
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__13);
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
		public TerminalNode LITERAL_TEXTO() { return getToken(enunciado_repeticaoParser.LITERAL_TEXTO, 0); }
		public TerminalNode LITERAL_NUMERICO() { return getToken(enunciado_repeticaoParser.LITERAL_NUMERICO, 0); }
		public TerminalNode CARACTERE() { return getToken(enunciado_repeticaoParser.CARACTERE, 0); }
		public Literal_booleanoContext literal_booleano() {
			return getRuleContext(Literal_booleanoContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_literal);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(LITERAL_TEXTO);
				}
				break;
			case LITERAL_NUMERICO:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(LITERAL_NUMERICO);
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(CARACTERE);
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterOperador_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitOperador_aritmetico(this);
		}
	}

	public final Operador_aritmeticoContext operador_aritmetico() throws RecognitionException {
		Operador_aritmeticoContext _localctx = new Operador_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operador_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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

	public static class Operador_relacionalContext extends ParserRuleContext {
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitOperador_relacional(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterOperador_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitOperador_logico(this);
		}
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterFim_linha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitFim_linha(this);
		}
	}

	public final Fim_linhaContext fim_linha() throws RecognitionException {
		Fim_linhaContext _localctx = new Fim_linhaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fim_linha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__25);
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterTipo_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitTipo_inteiro(this);
		}
	}

	public final Tipo_inteiroContext tipo_inteiro() throws RecognitionException {
		Tipo_inteiroContext _localctx = new Tipo_inteiroContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo_inteiro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterTipo_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitTipo_decimal(this);
		}
	}

	public final Tipo_decimalContext tipo_decimal() throws RecognitionException {
		Tipo_decimalContext _localctx = new Tipo_decimalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__31) ) {
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterTipo_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitTipo_texto(this);
		}
	}

	public final Tipo_textoContext tipo_texto() throws RecognitionException {
		Tipo_textoContext _localctx = new Tipo_textoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__32);
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterTipo_caractere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitTipo_caractere(this);
		}
	}

	public final Tipo_caractereContext tipo_caractere() throws RecognitionException {
		Tipo_caractereContext _localctx = new Tipo_caractereContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_caractere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__33);
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
		public List<TerminalNode> LITERAL_NUMERICO() { return getTokens(enunciado_repeticaoParser.LITERAL_NUMERICO); }
		public TerminalNode LITERAL_NUMERICO(int i) {
			return getToken(enunciado_repeticaoParser.LITERAL_NUMERICO, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(enunciado_repeticaoParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(enunciado_repeticaoParser.IDENTIFICADOR, i);
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterExpressao_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitExpressao_aritmetica(this);
		}
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==LITERAL_NUMERICO || _la==IDENTIFICADOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(144);
				operador_aritmetico();
				setState(145);
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
				setState(151);
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
		public List<TerminalNode> LITERAL_NUMERICO() { return getTokens(enunciado_repeticaoParser.LITERAL_NUMERICO); }
		public TerminalNode LITERAL_NUMERICO(int i) {
			return getToken(enunciado_repeticaoParser.LITERAL_NUMERICO, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(enunciado_repeticaoParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(enunciado_repeticaoParser.IDENTIFICADOR, i);
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterExpressao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitExpressao_relacional(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressao_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==LITERAL_NUMERICO || _la==IDENTIFICADOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				{
				setState(153);
				operador_relacional();
				setState(154);
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
				setState(160);
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
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(enunciado_repeticaoParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(enunciado_repeticaoParser.IDENTIFICADOR, i);
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterExpressao_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitExpressao_logica(this);
		}
	}

	public final Expressao_logicaContext expressao_logica() throws RecognitionException {
		Expressao_logicaContext _localctx = new Expressao_logicaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressao_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(161);
				match(T__24);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
				{
				setState(167);
				literal_booleano();
				}
				break;
			case IDENTIFICADOR:
				{
				setState(168);
				((Expressao_logicaContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				System.out.println((((Expressao_logicaContext)_localctx).IDENTIFICADOR!=null?((Expressao_logicaContext)_localctx).IDENTIFICADOR.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				{
				setState(172);
				((Expressao_logicaContext)_localctx).operador_logico = operador_logico();
				System.out.print((((Expressao_logicaContext)_localctx).operador_logico!=null?_input.getText(((Expressao_logicaContext)_localctx).operador_logico.start,((Expressao_logicaContext)_localctx).operador_logico.stop):null));
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(174);
					match(T__24);
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__13:
					{
					setState(180);
					literal_booleano();
					}
					break;
				case IDENTIFICADOR:
					{
					setState(181);
					((Expressao_logicaContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
					System.out.println((((Expressao_logicaContext)_localctx).IDENTIFICADOR!=null?((Expressao_logicaContext)_localctx).IDENTIFICADOR.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(189);
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterInstrucao_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitInstrucao_atribuicao(this);
		}
	}

	public final Instrucao_atribuicaoContext instrucao_atribuicao() throws RecognitionException {
		Instrucao_atribuicaoContext _localctx = new Instrucao_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_instrucao_atribuicao);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				atribuicao_inteiros();
				}
				break;
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				atribuicao_decimal();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				atribuicao_texto();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				atribuicao_booleana();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
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
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_repeticaoParser.IDENTIFICADOR, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Atribuicao_inteirosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_inteiros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterAtribuicao_inteiros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitAtribuicao_inteiros(this);
		}
	}

	public final Atribuicao_inteirosContext atribuicao_inteiros() throws RecognitionException {
		Atribuicao_inteirosContext _localctx = new Atribuicao_inteirosContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_atribuicao_inteiros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			((Atribuicao_inteirosContext)_localctx).tipo_inteiro = tipo_inteiro();
			setState(198);
			((Atribuicao_inteirosContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(199);
			match(T__34);
			setState(200);
			((Atribuicao_inteirosContext)_localctx).expressao_aritmetica = expressao_aritmetica();
			setState(201);
			match(T__25);

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
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_repeticaoParser.IDENTIFICADOR, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Atribuicao_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterAtribuicao_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitAtribuicao_decimal(this);
		}
	}

	public final Atribuicao_decimalContext atribuicao_decimal() throws RecognitionException {
		Atribuicao_decimalContext _localctx = new Atribuicao_decimalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atribuicao_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			((Atribuicao_decimalContext)_localctx).tipo_decimal = tipo_decimal();
			setState(205);
			((Atribuicao_decimalContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(206);
			match(T__34);
			setState(207);
			((Atribuicao_decimalContext)_localctx).expressao_aritmetica = expressao_aritmetica();
			setState(208);
			match(T__25);

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
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_repeticaoParser.IDENTIFICADOR, 0); }
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
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterAtribuicao_booleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitAtribuicao_booleana(this);
		}
	}

	public final Atribuicao_booleanaContext atribuicao_booleana() throws RecognitionException {
		Atribuicao_booleanaContext _localctx = new Atribuicao_booleanaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atribuicao_booleana);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__35);
			setState(212);
			((Atribuicao_booleanaContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(213);
			match(T__34);
			System.out.print("boolean " + (((Atribuicao_booleanaContext)_localctx).IDENTIFICADOR!=null?((Atribuicao_booleanaContext)_localctx).IDENTIFICADOR.getText():null) + "=");
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				{
				setState(215);
				((Atribuicao_booleanaContext)_localctx).expressao_relacional = expressao_relacional();
				setState(216);
				match(T__25);
				}
				System.out.println((((Atribuicao_booleanaContext)_localctx).expressao_relacional!=null?_input.getText(((Atribuicao_booleanaContext)_localctx).expressao_relacional.start,((Atribuicao_booleanaContext)_localctx).expressao_relacional.stop):null) + ";");
				}
				break;
			case 2:
				{
				{
				setState(220);
				expressao_logica();
				setState(221);
				match(T__25);
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
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_repeticaoParser.IDENTIFICADOR, 0); }
		public TerminalNode LITERAL_TEXTO() { return getToken(enunciado_repeticaoParser.LITERAL_TEXTO, 0); }
		public Atribuicao_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterAtribuicao_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitAtribuicao_texto(this);
		}
	}

	public final Atribuicao_textoContext atribuicao_texto() throws RecognitionException {
		Atribuicao_textoContext _localctx = new Atribuicao_textoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atribuicao_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			tipo_texto();
			setState(228);
			((Atribuicao_textoContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(229);
			match(T__34);
			setState(230);
			((Atribuicao_textoContext)_localctx).LITERAL_TEXTO = match(LITERAL_TEXTO);
			setState(231);
			match(T__25);
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
		public TerminalNode IDENTIFICADOR() { return getToken(enunciado_repeticaoParser.IDENTIFICADOR, 0); }
		public TerminalNode CARACTERE() { return getToken(enunciado_repeticaoParser.CARACTERE, 0); }
		public Atribuicao_caractereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_caractere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).enterAtribuicao_caractere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof enunciado_repeticaoListener ) ((enunciado_repeticaoListener)listener).exitAtribuicao_caractere(this);
		}
	}

	public final Atribuicao_caractereContext atribuicao_caractere() throws RecognitionException {
		Atribuicao_caractereContext _localctx = new Atribuicao_caractereContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atribuicao_caractere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			tipo_caractere();
			setState(235);
			((Atribuicao_caractereContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(236);
			match(T__34);
			setState(237);
			((Atribuicao_caractereContext)_localctx).CARACTERE = match(CARACTERE);
			setState(238);
			match(T__25);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\5\5U\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6a\n\6\f\6\16\6"+
		"d\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\3\6\5\6"+
		"t\n\6\3\7\3\7\3\7\3\7\5\7z\n\7\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\7\21\u0096\n\21\f\21\16\21\u0099\13\21\3\22\3\22\3\22\3"+
		"\22\7\22\u009f\n\22\f\22\16\22\u00a2\13\22\3\23\7\23\u00a5\n\23\f\23\16"+
		"\23\u00a8\13\23\3\23\3\23\3\23\5\23\u00ad\n\23\3\23\3\23\3\23\7\23\u00b2"+
		"\n\23\f\23\16\23\u00b5\13\23\3\23\3\23\3\23\5\23\u00ba\n\23\7\23\u00bc"+
		"\n\23\f\23\16\23\u00bf\13\23\3\24\3\24\3\24\3\24\3\24\5\24\u00c6\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00e4\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\2\b\3\2\21\24\3\2\25\30\3\2\31\33\3\2\35 \3\2!\"\3\2)*\2\u00f6"+
		"\2\62\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\bT\3\2\2\2\nV\3\2\2\2\fy\3\2\2"+
		"\2\16\177\3\2\2\2\20\u0081\3\2\2\2\22\u0083\3\2\2\2\24\u0085\3\2\2\2\26"+
		"\u0087\3\2\2\2\30\u0089\3\2\2\2\32\u008b\3\2\2\2\34\u008d\3\2\2\2\36\u008f"+
		"\3\2\2\2 \u0091\3\2\2\2\"\u009a\3\2\2\2$\u00a6\3\2\2\2&\u00c5\3\2\2\2"+
		"(\u00c7\3\2\2\2*\u00ce\3\2\2\2,\u00d5\3\2\2\2.\u00e5\3\2\2\2\60\u00ec"+
		"\3\2\2\2\62\63\5\4\3\2\63\3\3\2\2\2\64\65\5\6\4\2\65\5\3\2\2\2\66\67\7"+
		"\3\2\2\678\7\4\2\289\5&\24\29:\7\5\2\2:;\5\b\5\2;@\7\5\2\2<=\7\6\2\2="+
		"A\7*\2\2>?\7\7\2\2?A\7*\2\2@<\3\2\2\2@>\3\2\2\2AB\3\2\2\2BC\7\b\2\2CD"+
		"\7\t\2\2DJ\7\n\2\2EI\5\6\4\2FI\5\n\6\2GI\5&\24\2HE\3\2\2\2HF\3\2\2\2H"+
		"G\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\13\2\2"+
		"N\7\3\2\2\2OU\5\f\7\2PQ\5\"\22\2QR\b\5\1\2RU\3\2\2\2SU\5$\23\2TO\3\2\2"+
		"\2TP\3\2\2\2TS\3\2\2\2U\t\3\2\2\2VW\7\f\2\2WX\7\4\2\2XY\b\6\1\2YZ\5\b"+
		"\5\2Z[\7\b\2\2[\\\b\6\1\2\\]\7\r\2\2]b\7\n\2\2^a\5&\24\2_a\5\n\6\2`^\3"+
		"\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7"+
		"\13\2\2fs\b\6\1\2gh\7\16\2\2hi\b\6\1\2in\7\n\2\2jm\5&\24\2km\5\n\6\2l"+
		"j\3\2\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2"+
		"qr\7\13\2\2rt\b\6\1\2sg\3\2\2\2st\3\2\2\2t\13\3\2\2\2uv\7\17\2\2vz\b\7"+
		"\1\2wx\7\20\2\2xz\b\7\1\2yu\3\2\2\2yw\3\2\2\2z\r\3\2\2\2{\u0080\7(\2\2"+
		"|\u0080\7)\2\2}\u0080\7\'\2\2~\u0080\5\f\7\2\177{\3\2\2\2\177|\3\2\2\2"+
		"\177}\3\2\2\2\177~\3\2\2\2\u0080\17\3\2\2\2\u0081\u0082\t\2\2\2\u0082"+
		"\21\3\2\2\2\u0083\u0084\t\3\2\2\u0084\23\3\2\2\2\u0085\u0086\t\4\2\2\u0086"+
		"\25\3\2\2\2\u0087\u0088\7\34\2\2\u0088\27\3\2\2\2\u0089\u008a\t\5\2\2"+
		"\u008a\31\3\2\2\2\u008b\u008c\t\6\2\2\u008c\33\3\2\2\2\u008d\u008e\7#"+
		"\2\2\u008e\35\3\2\2\2\u008f\u0090\7$\2\2\u0090\37\3\2\2\2\u0091\u0097"+
		"\t\7\2\2\u0092\u0093\5\20\t\2\u0093\u0094\t\7\2\2\u0094\u0096\3\2\2\2"+
		"\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098!\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u00a0\t\7\2\2\u009b"+
		"\u009c\5\22\n\2\u009c\u009d\t\7\2\2\u009d\u009f\3\2\2\2\u009e\u009b\3"+
		"\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"#\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\33\2\2\u00a4\u00a3\3\2\2\2"+
		"\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ac"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ad\5\f\7\2\u00aa\u00ab\7*\2\2\u00ab"+
		"\u00ad\b\23\1\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00bd\3"+
		"\2\2\2\u00ae\u00af\5\24\13\2\u00af\u00b3\b\23\1\2\u00b0\u00b2\7\33\2\2"+
		"\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b9\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ba\5\f\7\2\u00b7"+
		"\u00b8\7*\2\2\u00b8\u00ba\b\23\1\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00ae\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be%\3\2\2\2\u00bf\u00bd\3\2\2\2"+
		"\u00c0\u00c6\5(\25\2\u00c1\u00c6\5*\26\2\u00c2\u00c6\5.\30\2\u00c3\u00c6"+
		"\5,\27\2\u00c4\u00c6\5\60\31\2\u00c5\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2"+
		"\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\'\3"+
		"\2\2\2\u00c7\u00c8\5\30\r\2\u00c8\u00c9\7*\2\2\u00c9\u00ca\7%\2\2\u00ca"+
		"\u00cb\5 \21\2\u00cb\u00cc\7\34\2\2\u00cc\u00cd\b\25\1\2\u00cd)\3\2\2"+
		"\2\u00ce\u00cf\5\32\16\2\u00cf\u00d0\7*\2\2\u00d0\u00d1\7%\2\2\u00d1\u00d2"+
		"\5 \21\2\u00d2\u00d3\7\34\2\2\u00d3\u00d4\b\26\1\2\u00d4+\3\2\2\2\u00d5"+
		"\u00d6\7&\2\2\u00d6\u00d7\7*\2\2\u00d7\u00d8\7%\2\2\u00d8\u00e3\b\27\1"+
		"\2\u00d9\u00da\5\"\22\2\u00da\u00db\7\34\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\b\27\1\2\u00dd\u00e4\3\2\2\2\u00de\u00df\5$\23\2\u00df\u00e0\7"+
		"\34\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\27\1\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00d9\3\2\2\2\u00e3\u00de\3\2\2\2\u00e4-\3\2\2\2\u00e5\u00e6\5\34\17"+
		"\2\u00e6\u00e7\7*\2\2\u00e7\u00e8\7%\2\2\u00e8\u00e9\7(\2\2\u00e9\u00ea"+
		"\7\34\2\2\u00ea\u00eb\b\30\1\2\u00eb/\3\2\2\2\u00ec\u00ed\5\36\20\2\u00ed"+
		"\u00ee\7*\2\2\u00ee\u00ef\7%\2\2\u00ef\u00f0\7\'\2\2\u00f0\u00f1\7\34"+
		"\2\2\u00f1\u00f2\b\31\1\2\u00f2\61\3\2\2\2\26@HJT`blnsy\177\u0097\u00a0"+
		"\u00a6\u00ac\u00b3\u00b9\u00bd\u00c5\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}