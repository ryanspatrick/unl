// Generated from java/Inventory.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InventoryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, SK=85, ANYTHING=86;
	public static final int
		RULE_student_tok = 0, RULE_nuid_tok = 1, RULE_college_tok = 2, RULE_ap_tok = 3, 
		RULE_ib_tok = 4, RULE_trde_tok = 5, RULE_math_tok = 6, RULE_unl_tok = 7, 
		RULE_eof = 8, RULE_inventory = 9, RULE_ace = 10, RULE_ace_head = 11, RULE_survey = 12, 
		RULE_survey_response = 13, RULE_likert_question = 14, RULE_likert_answer = 15, 
		RULE_free_question = 16, RULE_free_answer = 17, RULE_student = 18, RULE_nuid = 19, 
		RULE_collegemajor = 20, RULE_ap = 21, RULE_ib = 22, RULE_trde = 23, RULE_math = 24, 
		RULE_unl = 25, RULE_likert_agree = 26, RULE_likert_conce = 27, RULE_very_strong_agree = 28, 
		RULE_strong_agree = 29, RULE_neutral_agree = 30, RULE_weak_agree = 31, 
		RULE_very_weak_agree = 32, RULE_very_strong_conce = 33, RULE_strong_conce = 34, 
		RULE_neutral_conce = 35, RULE_weak_conce = 36, RULE_very_weak_conce = 37, 
		RULE_txt = 38;
	public static final String[] ruleNames = {
		"student_tok", "nuid_tok", "college_tok", "ap_tok", "ib_tok", "trde_tok", 
		"math_tok", "unl_tok", "eof", "inventory", "ace", "ace_head", "survey", 
		"survey_response", "likert_question", "likert_answer", "free_question", 
		"free_answer", "student", "nuid", "collegemajor", "ap", "ib", "trde", 
		"math", "unl", "likert_agree", "likert_conce", "very_strong_agree", "strong_agree", 
		"neutral_agree", "weak_agree", "very_weak_agree", "very_strong_conce", 
		"strong_conce", "neutral_conce", "weak_conce", "very_weak_conce", "txt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'      Student:'", "'         NUID:'", "'College/Major:'", "'Advanced Placement '", 
		"'International Baccalaureate '", "'Transfer and Dual Enrollment'", "'Math Courses'", 
		"'UNL Courses'", "'ACE Outcomes'", "'\n'", "'No values entered'", "'     ACE 1 Writing'", 
		"'     ACE 2 Communication Competence'", "'     ACE 3 Math/Stat/Reasoning'", 
		"'     ACE 4 Science'", "'     ACE 5 Humanities'", "'     ACE 6 Social Science'", 
		"'     ACE 7 Arts'", "'     ACE 8 Civic/Ethics/Stewardship'", "'     ACE 9 Global/Diversity'", 
		"'     ACE 10 Integrated Product'", "'         15 Knowing how to study'", 
		"'         16 Making Friends'", "'         17 Being in a large environment'", 
		"'         18 Paying for college'", "'         19 Doing well in my classes'", 
		"'         20 Being away from family'", "'         21 Finding help if I need it'", 
		"'         22 Making the right major/career decision'", "'         23 Managing my time'", 
		"'         29 New ideas and projects sometimes distract me from previous ones.'", 
		"'         30 Setbacks don't discourage me. '", "'         31 I have been obsessed with a certain idea or project for a short time but later lost interest.'", 
		"'         32 I am a hard worker.'", "'         33 I often set a goal but later choose to pursue a different one.'", 
		"'         34 I have difficulty maintaining my focus on projects that take more than a few months to complete.'", 
		"'         35 I finish whatever I begin.'", "'         36 I am diligent.'", 
		"'         39 My academic performance is important to me.'", "'         40 I set goals for the grades I want in my classes.'", 
		"'         41 It is important for me to do as well as I can in my courses.'", 
		"'         42 I find it difficult to motivate myself to study for my courses.'", 
		"'         43 I study just what I need to know to pass.'", "'         46 I usually start an assignment shortly after it is assigned.'", 
		"'         47 When I have a deadline, I often waste time doing other things.'", 
		"'         48 I usually plan out my week's work in advance.'", "'         49 I find it hard to stick to my study schedule.'", 
		"'         50 I schedule more time to study for difficult classes.'", 
		"'         51 I know how to manage my time.'", "'         54 I know how to study for tests.'", 
		"'         55 I know how to study well.'", "'         56 I will develop a strong plan for academic success.'", 
		"'         57 Academically, I am very self-disciplined.'", "'         58 I will handle any academic issues I might encounter.'", 
		"'         59 UNL was my first choice.'", "'         2 I plan to live'", 
		"'         3 My first term, I plan to work on campus this many hours:'", 
		"'         4 My first term, I plan to work off campus this many hours:'", 
		"'         5 I am interested in one of the Pre-professional areas:'", 
		"'         6 My strongest subjects are (select all that apply):'", "'         7 My most difficult subjects are (select all that apply): '", 
		"'         8 The average number of hours I spent in high school studying outside of class time:'", 
		"'         9 The amount of time I plan to study outside of class time in college:'", 
		"'         10 Number of activities I plan to be involved in at UNL:'", 
		"'         11 Activities in which I plan to participate during my first year that may impactt my planning:'", 
		"'         12 My parents earned a Bachelor's Degree.'", "'         24 Do you plan to take coursework in a modern/classical (i.e., non-English) language?'", 
		"'         25 Briefly describe your career interests:'", "'         26 Majors of Interest:'", 
		"'             Strongly Agree'", "'             Very much like me'", "'             Agree'", 
		"'             Mostly like me'", "'             Neutral'", "'             Somewhat like me'", 
		"'             Disagree'", "'             Not much like me'", "'             Strongly Disagree'", 
		"'             Not like me at all'", "'             Extremely Concerned'", 
		"'             Moderately Concerned'", "'             Somewhat Concerned'", 
		"'             Slightly Concerned'", "'             Not Concerned'", "'\r'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "SK", "ANYTHING"
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
	public String getGrammarFileName() { return "Inventory.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	double[] theta = { 0,0.1848,0.3696,0.5544,0.7392,0.924,1.1088,1.2936,1.4784,1.6632,1.848,2.0328,2.2176,2.4024,2.5872,2.772,2.9568,3.1416,3.3264,3.5112,3.696,3.8808,4.0656,4.2504,4.4352,4.62,4.8048,4.9896,5.1744,5.3592,5.544,5.7288,5.9136,6.0984 };
	double[] rho = new double[34];
	int count = 0;

	public InventoryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Student_tokContext extends ParserRuleContext {
		public Student_tokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_student_tok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterStudent_tok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitStudent_tok(this);
		}
	}

	public final Student_tokContext student_tok() throws RecognitionException {
		Student_tokContext _localctx = new Student_tokContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_student_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
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

	public static class Nuid_tokContext extends ParserRuleContext {
		public Nuid_tokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuid_tok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterNuid_tok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitNuid_tok(this);
		}
	}

	public final Nuid_tokContext nuid_tok() throws RecognitionException {
		Nuid_tokContext _localctx = new Nuid_tokContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nuid_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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

	public static class College_tokContext extends ParserRuleContext {
		public College_tokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_college_tok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterCollege_tok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitCollege_tok(this);
		}
	}

	public final College_tokContext college_tok() throws RecognitionException {
		College_tokContext _localctx = new College_tokContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_college_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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

	public static class Ap_tokContext extends ParserRuleContext {
		public Ap_tokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap_tok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterAp_tok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitAp_tok(this);
		}
	}

	public final Ap_tokContext ap_tok() throws RecognitionException {
		Ap_tokContext _localctx = new Ap_tokContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ap_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
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

	public static class Ib_tokContext extends ParserRuleContext {
		public Ib_tokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ib_tok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterIb_tok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitIb_tok(this);
		}
	}

	public final Ib_tokContext ib_tok() throws RecognitionException {
		Ib_tokContext _localctx = new Ib_tokContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ib_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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

	public static class Trde_tokContext extends ParserRuleContext {
		public Trde_tokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trde_tok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterTrde_tok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitTrde_tok(this);
		}
	}

	public final Trde_tokContext trde_tok() throws RecognitionException {
		Trde_tokContext _localctx = new Trde_tokContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_trde_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__5);
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

	public static class Math_tokContext extends ParserRuleContext {
		public Math_tokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_tok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterMath_tok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitMath_tok(this);
		}
	}

	public final Math_tokContext math_tok() throws RecognitionException {
		Math_tokContext _localctx = new Math_tokContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_math_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__6);
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

	public static class Unl_tokContext extends ParserRuleContext {
		public Unl_tokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unl_tok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterUnl_tok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitUnl_tok(this);
		}
	}

	public final Unl_tokContext unl_tok() throws RecognitionException {
		Unl_tokContext _localctx = new Unl_tokContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unl_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(InventoryParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitEof(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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

	public static class InventoryContext extends ParserRuleContext {
		public StudentContext student() {
			return getRuleContext(StudentContext.class,0);
		}
		public NuidContext nuid() {
			return getRuleContext(NuidContext.class,0);
		}
		public CollegemajorContext collegemajor() {
			return getRuleContext(CollegemajorContext.class,0);
		}
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public IbContext ib() {
			return getRuleContext(IbContext.class,0);
		}
		public UnlContext unl() {
			return getRuleContext(UnlContext.class,0);
		}
		public TrdeContext trde() {
			return getRuleContext(TrdeContext.class,0);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public AceContext ace() {
			return getRuleContext(AceContext.class,0);
		}
		public SurveyContext survey() {
			return getRuleContext(SurveyContext.class,0);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public InventoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inventory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterInventory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitInventory(this);
		}
	}

	public final InventoryContext inventory() throws RecognitionException {
		InventoryContext _localctx = new InventoryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inventory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			student();
			setState(97);
			nuid();
			setState(98);
			collegemajor();
			setState(99);
			ap();
			setState(100);
			ib();
			setState(101);
			unl();
			setState(102);
			trde();
			setState(103);
			math();
			setState(104);
			ace();
			setState(105);
			survey();
			setState(106);
			eof();
			 
				  for( int i = 0; i < rho.length; i++ ){
				       System.err.format( "%f,%f\n" , rho[i] * Math.cos( theta[ i ] ) , rho[i] * Math.sin( theta[i] ) );
				  }
				  System.err.format( "%f,%f\n" , rho[0] * Math.cos( theta[ 0 ] ) , rho[0] * Math.sin( theta[0] ) );
				  System.err.println();
			 
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

	public static class AceContext extends ParserRuleContext {
		public Ace_headContext ace_head;
		public TxtContext txt;
		public List<Ace_headContext> ace_head() {
			return getRuleContexts(Ace_headContext.class);
		}
		public Ace_headContext ace_head(int i) {
			return getRuleContext(Ace_headContext.class,i);
		}
		public List<TxtContext> txt() {
			return getRuleContexts(TxtContext.class);
		}
		public TxtContext txt(int i) {
			return getRuleContext(TxtContext.class,i);
		}
		public AceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterAce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitAce(this);
		}
	}

	public final AceContext ace() throws RecognitionException {
		AceContext _localctx = new AceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ace);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__8);
			setState(111); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(110);
					match(T__9);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(113); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(115);
			matchWildcard();
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				match(T__9);
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 );
			setState(130);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(121);
				match(T__10);
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				{
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(122);
					((AceContext)_localctx).ace_head = ace_head();
					setState(123);
					((AceContext)_localctx).txt = txt();
					 System.out.println( (((AceContext)_localctx).ace_head!=null?_input.getText(((AceContext)_localctx).ace_head.start,((AceContext)_localctx).ace_head.stop):null) + "\n" + (((AceContext)_localctx).txt!=null?_input.getText(((AceContext)_localctx).txt.start,((AceContext)_localctx).txt.stop):null).trim() ); System.out.println(); 
					}
					}
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(132);
			match(T__9);
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

	public static class Ace_headContext extends ParserRuleContext {
		public Ace_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ace_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterAce_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitAce_head(this);
		}
	}

	public final Ace_headContext ace_head() throws RecognitionException {
		Ace_headContext _localctx = new Ace_headContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ace_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class SurveyContext extends ParserRuleContext {
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public List<Survey_responseContext> survey_response() {
			return getRuleContexts(Survey_responseContext.class);
		}
		public Survey_responseContext survey_response(int i) {
			return getRuleContext(Survey_responseContext.class,i);
		}
		public SurveyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_survey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterSurvey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitSurvey(this);
		}
	}

	public final SurveyContext survey() throws RecognitionException {
		SurveyContext _localctx = new SurveyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_survey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			txt();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T__21 - 22)) | (1L << (T__22 - 22)) | (1L << (T__23 - 22)) | (1L << (T__24 - 22)) | (1L << (T__25 - 22)) | (1L << (T__26 - 22)) | (1L << (T__27 - 22)) | (1L << (T__28 - 22)) | (1L << (T__29 - 22)) | (1L << (T__30 - 22)) | (1L << (T__31 - 22)) | (1L << (T__32 - 22)) | (1L << (T__33 - 22)) | (1L << (T__34 - 22)) | (1L << (T__35 - 22)) | (1L << (T__36 - 22)) | (1L << (T__37 - 22)) | (1L << (T__38 - 22)) | (1L << (T__39 - 22)) | (1L << (T__40 - 22)) | (1L << (T__41 - 22)) | (1L << (T__42 - 22)) | (1L << (T__43 - 22)) | (1L << (T__44 - 22)) | (1L << (T__45 - 22)) | (1L << (T__46 - 22)) | (1L << (T__47 - 22)) | (1L << (T__48 - 22)) | (1L << (T__49 - 22)) | (1L << (T__50 - 22)) | (1L << (T__51 - 22)) | (1L << (T__52 - 22)) | (1L << (T__53 - 22)) | (1L << (T__54 - 22)) | (1L << (T__55 - 22)) | (1L << (T__56 - 22)) | (1L << (T__57 - 22)) | (1L << (T__58 - 22)) | (1L << (T__59 - 22)) | (1L << (T__60 - 22)) | (1L << (T__61 - 22)) | (1L << (T__62 - 22)) | (1L << (T__63 - 22)) | (1L << (T__64 - 22)) | (1L << (T__65 - 22)) | (1L << (T__66 - 22)) | (1L << (T__67 - 22)) | (1L << (T__68 - 22)))) != 0)) {
				{
				{
				setState(137);
				survey_response();
				}
				}
				setState(142);
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

	public static class Survey_responseContext extends ParserRuleContext {
		public Free_questionContext free_question;
		public Free_answerContext free_answer;
		public Likert_questionContext likert_question() {
			return getRuleContext(Likert_questionContext.class,0);
		}
		public Likert_answerContext likert_answer() {
			return getRuleContext(Likert_answerContext.class,0);
		}
		public Free_questionContext free_question() {
			return getRuleContext(Free_questionContext.class,0);
		}
		public Free_answerContext free_answer() {
			return getRuleContext(Free_answerContext.class,0);
		}
		public Survey_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_survey_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterSurvey_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitSurvey_response(this);
		}
	}

	public final Survey_responseContext survey_response() throws RecognitionException {
		Survey_responseContext _localctx = new Survey_responseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_survey_response);
		int _la;
		try {
			int _alt;
			setState(171);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(143);
				likert_question();
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(144);
					match(T__9);
					}
					}
					setState(147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				setState(149);
				likert_answer();
				setState(151); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(150);
						match(T__9);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(153); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(155);
				matchWildcard();
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156);
					match(T__9);
					}
					}
					setState(159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				}
				}
				break;
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(161);
				((Survey_responseContext)_localctx).free_question = free_question();
				setState(163); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(162);
						match(T__9);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(165); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(167);
				((Survey_responseContext)_localctx).free_answer = free_answer();
				{
				setState(168);
				match(T__9);
				}
				 System.out.println( (((Survey_responseContext)_localctx).free_question!=null?_input.getText(((Survey_responseContext)_localctx).free_question.start,((Survey_responseContext)_localctx).free_question.stop):null) + "\n" + (((Survey_responseContext)_localctx).free_answer!=null?_input.getText(((Survey_responseContext)_localctx).free_answer.start,((Survey_responseContext)_localctx).free_answer.stop):null).trim() ); System.out.println(); 
				}
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

	public static class Likert_questionContext extends ParserRuleContext {
		public Likert_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likert_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterLikert_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitLikert_question(this);
		}
	}

	public final Likert_questionContext likert_question() throws RecognitionException {
		Likert_questionContext _localctx = new Likert_questionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_likert_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Likert_answerContext extends ParserRuleContext {
		public Likert_agreeContext likert_agree() {
			return getRuleContext(Likert_agreeContext.class,0);
		}
		public Likert_conceContext likert_conce() {
			return getRuleContext(Likert_conceContext.class,0);
		}
		public Likert_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likert_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterLikert_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitLikert_answer(this);
		}
	}

	public final Likert_answerContext likert_answer() throws RecognitionException {
		Likert_answerContext _localctx = new Likert_answerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_likert_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			switch (_input.LA(1)) {
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
				{
				setState(175);
				likert_agree();
				}
				break;
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
				{
				setState(176);
				likert_conce();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Free_questionContext extends ParserRuleContext {
		public Free_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_free_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterFree_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitFree_question(this);
		}
	}

	public final Free_questionContext free_question() throws RecognitionException {
		Free_questionContext _localctx = new Free_questionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_free_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (T__55 - 56)) | (1L << (T__56 - 56)) | (1L << (T__57 - 56)) | (1L << (T__58 - 56)) | (1L << (T__59 - 56)) | (1L << (T__60 - 56)) | (1L << (T__61 - 56)) | (1L << (T__62 - 56)) | (1L << (T__63 - 56)) | (1L << (T__64 - 56)) | (1L << (T__65 - 56)) | (1L << (T__66 - 56)) | (1L << (T__67 - 56)) | (1L << (T__68 - 56)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Free_answerContext extends ParserRuleContext {
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public Free_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_free_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterFree_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitFree_answer(this);
		}
	}

	public final Free_answerContext free_answer() throws RecognitionException {
		Free_answerContext _localctx = new Free_answerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_free_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			txt();
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

	public static class StudentContext extends ParserRuleContext {
		public Student_tokContext student_tok() {
			return getRuleContext(Student_tokContext.class,0);
		}
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public StudentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_student; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterStudent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitStudent(this);
		}
	}

	public final StudentContext student() throws RecognitionException {
		StudentContext _localctx = new StudentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_student);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			student_tok();
			setState(184);
			matchWildcard();
			setState(185);
			txt();
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

	public static class NuidContext extends ParserRuleContext {
		public Nuid_tokContext nuid_tok() {
			return getRuleContext(Nuid_tokContext.class,0);
		}
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public NuidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterNuid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitNuid(this);
		}
	}

	public final NuidContext nuid() throws RecognitionException {
		NuidContext _localctx = new NuidContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nuid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			nuid_tok();
			setState(188);
			matchWildcard();
			setState(189);
			txt();
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

	public static class CollegemajorContext extends ParserRuleContext {
		public College_tokContext college_tok;
		public TxtContext txt;
		public College_tokContext college_tok() {
			return getRuleContext(College_tokContext.class,0);
		}
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public CollegemajorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collegemajor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterCollegemajor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitCollegemajor(this);
		}
	}

	public final CollegemajorContext collegemajor() throws RecognitionException {
		CollegemajorContext _localctx = new CollegemajorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_collegemajor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((CollegemajorContext)_localctx).college_tok = college_tok();
			setState(192);
			matchWildcard();
			setState(193);
			((CollegemajorContext)_localctx).txt = txt();
			 System.out.println( (((CollegemajorContext)_localctx).college_tok!=null?_input.getText(((CollegemajorContext)_localctx).college_tok.start,((CollegemajorContext)_localctx).college_tok.stop):null) + "\n" + (((CollegemajorContext)_localctx).txt!=null?_input.getText(((CollegemajorContext)_localctx).txt.start,((CollegemajorContext)_localctx).txt.stop):null).trim() ); System.out.println(); 
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

	public static class ApContext extends ParserRuleContext {
		public Ap_tokContext ap_tok;
		public TxtContext txt;
		public Ap_tokContext ap_tok() {
			return getRuleContext(Ap_tokContext.class,0);
		}
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitAp(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			((ApContext)_localctx).ap_tok = ap_tok();
			setState(197);
			match(T__9);
			setState(198);
			((ApContext)_localctx).txt = txt();
			 System.out.println( (((ApContext)_localctx).ap_tok!=null?_input.getText(((ApContext)_localctx).ap_tok.start,((ApContext)_localctx).ap_tok.stop):null) + "\n" + (((ApContext)_localctx).txt!=null?_input.getText(((ApContext)_localctx).txt.start,((ApContext)_localctx).txt.stop):null).trim() ); System.out.println(); 
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

	public static class IbContext extends ParserRuleContext {
		public Ib_tokContext ib_tok;
		public TxtContext txt;
		public Ib_tokContext ib_tok() {
			return getRuleContext(Ib_tokContext.class,0);
		}
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public IbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterIb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitIb(this);
		}
	}

	public final IbContext ib() throws RecognitionException {
		IbContext _localctx = new IbContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			((IbContext)_localctx).ib_tok = ib_tok();
			setState(202);
			match(T__9);
			setState(203);
			((IbContext)_localctx).txt = txt();
			 System.out.println( (((IbContext)_localctx).ib_tok!=null?_input.getText(((IbContext)_localctx).ib_tok.start,((IbContext)_localctx).ib_tok.stop):null) + "\n" + (((IbContext)_localctx).txt!=null?_input.getText(((IbContext)_localctx).txt.start,((IbContext)_localctx).txt.stop):null).trim() ); System.out.println(); 
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

	public static class TrdeContext extends ParserRuleContext {
		public Trde_tokContext trde_tok;
		public TxtContext txt;
		public Trde_tokContext trde_tok() {
			return getRuleContext(Trde_tokContext.class,0);
		}
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public TrdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterTrde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitTrde(this);
		}
	}

	public final TrdeContext trde() throws RecognitionException {
		TrdeContext _localctx = new TrdeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_trde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			((TrdeContext)_localctx).trde_tok = trde_tok();
			setState(207);
			match(T__9);
			setState(208);
			((TrdeContext)_localctx).txt = txt();
			 System.out.println( (((TrdeContext)_localctx).trde_tok!=null?_input.getText(((TrdeContext)_localctx).trde_tok.start,((TrdeContext)_localctx).trde_tok.stop):null) + "\n" + (((TrdeContext)_localctx).txt!=null?_input.getText(((TrdeContext)_localctx).txt.start,((TrdeContext)_localctx).txt.stop):null).trim() ); System.out.println(); 
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

	public static class MathContext extends ParserRuleContext {
		public Math_tokContext math_tok;
		public TxtContext txt;
		public Math_tokContext math_tok() {
			return getRuleContext(Math_tokContext.class,0);
		}
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitMath(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_math);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			((MathContext)_localctx).math_tok = math_tok();
			setState(212);
			match(T__9);
			setState(213);
			((MathContext)_localctx).txt = txt();
			 System.out.println( (((MathContext)_localctx).math_tok!=null?_input.getText(((MathContext)_localctx).math_tok.start,((MathContext)_localctx).math_tok.stop):null) + "\n" + (((MathContext)_localctx).txt!=null?_input.getText(((MathContext)_localctx).txt.start,((MathContext)_localctx).txt.stop):null).trim() ); System.out.println(); 
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

	public static class UnlContext extends ParserRuleContext {
		public Unl_tokContext unl_tok;
		public TxtContext txt;
		public Unl_tokContext unl_tok() {
			return getRuleContext(Unl_tokContext.class,0);
		}
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public UnlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterUnl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitUnl(this);
		}
	}

	public final UnlContext unl() throws RecognitionException {
		UnlContext _localctx = new UnlContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			((UnlContext)_localctx).unl_tok = unl_tok();
			setState(217);
			match(T__9);
			setState(218);
			((UnlContext)_localctx).txt = txt();
			 System.out.println( (((UnlContext)_localctx).unl_tok!=null?_input.getText(((UnlContext)_localctx).unl_tok.start,((UnlContext)_localctx).unl_tok.stop):null) + "\n" + (((UnlContext)_localctx).txt!=null?_input.getText(((UnlContext)_localctx).txt.start,((UnlContext)_localctx).txt.stop):null).trim() ); System.out.println(); 
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

	public static class Likert_agreeContext extends ParserRuleContext {
		public Very_strong_agreeContext very_strong_agree() {
			return getRuleContext(Very_strong_agreeContext.class,0);
		}
		public Strong_agreeContext strong_agree() {
			return getRuleContext(Strong_agreeContext.class,0);
		}
		public Neutral_agreeContext neutral_agree() {
			return getRuleContext(Neutral_agreeContext.class,0);
		}
		public Weak_agreeContext weak_agree() {
			return getRuleContext(Weak_agreeContext.class,0);
		}
		public Very_weak_agreeContext very_weak_agree() {
			return getRuleContext(Very_weak_agreeContext.class,0);
		}
		public Likert_agreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likert_agree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterLikert_agree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitLikert_agree(this);
		}
	}

	public final Likert_agreeContext likert_agree() throws RecognitionException {
		Likert_agreeContext _localctx = new Likert_agreeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_likert_agree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			switch (_input.LA(1)) {
			case T__69:
			case T__70:
				{
				setState(221);
				very_strong_agree();
				}
				break;
			case T__71:
			case T__72:
				{
				setState(222);
				strong_agree();
				}
				break;
			case T__73:
			case T__74:
				{
				setState(223);
				neutral_agree();
				}
				break;
			case T__75:
			case T__76:
				{
				setState(224);
				weak_agree();
				}
				break;
			case T__77:
			case T__78:
				{
				setState(225);
				very_weak_agree();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Likert_conceContext extends ParserRuleContext {
		public Very_strong_conceContext very_strong_conce() {
			return getRuleContext(Very_strong_conceContext.class,0);
		}
		public Strong_conceContext strong_conce() {
			return getRuleContext(Strong_conceContext.class,0);
		}
		public Neutral_conceContext neutral_conce() {
			return getRuleContext(Neutral_conceContext.class,0);
		}
		public Weak_conceContext weak_conce() {
			return getRuleContext(Weak_conceContext.class,0);
		}
		public Very_weak_conceContext very_weak_conce() {
			return getRuleContext(Very_weak_conceContext.class,0);
		}
		public Likert_conceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likert_conce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterLikert_conce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitLikert_conce(this);
		}
	}

	public final Likert_conceContext likert_conce() throws RecognitionException {
		Likert_conceContext _localctx = new Likert_conceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_likert_conce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			switch (_input.LA(1)) {
			case T__79:
				{
				setState(228);
				very_strong_conce();
				}
				break;
			case T__80:
				{
				setState(229);
				strong_conce();
				}
				break;
			case T__81:
				{
				setState(230);
				neutral_conce();
				}
				break;
			case T__82:
				{
				setState(231);
				weak_conce();
				}
				break;
			case T__83:
				{
				setState(232);
				very_weak_conce();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Very_strong_agreeContext extends ParserRuleContext {
		public Very_strong_agreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_very_strong_agree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterVery_strong_agree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitVery_strong_agree(this);
		}
	}

	public final Very_strong_agreeContext very_strong_agree() throws RecognitionException {
		Very_strong_agreeContext _localctx = new Very_strong_agreeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_very_strong_agree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==T__69 || _la==T__70) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			 rho[count] = 5; count++; 
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

	public static class Strong_agreeContext extends ParserRuleContext {
		public Strong_agreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strong_agree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterStrong_agree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitStrong_agree(this);
		}
	}

	public final Strong_agreeContext strong_agree() throws RecognitionException {
		Strong_agreeContext _localctx = new Strong_agreeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_strong_agree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==T__71 || _la==T__72) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			 rho[count] = 4; count++; 
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

	public static class Neutral_agreeContext extends ParserRuleContext {
		public Neutral_agreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neutral_agree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterNeutral_agree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitNeutral_agree(this);
		}
	}

	public final Neutral_agreeContext neutral_agree() throws RecognitionException {
		Neutral_agreeContext _localctx = new Neutral_agreeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_neutral_agree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !(_la==T__73 || _la==T__74) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			 rho[count] = 3; count++; 
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

	public static class Weak_agreeContext extends ParserRuleContext {
		public Weak_agreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weak_agree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterWeak_agree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitWeak_agree(this);
		}
	}

	public final Weak_agreeContext weak_agree() throws RecognitionException {
		Weak_agreeContext _localctx = new Weak_agreeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_weak_agree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==T__75 || _la==T__76) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			 rho[count] = 2; count++; 
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

	public static class Very_weak_agreeContext extends ParserRuleContext {
		public Very_weak_agreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_very_weak_agree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterVery_weak_agree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitVery_weak_agree(this);
		}
	}

	public final Very_weak_agreeContext very_weak_agree() throws RecognitionException {
		Very_weak_agreeContext _localctx = new Very_weak_agreeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_very_weak_agree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==T__77 || _la==T__78) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			 rho[count] = 1; count++; 
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

	public static class Very_strong_conceContext extends ParserRuleContext {
		public Very_strong_conceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_very_strong_conce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterVery_strong_conce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitVery_strong_conce(this);
		}
	}

	public final Very_strong_conceContext very_strong_conce() throws RecognitionException {
		Very_strong_conceContext _localctx = new Very_strong_conceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_very_strong_conce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__79);
			 rho[count] = 1; count++; 
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

	public static class Strong_conceContext extends ParserRuleContext {
		public Strong_conceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strong_conce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterStrong_conce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitStrong_conce(this);
		}
	}

	public final Strong_conceContext strong_conce() throws RecognitionException {
		Strong_conceContext _localctx = new Strong_conceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_strong_conce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__80);
			 rho[count] = 2; count++; 
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

	public static class Neutral_conceContext extends ParserRuleContext {
		public Neutral_conceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neutral_conce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterNeutral_conce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitNeutral_conce(this);
		}
	}

	public final Neutral_conceContext neutral_conce() throws RecognitionException {
		Neutral_conceContext _localctx = new Neutral_conceContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_neutral_conce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__81);
			 rho[count] = 3; count++; 
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

	public static class Weak_conceContext extends ParserRuleContext {
		public Weak_conceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weak_conce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterWeak_conce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitWeak_conce(this);
		}
	}

	public final Weak_conceContext weak_conce() throws RecognitionException {
		Weak_conceContext _localctx = new Weak_conceContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_weak_conce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__82);
			 rho[count] = 4; count++; 
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

	public static class Very_weak_conceContext extends ParserRuleContext {
		public Very_weak_conceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_very_weak_conce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterVery_weak_conce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitVery_weak_conce(this);
		}
	}

	public final Very_weak_conceContext very_weak_conce() throws RecognitionException {
		Very_weak_conceContext _localctx = new Very_weak_conceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_very_weak_conce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__83);
			 rho[count] = 5; count++; 
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

	public static class TxtContext extends ParserRuleContext {
		public List<TerminalNode> ANYTHING() { return getTokens(InventoryParser.ANYTHING); }
		public TerminalNode ANYTHING(int i) {
			return getToken(InventoryParser.ANYTHING, i);
		}
		public TxtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterTxt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitTxt(this);
		}
	}

	public final TxtContext txt() throws RecognitionException {
		TxtContext _localctx = new TxtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_txt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(265);
					_la = _input.LA(1);
					if ( !(_la==T__9 || _la==ANYTHING) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(268); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3X\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\6\fr\n\f\r\f"+
		"\16\fs\3\f\3\f\6\fx\n\f\r\f\16\fy\3\f\3\f\3\f\3\f\3\f\6\f\u0081\n\f\r"+
		"\f\16\f\u0082\5\f\u0085\n\f\3\f\3\f\3\r\3\r\3\16\3\16\7\16\u008d\n\16"+
		"\f\16\16\16\u0090\13\16\3\17\3\17\6\17\u0094\n\17\r\17\16\17\u0095\3\17"+
		"\3\17\6\17\u009a\n\17\r\17\16\17\u009b\3\17\3\17\6\17\u00a0\n\17\r\17"+
		"\16\17\u00a1\3\17\3\17\6\17\u00a6\n\17\r\17\16\17\u00a7\3\17\3\17\3\17"+
		"\3\17\5\17\u00ae\n\17\3\20\3\20\3\21\3\21\5\21\u00b4\n\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u00e5\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u00ec\n\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#"+
		"\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\6(\u010d\n(\r(\16(\u010e\3"+
		"(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLN\2\13\3\2\16\27\3\2\309\3\2:G\3\2HI\3\2JK\3\2LM\3\2NO\3\2PQ\4"+
		"\2\f\fXX\u00fd\2P\3\2\2\2\4R\3\2\2\2\6T\3\2\2\2\bV\3\2\2\2\nX\3\2\2\2"+
		"\fZ\3\2\2\2\16\\\3\2\2\2\20^\3\2\2\2\22`\3\2\2\2\24b\3\2\2\2\26o\3\2\2"+
		"\2\30\u0088\3\2\2\2\32\u008a\3\2\2\2\34\u00ad\3\2\2\2\36\u00af\3\2\2\2"+
		" \u00b3\3\2\2\2\"\u00b5\3\2\2\2$\u00b7\3\2\2\2&\u00b9\3\2\2\2(\u00bd\3"+
		"\2\2\2*\u00c1\3\2\2\2,\u00c6\3\2\2\2.\u00cb\3\2\2\2\60\u00d0\3\2\2\2\62"+
		"\u00d5\3\2\2\2\64\u00da\3\2\2\2\66\u00e4\3\2\2\28\u00eb\3\2\2\2:\u00ed"+
		"\3\2\2\2<\u00f0\3\2\2\2>\u00f3\3\2\2\2@\u00f6\3\2\2\2B\u00f9\3\2\2\2D"+
		"\u00fc\3\2\2\2F\u00ff\3\2\2\2H\u0102\3\2\2\2J\u0105\3\2\2\2L\u0108\3\2"+
		"\2\2N\u010c\3\2\2\2PQ\7\3\2\2Q\3\3\2\2\2RS\7\4\2\2S\5\3\2\2\2TU\7\5\2"+
		"\2U\7\3\2\2\2VW\7\6\2\2W\t\3\2\2\2XY\7\7\2\2Y\13\3\2\2\2Z[\7\b\2\2[\r"+
		"\3\2\2\2\\]\7\t\2\2]\17\3\2\2\2^_\7\n\2\2_\21\3\2\2\2`a\7\2\2\3a\23\3"+
		"\2\2\2bc\5&\24\2cd\5(\25\2de\5*\26\2ef\5,\27\2fg\5.\30\2gh\5\64\33\2h"+
		"i\5\60\31\2ij\5\62\32\2jk\5\26\f\2kl\5\32\16\2lm\5\22\n\2mn\b\13\1\2n"+
		"\25\3\2\2\2oq\7\13\2\2pr\7\f\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2"+
		"\2tu\3\2\2\2uw\13\2\2\2vx\7\f\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2"+
		"\2\2z\u0084\3\2\2\2{\u0085\7\r\2\2|}\5\30\r\2}~\5N(\2~\177\b\f\1\2\177"+
		"\u0081\3\2\2\2\u0080|\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084{\3\2\2\2\u0084\u0080\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\f\2\2\u0087\27\3\2\2\2\u0088"+
		"\u0089\t\2\2\2\u0089\31\3\2\2\2\u008a\u008e\5N(\2\u008b\u008d\5\34\17"+
		"\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\33\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\5\36\20\2\u0092"+
		"\u0094\7\f\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\5 \21\2\u0098"+
		"\u009a\7\f\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\13\2\2\2\u009e"+
		"\u00a0\7\f\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00ae\3\2\2\2\u00a3\u00a5\5\"\22\2\u00a4"+
		"\u00a6\7\f\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5$\23\2\u00aa"+
		"\u00ab\7\f\2\2\u00ab\u00ac\b\17\1\2\u00ac\u00ae\3\2\2\2\u00ad\u0091\3"+
		"\2\2\2\u00ad\u00a3\3\2\2\2\u00ae\35\3\2\2\2\u00af\u00b0\t\3\2\2\u00b0"+
		"\37\3\2\2\2\u00b1\u00b4\5\66\34\2\u00b2\u00b4\58\35\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b4!\3\2\2\2\u00b5\u00b6\t\4\2\2\u00b6#\3\2"+
		"\2\2\u00b7\u00b8\5N(\2\u00b8%\3\2\2\2\u00b9\u00ba\5\2\2\2\u00ba\u00bb"+
		"\13\2\2\2\u00bb\u00bc\5N(\2\u00bc\'\3\2\2\2\u00bd\u00be\5\4\3\2\u00be"+
		"\u00bf\13\2\2\2\u00bf\u00c0\5N(\2\u00c0)\3\2\2\2\u00c1\u00c2\5\6\4\2\u00c2"+
		"\u00c3\13\2\2\2\u00c3\u00c4\5N(\2\u00c4\u00c5\b\26\1\2\u00c5+\3\2\2\2"+
		"\u00c6\u00c7\5\b\5\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9\5N(\2\u00c9\u00ca"+
		"\b\27\1\2\u00ca-\3\2\2\2\u00cb\u00cc\5\n\6\2\u00cc\u00cd\7\f\2\2\u00cd"+
		"\u00ce\5N(\2\u00ce\u00cf\b\30\1\2\u00cf/\3\2\2\2\u00d0\u00d1\5\f\7\2\u00d1"+
		"\u00d2\7\f\2\2\u00d2\u00d3\5N(\2\u00d3\u00d4\b\31\1\2\u00d4\61\3\2\2\2"+
		"\u00d5\u00d6\5\16\b\2\u00d6\u00d7\7\f\2\2\u00d7\u00d8\5N(\2\u00d8\u00d9"+
		"\b\32\1\2\u00d9\63\3\2\2\2\u00da\u00db\5\20\t\2\u00db\u00dc\7\f\2\2\u00dc"+
		"\u00dd\5N(\2\u00dd\u00de\b\33\1\2\u00de\65\3\2\2\2\u00df\u00e5\5:\36\2"+
		"\u00e0\u00e5\5<\37\2\u00e1\u00e5\5> \2\u00e2\u00e5\5@!\2\u00e3\u00e5\5"+
		"B\"\2\u00e4\u00df\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\67\3\2\2\2\u00e6\u00ec\5D#\2"+
		"\u00e7\u00ec\5F$\2\u00e8\u00ec\5H%\2\u00e9\u00ec\5J&\2\u00ea\u00ec\5L"+
		"\'\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec9\3\2\2\2\u00ed\u00ee\t\5\2\2"+
		"\u00ee\u00ef\b\36\1\2\u00ef;\3\2\2\2\u00f0\u00f1\t\6\2\2\u00f1\u00f2\b"+
		"\37\1\2\u00f2=\3\2\2\2\u00f3\u00f4\t\7\2\2\u00f4\u00f5\b \1\2\u00f5?\3"+
		"\2\2\2\u00f6\u00f7\t\b\2\2\u00f7\u00f8\b!\1\2\u00f8A\3\2\2\2\u00f9\u00fa"+
		"\t\t\2\2\u00fa\u00fb\b\"\1\2\u00fbC\3\2\2\2\u00fc\u00fd\7R\2\2\u00fd\u00fe"+
		"\b#\1\2\u00feE\3\2\2\2\u00ff\u0100\7S\2\2\u0100\u0101\b$\1\2\u0101G\3"+
		"\2\2\2\u0102\u0103\7T\2\2\u0103\u0104\b%\1\2\u0104I\3\2\2\2\u0105\u0106"+
		"\7U\2\2\u0106\u0107\b&\1\2\u0107K\3\2\2\2\u0108\u0109\7V\2\2\u0109\u010a"+
		"\b\'\1\2\u010aM\3\2\2\2\u010b\u010d\t\n\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010fO\3\2\2\2"+
		"\20sy\u0082\u0084\u008e\u0095\u009b\u00a1\u00a7\u00ad\u00b3\u00e4\u00eb"+
		"\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}