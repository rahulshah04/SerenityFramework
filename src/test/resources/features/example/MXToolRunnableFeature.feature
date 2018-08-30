Feature: PDF Download Action for MX2018 tools MAC Application for Student Edition

  Background:
     Given The user launches MX2018 Application
     
@LessonPractice
  Scenario: LogIn to MX2018 tool Application and Download the PDF for Lesson Practice Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Student option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Lesson Practice Tab
		Then User navigate to Lesson Practice Landing Page
		#And Click on Unit1 tab
		#Then User navigate to Lesson Tab Launch Page
		#And Click on Lesson11 Tab
		#Then User is displayed with Lesson11 Worksheet Tab
		And Click on Lesson Practice Worksheet Tab
		Then Worksheet PDF file should be downloaded
		
@LessonChallenge
	Scenario: LogIn to MX2018 tool Application and Download the PDF for Lesson Challenge Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Student option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Lesson Challenge Tab
		Then User navigate to Lesson Challenge Landing Page
		And Click on Lesson Challenge Worksheet Tab
		Then Worksheet PDF file should be downloaded

@LessonChecks
	Scenario: LogIn to MX2018 tool Application and Validate HTML file for Lesson Checks Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Student option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Lesson Checks Tab
		Then User navigate to Lesson Checks Landing Page
		And Click on Lesson Checks HTML Worksheet Tab
		Then HTML Worksheet file should be opened in the next tab for Lesson Checks Tab
		
@MathReaderStudent
	Scenario: LogIn to MX2018 tool Application and Validate HTML file for Math Reader Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Student option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Student Math Reader Tab
		Then User navigate to Math Reader Landing Page
		And Click on Math Reader HTML Worksheet Tab
		Then HTML Worksheet file should be opened in the next tab for Math Reader Tab
		
@GamesStudent
	Scenario: LogIn to MX2018 tool Application and Validate HTML file for Games Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Student option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Student Games Tab
		Then User navigate to Games Landing Page
		And Click on Games HTML Worksheet Tab
		Then HTML Worksheet file should be opened in the next tab for Games
		
@FluencyPractice
	Scenario: LogIn to MX2018 tool Application and Validate HTML file for Fluency Practice Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Student option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Fluency Practice Tab
		Then User navigate to Fluency Practice Landing Page
		And Click on Fluency Practice HTML Worksheet Tab
		Then HTML Worksheet file should be opened in the next tab for Fluency Practice