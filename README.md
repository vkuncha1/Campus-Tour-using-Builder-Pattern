# CS542: Assignment 3
## Name: Venkata Achyuth Kunchapu
No of Slack days used : 0
-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on project.
#### Note: build.xml is present in studentCoursesBackup/src folder.
#### Note: courseInfo.txt, coursePrefs.txt, errorLog.txt, regConflicts.txt, and regResults.txt to be placed in same directory level as src

Assumptions : Input files are well formatted, and no dupulicates, Input File always available and not empty, UPDATE_VALUE is not empty

-----------------------------------------------------------------------
## How to clean ?

Command: ant -buildfile studentRecordsBackupTree/src/build.xml clean

Description: It cleans up all the .class files that were generated when code was compiled.

-----------------------------------------------------------------------
## How to compile ?

Command: ant -buildfile studentRecordsBackupTree/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## How to run ?

Command: ant -buildfile studentRecordsBackupTree/src/build.xml run -Darg0=bstInput.txt -Darg1=bstOutput.txt -Darg2=errorLog.txt -Darg3=1 -Darg4=3




-----------------------------------------------------------------------
## Sample Input and Output



#### Terminal Output




#### errorLog.txt



-----------------------------------------------------------------------


#### Choice of Data Structure 





-----------------------------------------------------------------------
## Description:

Binghamton University Campus Tour was implemented using Builder Pattern, In this campus tour student need to complete four different activities as part of campus tour.

Student can perform this activities in any order.

Activity 1: To visit the Building (By Bus or Walk)
Activity 2: To Pick the gift from UNIVERSITY_UNION or EVENTS_CENTER
Activity 3: To Select cafeteria for lunch (CIW or MOUNTAIN_VIEW) 
Activity 4: To attend Lecture (CS542 (In Person class) or CS540 (Online class)

For Every activity there is Carbonfootprint measured in c02, duration measured in minutes, cost is measured in dollars and effort meassure in calories.

Assumptions made for every activity:

For Bus Tour to visit building (Activity 1) :
Cost is 3$,Carbonfootprint as 2.5 co2, Duration is 5 minutes and Effort of 20 Calories.
By Walk to visit building (Activity 1) :
Cost is 1$,Carbonfootprint as 2.5 co2, Duration is 5 minutes and Effort of 70 Calories.


To Pick gift from University Union (Activity 2) :
Carbonfoot Print: 0.4 co2
Cost : 0.4$
Duration: 5 min
Effort: 40 Calories
To Pick gift from Events Center (Activity 2) :
Carbonfoot Print: 0.6 co2
Cost : 0.2$
Duration: 10 min
Effort: 20 Calories

To Choose Cafeteria as MOUNTAIN_VIEW (Activity 3) :
Carbonfoot Print: 1.9 co2
Cost : 2.1$ [Orginal Cost:2.0$ Surcharge: 0.1$] [5% of surcharage]
Duration: 5 min
Effort: 3 Calories

To Choose Cafeteria as CIW (Activity 3) :
Carbonfoot Print: 1.7 co2
Cost : 2.0$
Duration: 30 min
Effort: 20 Calories

To attend Lecture CS540 (Activity 4) :
Carbonfoot Print: 0.44 co2
Cost : 20.0$
Duration: 15 min
Effort: 20 Calories

To attend Lecture CS542 (Activity 4) :
Carbonfoot Print: 0.23 co2
Cost : 22.0$ [Orginal Cost:20.0$ Surcharge: 2.0$] [10% of surcharge]
Duration: 20 min
Effort: 25 Calories

-----------------------------------------------------------------------
## References:

1. https://www.geeksforgeeks.org/linkedhashmap-class-in-java/

-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.""

Date: -- 11/17/2022


