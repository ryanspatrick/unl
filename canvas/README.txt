due_today_canvas.sh
bash due_today_canvas.sh CANVAS_CLASS_NUMBER CANVAS_KEY
Finds all assignments due on current day and calls raise_flags_canvas.sh to display NUIDs and names of all students who have not submitted something to Canvas for those assignments

due_today.sh
bash due_today.sh CANVAS_CLASS_NUMBER CANVAS_KEY
Same as due_today_canvas.sh, but runs from a given CSE class account and checks handin instead of Canvas for submissions

get_assignment.sh
bash get_assignment.sh CANVAS_CLASS_NUMBER CANVAS_ASSIGNMENT_NUMBER CANVAS_KEY
Shows Canvas_username,Canvas_score for all students for a given assignment

get_classes.sh
bash get_classes.sh CANVAS_KEY
Shows all Canvas class numbers and "Course Codes" (Prefix, class number, section number, term) for every class user is affiliated with

get_current_grades.sh
bash get_current_grades.sh CANVAS_CLASS_NUMBER CANVAS_KEY
Shows current grade (score) NUID Name for each student in a given class

get_emails.sh
bash get_emails.sh CANVAS_CLASS_NUMBER CANVAS_KEY
Shows a comma-separated list of email addresses for every person affiliated with a given class

get_info.sh
bash get_info.sh CANVAS_CLASS_NUMBER CANVAS_KEY
Shows NUID name for every student and CANVAS_ASSIGNMENT_ID ASSIGNMENT_NAME for every assignment on Canvas for a given class

get_nuids_usernames_canvas.sh
bash get_nuids_usernames_canvas.sh CANVAS_CLASS_NUMBER CANVAS_KEY
Displays CSE username,NUID,CANVAS_STUDENT_ID for every student in a given class

grade_surveys.sh
bash grade_surveys.sh CANVAS_CLASS_ID CANVAS_ASSIGNMENT_ID SURVEY_FILE CANVAS_KEY
Attempts to put scores from CSV file in NUID,Score order into Canvas gradebook. Shows which NUIDs in supplied CSV file do not match NUIDs in class (for manual correction in the CSV file)

insert_grades.sh
bash insert_grades.sh CSE_NUID_CANVAS CSE_SCORE CANVAS_CLASS CANVAS_ASSIGNMENT CANVAS_KEY
Given a CSV in CSE_USERNAME,SCORE order, insert grades into Canvas gradebook using file with correspondences between CSE username, NUID, and Canvas ID for a given class

make_options.sh
bash make_options.sh CANVAS_CLASS CANVAS_KEY
Creates entries for a drop-down menu where the value is the CSE username and the label is the name (according to Canvas)

make_partners.sh
bash make_partners.sh CANVAS_CLASSES_FILE CANVAS_KEY
For each CANVAS_CLASS_ID in CANVAS_CLASSES_FILE, randomly pair current students (there will be one group of three in situations where an odd number of students are enrolled

raise_flags_canvas.sh
bash raise_flags_canvas.sh CANVAS_CLASS_ID CANVAS_ASSIGNMENT_ID CANVAS_KEY
Display NUID and name for each student not submitting something to Canvas for a given assignment

raise_flags.sh
bash raise_flags.sh INFO_FILE CSE_ASSIGNMENT_NUMBER
Like raise_flags_canvas.sh, but with a file of NUID and Names and the CSE handin assignment number provided (and run from a CSE class account).

upload_file.sh
bash upload_file.sh FILE CANVAS_CLASS CANVAS_DESTINATION CANVAS_KEY
Uploads FILE to Canvas class CANVAS_CLASS into location CANVAS_DESTINATION

visualize_enrollment.sh
bash visualize_enrollment CANVAS_CLASS CANVAS_KEY
Creates pie charts of student year, major, and college for Canvas class CANVAS_CLASS
