// Generated from ./src/Trajectory.g4 by ANTLR 4.9.2

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrajectoryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TIME=10, DATE=11, FACING=12, DEGREES=13, MINUTES=14, SECONDS=15, ELEVATION=16, 
		ID=17, COMMENT=18, WS=19;
	public static final int
		RULE_trajectory = 0, RULE_object = 1, RULE_identifier = 2, RULE_body = 3, 
		RULE_entry = 4, RULE_entry_declaration = 5, RULE_position = 6, RULE_longitude = 7, 
		RULE_latitude = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"trajectory", "object", "identifier", "body", "entry", "entry_declaration", 
			"position", "longitude", "latitude"
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

	@Override
	public String getGrammarFileName() { return "Trajectory.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TrajectoryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TrajectoryContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TrajectoryParser.EOF, 0); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public TrajectoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trajectory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).enterTrajectory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).exitTrajectory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrajectoryVisitor ) return ((TrajectoryVisitor<? extends T>)visitor).visitTrajectory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrajectoryContext trajectory() throws RecognitionException {
		TrajectoryContext _localctx = new TrajectoryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_trajectory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(18);
				object();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(EOF);
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

	public static class ObjectContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrajectoryVisitor ) return ((TrajectoryVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			identifier();
			setState(27);
			body();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TrajectoryParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrajectoryVisitor ) return ((TrajectoryVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
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

	public static class BodyContext extends ParserRuleContext {
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrajectoryVisitor ) return ((TrajectoryVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__1);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(33);
				entry();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
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

	public static class EntryContext extends ParserRuleContext {
		public Entry_declarationContext entry_declaration() {
			return getRuleContext(Entry_declarationContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrajectoryVisitor ) return ((TrajectoryVisitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__3);
			setState(42);
			entry_declaration();
			setState(43);
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

	public static class Entry_declarationContext extends ParserRuleContext {
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public TerminalNode FACING() { return getToken(TrajectoryParser.FACING, 0); }
		public TerminalNode TIME() { return getToken(TrajectoryParser.TIME, 0); }
		public TerminalNode DATE() { return getToken(TrajectoryParser.DATE, 0); }
		public Entry_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).enterEntry_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).exitEntry_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrajectoryVisitor ) return ((TrajectoryVisitor<? extends T>)visitor).visitEntry_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entry_declarationContext entry_declaration() throws RecognitionException {
		Entry_declarationContext _localctx = new Entry_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_entry_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			position();
			setState(46);
			match(T__5);
			setState(47);
			match(FACING);
			setState(48);
			match(T__5);
			setState(49);
			match(TIME);
			setState(50);
			match(T__5);
			setState(51);
			match(DATE);
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

	public static class PositionContext extends ParserRuleContext {
		public LongitudeContext longitude() {
			return getRuleContext(LongitudeContext.class,0);
		}
		public LatitudeContext latitude() {
			return getRuleContext(LatitudeContext.class,0);
		}
		public TerminalNode ELEVATION() { return getToken(TrajectoryParser.ELEVATION, 0); }
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrajectoryVisitor ) return ((TrajectoryVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__6);
			setState(54);
			longitude();
			setState(55);
			match(T__5);
			setState(56);
			latitude();
			setState(57);
			match(T__5);
			setState(58);
			match(ELEVATION);
			setState(59);
			match(T__7);
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

	public static class LongitudeContext extends ParserRuleContext {
		public TerminalNode DEGREES() { return getToken(TrajectoryParser.DEGREES, 0); }
		public TerminalNode MINUTES() { return getToken(TrajectoryParser.MINUTES, 0); }
		public TerminalNode SECONDS() { return getToken(TrajectoryParser.SECONDS, 0); }
		public LongitudeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longitude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).enterLongitude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).exitLongitude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrajectoryVisitor ) return ((TrajectoryVisitor<? extends T>)visitor).visitLongitude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongitudeContext longitude() throws RecognitionException {
		LongitudeContext _localctx = new LongitudeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_longitude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(DEGREES);
			setState(62);
			match(T__8);
			setState(63);
			match(MINUTES);
			setState(64);
			match(T__8);
			setState(65);
			match(SECONDS);
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

	public static class LatitudeContext extends ParserRuleContext {
		public TerminalNode DEGREES() { return getToken(TrajectoryParser.DEGREES, 0); }
		public TerminalNode MINUTES() { return getToken(TrajectoryParser.MINUTES, 0); }
		public TerminalNode SECONDS() { return getToken(TrajectoryParser.SECONDS, 0); }
		public LatitudeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latitude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).enterLatitude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrajectoryListener ) ((TrajectoryListener)listener).exitLatitude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrajectoryVisitor ) return ((TrajectoryVisitor<? extends T>)visitor).visitLatitude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatitudeContext latitude() throws RecognitionException {
		LatitudeContext _localctx = new LatitudeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_latitude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(DEGREES);
			setState(68);
			match(T__8);
			setState(69);
			match(MINUTES);
			setState(70);
			match(T__8);
			setState(71);
			match(SECONDS);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25L\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\7\5%\n\5"+
		"\f\5\16\5(\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2D\2\27\3\2\2\2\4\34"+
		"\3\2\2\2\6\37\3\2\2\2\b\"\3\2\2\2\n+\3\2\2\2\f/\3\2\2\2\16\67\3\2\2\2"+
		"\20?\3\2\2\2\22E\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27"+
		"\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\2\2\3\33"+
		"\3\3\2\2\2\34\35\5\6\4\2\35\36\5\b\5\2\36\5\3\2\2\2\37 \7\3\2\2 !\7\23"+
		"\2\2!\7\3\2\2\2\"&\7\4\2\2#%\5\n\6\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'"+
		"\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7\5\2\2*\t\3\2\2\2+,\7\6\2\2,-\5\f\7\2"+
		"-.\7\7\2\2.\13\3\2\2\2/\60\5\16\b\2\60\61\7\b\2\2\61\62\7\16\2\2\62\63"+
		"\7\b\2\2\63\64\7\f\2\2\64\65\7\b\2\2\65\66\7\r\2\2\66\r\3\2\2\2\678\7"+
		"\t\2\289\5\20\t\29:\7\b\2\2:;\5\22\n\2;<\7\b\2\2<=\7\22\2\2=>\7\n\2\2"+
		">\17\3\2\2\2?@\7\17\2\2@A\7\13\2\2AB\7\20\2\2BC\7\13\2\2CD\7\21\2\2D\21"+
		"\3\2\2\2EF\7\17\2\2FG\7\13\2\2GH\7\20\2\2HI\7\13\2\2IJ\7\21\2\2J\23\3"+
		"\2\2\2\4\27&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}