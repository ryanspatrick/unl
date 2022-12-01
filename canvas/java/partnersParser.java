// Generated from partners.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class partnersParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE=1;
	public static final int
		RULE_file = 0, RULE_partners = 1, RULE_user = 2;
	public static final String[] ruleNames = {
		"file", "partners", "user"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LINE"
	};
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
	public String getGrammarFileName() { return "partners.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		int group = 1;

	public partnersParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(partnersParser.EOF, 0); }
		public List<PartnersContext> partners() {
			return getRuleContexts(PartnersContext.class);
		}
		public PartnersContext partners(int i) {
			return getRuleContext(PartnersContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof partnersListener ) ((partnersListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof partnersListener ) ((partnersListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE) {
				{
				{
				 System.out.format( "--------" ); 
				setState(7);
				partners();
				}
				}
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(13);
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

	public static class PartnersContext extends ParserRuleContext {
		public UserContext p01;
		public UserContext p02;
		public UserContext pA;
		public UserContext pB;
		public UserContext pC;
		public List<UserContext> user() {
			return getRuleContexts(UserContext.class);
		}
		public UserContext user(int i) {
			return getRuleContext(UserContext.class,i);
		}
		public PartnersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partners; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof partnersListener ) ((partnersListener)listener).enterPartners(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof partnersListener ) ((partnersListener)listener).exitPartners(this);
		}
	}

	public final PartnersContext partners() throws RecognitionException {
		PartnersContext _localctx = new PartnersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_partners);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(15);
				((PartnersContext)_localctx).p01 = user();
				setState(16);
				((PartnersContext)_localctx).p02 = user();
				 System.out.format( "\n%d\n%s%s" , group , (((PartnersContext)_localctx).p01!=null?_input.getText(((PartnersContext)_localctx).p01.start,((PartnersContext)_localctx).p01.stop):null) , (((PartnersContext)_localctx).p02!=null?_input.getText(((PartnersContext)_localctx).p02.start,((PartnersContext)_localctx).p02.stop):null) ); group++; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(19);
				((PartnersContext)_localctx).pA = user();
				setState(20);
				((PartnersContext)_localctx).pB = user();
				setState(21);
				((PartnersContext)_localctx).pC = user();
				 System.out.format( "\n%d\n%s%s%s" , group , (((PartnersContext)_localctx).pA!=null?_input.getText(((PartnersContext)_localctx).pA.start,((PartnersContext)_localctx).pA.stop):null) , (((PartnersContext)_localctx).pB!=null?_input.getText(((PartnersContext)_localctx).pB.start,((PartnersContext)_localctx).pB.stop):null) , (((PartnersContext)_localctx).pC!=null?_input.getText(((PartnersContext)_localctx).pC.start,((PartnersContext)_localctx).pC.stop):null) ); group++; 
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

	public static class UserContext extends ParserRuleContext {
		public TerminalNode LINE() { return getToken(partnersParser.LINE, 0); }
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof partnersListener ) ((partnersListener)listener).enterUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof partnersListener ) ((partnersListener)listener).exitUser(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(LINE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\3\37\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\2\2\5\2\4\6\2\2\35\2\f\3"+
		"\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b\t\b\2\1\2\t\13\5\4\3\2\n\b\3\2\2\2"+
		"\13\16\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\17\3\2\2\2\16\f\3\2\2\2\17\20"+
		"\7\2\2\3\20\3\3\2\2\2\21\22\5\6\4\2\22\23\5\6\4\2\23\24\b\3\1\2\24\33"+
		"\3\2\2\2\25\26\5\6\4\2\26\27\5\6\4\2\27\30\5\6\4\2\30\31\b\3\1\2\31\33"+
		"\3\2\2\2\32\21\3\2\2\2\32\25\3\2\2\2\33\5\3\2\2\2\34\35\7\3\2\2\35\7\3"+
		"\2\2\2\4\f\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}