// Generated from Gramatica.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, NOME_CLASSE=43, ID=44, LITERAL_INTEIRO=45, 
		LITERAL_DECIMAL=46, LITERAL_TEXTO=47, Ws=48;
	public static final int
		RULE_init = 0, RULE_classe_principal = 1, RULE_nome_classe = 2, RULE_id = 3, 
		RULE_tipo_inteiro = 4, RULE_tipo_decimal = 5, RULE_tipo_texto = 6, RULE_tipo_booleano = 7, 
		RULE_literal_inteiro = 8, RULE_literal_decimal = 9, RULE_literal_booleano = 10, 
		RULE_literal_texto = 11, RULE_operador_aritmetico = 12, RULE_operador_relacional = 13, 
		RULE_operador_logico = 14, RULE_operador_atribuicao = 15, RULE_operador_concatenacao = 16, 
		RULE_abre_parenteses = 17, RULE_fecha_parenteses = 18, RULE_abre_chaves = 19, 
		RULE_fim_linha = 20, RULE_expressao_aritmetica_inteiro = 21, RULE_expressao_aritmetica_decimal = 22, 
		RULE_expressao_concatenacao = 23, RULE_expressao_relacional = 24, RULE_expressao_logica = 25, 
		RULE_expressao_condicao = 26, RULE_instrucao = 27, RULE_instrucao_declaracao = 28, 
		RULE_instrucao_atribuicao = 29, RULE_instrucao_declaracao_inteiro = 30, 
		RULE_instrucao_atribuicao_inteiro = 31, RULE_instrucao_declaracao_decimal = 32, 
		RULE_instrucao_atribuicao_decimal = 33, RULE_instrucao_declaracao_texto = 34, 
		RULE_instrucao_atribuicao_texto = 35, RULE_instrucao_condicional = 36, 
		RULE_senao = 37, RULE_instrucao_repeticao = 38, RULE_separacao_argumentos = 39, 
		RULE_declaracao_para = 40, RULE_repeticao_para = 41, RULE_repeticao_enquanto = 42, 
		RULE_meio_ciclo = 43, RULE_repeticao_ciclo = 44, RULE_instrucao_varredura = 45, 
		RULE_nova_varredura = 46, RULE_proximo_inteiro = 47, RULE_proximo_decimal = 48, 
		RULE_proximo_texto = 49, RULE_instrucao_imprecao = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "classe_principal", "nome_classe", "id", "tipo_inteiro", "tipo_decimal", 
			"tipo_texto", "tipo_booleano", "literal_inteiro", "literal_decimal", 
			"literal_booleano", "literal_texto", "operador_aritmetico", "operador_relacional", 
			"operador_logico", "operador_atribuicao", "operador_concatenacao", "abre_parenteses", 
			"fecha_parenteses", "abre_chaves", "fim_linha", "expressao_aritmetica_inteiro", 
			"expressao_aritmetica_decimal", "expressao_concatenacao", "expressao_relacional", 
			"expressao_logica", "expressao_condicao", "instrucao", "instrucao_declaracao", 
			"instrucao_atribuicao", "instrucao_declaracao_inteiro", "instrucao_atribuicao_inteiro", 
			"instrucao_declaracao_decimal", "instrucao_atribuicao_decimal", "instrucao_declaracao_texto", 
			"instrucao_atribuicao_texto", "instrucao_condicional", "senao", "instrucao_repeticao", 
			"separacao_argumentos", "declaracao_para", "repeticao_para", "repeticao_enquanto", 
			"meio_ciclo", "repeticao_ciclo", "instrucao_varredura", "nova_varredura", 
			"proximo_inteiro", "proximo_decimal", "proximo_texto", "instrucao_imprecao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'classe'", "'fim classe'", "'inteiro'", "'decimal'", "'texto'", 
			"'verdadeiro'", "'falso'", "'+'", "'-'", "'/'", "'*'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'^'", "':='", "'<>'", 
			"'.'", "'se'", "'entao'", "'fim se'", "'senao'", "'fim senao'", "','", 
			"'para'", "'rode'", "'fim para'", "'enquanto'", "'fim enquanto'", "'cicle'", 
			"'fim ciclo'", "'varrer'", "'nova varredura'", "'proximo inteiro'", "'proximo decimal'", 
			"'proximo texto'", "'imprima'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NOME_CLASSE", "ID", "LITERAL_INTEIRO", 
			"LITERAL_DECIMAL", "LITERAL_TEXTO", "Ws"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public Classe_principalContext classe_principal() {
			return getRuleContext(Classe_principalContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			classe_principal();
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

	public static class Classe_principalContext extends ParserRuleContext {
		public Nome_classeContext nome_classe() {
			return getRuleContext(Nome_classeContext.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public Classe_principalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterClasse_principal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitClasse_principal(this);
		}
	}

	public final Classe_principalContext classe_principal() throws RecognitionException {
		Classe_principalContext _localctx = new Classe_principalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classe_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__0);
			setState(105);
			nome_classe();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__23) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__41) | (1L << ID))) != 0)) {
				{
				{
				setState(106);
				instrucao();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__1);
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

	public static class Nome_classeContext extends ParserRuleContext {
		public TerminalNode NOME_CLASSE() { return getToken(GramaticaParser.NOME_CLASSE, 0); }
		public Nome_classeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNome_classe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNome_classe(this);
		}
	}

	public final Nome_classeContext nome_classe() throws RecognitionException {
		Nome_classeContext _localctx = new Nome_classeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nome_classe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(NOME_CLASSE);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ID);
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
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipo_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipo_inteiro(this);
		}
	}

	public final Tipo_inteiroContext tipo_inteiro() throws RecognitionException {
		Tipo_inteiroContext _localctx = new Tipo_inteiroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__2);
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
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipo_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipo_decimal(this);
		}
	}

	public final Tipo_decimalContext tipo_decimal() throws RecognitionException {
		Tipo_decimalContext _localctx = new Tipo_decimalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__3);
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
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipo_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipo_texto(this);
		}
	}

	public final Tipo_textoContext tipo_texto() throws RecognitionException {
		Tipo_textoContext _localctx = new Tipo_textoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__4);
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

	public static class Tipo_booleanoContext extends ParserRuleContext {
		public Tipo_booleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipo_booleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipo_booleano(this);
		}
	}

	public final Tipo_booleanoContext tipo_booleano() throws RecognitionException {
		Tipo_booleanoContext _localctx = new Tipo_booleanoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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

	public static class Literal_inteiroContext extends ParserRuleContext {
		public TerminalNode LITERAL_INTEIRO() { return getToken(GramaticaParser.LITERAL_INTEIRO, 0); }
		public Literal_inteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLiteral_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLiteral_inteiro(this);
		}
	}

	public final Literal_inteiroContext literal_inteiro() throws RecognitionException {
		Literal_inteiroContext _localctx = new Literal_inteiroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_literal_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LITERAL_INTEIRO);
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

	public static class Literal_decimalContext extends ParserRuleContext {
		public TerminalNode LITERAL_DECIMAL() { return getToken(GramaticaParser.LITERAL_DECIMAL, 0); }
		public Literal_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLiteral_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLiteral_decimal(this);
		}
	}

	public final Literal_decimalContext literal_decimal() throws RecognitionException {
		Literal_decimalContext _localctx = new Literal_decimalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(LITERAL_DECIMAL);
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
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLiteral_booleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLiteral_booleano(this);
		}
	}

	public final Literal_booleanoContext literal_booleano() throws RecognitionException {
		Literal_booleanoContext _localctx = new Literal_booleanoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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

	public static class Literal_textoContext extends ParserRuleContext {
		public TerminalNode LITERAL_TEXTO() { return getToken(GramaticaParser.LITERAL_TEXTO, 0); }
		public Literal_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLiteral_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLiteral_texto(this);
		}
	}

	public final Literal_textoContext literal_texto() throws RecognitionException {
		Literal_textoContext _localctx = new Literal_textoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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

	public static class Operador_aritmeticoContext extends ParserRuleContext {
		public Operador_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperador_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperador_aritmetico(this);
		}
	}

	public final Operador_aritmeticoContext operador_aritmetico() throws RecognitionException {
		Operador_aritmeticoContext _localctx = new Operador_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operador_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperador_relacional(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperador_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperador_logico(this);
		}
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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

	public static class Operador_atribuicaoContext extends ParserRuleContext {
		public Operador_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperador_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperador_atribuicao(this);
		}
	}

	public final Operador_atribuicaoContext operador_atribuicao() throws RecognitionException {
		Operador_atribuicaoContext _localctx = new Operador_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operador_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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

	public static class Operador_concatenacaoContext extends ParserRuleContext {
		public Operador_concatenacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_concatenacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperador_concatenacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperador_concatenacao(this);
		}
	}

	public final Operador_concatenacaoContext operador_concatenacao() throws RecognitionException {
		Operador_concatenacaoContext _localctx = new Operador_concatenacaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operador_concatenacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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

	public static class Abre_parentesesContext extends ParserRuleContext {
		public Abre_parentesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abre_parenteses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAbre_parenteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAbre_parenteses(this);
		}
	}

	public final Abre_parentesesContext abre_parenteses() throws RecognitionException {
		Abre_parentesesContext _localctx = new Abre_parentesesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_abre_parenteses);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Fecha_parentesesContext extends ParserRuleContext {
		public Fecha_parentesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fecha_parenteses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFecha_parenteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFecha_parenteses(this);
		}
	}

	public final Fecha_parentesesContext fecha_parenteses() throws RecognitionException {
		Fecha_parentesesContext _localctx = new Fecha_parentesesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fecha_parenteses);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Abre_chavesContext extends ParserRuleContext {
		public Abre_chavesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abre_chaves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAbre_chaves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAbre_chaves(this);
		}
	}

	public final Abre_chavesContext abre_chaves() throws RecognitionException {
		Abre_chavesContext _localctx = new Abre_chavesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_abre_chaves);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFim_linha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFim_linha(this);
		}
	}

	public final Fim_linhaContext fim_linha() throws RecognitionException {
		Fim_linhaContext _localctx = new Fim_linhaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fim_linha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__22);
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

	public static class Expressao_aritmetica_inteiroContext extends ParserRuleContext {
		public Operador_aritmeticoContext operador_aritmetico() {
			return getRuleContext(Operador_aritmeticoContext.class,0);
		}
		public List<Literal_inteiroContext> literal_inteiro() {
			return getRuleContexts(Literal_inteiroContext.class);
		}
		public Literal_inteiroContext literal_inteiro(int i) {
			return getRuleContext(Literal_inteiroContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Expressao_aritmetica_inteiroContext expressao_aritmetica_inteiro() {
			return getRuleContext(Expressao_aritmetica_inteiroContext.class,0);
		}
		public Expressao_aritmetica_inteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_aritmetica_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_aritmetica_inteiro(this);
		}
	}

	public final Expressao_aritmetica_inteiroContext expressao_aritmetica_inteiro() throws RecognitionException {
		Expressao_aritmetica_inteiroContext _localctx = new Expressao_aritmetica_inteiroContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressao_aritmetica_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_INTEIRO:
				{
				setState(152);
				literal_inteiro();
				}
				break;
			case ID:
				{
				setState(153);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156);
			operador_aritmetico();
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL_INTEIRO:
					{
					setState(157);
					literal_inteiro();
					}
					break;
				case ID:
					{
					setState(158);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(161);
				expressao_aritmetica_inteiro();
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

	public static class Expressao_aritmetica_decimalContext extends ParserRuleContext {
		public Operador_aritmeticoContext operador_aritmetico() {
			return getRuleContext(Operador_aritmeticoContext.class,0);
		}
		public List<Literal_decimalContext> literal_decimal() {
			return getRuleContexts(Literal_decimalContext.class);
		}
		public Literal_decimalContext literal_decimal(int i) {
			return getRuleContext(Literal_decimalContext.class,i);
		}
		public List<Literal_inteiroContext> literal_inteiro() {
			return getRuleContexts(Literal_inteiroContext.class);
		}
		public Literal_inteiroContext literal_inteiro(int i) {
			return getRuleContext(Literal_inteiroContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Expressao_aritmetica_decimalContext expressao_aritmetica_decimal() {
			return getRuleContext(Expressao_aritmetica_decimalContext.class,0);
		}
		public Expressao_aritmetica_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_aritmetica_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_aritmetica_decimal(this);
		}
	}

	public final Expressao_aritmetica_decimalContext expressao_aritmetica_decimal() throws RecognitionException {
		Expressao_aritmetica_decimalContext _localctx = new Expressao_aritmetica_decimalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressao_aritmetica_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_DECIMAL:
				{
				setState(164);
				literal_decimal();
				}
				break;
			case LITERAL_INTEIRO:
				{
				setState(165);
				literal_inteiro();
				}
				break;
			case ID:
				{
				setState(166);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(169);
			operador_aritmetico();
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL_DECIMAL:
					{
					setState(170);
					literal_decimal();
					}
					break;
				case LITERAL_INTEIRO:
					{
					setState(171);
					literal_inteiro();
					}
					break;
				case ID:
					{
					setState(172);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(175);
				expressao_aritmetica_decimal();
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

	public static class Expressao_concatenacaoContext extends ParserRuleContext {
		public List<Literal_textoContext> literal_texto() {
			return getRuleContexts(Literal_textoContext.class);
		}
		public Literal_textoContext literal_texto(int i) {
			return getRuleContext(Literal_textoContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<Operador_concatenacaoContext> operador_concatenacao() {
			return getRuleContexts(Operador_concatenacaoContext.class);
		}
		public Operador_concatenacaoContext operador_concatenacao(int i) {
			return getRuleContext(Operador_concatenacaoContext.class,i);
		}
		public List<Expressao_concatenacaoContext> expressao_concatenacao() {
			return getRuleContexts(Expressao_concatenacaoContext.class);
		}
		public Expressao_concatenacaoContext expressao_concatenacao(int i) {
			return getRuleContext(Expressao_concatenacaoContext.class,i);
		}
		public Expressao_concatenacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_concatenacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_concatenacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_concatenacao(this);
		}
	}

	public final Expressao_concatenacaoContext expressao_concatenacao() throws RecognitionException {
		Expressao_concatenacaoContext _localctx = new Expressao_concatenacaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressao_concatenacao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_TEXTO:
				{
				setState(178);
				literal_texto();
				}
				break;
			case ID:
				{
				setState(179);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					operador_concatenacao();
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(185);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LITERAL_TEXTO:
							{
							setState(183);
							literal_texto();
							}
							break;
						case ID:
							{
							setState(184);
							id();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 2:
						{
						setState(187);
						expressao_concatenacao();
						}
						break;
					}
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<Literal_inteiroContext> literal_inteiro() {
			return getRuleContexts(Literal_inteiroContext.class);
		}
		public Literal_inteiroContext literal_inteiro(int i) {
			return getRuleContext(Literal_inteiroContext.class,i);
		}
		public List<Literal_decimalContext> literal_decimal() {
			return getRuleContexts(Literal_decimalContext.class);
		}
		public Literal_decimalContext literal_decimal(int i) {
			return getRuleContext(Literal_decimalContext.class,i);
		}
		public List<Expressao_relacionalContext> expressao_relacional() {
			return getRuleContexts(Expressao_relacionalContext.class);
		}
		public Expressao_relacionalContext expressao_relacional(int i) {
			return getRuleContext(Expressao_relacionalContext.class,i);
		}
		public Expressao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_relacional(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressao_relacional);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(195);
				id();
				}
				break;
			case LITERAL_INTEIRO:
				{
				setState(196);
				literal_inteiro();
				}
				break;
			case LITERAL_DECIMAL:
				{
				setState(197);
				literal_decimal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(200);
			operador_relacional();
			setState(207); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(204);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(201);
							id();
							}
							break;
						case LITERAL_INTEIRO:
							{
							setState(202);
							literal_inteiro();
							}
							break;
						case LITERAL_DECIMAL:
							{
							setState(203);
							literal_decimal();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 2:
						{
						setState(206);
						expressao_relacional();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public Operador_logicoContext operador_logico() {
			return getRuleContext(Operador_logicoContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<Literal_booleanoContext> literal_booleano() {
			return getRuleContexts(Literal_booleanoContext.class);
		}
		public Literal_booleanoContext literal_booleano(int i) {
			return getRuleContext(Literal_booleanoContext.class,i);
		}
		public List<Expressao_relacionalContext> expressao_relacional() {
			return getRuleContexts(Expressao_relacionalContext.class);
		}
		public Expressao_relacionalContext expressao_relacional(int i) {
			return getRuleContext(Expressao_relacionalContext.class,i);
		}
		public Expressao_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_logica(this);
		}
	}

	public final Expressao_logicaContext expressao_logica() throws RecognitionException {
		Expressao_logicaContext _localctx = new Expressao_logicaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressao_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(211);
				id();
				}
				break;
			case 2:
				{
				setState(212);
				literal_booleano();
				}
				break;
			case 3:
				{
				setState(213);
				expressao_relacional();
				}
				break;
			}
			setState(216);
			operador_logico();
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(217);
						id();
						}
						break;
					case 2:
						{
						setState(218);
						literal_booleano();
						}
						break;
					case 3:
						{
						setState(219);
						expressao_relacional();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(222);
					expressao_relacional();
					}
					break;
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL))) != 0) );
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

	public static class Expressao_condicaoContext extends ParserRuleContext {
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public Literal_booleanoContext literal_booleano() {
			return getRuleContext(Literal_booleanoContext.class,0);
		}
		public Expressao_condicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_condicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_condicao(this);
		}
	}

	public final Expressao_condicaoContext expressao_condicao() throws RecognitionException {
		Expressao_condicaoContext _localctx = new Expressao_condicaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressao_condicao);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				expressao_relacional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				expressao_logica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				literal_booleano();
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

	public static class InstrucaoContext extends ParserRuleContext {
		public Instrucao_declaracaoContext instrucao_declaracao() {
			return getRuleContext(Instrucao_declaracaoContext.class,0);
		}
		public Instrucao_atribuicaoContext instrucao_atribuicao() {
			return getRuleContext(Instrucao_atribuicaoContext.class,0);
		}
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Instrucao_condicionalContext instrucao_condicional() {
			return getRuleContext(Instrucao_condicionalContext.class,0);
		}
		public Instrucao_repeticaoContext instrucao_repeticao() {
			return getRuleContext(Instrucao_repeticaoContext.class,0);
		}
		public Instrucao_imprecaoContext instrucao_imprecao() {
			return getRuleContext(Instrucao_imprecaoContext.class,0);
		}
		public Instrucao_varreduraContext instrucao_varredura() {
			return getRuleContext(Instrucao_varreduraContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_instrucao);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				instrucao_declaracao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				instrucao_atribuicao();
				setState(234);
				fim_linha();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				instrucao_condicional();
				}
				break;
			case T__29:
			case T__32:
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				instrucao_repeticao();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				instrucao_imprecao();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				instrucao_varredura();
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

	public static class Instrucao_declaracaoContext extends ParserRuleContext {
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Instrucao_declaracao_inteiroContext instrucao_declaracao_inteiro() {
			return getRuleContext(Instrucao_declaracao_inteiroContext.class,0);
		}
		public Instrucao_declaracao_decimalContext instrucao_declaracao_decimal() {
			return getRuleContext(Instrucao_declaracao_decimalContext.class,0);
		}
		public Instrucao_declaracao_textoContext instrucao_declaracao_texto() {
			return getRuleContext(Instrucao_declaracao_textoContext.class,0);
		}
		public Instrucao_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucao_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucao_declaracao(this);
		}
	}

	public final Instrucao_declaracaoContext instrucao_declaracao() throws RecognitionException {
		Instrucao_declaracaoContext _localctx = new Instrucao_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_instrucao_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(242);
				instrucao_declaracao_inteiro();
				}
				break;
			case T__3:
				{
				setState(243);
				instrucao_declaracao_decimal();
				}
				break;
			case T__4:
				{
				setState(244);
				instrucao_declaracao_texto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(247);
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

	public static class Instrucao_atribuicaoContext extends ParserRuleContext {
		public Instrucao_atribuicao_inteiroContext instrucao_atribuicao_inteiro() {
			return getRuleContext(Instrucao_atribuicao_inteiroContext.class,0);
		}
		public Instrucao_atribuicao_decimalContext instrucao_atribuicao_decimal() {
			return getRuleContext(Instrucao_atribuicao_decimalContext.class,0);
		}
		public Instrucao_atribuicao_textoContext instrucao_atribuicao_texto() {
			return getRuleContext(Instrucao_atribuicao_textoContext.class,0);
		}
		public Instrucao_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucao_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucao_atribuicao(this);
		}
	}

	public final Instrucao_atribuicaoContext instrucao_atribuicao() throws RecognitionException {
		Instrucao_atribuicaoContext _localctx = new Instrucao_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_instrucao_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(249);
				instrucao_atribuicao_inteiro();
				}
				break;
			case 2:
				{
				setState(250);
				instrucao_atribuicao_decimal();
				}
				break;
			case 3:
				{
				setState(251);
				instrucao_atribuicao_texto();
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

	public static class Instrucao_declaracao_inteiroContext extends ParserRuleContext {
		public Tipo_inteiroContext tipo_inteiro() {
			return getRuleContext(Tipo_inteiroContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Operador_atribuicaoContext operador_atribuicao() {
			return getRuleContext(Operador_atribuicaoContext.class,0);
		}
		public Proximo_inteiroContext proximo_inteiro() {
			return getRuleContext(Proximo_inteiroContext.class,0);
		}
		public Expressao_aritmetica_inteiroContext expressao_aritmetica_inteiro() {
			return getRuleContext(Expressao_aritmetica_inteiroContext.class,0);
		}
		public Literal_inteiroContext literal_inteiro() {
			return getRuleContext(Literal_inteiroContext.class,0);
		}
		public Instrucao_declaracao_inteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_declaracao_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucao_declaracao_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucao_declaracao_inteiro(this);
		}
	}

	public final Instrucao_declaracao_inteiroContext instrucao_declaracao_inteiro() throws RecognitionException {
		Instrucao_declaracao_inteiroContext _localctx = new Instrucao_declaracao_inteiroContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_instrucao_declaracao_inteiro);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(254);
				tipo_inteiro();
				setState(255);
				id();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(257);
				tipo_inteiro();
				setState(258);
				id();
				setState(259);
				operador_atribuicao();
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(265);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(262);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(260);
							id();
							}
							break;
						case LITERAL_INTEIRO:
							{
							setState(261);
							literal_inteiro();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 2:
						{
						setState(264);
						expressao_aritmetica_inteiro();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(267);
					proximo_inteiro();
					}
					break;
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

	public static class Instrucao_atribuicao_inteiroContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Operador_atribuicaoContext operador_atribuicao() {
			return getRuleContext(Operador_atribuicaoContext.class,0);
		}
		public Proximo_inteiroContext proximo_inteiro() {
			return getRuleContext(Proximo_inteiroContext.class,0);
		}
		public Expressao_aritmetica_inteiroContext expressao_aritmetica_inteiro() {
			return getRuleContext(Expressao_aritmetica_inteiroContext.class,0);
		}
		public Literal_inteiroContext literal_inteiro() {
			return getRuleContext(Literal_inteiroContext.class,0);
		}
		public Instrucao_atribuicao_inteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_atribuicao_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucao_atribuicao_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucao_atribuicao_inteiro(this);
		}
	}

	public final Instrucao_atribuicao_inteiroContext instrucao_atribuicao_inteiro() throws RecognitionException {
		Instrucao_atribuicao_inteiroContext _localctx = new Instrucao_atribuicao_inteiroContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_instrucao_atribuicao_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			id();
			setState(273);
			operador_atribuicao();
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(276);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(274);
						id();
						}
						break;
					case LITERAL_INTEIRO:
						{
						setState(275);
						literal_inteiro();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 2:
					{
					setState(278);
					expressao_aritmetica_inteiro();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(281);
				proximo_inteiro();
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

	public static class Instrucao_declaracao_decimalContext extends ParserRuleContext {
		public Tipo_decimalContext tipo_decimal() {
			return getRuleContext(Tipo_decimalContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Operador_atribuicaoContext operador_atribuicao() {
			return getRuleContext(Operador_atribuicaoContext.class,0);
		}
		public Proximo_decimalContext proximo_decimal() {
			return getRuleContext(Proximo_decimalContext.class,0);
		}
		public Expressao_aritmetica_decimalContext expressao_aritmetica_decimal() {
			return getRuleContext(Expressao_aritmetica_decimalContext.class,0);
		}
		public Literal_decimalContext literal_decimal() {
			return getRuleContext(Literal_decimalContext.class,0);
		}
		public Instrucao_declaracao_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_declaracao_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucao_declaracao_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucao_declaracao_decimal(this);
		}
	}

	public final Instrucao_declaracao_decimalContext instrucao_declaracao_decimal() throws RecognitionException {
		Instrucao_declaracao_decimalContext _localctx = new Instrucao_declaracao_decimalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_instrucao_declaracao_decimal);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(284);
				tipo_decimal();
				setState(285);
				id();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(287);
				tipo_decimal();
				setState(288);
				id();
				setState(289);
				operador_atribuicao();
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(292);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(290);
							id();
							}
							break;
						case LITERAL_DECIMAL:
							{
							setState(291);
							literal_decimal();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 2:
						{
						setState(294);
						expressao_aritmetica_decimal();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(297);
					proximo_decimal();
					}
					break;
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

	public static class Instrucao_atribuicao_decimalContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Operador_atribuicaoContext operador_atribuicao() {
			return getRuleContext(Operador_atribuicaoContext.class,0);
		}
		public Proximo_decimalContext proximo_decimal() {
			return getRuleContext(Proximo_decimalContext.class,0);
		}
		public Expressao_aritmetica_decimalContext expressao_aritmetica_decimal() {
			return getRuleContext(Expressao_aritmetica_decimalContext.class,0);
		}
		public Literal_decimalContext literal_decimal() {
			return getRuleContext(Literal_decimalContext.class,0);
		}
		public Instrucao_atribuicao_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_atribuicao_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucao_atribuicao_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucao_atribuicao_decimal(this);
		}
	}

	public final Instrucao_atribuicao_decimalContext instrucao_atribuicao_decimal() throws RecognitionException {
		Instrucao_atribuicao_decimalContext _localctx = new Instrucao_atribuicao_decimalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_instrucao_atribuicao_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			id();
			setState(303);
			operador_atribuicao();
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(306);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(304);
						id();
						}
						break;
					case LITERAL_DECIMAL:
						{
						setState(305);
						literal_decimal();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 2:
					{
					setState(308);
					expressao_aritmetica_decimal();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(311);
				proximo_decimal();
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

	public static class Instrucao_declaracao_textoContext extends ParserRuleContext {
		public Tipo_textoContext tipo_texto() {
			return getRuleContext(Tipo_textoContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Operador_atribuicaoContext operador_atribuicao() {
			return getRuleContext(Operador_atribuicaoContext.class,0);
		}
		public Literal_textoContext literal_texto() {
			return getRuleContext(Literal_textoContext.class,0);
		}
		public Proximo_textoContext proximo_texto() {
			return getRuleContext(Proximo_textoContext.class,0);
		}
		public Expressao_concatenacaoContext expressao_concatenacao() {
			return getRuleContext(Expressao_concatenacaoContext.class,0);
		}
		public Instrucao_declaracao_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_declaracao_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucao_declaracao_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucao_declaracao_texto(this);
		}
	}

	public final Instrucao_declaracao_textoContext instrucao_declaracao_texto() throws RecognitionException {
		Instrucao_declaracao_textoContext _localctx = new Instrucao_declaracao_textoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_instrucao_declaracao_texto);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(314);
				tipo_texto();
				setState(315);
				id();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(317);
				tipo_texto();
				setState(318);
				id();
				setState(319);
				operador_atribuicao();
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(320);
					id();
					}
					break;
				case 2:
					{
					setState(321);
					literal_texto();
					}
					break;
				case 3:
					{
					setState(322);
					proximo_texto();
					}
					break;
				case 4:
					{
					setState(323);
					expressao_concatenacao();
					}
					break;
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

	public static class Instrucao_atribuicao_textoContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Operador_atribuicaoContext operador_atribuicao() {
			return getRuleContext(Operador_atribuicaoContext.class,0);
		}
		public Literal_textoContext literal_texto() {
			return getRuleContext(Literal_textoContext.class,0);
		}
		public Proximo_textoContext proximo_texto() {
			return getRuleContext(Proximo_textoContext.class,0);
		}
		public Expressao_concatenacaoContext expressao_concatenacao() {
			return getRuleContext(Expressao_concatenacaoContext.class,0);
		}
		public Instrucao_atribuicao_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_atribuicao_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucao_atribuicao_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucao_atribuicao_texto(this);
		}
	}

	public final Instrucao_atribuicao_textoContext instrucao_atribuicao_texto() throws RecognitionException {
		Instrucao_atribuicao_textoContext _localctx = new Instrucao_atribuicao_textoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_instrucao_atribuicao_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			id();
			setState(329);
			operador_atribuicao();
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(330);
				id();
				}
				break;
			case 2:
				{
				setState(331);
				literal_texto();
				}
				break;
			case 3:
				{
				setState(332);
				proximo_texto();
				}
				break;
			case 4:
				{
				setState(333);
				expressao_concatenacao();
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

	public static class Instrucao_condicionalContext extends ParserRuleContext {
		public Abre_parentesesContext abre_parenteses() {
			return getRuleContext(Abre_parentesesContext.class,0);
		}
		public Expressao_condicaoContext expressao_condicao() {
			return getRuleContext(Expressao_condicaoContext.class,0);
		}
		public Fecha_parentesesContext fecha_parenteses() {
			return getRuleContext(Fecha_parentesesContext.class,0);
		}
		public Abre_chavesContext abre_chaves() {
			return getRuleContext(Abre_chavesContext.class,0);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public Instrucao_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucao_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucao_condicional(this);
		}
	}

	public final Instrucao_condicionalContext instrucao_condicional() throws RecognitionException {
		Instrucao_condicionalContext _localctx = new Instrucao_condicionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_instrucao_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__23);
			setState(337);
			abre_parenteses();
			setState(338);
			expressao_condicao();
			setState(339);
			fecha_parenteses();
			setState(340);
			match(T__24);
			setState(341);
			abre_chaves();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__23) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__41) | (1L << ID))) != 0)) {
				{
				{
				setState(342);
				instrucao();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			match(T__25);
			setState(349);
			senao();
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

	public static class SenaoContext extends ParserRuleContext {
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSenao(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_senao);
		int _la;
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(T__26);
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__23) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__41) | (1L << ID))) != 0)) {
					{
					{
					setState(352);
					instrucao();
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(358);
				match(T__27);
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__23:
			case T__25:
			case T__27:
			case T__29:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__41:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Instrucao_repeticaoContext extends ParserRuleContext {
		public Repeticao_paraContext repeticao_para() {
			return getRuleContext(Repeticao_paraContext.class,0);
		}
		public Repeticao_enquantoContext repeticao_enquanto() {
			return getRuleContext(Repeticao_enquantoContext.class,0);
		}
		public Repeticao_cicloContext repeticao_ciclo() {
			return getRuleContext(Repeticao_cicloContext.class,0);
		}
		public Instrucao_repeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucao_repeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucao_repeticao(this);
		}
	}

	public final Instrucao_repeticaoContext instrucao_repeticao() throws RecognitionException {
		Instrucao_repeticaoContext _localctx = new Instrucao_repeticaoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_instrucao_repeticao);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				repeticao_para();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				repeticao_enquanto();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				repeticao_ciclo();
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

	public static class Separacao_argumentosContext extends ParserRuleContext {
		public Separacao_argumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separacao_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSeparacao_argumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSeparacao_argumentos(this);
		}
	}

	public final Separacao_argumentosContext separacao_argumentos() throws RecognitionException {
		Separacao_argumentosContext _localctx = new Separacao_argumentosContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_separacao_argumentos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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

	public static class Declaracao_paraContext extends ParserRuleContext {
		public Instrucao_declaracao_inteiroContext instrucao_declaracao_inteiro() {
			return getRuleContext(Instrucao_declaracao_inteiroContext.class,0);
		}
		public Instrucao_declaracao_decimalContext instrucao_declaracao_decimal() {
			return getRuleContext(Instrucao_declaracao_decimalContext.class,0);
		}
		public Instrucao_declaracao_textoContext instrucao_declaracao_texto() {
			return getRuleContext(Instrucao_declaracao_textoContext.class,0);
		}
		public Instrucao_atribuicao_inteiroContext instrucao_atribuicao_inteiro() {
			return getRuleContext(Instrucao_atribuicao_inteiroContext.class,0);
		}
		public Instrucao_atribuicao_decimalContext instrucao_atribuicao_decimal() {
			return getRuleContext(Instrucao_atribuicao_decimalContext.class,0);
		}
		public Instrucao_atribuicao_textoContext instrucao_atribuicao_texto() {
			return getRuleContext(Instrucao_atribuicao_textoContext.class,0);
		}
		public Declaracao_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao_para(this);
		}
	}

	public final Declaracao_paraContext declaracao_para() throws RecognitionException {
		Declaracao_paraContext _localctx = new Declaracao_paraContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_declaracao_para);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				instrucao_declaracao_inteiro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				instrucao_declaracao_decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				instrucao_declaracao_texto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				instrucao_atribuicao_inteiro();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				instrucao_atribuicao_decimal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(374);
				instrucao_atribuicao_texto();
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

	public static class Repeticao_paraContext extends ParserRuleContext {
		public Abre_parentesesContext abre_parenteses() {
			return getRuleContext(Abre_parentesesContext.class,0);
		}
		public List<Separacao_argumentosContext> separacao_argumentos() {
			return getRuleContexts(Separacao_argumentosContext.class);
		}
		public Separacao_argumentosContext separacao_argumentos(int i) {
			return getRuleContext(Separacao_argumentosContext.class,i);
		}
		public Fecha_parentesesContext fecha_parenteses() {
			return getRuleContext(Fecha_parentesesContext.class,0);
		}
		public Abre_chavesContext abre_chaves() {
			return getRuleContext(Abre_chavesContext.class,0);
		}
		public Declaracao_paraContext declaracao_para() {
			return getRuleContext(Declaracao_paraContext.class,0);
		}
		public Expressao_condicaoContext expressao_condicao() {
			return getRuleContext(Expressao_condicaoContext.class,0);
		}
		public Instrucao_atribuicao_inteiroContext instrucao_atribuicao_inteiro() {
			return getRuleContext(Instrucao_atribuicao_inteiroContext.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public Repeticao_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRepeticao_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRepeticao_para(this);
		}
	}

	public final Repeticao_paraContext repeticao_para() throws RecognitionException {
		Repeticao_paraContext _localctx = new Repeticao_paraContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_repeticao_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__29);
			setState(378);
			abre_parenteses();
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case ID:
				{
				setState(379);
				declaracao_para();
				}
				break;
			case T__28:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(383);
			separacao_argumentos();
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case ID:
			case LITERAL_INTEIRO:
			case LITERAL_DECIMAL:
				{
				setState(384);
				expressao_condicao();
				}
				break;
			case T__28:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(388);
			separacao_argumentos();
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(389);
				instrucao_atribuicao_inteiro();
				}
				break;
			case T__30:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(393);
			fecha_parenteses();
			setState(394);
			match(T__30);
			setState(395);
			abre_chaves();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__23) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__41) | (1L << ID))) != 0)) {
				{
				{
				setState(396);
				instrucao();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(T__31);
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

	public static class Repeticao_enquantoContext extends ParserRuleContext {
		public Abre_parentesesContext abre_parenteses() {
			return getRuleContext(Abre_parentesesContext.class,0);
		}
		public Expressao_condicaoContext expressao_condicao() {
			return getRuleContext(Expressao_condicaoContext.class,0);
		}
		public Fecha_parentesesContext fecha_parenteses() {
			return getRuleContext(Fecha_parentesesContext.class,0);
		}
		public Abre_chavesContext abre_chaves() {
			return getRuleContext(Abre_chavesContext.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public Repeticao_enquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRepeticao_enquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRepeticao_enquanto(this);
		}
	}

	public final Repeticao_enquantoContext repeticao_enquanto() throws RecognitionException {
		Repeticao_enquantoContext _localctx = new Repeticao_enquantoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_repeticao_enquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__32);
			setState(405);
			abre_parenteses();
			setState(406);
			expressao_condicao();
			setState(407);
			fecha_parenteses();
			setState(408);
			match(T__30);
			setState(409);
			abre_chaves();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__23) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__41) | (1L << ID))) != 0)) {
				{
				{
				setState(410);
				instrucao();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
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

	public static class Meio_cicloContext extends ParserRuleContext {
		public Meio_cicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meio_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMeio_ciclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMeio_ciclo(this);
		}
	}

	public final Meio_cicloContext meio_ciclo() throws RecognitionException {
		Meio_cicloContext _localctx = new Meio_cicloContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_meio_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Repeticao_cicloContext extends ParserRuleContext {
		public Meio_cicloContext meio_ciclo() {
			return getRuleContext(Meio_cicloContext.class,0);
		}
		public Abre_parentesesContext abre_parenteses() {
			return getRuleContext(Abre_parentesesContext.class,0);
		}
		public Expressao_condicaoContext expressao_condicao() {
			return getRuleContext(Expressao_condicaoContext.class,0);
		}
		public Fecha_parentesesContext fecha_parenteses() {
			return getRuleContext(Fecha_parentesesContext.class,0);
		}
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public Repeticao_cicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRepeticao_ciclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRepeticao_ciclo(this);
		}
	}

	public final Repeticao_cicloContext repeticao_ciclo() throws RecognitionException {
		Repeticao_cicloContext _localctx = new Repeticao_cicloContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_repeticao_ciclo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__34);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__23) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__41) | (1L << ID))) != 0)) {
				{
				{
				setState(421);
				instrucao();
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
			match(T__35);
			setState(428);
			match(T__32);
			setState(429);
			meio_ciclo();
			setState(430);
			abre_parenteses();
			setState(431);
			expressao_condicao();
			setState(432);
			fecha_parenteses();
			setState(433);
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

	public static class Instrucao_varreduraContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Operador_atribuicaoContext operador_atribuicao() {
			return getRuleContext(Operador_atribuicaoContext.class,0);
		}
		public Nova_varreduraContext nova_varredura() {
			return getRuleContext(Nova_varreduraContext.class,0);
		}
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Instrucao_varreduraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_varredura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucao_varredura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucao_varredura(this);
		}
	}

	public final Instrucao_varreduraContext instrucao_varredura() throws RecognitionException {
		Instrucao_varreduraContext _localctx = new Instrucao_varreduraContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_instrucao_varredura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__36);
			setState(436);
			id();
			setState(437);
			operador_atribuicao();
			setState(438);
			nova_varredura();
			setState(439);
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

	public static class Nova_varreduraContext extends ParserRuleContext {
		public Nova_varreduraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nova_varredura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNova_varredura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNova_varredura(this);
		}
	}

	public final Nova_varreduraContext nova_varredura() throws RecognitionException {
		Nova_varreduraContext _localctx = new Nova_varreduraContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_nova_varredura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(T__37);
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

	public static class Proximo_inteiroContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Proximo_inteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proximo_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProximo_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProximo_inteiro(this);
		}
	}

	public final Proximo_inteiroContext proximo_inteiro() throws RecognitionException {
		Proximo_inteiroContext _localctx = new Proximo_inteiroContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_proximo_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			id();
			setState(444);
			match(T__38);
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

	public static class Proximo_decimalContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Proximo_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proximo_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProximo_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProximo_decimal(this);
		}
	}

	public final Proximo_decimalContext proximo_decimal() throws RecognitionException {
		Proximo_decimalContext _localctx = new Proximo_decimalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_proximo_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			id();
			setState(447);
			match(T__39);
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

	public static class Proximo_textoContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Proximo_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proximo_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProximo_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProximo_texto(this);
		}
	}

	public final Proximo_textoContext proximo_texto() throws RecognitionException {
		Proximo_textoContext _localctx = new Proximo_textoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_proximo_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			id();
			setState(450);
			match(T__40);
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

	public static class Instrucao_imprecaoContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<Expressao_concatenacaoContext> expressao_concatenacao() {
			return getRuleContexts(Expressao_concatenacaoContext.class);
		}
		public Expressao_concatenacaoContext expressao_concatenacao(int i) {
			return getRuleContext(Expressao_concatenacaoContext.class,i);
		}
		public Instrucao_imprecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_imprecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucao_imprecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucao_imprecao(this);
		}
	}

	public final Instrucao_imprecaoContext instrucao_imprecao() throws RecognitionException {
		Instrucao_imprecaoContext _localctx = new Instrucao_imprecaoContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_instrucao_imprecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(T__41);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==LITERAL_TEXTO) {
				{
				setState(455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(453);
					id();
					}
					break;
				case 2:
					{
					setState(454);
					expressao_concatenacao();
					}
					break;
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
			match(T__22);
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
		"\u0004\u00010\u01cf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001l\b\u0001\n\u0001\f\u0001o\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u009b\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u00a0\b\u0015\u0001\u0015\u0003\u0015\u00a3\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00a8\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00ae\b\u0016\u0001\u0016\u0003\u0016\u00b1"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u00b5\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00ba\b\u0017\u0001\u0017\u0003\u0017"+
		"\u00bd\b\u0017\u0005\u0017\u00bf\b\u0017\n\u0017\f\u0017\u00c2\t\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00c7\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00cd\b\u0018\u0001\u0018"+
		"\u0004\u0018\u00d0\b\u0018\u000b\u0018\f\u0018\u00d1\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u00d7\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u00dd\b\u0019\u0001\u0019\u0004\u0019\u00e0"+
		"\b\u0019\u000b\u0019\f\u0019\u00e1\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u00e7\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00f1\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u00f6\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u00fd\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0107\b\u001e\u0001\u001e\u0003\u001e"+
		"\u010a\b\u001e\u0001\u001e\u0003\u001e\u010d\b\u001e\u0003\u001e\u010f"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0115"+
		"\b\u001f\u0001\u001f\u0003\u001f\u0118\b\u001f\u0001\u001f\u0003\u001f"+
		"\u011b\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u0125\b \u0001 \u0003 \u0128\b \u0001 \u0003 \u012b\b \u0003"+
		" \u012d\b \u0001!\u0001!\u0001!\u0001!\u0003!\u0133\b!\u0001!\u0003!\u0136"+
		"\b!\u0001!\u0003!\u0139\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0145\b\"\u0003\"\u0147\b\""+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u014f\b#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u0158\b$\n$\f$\u015b\t$\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0005%\u0162\b%\n%\f%\u0165\t%\u0001%\u0001"+
		"%\u0003%\u0169\b%\u0001&\u0001&\u0001&\u0003&\u016e\b&\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0178\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u017e\b)\u0001)\u0001)\u0001)\u0003)\u0183\b)\u0001"+
		")\u0001)\u0001)\u0003)\u0188\b)\u0001)\u0001)\u0001)\u0001)\u0005)\u018e"+
		"\b)\n)\f)\u0191\t)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0005*\u019c\b*\n*\f*\u019f\t*\u0001*\u0001*\u0001+\u0001+\u0001"+
		",\u0001,\u0005,\u01a7\b,\n,\f,\u01aa\t,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00011\u00011\u0001"+
		"1\u00012\u00012\u00012\u00052\u01c8\b2\n2\f2\u01cb\t2\u00012\u00012\u0001"+
		"2\u0000\u00003\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0004"+
		"\u0001\u0000\u0006\u0007\u0001\u0000\b\u000b\u0001\u0000\f\u0011\u0001"+
		"\u0000\u0012\u0014\u01e6\u0000f\u0001\u0000\u0000\u0000\u0002h\u0001\u0000"+
		"\u0000\u0000\u0004r\u0001\u0000\u0000\u0000\u0006t\u0001\u0000\u0000\u0000"+
		"\bv\u0001\u0000\u0000\u0000\nx\u0001\u0000\u0000\u0000\fz\u0001\u0000"+
		"\u0000\u0000\u000e|\u0001\u0000\u0000\u0000\u0010~\u0001\u0000\u0000\u0000"+
		"\u0012\u0080\u0001\u0000\u0000\u0000\u0014\u0082\u0001\u0000\u0000\u0000"+
		"\u0016\u0084\u0001\u0000\u0000\u0000\u0018\u0086\u0001\u0000\u0000\u0000"+
		"\u001a\u0088\u0001\u0000\u0000\u0000\u001c\u008a\u0001\u0000\u0000\u0000"+
		"\u001e\u008c\u0001\u0000\u0000\u0000 \u008e\u0001\u0000\u0000\u0000\""+
		"\u0090\u0001\u0000\u0000\u0000$\u0092\u0001\u0000\u0000\u0000&\u0094\u0001"+
		"\u0000\u0000\u0000(\u0096\u0001\u0000\u0000\u0000*\u009a\u0001\u0000\u0000"+
		"\u0000,\u00a7\u0001\u0000\u0000\u0000.\u00b4\u0001\u0000\u0000\u00000"+
		"\u00c6\u0001\u0000\u0000\u00002\u00d6\u0001\u0000\u0000\u00004\u00e6\u0001"+
		"\u0000\u0000\u00006\u00f0\u0001\u0000\u0000\u00008\u00f5\u0001\u0000\u0000"+
		"\u0000:\u00fc\u0001\u0000\u0000\u0000<\u010e\u0001\u0000\u0000\u0000>"+
		"\u0110\u0001\u0000\u0000\u0000@\u012c\u0001\u0000\u0000\u0000B\u012e\u0001"+
		"\u0000\u0000\u0000D\u0146\u0001\u0000\u0000\u0000F\u0148\u0001\u0000\u0000"+
		"\u0000H\u0150\u0001\u0000\u0000\u0000J\u0168\u0001\u0000\u0000\u0000L"+
		"\u016d\u0001\u0000\u0000\u0000N\u016f\u0001\u0000\u0000\u0000P\u0177\u0001"+
		"\u0000\u0000\u0000R\u0179\u0001\u0000\u0000\u0000T\u0194\u0001\u0000\u0000"+
		"\u0000V\u01a2\u0001\u0000\u0000\u0000X\u01a4\u0001\u0000\u0000\u0000Z"+
		"\u01b3\u0001\u0000\u0000\u0000\\\u01b9\u0001\u0000\u0000\u0000^\u01bb"+
		"\u0001\u0000\u0000\u0000`\u01be\u0001\u0000\u0000\u0000b\u01c1\u0001\u0000"+
		"\u0000\u0000d\u01c4\u0001\u0000\u0000\u0000fg\u0003\u0002\u0001\u0000"+
		"g\u0001\u0001\u0000\u0000\u0000hi\u0005\u0001\u0000\u0000im\u0003\u0004"+
		"\u0002\u0000jl\u00036\u001b\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0002\u0000\u0000"+
		"q\u0003\u0001\u0000\u0000\u0000rs\u0005+\u0000\u0000s\u0005\u0001\u0000"+
		"\u0000\u0000tu\u0005,\u0000\u0000u\u0007\u0001\u0000\u0000\u0000vw\u0005"+
		"\u0003\u0000\u0000w\t\u0001\u0000\u0000\u0000xy\u0005\u0004\u0000\u0000"+
		"y\u000b\u0001\u0000\u0000\u0000z{\u0005\u0005\u0000\u0000{\r\u0001\u0000"+
		"\u0000\u0000|}\u0007\u0000\u0000\u0000}\u000f\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005-\u0000\u0000\u007f\u0011\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005.\u0000\u0000\u0081\u0013\u0001\u0000\u0000\u0000\u0082\u0083\u0007"+
		"\u0000\u0000\u0000\u0083\u0015\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"/\u0000\u0000\u0085\u0017\u0001\u0000\u0000\u0000\u0086\u0087\u0007\u0001"+
		"\u0000\u0000\u0087\u0019\u0001\u0000\u0000\u0000\u0088\u0089\u0007\u0002"+
		"\u0000\u0000\u0089\u001b\u0001\u0000\u0000\u0000\u008a\u008b\u0007\u0003"+
		"\u0000\u0000\u008b\u001d\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0015"+
		"\u0000\u0000\u008d\u001f\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0016"+
		"\u0000\u0000\u008f!\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091#\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093%\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\'\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0017\u0000\u0000\u0097)"+
		"\u0001\u0000\u0000\u0000\u0098\u009b\u0003\u0010\b\u0000\u0099\u009b\u0003"+
		"\u0006\u0003\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u00a2\u0003"+
		"\u0018\f\u0000\u009d\u00a0\u0003\u0010\b\u0000\u009e\u00a0\u0003\u0006"+
		"\u0003\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u00a3\u0003*\u0015"+
		"\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3+\u0001\u0000\u0000\u0000\u00a4\u00a8\u0003\u0012\t\u0000"+
		"\u00a5\u00a8\u0003\u0010\b\u0000\u00a6\u00a8\u0003\u0006\u0003\u0000\u00a7"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00b0\u0003\u0018\f\u0000\u00aa\u00ae\u0003\u0012\t\u0000\u00ab\u00ae"+
		"\u0003\u0010\b\u0000\u00ac\u00ae\u0003\u0006\u0003\u0000\u00ad\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00b1\u0003"+
		",\u0016\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1-\u0001\u0000\u0000\u0000\u00b2\u00b5\u0003\u0016\u000b"+
		"\u0000\u00b3\u00b5\u0003\u0006\u0003\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00c0\u0001\u0000\u0000"+
		"\u0000\u00b6\u00bc\u0003 \u0010\u0000\u00b7\u00ba\u0003\u0016\u000b\u0000"+
		"\u00b8\u00ba\u0003\u0006\u0003\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\u0003.\u0017\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be"+
		"\u00b6\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"/\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c7"+
		"\u0003\u0006\u0003\u0000\u00c4\u00c7\u0003\u0010\b\u0000\u00c5\u00c7\u0003"+
		"\u0012\t\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cf\u0003\u001a\r\u0000\u00c9\u00cd\u0003\u0006\u0003"+
		"\u0000\u00ca\u00cd\u0003\u0010\b\u0000\u00cb\u00cd\u0003\u0012\t\u0000"+
		"\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d0\u00030\u0018\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00cf"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"1\u0001\u0000\u0000\u0000\u00d3\u00d7\u0003\u0006\u0003\u0000\u00d4\u00d7"+
		"\u0003\u0014\n\u0000\u00d5\u00d7\u00030\u0018\u0000\u00d6\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00df\u0003"+
		"\u001c\u000e\u0000\u00d9\u00dd\u0003\u0006\u0003\u0000\u00da\u00dd\u0003"+
		"\u0014\n\u0000\u00db\u00dd\u00030\u0018\u0000\u00dc\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00e0\u00030\u0018"+
		"\u0000\u00df\u00dc\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e23\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e7\u00030\u0018\u0000\u00e4\u00e7\u00032\u0019\u0000\u00e5\u00e7"+
		"\u0003\u0014\n\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e75\u0001\u0000"+
		"\u0000\u0000\u00e8\u00f1\u00038\u001c\u0000\u00e9\u00ea\u0003:\u001d\u0000"+
		"\u00ea\u00eb\u0003(\u0014\u0000\u00eb\u00f1\u0001\u0000\u0000\u0000\u00ec"+
		"\u00f1\u0003H$\u0000\u00ed\u00f1\u0003L&\u0000\u00ee\u00f1\u0003d2\u0000"+
		"\u00ef\u00f1\u0003Z-\u0000\u00f0\u00e8\u0001\u0000\u0000\u0000\u00f0\u00e9"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ec\u0001\u0000\u0000\u0000\u00f0\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f17\u0001\u0000\u0000\u0000\u00f2\u00f6\u0003"+
		"<\u001e\u0000\u00f3\u00f6\u0003@ \u0000\u00f4\u00f6\u0003D\"\u0000\u00f5"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0003(\u0014\u0000\u00f89\u0001\u0000\u0000\u0000\u00f9\u00fd\u0003"+
		">\u001f\u0000\u00fa\u00fd\u0003B!\u0000\u00fb\u00fd\u0003F#\u0000\u00fc"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fd;\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0003\b\u0004\u0000\u00ff\u0100\u0003\u0006\u0003\u0000\u0100\u010f\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0003\b\u0004\u0000\u0102\u0103\u0003\u0006"+
		"\u0003\u0000\u0103\u010c\u0003\u001e\u000f\u0000\u0104\u0107\u0003\u0006"+
		"\u0003\u0000\u0105\u0107\u0003\u0010\b\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000"+
		"\u0000\u0108\u010a\u0003*\u0015\u0000\u0109\u0106\u0001\u0000\u0000\u0000"+
		"\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000"+
		"\u010b\u010d\u0003^/\u0000\u010c\u0109\u0001\u0000\u0000\u0000\u010c\u010b"+
		"\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u00fe"+
		"\u0001\u0000\u0000\u0000\u010e\u0101\u0001\u0000\u0000\u0000\u010f=\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0003\u0006\u0003\u0000\u0111\u011a\u0003"+
		"\u001e\u000f\u0000\u0112\u0115\u0003\u0006\u0003\u0000\u0113\u0115\u0003"+
		"\u0010\b\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0113\u0001\u0000"+
		"\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0118\u0003*\u0015"+
		"\u0000\u0117\u0114\u0001\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u011b\u0003^/\u0000\u011a"+
		"\u0117\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b"+
		"?\u0001\u0000\u0000\u0000\u011c\u011d\u0003\n\u0005\u0000\u011d\u011e"+
		"\u0003\u0006\u0003\u0000\u011e\u012d\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0003\n\u0005\u0000\u0120\u0121\u0003\u0006\u0003\u0000\u0121\u012a\u0003"+
		"\u001e\u000f\u0000\u0122\u0125\u0003\u0006\u0003\u0000\u0123\u0125\u0003"+
		"\u0012\t\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0128\u0003,\u0016"+
		"\u0000\u0127\u0124\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000"+
		"\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u012b\u0003`0\u0000\u012a"+
		"\u0127\u0001\u0000\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b"+
		"\u012d\u0001\u0000\u0000\u0000\u012c\u011c\u0001\u0000\u0000\u0000\u012c"+
		"\u011f\u0001\u0000\u0000\u0000\u012dA\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0003\u0006\u0003\u0000\u012f\u0138\u0003\u001e\u000f\u0000\u0130\u0133"+
		"\u0003\u0006\u0003\u0000\u0131\u0133\u0003\u0012\t\u0000\u0132\u0130\u0001"+
		"\u0000\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0136\u0001"+
		"\u0000\u0000\u0000\u0134\u0136\u0003,\u0016\u0000\u0135\u0132\u0001\u0000"+
		"\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000"+
		"\u0000\u0000\u0137\u0139\u0003`0\u0000\u0138\u0135\u0001\u0000\u0000\u0000"+
		"\u0138\u0137\u0001\u0000\u0000\u0000\u0139C\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0003\f\u0006\u0000\u013b\u013c\u0003\u0006\u0003\u0000\u013c\u0147"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0003\f\u0006\u0000\u013e\u013f\u0003"+
		"\u0006\u0003\u0000\u013f\u0144\u0003\u001e\u000f\u0000\u0140\u0145\u0003"+
		"\u0006\u0003\u0000\u0141\u0145\u0003\u0016\u000b\u0000\u0142\u0145\u0003"+
		"b1\u0000\u0143\u0145\u0003.\u0017\u0000\u0144\u0140\u0001\u0000\u0000"+
		"\u0000\u0144\u0141\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000"+
		"\u0000\u0146\u013a\u0001\u0000\u0000\u0000\u0146\u013d\u0001\u0000\u0000"+
		"\u0000\u0147E\u0001\u0000\u0000\u0000\u0148\u0149\u0003\u0006\u0003\u0000"+
		"\u0149\u014e\u0003\u001e\u000f\u0000\u014a\u014f\u0003\u0006\u0003\u0000"+
		"\u014b\u014f\u0003\u0016\u000b\u0000\u014c\u014f\u0003b1\u0000\u014d\u014f"+
		"\u0003.\u0017\u0000\u014e\u014a\u0001\u0000\u0000\u0000\u014e\u014b\u0001"+
		"\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014d\u0001"+
		"\u0000\u0000\u0000\u014fG\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u0018"+
		"\u0000\u0000\u0151\u0152\u0003\"\u0011\u0000\u0152\u0153\u00034\u001a"+
		"\u0000\u0153\u0154\u0003$\u0012\u0000\u0154\u0155\u0005\u0019\u0000\u0000"+
		"\u0155\u0159\u0003&\u0013\u0000\u0156\u0158\u00036\u001b\u0000\u0157\u0156"+
		"\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c"+
		"\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0005\u001a\u0000\u0000\u015d\u015e\u0003J%\u0000\u015eI\u0001\u0000"+
		"\u0000\u0000\u015f\u0163\u0005\u001b\u0000\u0000\u0160\u0162\u00036\u001b"+
		"\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000"+
		"\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0166\u0169\u0005\u001c\u0000\u0000\u0167\u0169\u0001\u0000\u0000"+
		"\u0000\u0168\u015f\u0001\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000"+
		"\u0000\u0169K\u0001\u0000\u0000\u0000\u016a\u016e\u0003R)\u0000\u016b"+
		"\u016e\u0003T*\u0000\u016c\u016e\u0003X,\u0000\u016d\u016a\u0001\u0000"+
		"\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016c\u0001\u0000"+
		"\u0000\u0000\u016eM\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u001d\u0000"+
		"\u0000\u0170O\u0001\u0000\u0000\u0000\u0171\u0178\u0003<\u001e\u0000\u0172"+
		"\u0178\u0003@ \u0000\u0173\u0178\u0003D\"\u0000\u0174\u0178\u0003>\u001f"+
		"\u0000\u0175\u0178\u0003B!\u0000\u0176\u0178\u0003F#\u0000\u0177\u0171"+
		"\u0001\u0000\u0000\u0000\u0177\u0172\u0001\u0000\u0000\u0000\u0177\u0173"+
		"\u0001\u0000\u0000\u0000\u0177\u0174\u0001\u0000\u0000\u0000\u0177\u0175"+
		"\u0001\u0000\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178Q\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0005\u001e\u0000\u0000\u017a\u017d\u0003"+
		"\"\u0011\u0000\u017b\u017e\u0003P(\u0000\u017c\u017e\u0001\u0000\u0000"+
		"\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017c\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0182\u0003N\'\u0000"+
		"\u0180\u0183\u00034\u001a\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182"+
		"\u0180\u0001\u0000\u0000\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0001\u0000\u0000\u0000\u0184\u0187\u0003N\'\u0000\u0185\u0188"+
		"\u0003>\u001f\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0185\u0001"+
		"\u0000\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0003$\u0012\u0000\u018a\u018b\u0005\u001f"+
		"\u0000\u0000\u018b\u018f\u0003&\u0013\u0000\u018c\u018e\u00036\u001b\u0000"+
		"\u018d\u018c\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000"+
		"\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000"+
		"\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000"+
		"\u0192\u0193\u0005 \u0000\u0000\u0193S\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0005!\u0000\u0000\u0195\u0196\u0003\"\u0011\u0000\u0196\u0197\u0003"+
		"4\u001a\u0000\u0197\u0198\u0003$\u0012\u0000\u0198\u0199\u0005\u001f\u0000"+
		"\u0000\u0199\u019d\u0003&\u0013\u0000\u019a\u019c\u00036\u001b\u0000\u019b"+
		"\u019a\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e"+
		"\u01a0\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0005\"\u0000\u0000\u01a1U\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a3W\u0001\u0000\u0000\u0000\u01a4\u01a8\u0005"+
		"#\u0000\u0000\u01a5\u01a7\u00036\u001b\u0000\u01a6\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005$\u0000\u0000"+
		"\u01ac\u01ad\u0005!\u0000\u0000\u01ad\u01ae\u0003V+\u0000\u01ae\u01af"+
		"\u0003\"\u0011\u0000\u01af\u01b0\u00034\u001a\u0000\u01b0\u01b1\u0003"+
		"$\u0012\u0000\u01b1\u01b2\u0003(\u0014\u0000\u01b2Y\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0005%\u0000\u0000\u01b4\u01b5\u0003\u0006\u0003\u0000"+
		"\u01b5\u01b6\u0003\u001e\u000f\u0000\u01b6\u01b7\u0003\\.\u0000\u01b7"+
		"\u01b8\u0003(\u0014\u0000\u01b8[\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005"+
		"&\u0000\u0000\u01ba]\u0001\u0000\u0000\u0000\u01bb\u01bc\u0003\u0006\u0003"+
		"\u0000\u01bc\u01bd\u0005\'\u0000\u0000\u01bd_\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0003\u0006\u0003\u0000\u01bf\u01c0\u0005(\u0000\u0000\u01c0"+
		"a\u0001\u0000\u0000\u0000\u01c1\u01c2\u0003\u0006\u0003\u0000\u01c2\u01c3"+
		"\u0005)\u0000\u0000\u01c3c\u0001\u0000\u0000\u0000\u01c4\u01c9\u0005*"+
		"\u0000\u0000\u01c5\u01c8\u0003\u0006\u0003\u0000\u01c6\u01c8\u0003.\u0017"+
		"\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005\u0017\u0000"+
		"\u0000\u01cde\u0001\u0000\u0000\u00005m\u009a\u009f\u00a2\u00a7\u00ad"+
		"\u00b0\u00b4\u00b9\u00bc\u00c0\u00c6\u00cc\u00cf\u00d1\u00d6\u00dc\u00df"+
		"\u00e1\u00e6\u00f0\u00f5\u00fc\u0106\u0109\u010c\u010e\u0114\u0117\u011a"+
		"\u0124\u0127\u012a\u012c\u0132\u0135\u0138\u0144\u0146\u014e\u0159\u0163"+
		"\u0168\u016d\u0177\u017d\u0182\u0187\u018f\u019d\u01a8\u01c7\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}