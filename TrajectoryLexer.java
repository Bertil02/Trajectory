// Generated from ./src/Trajectory.g4 by ANTLR 4.9.2

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrajectoryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TIME=10, DATE=11, FACING=12, DEGREES=13, MINUTES=14, SECONDS=15, ELEVATION=16, 
		ID=17, COMMENT=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"TIME", "DATE", "FACING", "DEGREES", "MINUTES", "SECONDS", "ELEVATION", 
			"ID", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ID:'", "'{'", "'};'", "'entry('", "'),'", "','", "'('", "')'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "TIME", "DATE", 
			"FACING", "DEGREES", "MINUTES", "SECONDS", "ELEVATION", "ID", "COMMENT", 
			"WS"
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


	public TrajectoryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Trajectory.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16g\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"r\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0080\n\20\3\21\3\21\5\21\u0084\n\21\3\21\3\21\7\21\u0088\n\21\f\21\16"+
		"\21\u008b\13\21\3\21\5\21\u008e\n\21\3\22\7\22\u0091\n\22\f\22\16\22\u0094"+
		"\13\22\3\23\3\23\3\23\3\23\7\23\u009a\n\23\f\23\16\23\u009d\13\23\3\23"+
		"\3\23\3\24\6\24\u00a2\n\24\r\24\16\24\u00a3\3\24\3\24\2\2\25\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25\3\2\7\3\2\62;\3\2\63;\5\2\62;C\\c|\4\2\f\f\17\17\4\2\13"+
		"\f\"\"\2\u00b2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5-\3\2\2\2\7/\3\2"+
		"\2\2\t\62\3\2\2\2\139\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21@\3\2\2\2\23B\3"+
		"\2\2\2\25D\3\2\2\2\27Q\3\2\2\2\31\\\3\2\2\2\33f\3\2\2\2\35q\3\2\2\2\37"+
		"\177\3\2\2\2!\u008d\3\2\2\2#\u0092\3\2\2\2%\u0095\3\2\2\2\'\u00a1\3\2"+
		"\2\2)*\7K\2\2*+\7F\2\2+,\7<\2\2,\4\3\2\2\2-.\7}\2\2.\6\3\2\2\2/\60\7\177"+
		"\2\2\60\61\7=\2\2\61\b\3\2\2\2\62\63\7g\2\2\63\64\7p\2\2\64\65\7v\2\2"+
		"\65\66\7t\2\2\66\67\7{\2\2\678\7*\2\28\n\3\2\2\29:\7+\2\2:;\7.\2\2;\f"+
		"\3\2\2\2<=\7.\2\2=\16\3\2\2\2>?\7*\2\2?\20\3\2\2\2@A\7+\2\2A\22\3\2\2"+
		"\2BC\7<\2\2C\24\3\2\2\2DE\t\2\2\2EF\t\2\2\2FG\7<\2\2GH\t\2\2\2HI\t\2\2"+
		"\2IJ\7<\2\2JK\t\2\2\2KL\t\2\2\2LM\7<\2\2MN\t\2\2\2NO\t\2\2\2OP\t\2\2\2"+
		"P\26\3\2\2\2QR\t\2\2\2RS\t\2\2\2ST\7<\2\2TU\t\2\2\2UV\t\2\2\2VW\7<\2\2"+
		"WX\t\2\2\2XY\t\2\2\2YZ\t\2\2\2Z[\t\2\2\2[\30\3\2\2\2\\]\t\2\2\2]^\t\2"+
		"\2\2^_\t\2\2\2_\32\3\2\2\2`g\t\3\2\2ab\t\2\2\2bg\t\2\2\2cd\t\2\2\2de\t"+
		"\2\2\2eg\t\2\2\2f`\3\2\2\2fa\3\2\2\2fc\3\2\2\2g\34\3\2\2\2hi\t\3\2\2i"+
		"r\7b\2\2jk\t\2\2\2kl\t\2\2\2lr\7b\2\2mn\t\2\2\2no\t\2\2\2op\t\2\2\2pr"+
		"\7b\2\2qh\3\2\2\2qj\3\2\2\2qm\3\2\2\2r\36\3\2\2\2st\t\3\2\2tu\7b\2\2u"+
		"\u0080\7b\2\2vw\t\2\2\2wx\t\2\2\2xy\7b\2\2y\u0080\7b\2\2z{\t\2\2\2{|\t"+
		"\2\2\2|}\t\2\2\2}~\7b\2\2~\u0080\7b\2\2\177s\3\2\2\2\177v\3\2\2\2\177"+
		"z\3\2\2\2\u0080 \3\2\2\2\u0081\u008e\7\62\2\2\u0082\u0084\7/\2\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0089\t\3"+
		"\2\2\u0086\u0088\t\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u008e\7o\2\2\u008d\u0081\3\2\2\2\u008d\u0083\3\2\2\2\u008e"+
		"\"\3\2\2\2\u008f\u0091\t\4\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2"+
		"\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093$\3\2\2\2\u0094\u0092\3"+
		"\2\2\2\u0095\u0096\7/\2\2\u0096\u0097\7/\2\2\u0097\u009b\3\2\2\2\u0098"+
		"\u009a\n\5\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\b\23\2\2\u009f&\3\2\2\2\u00a0\u00a2\t\6\2\2\u00a1\u00a0\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a6\b\24\2\2\u00a6(\3\2\2\2\f\2fq\177\u0083\u0089\u008d"+
		"\u0092\u009b\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}