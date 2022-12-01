grammar Inventory;

@members{
double[] rho = new double[34];
double[] qs = {12,13,14,15,16,17,18,19,20,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48};
int count = 0;
}

PAGE_HEAD : ( ( ('0'..'9')* .)? 'NSE Student Enrollment Advising Inventory: Fall ' ( '0'..'9' )+ ('\n')+ ) { skip(); };
CONCERNS : ( 'Concerns' ('\n')+ PAGE_HEAD? 'Thinking about your first term at UNL, how concerned are you about the following' ('\n')+ PAGE_HEAD? 'issues:' ('\n')+ ) { skip(); };
perseverance : PERSEVERANCE;
PERSEVERANCE : ( 'Perseverance' ('\n')+ PAGE_HEAD? 'Below are a number of statements that may or may not apply to you. When responding,' ('\n')+ PAGE_HEAD? 'think of how you compare to most people. There are no right or wrong answers, so' ('\n')+ PAGE_HEAD? 'please answer honestly.' ('\n')+ ) { skip(); };
MOTIVATION : ( 'Motivation' ('\n')+ PAGE_HEAD? 'As you start your first semester at UNL, please indicate how much you agree or' ('\n')+ PAGE_HEAD? 'disagree with the following statements.' ('\n')+ ) { skip(); };
TIME : ( 'Time Management' ('\n')+ PAGE_HEAD? 'Please indicate how much you agree or disagree with the following statements.' ('\n')+ ) { skip(); };
APTITUDE : ( 'Aptitude' ('\n')+ PAGE_HEAD? 'Please indicate how much you agree or disagree with the following statements.' ('\n')+ ) { skip(); };

student_tok : 'Student:';
nuid_tok : 'NUID:';
college_tok : 'College/Major:';
ap_tok : 'Advanced Placement';
ib_tok : 'International Baccalaureate';
trde_tok : 'Transfer and Dual Enrollment';
math_tok : 'Math Courses';
unl_tok : 'UNL Courses';
eof : EOF;

SK : '\r' { skip(); };

inventory : student nuid collegemajor ap ib unl trde math ace survey eof { 
	  for( int i = 0; i < rho.length; i++ ){
	       System.err.format( "%d,%d,%d\n" , i , (int)qs[i] , (int)rho[i] );
	  }
	  System.err.format( "%d,%d,%d\n" , 0 , (int)qs[0] , (int)rho[0] );
	  System.out.println();
 };

ace : 'ACE Outcomes' ('\n')+ ( 'No values entered' | (ace_head txt { System.out.println( $ace_head.text + "\n" + $txt.text.trim() ); System.out.println(); } ) )+ ('\n');
ace_head : 'ACE 1 Writing'
	 | 'ACE 2 Communication Competence'
	 | 'ACE 3 Math/Stat/Reasoning'
	 | 'ACE 4 Science'
	 | 'ACE 5 Humanities'
	 | 'ACE 6 Social Science'
	 | 'ACE 7 Arts'
	 | 'ACE 8 Civic/Ethics/Stewardship'
	 | 'ACE 9 Global/Diversity'
	 | 'ACE 10 Integrated Product'
	 ;
survey_head : SURVEY;

survey : survey_head survey_response*;

survey_response : (perseverance likert_question ('\n')+ likert_answer ('\n')+)
		| (likert_question ('\n')+ likert_answer ('\n')+)
		| (free_question ('\n')+ free_answer ('\n') { System.out.println( $free_question.text + "\n" + $free_answer.text.trim() ); System.out.println(); });

