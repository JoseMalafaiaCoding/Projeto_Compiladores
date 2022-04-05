// Generated from enunciado_atribuicao.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class enunciado_atribuicaoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		CARACTERE=18, LITERAL_TEXTO=19, LITERAL_NUMERICO=20, IDENTIFICADOR=21, 
		Ws=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"CARACTERE", "LITERAL_TEXTO", "LITERAL_NUMERICO", "IDENTIFICADOR", "Ws"
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


	public enunciado_atribuicaoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "enunciado_atribuicao.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\6\24\u0086\n\24\r\24\16\24\u0087\3\24\3"+
		"\24\3\25\6\25\u008d\n\25\r\25\16\25\u008e\3\25\3\25\6\25\u0093\n\25\r"+
		"\25\16\25\u0094\5\25\u0097\n\25\3\26\7\26\u009a\n\26\f\26\16\26\u009d"+
		"\13\26\3\27\6\27\u00a0\n\27\r\27\16\27\u00a1\3\27\3\27\2\2\30\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30\3\2\6\5\2\62;C\\c|\4\2C\\c|\3\2\62;\5\2\13\f"+
		"\17\17\"\"\2\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\3/\3\2\2\2\5:\3\2\2\2\7@\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rF\3\2"+
		"\2\2\17H\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25O\3\2\2\2\27R\3\2\2\2\31T\3"+
		"\2\2\2\33W\3\2\2\2\35_\3\2\2\2\37g\3\2\2\2!q\3\2\2\2#x\3\2\2\2%\u0081"+
		"\3\2\2\2\'\u0083\3\2\2\2)\u008c\3\2\2\2+\u009b\3\2\2\2-\u009f\3\2\2\2"+
		"/\60\7x\2\2\60\61\7g\2\2\61\62\7t\2\2\62\63\7f\2\2\63\64\7c\2\2\64\65"+
		"\7f\2\2\65\66\7g\2\2\66\67\7k\2\2\678\7t\2\289\7q\2\29\4\3\2\2\2:;\7h"+
		"\2\2;<\7c\2\2<=\7n\2\2=>\7u\2\2>?\7q\2\2?\6\3\2\2\2@A\7-\2\2A\b\3\2\2"+
		"\2BC\7/\2\2C\n\3\2\2\2DE\7,\2\2E\f\3\2\2\2FG\7\61\2\2G\16\3\2\2\2HI\7"+
		">\2\2I\20\3\2\2\2JK\7@\2\2K\22\3\2\2\2LM\7>\2\2MN\7?\2\2N\24\3\2\2\2O"+
		"P\7@\2\2PQ\7?\2\2Q\26\3\2\2\2RS\7#\2\2S\30\3\2\2\2TU\7<\2\2UV\7?\2\2V"+
		"\32\3\2\2\2WX\7k\2\2XY\7p\2\2YZ\7v\2\2Z[\7g\2\2[\\\7k\2\2\\]\7t\2\2]^"+
		"\7q\2\2^\34\3\2\2\2_`\7f\2\2`a\7g\2\2ab\7e\2\2bc\7k\2\2cd\7o\2\2de\7c"+
		"\2\2ef\7n\2\2f\36\3\2\2\2gh\7e\2\2hi\7c\2\2ij\7t\2\2jk\7c\2\2kl\7e\2\2"+
		"lm\7v\2\2mn\7g\2\2no\7t\2\2op\7g\2\2p \3\2\2\2qr\7e\2\2rs\7c\2\2st\7f"+
		"\2\2tu\7g\2\2uv\7k\2\2vw\7c\2\2w\"\3\2\2\2xy\7d\2\2yz\7q\2\2z{\7q\2\2"+
		"{|\7n\2\2|}\7g\2\2}~\7c\2\2~\177\7p\2\2\177\u0080\7q\2\2\u0080$\3\2\2"+
		"\2\u0081\u0082\t\2\2\2\u0082&\3\2\2\2\u0083\u0085\7$\2\2\u0084\u0086\t"+
		"\3\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7$\2\2\u008a(\3\2\2\2\u008b"+
		"\u008d\t\4\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0096\3\2\2\2\u0090\u0092\13\2\2\2\u0091"+
		"\u0093\t\4\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0090\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097*\3\2\2\2\u0098\u009a\t\2\2\2\u0099\u0098\3\2\2\2"+
		"\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c,\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\t\5\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a4\b\27\2\2\u00a4.\3\2\2\2\t\2\u0087\u008e\u0094\u0096\u009b"+
		"\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}