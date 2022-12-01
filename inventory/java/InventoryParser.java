// Generated from Inventory.g4 by ANTLR 4.5.3
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
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, PAGE_HEAD=92, CONCERNS=93, PERSEVERANCE=94, 
		MOTIVATION=95, TIME=96, APTITUDE=97, SK=98, SURVEY=99, ANYTHING=100;
	public static final int
		RULE_perseverance = 0, RULE_student_tok = 1, RULE_nuid_tok = 2, RULE_college_tok = 3, 
		RULE_ap_tok = 4, RULE_ib_tok = 5, RULE_trde_tok = 6, RULE_math_tok = 7, 
		RULE_unl_tok = 8, RULE_eof = 9, RULE_inventory = 10, RULE_ace = 11, RULE_ace_head = 12, 
		RULE_survey_head = 13, RULE_survey = 14, RULE_survey_response = 15, RULE_likert_question = 16, 
		RULE_likert_answer = 17, RULE_free_question = 18, RULE_free_answer = 19, 
		RULE_student = 20, RULE_nuid = 21, RULE_collegemajor = 22, RULE_ap = 23, 
		RULE_ib = 24, RULE_trde = 25, RULE_math = 26, RULE_unl = 27, RULE_likert_agree = 28, 
		RULE_likert_conce = 29, RULE_very_strong_agree = 30, RULE_strong_agree = 31, 
		RULE_neutral_agree = 32, RULE_weak_agree = 33, RULE_very_weak_agree = 34, 
		RULE_very_strong_conce = 35, RULE_strong_conce = 36, RULE_neutral_conce = 37, 
		RULE_weak_conce = 38, RULE_very_weak_conce = 39, RULE_txt = 40;
	public static final String[] ruleNames = {
		"perseverance", "student_tok", "nuid_tok", "college_tok", "ap_tok", "ib_tok", 
		"trde_tok", "math_tok", "unl_tok", "eof", "inventory", "ace", "ace_head", 
		"survey_head", "survey", "survey_response", "likert_question", "likert_answer", 
		"free_question", "free_answer", "student", "nuid", "collegemajor", "ap", 
		"ib", "trde", "math", "unl", "likert_agree", "likert_conce", "very_strong_agree", 
		"strong_agree", "neutral_agree", "weak_agree", "very_weak_agree", "very_strong_conce", 
		"strong_conce", "neutral_conce", "weak_conce", "very_weak_conce", "txt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Student:'", "'NUID:'", "'College/Major:'", "'Advanced Placement'", 
		"'International Baccalaureate'", "'Transfer and Dual Enrollment'", "'Math Courses'", 
		"'UNL Courses'", "'ACE Outcomes'", "'\n'", "'No values entered'", "'ACE 1 Writing'", 
		"'ACE 2 Communication Competence'", "'ACE 3 Math/Stat/Reasoning'", "'ACE 4 Science'", 
		"'ACE 5 Humanities'", "'ACE 6 Social Science'", "'ACE 7 Arts'", "'ACE 8 Civic/Ethics/Stewardship'", 
		"'ACE 9 Global/Diversity'", "'ACE 10 Integrated Product'", "'12. Knowing how to study'", 
		"'13. Making Friends'", "'14. Being in a large environment'", "'15. Paying for college'", 
		"'16. Doing well in my classes'", "'17. Being away from family'", "'18. Finding help if I need it'", 
		"'19. Making the right major/career decision'", "'20. Managing my time'", 
		"'Perseverance '", "'Below are a number of statements that may or may not apply to you. When responding,'", 
		"'think of how you compare to most people. There are no right or wrong answers, so'", 
		"'please answer honestly.'", "'24. New ideas and projects sometimes distract me from previous ones.'", 
		"'25. Setbacks don't discourage me. '", "'26. I have been obsessed with a certain idea or project for a short time but later lost'", 
		"'interest.'", "'27. I am a hard worker.'", "'28. I often set a goal but later choose to pursue a different one.'", 
		"'29. I have difficulty maintaining my focus on projects that take more than a few months to'", 
		"'complete.'", "'30. I finish whatever I begin.'", "'31. I am diligent.'", 
		"'32. My academic performance is important to me.'", "'33. I set goals for the grades I want in my classes.'", 
		"'34. It is important for me to do as well as I can in my courses.'", 
		"'35. I find it difficult to motivate myself to study for my courses.'", 
		"'36. I study just what I need to know to pass.'", "'37. I usually start an assignment shortly after it is assigned.'", 
		"'38. When I have a deadline, I often waste time doing other things.'", 
		"'39. I usually plan out my week's work in advance.'", "'40. I find it hard to stick to my study schedule.'", 
		"'41. I schedule more time to study for difficult classes.'", "'42. I know how to manage my time.'", 
		"'43. I know how to study for tests.'", "'44. I know how to study well.'", 
		"'45. I will develop a strong plan for academic success.'", "'46. Academically, I am very self-disciplined.'", 
		"'47. I will handle any academic issues I might encounter.'", "'48. UNL was my first choice.'", 
		"'1. I plan to live'", "'2. My first term, I plan to work on campus this many hours:'", 
		"'3. My first term, I plan to work off campus this many hours:'", "'4. I am interested in one of the Pre-professional areas:'", 
		"'5. My strongest subjects are (select all that apply):'", "'6. My most difficult subjects are (select all that apply): '", 
		"'7. The average number of hours I spent in high school studying outside of class time:'", 
		"'8. The amount of time I plan to study outside of class time in college:'", 
		"'9. Number of activities I plan to be involved in at UNL:'", "'10. Activities in which I plan to participate during my first year that may impact my'", 
		"'planning:'", "'11. My parents earned a Bachelor's Degree.'", "'21. Do you plan to take coursework in a modern/classical (i.e., non-English) language?'", 
		"'22. Briefly describe your career interests:'", "'23. Majors of Interest:'", 
		"'Strongly Agree'", "'Very much like me'", "'Agree'", "'Mostly like me'", 
		"'Neutral'", "'Somewhat like me'", "'Disagree'", "'Not much like me'", 
		"'Strongly Disagree'", "'Not like me at all'", "'Extremely Concerned'", 
		"'Moderately Concerned'", "'Somewhat Concerned'", "'Slightly Concerned'", 
		"'Not Concerned'", null, null, null, null, null, null, "'\r'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "PAGE_HEAD", "CONCERNS", 
		"PERSEVERANCE", "MOTIVATION", "TIME", "APTITUDE", "SK", "SURVEY", "ANYTHING"
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


	double[] rho = new double[34];
	double[] qs = {12,13,14,15,16,17,18,19,20,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48};
	int count = 0;

	public InventoryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PerseveranceContext extends ParserRuleContext {
		public TerminalNode PERSEVERANCE() { return getToken(InventoryParser.PERSEVERANCE, 0); }
		public PerseveranceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perseverance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterPerseverance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitPerseverance(this);
		}
	}

	public final PerseveranceContext perseverance() throws RecognitionException {
		PerseveranceContext _localctx = new PerseveranceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_perseverance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(PERSEVERANCE);
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
		enterRule(_localctx, 2, RULE_student_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
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
		enterRule(_localctx, 4, RULE_nuid_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		enterRule(_localctx, 6, RULE_college_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		enterRule(_localctx, 8, RULE_ap_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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
		enterRule(_localctx, 10, RULE_ib_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		enterRule(_localctx, 12, RULE_trde_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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
		enterRule(_localctx, 14, RULE_math_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
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
		enterRule(_localctx, 16, RULE_unl_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		enterRule(_localctx, 18, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		enterRule(_localctx, 20, RULE_inventory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			student();
			setState(103);
			nuid();
			setState(104);
			collegemajor();
			setState(105);
			ap();
			setState(106);
			ib();
			setState(107);
			unl();
			setState(108);
			trde();
			setState(109);
			math();
			setState(110);
			ace();
			setState(111);
			survey();
			setState(112);
			eof();
			 
				  for( int i = 0; i < rho.length; i++ ){
				       System.err.format( "%d,%d,%d\n" , i , (int)qs[i] , (int)rho[i] );
				  }
				  System.err.format( "%d,%d,%d\n" , 0 , (int)qs[0] , (int)rho[0] );
				  System.out.println();
			 
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
		enterRule(_localctx, 22, RULE_ace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__8);
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
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(126);
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
					{
					setState(122);
					((AceContext)_localctx).ace_head = ace_head();
					setState(123);
					((AceContext)_localctx).txt = txt();
					 System.out.println( (((AceContext)_localctx).ace_head!=null?_input.getText(((AceContext)_localctx).ace_head.start,((AceContext)_localctx).ace_head.stop):null) + "\n" + (((AceContext)_localctx).txt!=null?_input.getText(((AceContext)_localctx).txt.start,((AceContext)_localctx).txt.stop):null).trim() ); System.out.println(); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0) );
			{
			setState(130);
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
		enterRule(_localctx, 24, RULE_ace_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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

	public static class Survey_headContext extends ParserRuleContext {
		public TerminalNode SURVEY() { return getToken(InventoryParser.SURVEY, 0); }
		public Survey_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_survey_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).enterSurvey_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InventoryListener ) ((InventoryListener)listener).exitSurvey_head(this);
		}
	}

	public final Survey_headContext survey_head() throws RecognitionException {
		Survey_headContext _localctx = new Survey_headContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_survey_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(SURVEY);
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
		public Survey_headContext survey_head() {
			return getRuleContext(Survey_headContext.class,0);
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
		enterRule(_localctx, 28, RULE_survey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			survey_head();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (PERSEVERANCE - 64)))) != 0)) {
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
		public PerseveranceContext perseverance() {
			return getRuleContext(PerseveranceContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_survey_response);
		int _la;
		try {
			int _alt;
			setState(178);
			switch (_input.LA(1)) {
			case PERSEVERANCE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(143);
				perseverance();
				setState(144);
				likert_question();
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
					match(T__9);
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				setState(150);
				likert_answer();
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(151);
					match(T__9);
					}
					}
					setState(154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				}
				}
				break;
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
			case T__35:
			case T__36:
			case T__38:
			case T__39:
			case T__40:
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
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(156);
				likert_question();
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					match(T__9);
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				setState(162);
				likert_answer();
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(163);
					match(T__9);
					}
					}
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				}
				}
				break;
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(168);
				((Survey_responseContext)_localctx).free_question = free_question();
				setState(170); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(169);
						match(T__9);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(172); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(174);
				((Survey_responseContext)_localctx).free_answer = free_answer();
				{
				setState(175);
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
		enterRule(_localctx, 32, RULE_likert_question);
		int _la;
		try {
			setState(234);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 7);
				{
				setState(186);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 8);
				{
				setState(187);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(189);
				match(T__30);
				setState(190);
				match(T__9);
				setState(191);
				match(T__31);
				setState(192);
				match(T__9);
				setState(193);
				match(T__32);
				setState(194);
				match(T__9);
				setState(195);
				match(T__33);
				setState(196);
				match(T__9);
				setState(197);
				match(T__34);
				}
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 11);
				{
				setState(198);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(199);
				match(T__36);
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(200);
					match(T__9);
					}
					}
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				setState(205);
				match(T__37);
				}
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 13);
				{
				setState(206);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 14);
				{
				setState(207);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(208);
				match(T__40);
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(209);
					match(T__9);
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				setState(214);
				match(T__41);
				}
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 16);
				{
				setState(215);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 17);
				{
				setState(216);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 18);
				{
				setState(217);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 19);
				{
				setState(218);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 20);
				{
				setState(219);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 21);
				{
				setState(220);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 22);
				{
				setState(221);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 23);
				{
				setState(222);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 24);
				{
				setState(223);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 25);
				{
				setState(224);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 26);
				{
				setState(225);
				match(T__52);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 27);
				{
				setState(226);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 28);
				{
				setState(227);
				match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 29);
				{
				setState(228);
				match(T__55);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 30);
				{
				setState(229);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 31);
				{
				setState(230);
				match(T__57);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 32);
				{
				setState(231);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 33);
				{
				setState(232);
				match(T__59);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 34);
				{
				setState(233);
				match(T__60);
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
		enterRule(_localctx, 34, RULE_likert_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			switch (_input.LA(1)) {
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
				{
				setState(236);
				likert_agree();
				}
				break;
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
				{
				setState(237);
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
		enterRule(_localctx, 36, RULE_free_question);
		int _la;
		try {
			setState(260);
			switch (_input.LA(1)) {
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(T__61);
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(T__62);
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(T__63);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(T__64);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(T__65);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				match(T__66);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				match(T__67);
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 8);
				{
				setState(247);
				match(T__68);
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 9);
				{
				setState(248);
				match(T__69);
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(249);
				match(T__70);
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(250);
					match(T__9);
					}
					}
					setState(253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				setState(255);
				match(T__71);
				}
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 11);
				{
				setState(256);
				match(T__72);
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 12);
				{
				setState(257);
				match(T__73);
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 13);
				{
				setState(258);
				match(T__74);
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 14);
				{
				setState(259);
				match(T__75);
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
		enterRule(_localctx, 38, RULE_free_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		enterRule(_localctx, 40, RULE_student);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			student_tok();
			setState(265);
			matchWildcard();
			setState(266);
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
		enterRule(_localctx, 42, RULE_nuid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			nuid_tok();
			setState(269);
			matchWildcard();
			setState(270);
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
		enterRule(_localctx, 44, RULE_collegemajor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			((CollegemajorContext)_localctx).college_tok = college_tok();
			setState(273);
			matchWildcard();
			setState(274);
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
		enterRule(_localctx, 46, RULE_ap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			((ApContext)_localctx).ap_tok = ap_tok();
			setState(278);
			match(T__9);
			setState(279);
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
		enterRule(_localctx, 48, RULE_ib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((IbContext)_localctx).ib_tok = ib_tok();
			setState(283);
			match(T__9);
			setState(284);
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
		enterRule(_localctx, 50, RULE_trde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			((TrdeContext)_localctx).trde_tok = trde_tok();
			setState(288);
			match(T__9);
			setState(289);
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
		enterRule(_localctx, 52, RULE_math);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			((MathContext)_localctx).math_tok = math_tok();
			setState(293);
			match(T__9);
			setState(294);
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
		enterRule(_localctx, 54, RULE_unl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			((UnlContext)_localctx).unl_tok = unl_tok();
			setState(298);
			match(T__9);
			setState(299);
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
		enterRule(_localctx, 56, RULE_likert_agree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			switch (_input.LA(1)) {
			case T__76:
			case T__77:
				{
				setState(302);
				very_strong_agree();
				}
				break;
			case T__78:
			case T__79:
				{
				setState(303);
				strong_agree();
				}
				break;
			case T__80:
			case T__81:
				{
				setState(304);
				neutral_agree();
				}
				break;
			case T__82:
			case T__83:
				{
				setState(305);
				weak_agree();
				}
				break;
			case T__84:
			case T__85:
				{
				setState(306);
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
		enterRule(_localctx, 58, RULE_likert_conce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			switch (_input.LA(1)) {
			case T__86:
				{
				setState(309);
				very_strong_conce();
				}
				break;
			case T__87:
				{
				setState(310);
				strong_conce();
				}
				break;
			case T__88:
				{
				setState(311);
				neutral_conce();
				}
				break;
			case T__89:
				{
				setState(312);
				weak_conce();
				}
				break;
			case T__90:
				{
				setState(313);
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
		enterRule(_localctx, 60, RULE_very_strong_agree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==T__76 || _la==T__77) ) {
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
		enterRule(_localctx, 62, RULE_strong_agree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !(_la==T__78 || _la==T__79) ) {
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
		enterRule(_localctx, 64, RULE_neutral_agree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==T__80 || _la==T__81) ) {
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
		enterRule(_localctx, 66, RULE_weak_agree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !(_la==T__82 || _la==T__83) ) {
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
		enterRule(_localctx, 68, RULE_very_weak_agree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==T__84 || _la==T__85) ) {
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
		enterRule(_localctx, 70, RULE_very_strong_conce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__86);
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
		enterRule(_localctx, 72, RULE_strong_conce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__87);
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
		enterRule(_localctx, 74, RULE_neutral_conce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__88);
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
		enterRule(_localctx, 76, RULE_weak_conce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__89);
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
		enterRule(_localctx, 78, RULE_very_weak_conce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__90);
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
		enterRule(_localctx, 80, RULE_txt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(347); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(346);
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
				setState(349); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3f\u0162\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\6\r"+
		"x\n\r\r\r\16\ry\3\r\3\r\3\r\3\r\3\r\6\r\u0081\n\r\r\r\16\r\u0082\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20\u008d\n\20\f\20\16\20\u0090\13\20"+
		"\3\21\3\21\3\21\6\21\u0095\n\21\r\21\16\21\u0096\3\21\3\21\6\21\u009b"+
		"\n\21\r\21\16\21\u009c\3\21\3\21\6\21\u00a1\n\21\r\21\16\21\u00a2\3\21"+
		"\3\21\6\21\u00a7\n\21\r\21\16\21\u00a8\3\21\3\21\6\21\u00ad\n\21\r\21"+
		"\16\21\u00ae\3\21\3\21\3\21\3\21\5\21\u00b5\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\6\22\u00cc\n\22\r\22\16\22\u00cd\3\22\3\22\3\22\3\22\3\22"+
		"\6\22\u00d5\n\22\r\22\16\22\u00d6\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ed"+
		"\n\22\3\23\3\23\5\23\u00f1\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\6\24\u00fe\n\24\r\24\16\24\u00ff\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u0107\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0136\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u013d\n\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$"+
		"\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\6*\u015e\n*\r*\16"+
		"*\u015f\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPR\2\t\3\2\16\27\3\2OP\3\2QR\3\2ST\3\2UV\3\2WX\4\2\f"+
		"\fff\u017e\2T\3\2\2\2\4V\3\2\2\2\6X\3\2\2\2\bZ\3\2\2\2\n\\\3\2\2\2\f^"+
		"\3\2\2\2\16`\3\2\2\2\20b\3\2\2\2\22d\3\2\2\2\24f\3\2\2\2\26h\3\2\2\2\30"+
		"u\3\2\2\2\32\u0086\3\2\2\2\34\u0088\3\2\2\2\36\u008a\3\2\2\2 \u00b4\3"+
		"\2\2\2\"\u00ec\3\2\2\2$\u00f0\3\2\2\2&\u0106\3\2\2\2(\u0108\3\2\2\2*\u010a"+
		"\3\2\2\2,\u010e\3\2\2\2.\u0112\3\2\2\2\60\u0117\3\2\2\2\62\u011c\3\2\2"+
		"\2\64\u0121\3\2\2\2\66\u0126\3\2\2\28\u012b\3\2\2\2:\u0135\3\2\2\2<\u013c"+
		"\3\2\2\2>\u013e\3\2\2\2@\u0141\3\2\2\2B\u0144\3\2\2\2D\u0147\3\2\2\2F"+
		"\u014a\3\2\2\2H\u014d\3\2\2\2J\u0150\3\2\2\2L\u0153\3\2\2\2N\u0156\3\2"+
		"\2\2P\u0159\3\2\2\2R\u015d\3\2\2\2TU\7`\2\2U\3\3\2\2\2VW\7\3\2\2W\5\3"+
		"\2\2\2XY\7\4\2\2Y\7\3\2\2\2Z[\7\5\2\2[\t\3\2\2\2\\]\7\6\2\2]\13\3\2\2"+
		"\2^_\7\7\2\2_\r\3\2\2\2`a\7\b\2\2a\17\3\2\2\2bc\7\t\2\2c\21\3\2\2\2de"+
		"\7\n\2\2e\23\3\2\2\2fg\7\2\2\3g\25\3\2\2\2hi\5*\26\2ij\5,\27\2jk\5.\30"+
		"\2kl\5\60\31\2lm\5\62\32\2mn\58\35\2no\5\64\33\2op\5\66\34\2pq\5\30\r"+
		"\2qr\5\36\20\2rs\5\24\13\2st\b\f\1\2t\27\3\2\2\2uw\7\13\2\2vx\7\f\2\2"+
		"wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u0080\3\2\2\2{\u0081\7\r\2\2"+
		"|}\5\32\16\2}~\5R*\2~\177\b\r\1\2\177\u0081\3\2\2\2\u0080{\3\2\2\2\u0080"+
		"|\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0085\7\f\2\2\u0085\31\3\2\2\2\u0086\u0087"+
		"\t\2\2\2\u0087\33\3\2\2\2\u0088\u0089\7e\2\2\u0089\35\3\2\2\2\u008a\u008e"+
		"\5\34\17\2\u008b\u008d\5 \21\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\37\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0091\u0092\5\2\2\2\u0092\u0094\5\"\22\2\u0093\u0095\7\f\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\5$\23\2\u0099\u009b\7\f\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u00b5\3\2\2\2\u009e\u00a0\5\"\22\2\u009f\u00a1\7\f\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\5$\23\2\u00a5\u00a7\7\f\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00b5\3\2\2\2\u00aa\u00ac\5&\24\2\u00ab\u00ad\7\f\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5(\25\2\u00b1\u00b2\7\f\2\2\u00b2"+
		"\u00b3\b\21\1\2\u00b3\u00b5\3\2\2\2\u00b4\u0091\3\2\2\2\u00b4\u009e\3"+
		"\2\2\2\u00b4\u00aa\3\2\2\2\u00b5!\3\2\2\2\u00b6\u00ed\7\30\2\2\u00b7\u00ed"+
		"\7\31\2\2\u00b8\u00ed\7\32\2\2\u00b9\u00ed\7\33\2\2\u00ba\u00ed\7\34\2"+
		"\2\u00bb\u00ed\7\35\2\2\u00bc\u00ed\7\36\2\2\u00bd\u00ed\7\37\2\2\u00be"+
		"\u00ed\7 \2\2\u00bf\u00c0\7!\2\2\u00c0\u00c1\7\f\2\2\u00c1\u00c2\7\"\2"+
		"\2\u00c2\u00c3\7\f\2\2\u00c3\u00c4\7#\2\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6"+
		"\7$\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00ed\7%\2\2\u00c8\u00ed\7&\2\2\u00c9"+
		"\u00cb\7\'\2\2\u00ca\u00cc\7\f\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00ed\7(\2\2\u00d0\u00ed\7)\2\2\u00d1\u00ed\7*\2\2\u00d2\u00d4\7+\2\2"+
		"\u00d3\u00d5\7\f\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00ed\7,\2\2\u00d9"+
		"\u00ed\7-\2\2\u00da\u00ed\7.\2\2\u00db\u00ed\7/\2\2\u00dc\u00ed\7\60\2"+
		"\2\u00dd\u00ed\7\61\2\2\u00de\u00ed\7\62\2\2\u00df\u00ed\7\63\2\2\u00e0"+
		"\u00ed\7\64\2\2\u00e1\u00ed\7\65\2\2\u00e2\u00ed\7\66\2\2\u00e3\u00ed"+
		"\7\67\2\2\u00e4\u00ed\78\2\2\u00e5\u00ed\79\2\2\u00e6\u00ed\7:\2\2\u00e7"+
		"\u00ed\7;\2\2\u00e8\u00ed\7<\2\2\u00e9\u00ed\7=\2\2\u00ea\u00ed\7>\2\2"+
		"\u00eb\u00ed\7?\2\2\u00ec\u00b6\3\2\2\2\u00ec\u00b7\3\2\2\2\u00ec\u00b8"+
		"\3\2\2\2\u00ec\u00b9\3\2\2\2\u00ec\u00ba\3\2\2\2\u00ec\u00bb\3\2\2\2\u00ec"+
		"\u00bc\3\2\2\2\u00ec\u00bd\3\2\2\2\u00ec\u00be\3\2\2\2\u00ec\u00bf\3\2"+
		"\2\2\u00ec\u00c8\3\2\2\2\u00ec\u00c9\3\2\2\2\u00ec\u00d0\3\2\2\2\u00ec"+
		"\u00d1\3\2\2\2\u00ec\u00d2\3\2\2\2\u00ec\u00d9\3\2\2\2\u00ec\u00da\3\2"+
		"\2\2\u00ec\u00db\3\2\2\2\u00ec\u00dc\3\2\2\2\u00ec\u00dd\3\2\2\2\u00ec"+
		"\u00de\3\2\2\2\u00ec\u00df\3\2\2\2\u00ec\u00e0\3\2\2\2\u00ec\u00e1\3\2"+
		"\2\2\u00ec\u00e2\3\2\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec"+
		"\u00e5\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00e8\3\2"+
		"\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"#\3\2\2\2\u00ee\u00f1\5:\36\2\u00ef\u00f1\5<\37\2\u00f0\u00ee\3\2\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1%\3\2\2\2\u00f2\u0107\7@\2\2\u00f3\u0107\7A"+
		"\2\2\u00f4\u0107\7B\2\2\u00f5\u0107\7C\2\2\u00f6\u0107\7D\2\2\u00f7\u0107"+
		"\7E\2\2\u00f8\u0107\7F\2\2\u00f9\u0107\7G\2\2\u00fa\u0107\7H\2\2\u00fb"+
		"\u00fd\7I\2\2\u00fc\u00fe\7\f\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0107\7J\2\2\u0102\u0107\7K\2\2\u0103\u0107\7L\2\2\u0104\u0107\7M\2\2"+
		"\u0105\u0107\7N\2\2\u0106\u00f2\3\2\2\2\u0106\u00f3\3\2\2\2\u0106\u00f4"+
		"\3\2\2\2\u0106\u00f5\3\2\2\2\u0106\u00f6\3\2\2\2\u0106\u00f7\3\2\2\2\u0106"+
		"\u00f8\3\2\2\2\u0106\u00f9\3\2\2\2\u0106\u00fa\3\2\2\2\u0106\u00fb\3\2"+
		"\2\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0105\3\2\2\2\u0107\'\3\2\2\2\u0108\u0109\5R*\2\u0109)\3\2\2\2\u010a"+
		"\u010b\5\4\3\2\u010b\u010c\13\2\2\2\u010c\u010d\5R*\2\u010d+\3\2\2\2\u010e"+
		"\u010f\5\6\4\2\u010f\u0110\13\2\2\2\u0110\u0111\5R*\2\u0111-\3\2\2\2\u0112"+
		"\u0113\5\b\5\2\u0113\u0114\13\2\2\2\u0114\u0115\5R*\2\u0115\u0116\b\30"+
		"\1\2\u0116/\3\2\2\2\u0117\u0118\5\n\6\2\u0118\u0119\7\f\2\2\u0119\u011a"+
		"\5R*\2\u011a\u011b\b\31\1\2\u011b\61\3\2\2\2\u011c\u011d\5\f\7\2\u011d"+
		"\u011e\7\f\2\2\u011e\u011f\5R*\2\u011f\u0120\b\32\1\2\u0120\63\3\2\2\2"+
		"\u0121\u0122\5\16\b\2\u0122\u0123\7\f\2\2\u0123\u0124\5R*\2\u0124\u0125"+
		"\b\33\1\2\u0125\65\3\2\2\2\u0126\u0127\5\20\t\2\u0127\u0128\7\f\2\2\u0128"+
		"\u0129\5R*\2\u0129\u012a\b\34\1\2\u012a\67\3\2\2\2\u012b\u012c\5\22\n"+
		"\2\u012c\u012d\7\f\2\2\u012d\u012e\5R*\2\u012e\u012f\b\35\1\2\u012f9\3"+
		"\2\2\2\u0130\u0136\5> \2\u0131\u0136\5@!\2\u0132\u0136\5B\"\2\u0133\u0136"+
		"\5D#\2\u0134\u0136\5F$\2\u0135\u0130\3\2\2\2\u0135\u0131\3\2\2\2\u0135"+
		"\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136;\3\2\2\2"+
		"\u0137\u013d\5H%\2\u0138\u013d\5J&\2\u0139\u013d\5L\'\2\u013a\u013d\5"+
		"N(\2\u013b\u013d\5P)\2\u013c\u0137\3\2\2\2\u013c\u0138\3\2\2\2\u013c\u0139"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d=\3\2\2\2\u013e"+
		"\u013f\t\3\2\2\u013f\u0140\b \1\2\u0140?\3\2\2\2\u0141\u0142\t\4\2\2\u0142"+
		"\u0143\b!\1\2\u0143A\3\2\2\2\u0144\u0145\t\5\2\2\u0145\u0146\b\"\1\2\u0146"+
		"C\3\2\2\2\u0147\u0148\t\6\2\2\u0148\u0149\b#\1\2\u0149E\3\2\2\2\u014a"+
		"\u014b\t\7\2\2\u014b\u014c\b$\1\2\u014cG\3\2\2\2\u014d\u014e\7Y\2\2\u014e"+
		"\u014f\b%\1\2\u014fI\3\2\2\2\u0150\u0151\7Z\2\2\u0151\u0152\b&\1\2\u0152"+
		"K\3\2\2\2\u0153\u0154\7[\2\2\u0154\u0155\b\'\1\2\u0155M\3\2\2\2\u0156"+
		"\u0157\7\\\2\2\u0157\u0158\b(\1\2\u0158O\3\2\2\2\u0159\u015a\7]\2\2\u015a"+
		"\u015b\b)\1\2\u015bQ\3\2\2\2\u015c\u015e\t\b\2\2\u015d\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160S\3\2\2\2"+
		"\25y\u0080\u0082\u008e\u0096\u009c\u00a2\u00a8\u00ae\u00b4\u00cd\u00d6"+
		"\u00ec\u00f0\u00ff\u0106\u0135\u013c\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}