likert_question : '12. Knowing how to study'
		| '13. Making Friends'
		| '14. Being in a large environment'
		| '15. Paying for college'
		| '16. Doing well in my classes'
		| '17. Being away from family'
		| '18. Finding help if I need it'
		| '19. Making the right major/career decision'
		| '20. Managing my time'
		| ( 'Perseverance ' '\n' 'Below are a number of statements that may or may not apply to you. When responding,' '\n' 'think of how you compare to most people. There are no right or wrong answers, so' '\n' 'please answer honestly.' '\n' '24. New ideas and projects sometimes distract me from previous ones.' )
		| '25. Setbacks don\'t discourage me. '
		| ( '26. I have been obsessed with a certain idea or project for a short time but later lost' ('\n')+ 'interest.' )
		| '27. I am a hard worker.'
		| '28. I often set a goal but later choose to pursue a different one.'
		| ( '29. I have difficulty maintaining my focus on projects that take more than a few months to' ('\n')+ 'complete.' )
		| '30. I finish whatever I begin.'
		| '31. I am diligent.'
		| '32. My academic performance is important to me.'
		| '33. I set goals for the grades I want in my classes.'
		| '34. It is important for me to do as well as I can in my courses.'
		| '35. I find it difficult to motivate myself to study for my courses.'
		| '36. I study just what I need to know to pass.'
		| '37. I usually start an assignment shortly after it is assigned.'
		| '38. When I have a deadline, I often waste time doing other things.'
		| '39. I usually plan out my week\'s work in advance.'
		| '40. I find it hard to stick to my study schedule.'
		| '41. I schedule more time to study for difficult classes.'
		| '42. I know how to manage my time.'
		| '43. I know how to study for tests.'
		| '44. I know how to study well.'
		| '45. I will develop a strong plan for academic success.'
		| '46. Academically, I am very self-disciplined.'
		| '47. I will handle any academic issues I might encounter.'
		| '48. UNL was my first choice.'
		;

likert_answer : ( likert_agree | likert_conce );

free_question : '1. I plan to live'
	      | '2. My first term, I plan to work on campus this many hours:'
	      | '3. My first term, I plan to work off campus this many hours:'
	      | '4. I am interested in one of the Pre-professional areas:'
	      | '5. My strongest subjects are (select all that apply):'
	      | '6. My most difficult subjects are (select all that apply): '
	      | '7. The average number of hours I spent in high school studying outside of class time:'
	      | '8. The amount of time I plan to study outside of class time in college:'
	      | '9. Number of activities I plan to be involved in at UNL:'
	      | ('10. Activities in which I plan to participate during my first year that may impact my' ('\n')+ 'planning:')
	      | '11. My parents earned a Bachelor\'s Degree.'
	      | '21. Do you plan to take coursework in a modern/classical (i.e., non-English) language?'
	      | '22. Briefly describe your career interests:'
	      | '23. Majors of Interest:'
  	      ;

free_answer : txt;

student : student_tok . txt;
nuid : nuid_tok . txt;
collegemajor : college_tok . txt { System.out.println( $college_tok.text + "\n" + $txt.text.trim() ); System.out.println(); };
ap : ap_tok '\n' txt { System.out.println( $ap_tok.text + "\n" + $txt.text.trim() ); System.out.println(); };
ib : ib_tok '\n' txt { System.out.println( $ib_tok.text + "\n" + $txt.text.trim() ); System.out.println(); };
trde : trde_tok '\n' txt { System.out.println( $trde_tok.text + "\n" + $txt.text.trim() ); System.out.println(); };
math : math_tok '\n' txt { System.out.println( $math_tok.text + "\n" + $txt.text.trim() ); System.out.println(); };
unl : unl_tok '\n' txt { System.out.println( $unl_tok.text + "\n" + $txt.text.trim() ); System.out.println(); };

likert_agree : (very_strong_agree | strong_agree | neutral_agree | weak_agree | very_weak_agree);
likert_conce : (very_strong_conce | strong_conce | neutral_conce | weak_conce | very_weak_conce);

very_strong_agree : ( 'Strongly Agree' | 'Very much like me' ) { rho[count] = 5; count++; };
strong_agree : ( 'Agree' | 'Mostly like me' ) { rho[count] = 4; count++; };
neutral_agree : ( 'Neutral' | 'Somewhat like me' ) { rho[count] = 3; count++; };
weak_agree : ( 'Disagree' | 'Not much like me' ) { rho[count] = 2; count++; };
very_weak_agree : ( 'Strongly Disagree' | 'Not like me at all' ) { rho[count] = 1; count++; };

very_strong_conce : 'Extremely Concerned' { rho[count] = 1; count++; };
strong_conce : 'Moderately Concerned' { rho[count] = 2; count++; };
neutral_conce : 'Somewhat Concerned' { rho[count] = 3; count++; };
weak_conce : 'Slightly Concerned' { rho[count] = 4; count++; };
very_weak_conce : 'Not Concerned' { rho[count] = 5; count++; };

SURVEY : ( 'Survey' ('\n') 'First-Semester Planning' ('\n'));

txt : (ANYTHING | '\n')+;
ANYTHING : (.);