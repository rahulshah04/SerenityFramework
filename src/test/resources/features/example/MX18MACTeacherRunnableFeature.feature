Feature: PDF Download Action for MX2018 MAC Application for Teacher Edition

  Background:
     Given The user launches MX2018 Application
     
@PracticeTab
  Scenario: LogIn to MX2018 MAC Application and Download the PDF for Teacher Practice Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Teacher option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Practice Tab
		Then User navigate to Teacher Edition Practice Landing Page
		And Click on Lesson PDF Worksheet for Practice Tab Teacher Edition
		Then Worksheet PDF file is downloaded sucessfully for Teacher Edition
		Then Click on Reset button
		And Click on Lesson PDF Worksheet for Practice Tab Student Edition
		Then Worksheet PDF file is downloaded sucessfully for Student Edition
		Then Click on Reset button
		
@ReteachTab
  Scenario: LogIn to MX2018 MAC Application and Download the PDF for Teacher Reteach Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Teacher option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Reteach Tab
		Then User navigate to Teacher Edition Reteach Landing Page
		And Click on Lesson PDF Worksheet for Reteach Tab Teacher Edition
		Then Worksheet PDF file is downloaded sucessfully for Teacher Edition
		Then Click on Reset button
		And Click on Lesson PDF Worksheet for Reteach Tab Student Edition
		Then Worksheet PDF file is downloaded sucessfully for Student Edition
		Then Click on Reset button

@ChallengeTab
  Scenario: LogIn to MX2018 MAC Application and Download the PDF for Teacher Challenge Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Teacher option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Challenge Tab
		Then User navigate to Teacher Edition Challenge Landing Page
		And Click on Lesson PDF Worksheet for Challenge Tab Teacher Edition
		Then Worksheet PDF file is downloaded sucessfully for Teacher Edition
		Then Click on Reset button
		And Click on Lesson PDF Worksheet for Challenge Tab Student Edition
		Then Worksheet PDF file is downloaded sucessfully for Student Edition
		Then Click on Reset button
		
@OnlineFluencyBuilder
  Scenario: LogIn to MX2018 MAC Application and validate HTML files for Teacher Online Fluency Builder Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Teacher option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Online Fluency Builder Tab
		Then User navigate to Teacher Edition Fluency Builder Landing Page
		And Click on HTML Worksheet for Fluency Check Checkbox
		Then HTML Worksheet file is opened sucessfully in next Tab for Fluency Check
		Then Click on Reset button
		And Click on HTML Worksheet for Fluency Practice Checkbox
		Then HTML Worksheet file is opened sucessfully in next Tab for Fluency Practice
		Then Click on Reset button
		
@GamesTab
  Scenario: LogIn to MX2018 MAC Application and Download the PDF for Teacher Edition Games Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Teacher option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Games Tab
		Then User navigate to Teacher Edition Games Landing Page
		And Click on Lesson PDF Worksheet for Game Boards Checkbox
		Then Worksheet PDF file is downloaded sucessfully for Game Boards
		Then Click on Reset button
		
@PMTLessonChecks
  Scenario: LogIn to MX2018 MAC Application and validate HTML files for Teacher PMT Lesson Checks Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Teacher option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on PMT Lesson Checks Tab
		Then User navigate to Teacher Edition Lesson Checks Landing Page
		And Click on HTML Worksheet for Lesson Checks
		Then HTML Worksheet file is opened sucessfully in next Tab for Lesson Checks
		Then Click on Reset button
		
@ActivityCardsTab
  Scenario: LogIn to MX2018 MAC Application and Download the PDF for Teacher Activity Cards Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Teacher option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Activity Cards Tab
		Then User navigate to Teacher Edition Activity Cards Landing Page
		And Click on Lesson PDF Worksheet for OnLevel Checkbox
		Then Worksheet PDF file is downloaded sucessfully for OnLevel Edition
		Then Click on Reset button
		And Click on Lesson PDF Worksheet for Challenge Checkbox
		Then Worksheet PDF file is downloaded sucessfully for Challenge Edition
		Then Click on Reset button
		
@MathReaderTab
  Scenario: LogIn to MX2018 MAC Application and validate HTML files for Teacher Math Reader Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Teacher option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Math Reader Tab
		Then User navigate to Teacher Edition Math Reader Landing Page
		And Click on HTML Worksheet for Math Reader
		Then HTML Worksheet file is opened sucessfully in next Tab for Math Reader
		
@InquiryBasedTaskTab
  Scenario: LogIn to MX2018 MAC Application and Download the PDF for Teacher Inquiry based Task Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Teacher option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Indepth Inquiry based Task Tab
		Then User navigate to Teacher Edition Inquiry based Task Landing Page
		And Click on PDF Worksheet for Inquiry based Task
		Then Worksheet PDF file is downloaded sucessfully for Inquiry based Task

@CenterPlanningGuideTab
  Scenario: LogIn to MX2018 MAC Application and Download the PDF for Teacher Center Planning Guide Tab
    When The user is on Home Page
		Then User Navigate to Dashboard Page and Login is Success
		Then User Select Teacher option for the Math Activity Center Dropdown
		And User Click on Cert Review Environment
		And Click on Launch button
		Then User navigate to Math Expression Launch Page open in a new window
		And Click on Center Planning Guide Tab
		Then Worksheet PDF file is downloaded sucessfully for Planning Guide	
		
		