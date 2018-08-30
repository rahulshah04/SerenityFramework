package com.hmhco.hmhqe.testsuites.steps.scenariosteps;


import org.openqa.selenium.support.ui.Select;

import com.hmhco.hmhqe.testsuites.steps.serenity.SerenityPageSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by graced on 21/09/2017.
 */
public class SerenitySteps {

    @Steps
    private SerenityPageSteps serenityPageSteps;

    @Given("The user launches MX2018 Application")
    public void launchSite() {
        serenityPageSteps.openMXAppUrl();
    }

    @When("The user is on Home Page")
    public void verifyNavigateToHomePage() {
        serenityPageSteps.verifyNavigationToHomePage();
    }
    
    @Then("User Navigate to Dashboard Page and Login is Success")
    public void verifyLoginIsSuccess() {
        serenityPageSteps.verifyLoginSuccess();
    }
    
    @Then("User Select Student option for the Math Activity Center Dropdown")
    public void selectMathActivityCenterOption() {
        serenityPageSteps.selectMathActivityCenterOption();
    }

    @And("User Click on Cert Review Environment")
    public void clickOnCretViewEnvironment() {
        serenityPageSteps.clickCretViewEnvironment();
    }
    
    @And("Click on Launch button")
    public void clickOnLaunchButton() {
    	serenityPageSteps.clickLaunchButton();
    }

    @Then("User navigate to Math Expression Launch Page open in a new window")
    public void verifyNavigateToMathExpressionPage() {
        serenityPageSteps.verifyNavigationToMathExpLaunchPage();
    }
    
    @And("Click on Lesson Practice Tab")
    public void clickOnLessonPracticeTab() {
    	try{
    		Thread.sleep(5000);
    		serenityPageSteps.clickOnLessonPracticeTab();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		System.out.println(e.getMessage());
    	}
    }
    
    @And("Click on Lesson Challenge Tab")
    public void clickOnLessonChallengeTab() {
    	try{
    		Thread.sleep(5000);
    		serenityPageSteps.clickOnLessonChallengeTab();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		System.out.println(e.getMessage());
    	}
    }
    
    @And("Click on Lesson Checks Tab")
    public void clickOnStudentLessonCheckTab() {
    	try{
    		Thread.sleep(4000);
    		serenityPageSteps.clickOnStudentLessonChecksTab();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @And("Click on Student Math Reader Tab")
    public void clickOnStudentMathReaderTab() {
    	try{
    		Thread.sleep(4000);
    		serenityPageSteps.clickOnStudentMathReaderTab();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @And("Click on Fluency Practice Tab")
    public void clickOnStudentFluencyPracticeTab() {
    	try{
    		Thread.sleep(4000);
    		serenityPageSteps.clickOnStudentFluencyPracticeTab();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @And("Click on Student Games Tab")
    public void clickOnStudentGamesTab() {
    	try{
    		Thread.sleep(4000);
    		serenityPageSteps.clickOnStudentGamesTab();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @Then("User navigate to Lesson Practice Landing Page")
    public void verifyNavigateToLessonPracticePage() {
    	serenityPageSteps.verifyNavigationToLessonPracticePage();
    }
    
    @Then("User navigate to Lesson Challenge Landing Page")
    public void verifyNavigateToLessonChallengePage() {
    	serenityPageSteps.verifyNavigationToLessonChallenegePage();
    }
    
    @Then("User navigate to Lesson Checks Landing Page")
    public void verifyNavigateToStudentLessonChecksPage() {
    	serenityPageSteps.verifyNavigationToStudentLessonChecksPage();
    }
    
    @Then("User navigate to Math Reader Landing Page")
    public void verifyNavigateToStudentMathReaderPage() {
    	serenityPageSteps.verifyNavigationToStudentMathReaderPage();
    }
    
    @Then("User navigate to Fluency Practice Landing Page")
    public void verifyNavigateToStudentFluencyPracticePage() {
    	serenityPageSteps.verifyNavigationToStudentFluencyPracticePage();
    }
    
    @Then("User navigate to Games Landing Page")
    public void verifyNavigateToStudentGamesPage() {
    	serenityPageSteps.verifyNavigationToStudentGamesPage();
    }
    
    @And("Click on Lesson Practice Worksheet Tab")
    public void clickOnLessonWorksheetTab() {
    	serenityPageSteps.clickOnLessonWorksheetTab();
    }
    
    @And("Click on Lesson Challenge Worksheet Tab")
    public void clickOnLessonChallengeWorksheetTab() {
    	serenityPageSteps.clickonLessonChallengeWorksheetTab();
    }
    
    @And("Click on Lesson Checks HTML Worksheet Tab")
    public void clickOnUnitTabLessonChecks() {
    	serenityPageSteps.clickonUnitTabLessonChecks();
    }
    
    @And("Click on Math Reader HTML Worksheet Tab")
    public void clickOnUnitTabMathReader() {
    	serenityPageSteps.clickonUnitTabStudentMathReader();
    }
    
    @And("Click on Fluency Practice HTML Worksheet Tab")
    public void clickOnUnitTabFluencyReader() {
    	serenityPageSteps.clickonUnitTabStudentFluencyPractice();
    }
    
    @And("Click on Games HTML Worksheet Tab")
    public void clickOnUnitTabGames() {
    	serenityPageSteps.clickonUnitTabStudentGames();
    }
    
    @Then("Worksheet PDF file should be downloaded")
    public void verifyPDFfileDownload() {
    	serenityPageSteps.PDFfileDownloadValidation();
    }
    
    @Then("HTML Worksheet file should be opened in the next tab for Lesson Checks Tab")
    public void verifyWorksheetValidationforStudentLessonChecks() {
    	serenityPageSteps.HTMLWorksheetValidationforStudentLessonChecks();
    }
    
    @Then("HTML Worksheet file should be opened in the next tab for Math Reader Tab")
    public void verifyWorksheetValidationforStudentMathReader() {
    	serenityPageSteps.HTMLWorksheetValidationforStudentMathReader();
    }
    
    @Then("HTML Worksheet file should be opened in the next tab for Fluency Practice")
    public void verifyWorksheetValidationforStudentFluencyPractice() {
    	serenityPageSteps.HTMLWorksheetValidationforStudentFluencyParctice();
    }
    
    @Then("HTML Worksheet file should be opened in the next tab for Games")
    public void verifyWorksheetValidationforStudentGames() {
    	serenityPageSteps.HTMLWorksheetValidationforStudentGames();
    }
    
    //Teacher Edition PDF Download Validation
    
    @Then("User Select Teacher option for the Math Activity Center Dropdown")
    public void selectMathActivityCenterOptionforTeacher() {
        serenityPageSteps.selectMathActivityCenterOptionTeacher();
    }
    
    @And("Click on Practice Tab")
    public void clickOnTeacherPracticeTab() {
    	serenityPageSteps.clickTeacherPracticeTab();
    }
    
    @And("Click on Reteach Tab")
    public void clickOnTeacherReteachTab() {
    	serenityPageSteps.clickTeacherReteachTab();
    }
    
    @And("Click on Challenge Tab")
    public void clickOnTeacherChallengeTab() {
    	serenityPageSteps.clickTeacherChallengeTab();
    }
    
    @And("Click on Activity Cards Tab")
    public void clickOnTeacherActivityCardsTab() {
    	serenityPageSteps.clickTeacherActivityCardsTab();
    }
    
    @And("Click on Indepth Inquiry based Task Tab")
    public void clickOnIndepthInquiryTaskTab() {
    	serenityPageSteps.clickTeacherIndepthInquiryTaskTab();
    }
    
    @And("Click on Center Planning Guide Tab")
    public void clickOnCenterPlanningGuideTab() {
    	serenityPageSteps.clickTeacherPlanningGuideTab();
    }
    
    @And("Click on Games Tab")
    public void clickOnGamesTab() {
    	serenityPageSteps.clickTeacherGamesTab();
    }
    
    @And("Click on Online Fluency Builder Tab")
    public void clickOnOnlineFluencyBuilderTab() {
    	serenityPageSteps.clickTeacherOnlineFluencyBuilderTab();
    }
    
    @And("Click on PMT Lesson Checks Tab")
    public void clickOnPMTLessonChecksTab() {
    	serenityPageSteps.clickTeacherPMTLessonChecksTab();
    }
    
    @And("Click on Math Reader Tab")
    public void clickOnMathReaderTab() {
    	serenityPageSteps.clickTeacherMathReaderTab();
    }
    
    @Then("User navigate to Teacher Edition Practice Landing Page")
    public void navigateToTeacherPracticePage() {
    	serenityPageSteps.verifyNavigationToLessonPracticePage();
    }
    
    @Then("User navigate to Teacher Edition Reteach Landing Page")
    public void navigateToTeacherReteachPage() {
    	serenityPageSteps.verifyNavigationToLessonReteachTeacherPage();
    }
    
    @Then("User navigate to Teacher Edition Challenge Landing Page")
    public void navigateToTeacherChallengePage() {
    	serenityPageSteps.verifyNavigationToLessonChallengeTeacherPage();
    }
    
    @Then("User navigate to Teacher Edition Activity Cards Landing Page")
    public void navigateToTeacherActivityCardsPage() {
    	serenityPageSteps.verifyNavigationToActivityCardsTeacherPage();
    }
    
    @Then("User navigate to Teacher Edition Inquiry based Task Landing Page")
    public void navigateToIndepthInquiryTaskPage() {
    	serenityPageSteps.verifyNavigationToIndepthInquiryTaskTeacherPage();
    }
    
    @Then("User navigate to Teacher Edition Games Landing Page")
    public void navigateToGamePage() {
    	serenityPageSteps.verifyNavigationToGamesTeacherPage();
    }
    
    @Then("User navigate to Teacher Edition Fluency Builder Landing Page")
    public void navigateToFluencyBuilderPage() {
    	serenityPageSteps.verifyNavigationToFluencyBuilderTeacherPage();
    }
    
    @Then("User navigate to Teacher Edition Lesson Checks Landing Page")
    public void navigateToLessonChecksTeacherPage() {
    	serenityPageSteps.verifyNavigationToLessonChecksTeacherPage();
    }
    
    @Then("User navigate to Teacher Edition Math Reader Landing Page")
    public void navigateToMathReaderTeacherPage() {
    	serenityPageSteps.verifyNavigationToMathReaderTeacherPage();
    }
    
   @And("Click on Lesson PDF Worksheet for Practice Tab Teacher Edition")
   public void clickPracticeWorksheetPDFforTeacher() {
	   serenityPageSteps.clickOnWorksheetPDFTeacherEdition();
   }
   
   @Then("Worksheet PDF file is downloaded sucessfully for Teacher Edition")
   public void PDFfileDownloadValidationforTeacher() {
	   serenityPageSteps.PDFdownloadValidationforTeacherEdition();
   }
   
   @And("Click on Lesson PDF Worksheet for Practice Tab Student Edition")
   public void clickPracticeWorksheetPDFforStudent() {
	   serenityPageSteps.clickOnWorksheetPDFStudentEdition();
   }
   
   @Then("Worksheet PDF file is downloaded sucessfully for Student Edition")
   public void PDFWorksheetDownloadValidationforStudent() {
	   serenityPageSteps.PDFdownloadValidationforStudentEdition();
   }
   
   @And("Click on Lesson PDF Worksheet for Reteach Tab Teacher Edition")
   public void clickPracticeWorksheetPDFforReteachTabTeacher() {
	   serenityPageSteps.clickOnWorksheetPDFReteachTeacherEdition();
   }
    
   @And("Click on Lesson PDF Worksheet for Reteach Tab Student Edition")
   public void clickPracticeWorksheetPDFforReteachTabStudent() {
	   serenityPageSteps.clickOnWorksheetPDFReteachStudentEdition();
   }
   
   @And("Click on Lesson PDF Worksheet for Challenge Tab Teacher Edition")
   public void clickPracticeWorksheetPDFforChallengeTabTeacher() {
	   serenityPageSteps.clickOnWorksheetPDFChallengeTeacherEdition();
   }
    
   @And("Click on Lesson PDF Worksheet for Challenge Tab Student Edition")
   public void clickPracticeWorksheetPDFforChallengeTabTabStudent() {
	   serenityPageSteps.clickOnWorksheetPDFChallengeStudentEdition();
   }
   
   @And("Click on Lesson PDF Worksheet for OnLevel Checkbox")
   public void clickWorksheetPDFforOnLevelActivityCards() {
	   serenityPageSteps.clickOnWorksheetPDFOnLevelEditionActivityCards();
   }
   
   @Then("Worksheet PDF file is downloaded sucessfully for OnLevel Edition")
   public void PDFfileDownloadValidationforOnLevelCheckbox() {
	   serenityPageSteps.PDFdownloadValidationforOnLevelCheckbox();
   }
   
   @And("Click on Lesson PDF Worksheet for Challenge Checkbox")
   public void clickWorksheetPDFforChallengeActivityCards() {
	   serenityPageSteps.clickOnWorksheetPDFChallengeEditionActivityCards();
   }
   
   @Then("Worksheet PDF file is downloaded sucessfully for Challenge Edition")
   public void PDFfileDownloadValidationforChallengeCheckbox() {
	   serenityPageSteps.PDFdownloadValidationforChallengeCheckbox();
   }
   
   @And("Click on PDF Worksheet for Inquiry based Task")
   public void clickWorksheetPDFforIndepthInquiryTask() {
	   serenityPageSteps.clickOnWorksheetPDFIndepthInquiryTask();
   }
   
   @Then("Worksheet PDF file is downloaded sucessfully for Inquiry based Task")
   public void PDFfileDownloadValidationforIndepthInquiryTask() {
	   serenityPageSteps.PDFdownloadValidationforIndepthInquiryTask();
   }
   
   @Then("Worksheet PDF file is downloaded sucessfully for Planning Guide")
   public void PDFfileDownloadValidationforCenterPlanningGuide() {
	   serenityPageSteps.PDFdownloadValidationforCenterPlanningGuide();
   }
   
   @And("Click on Lesson PDF Worksheet for Game Boards Checkbox")
   public void clickWorksheetPDFforGamesBoardsCheckbox() {
	   serenityPageSteps.clickOnWorksheetPDFGamesBoards();
   }
   
   @Then("Worksheet PDF file is downloaded sucessfully for Game Boards")
   public void PDFfileDownloadValidationforGamesBoards() {
	   serenityPageSteps.PDFdownloadValidationforGameBoardsCheckbox();
   }
   
   @And("Click on HTML Worksheet for Fluency Check Checkbox")
   public void clickHTMLWorksheetforFluencyChecksCheckbox() {
	   serenityPageSteps.clickOnHTMLWorksheetFluencyChecksforFluencyBuilderTab();
   }
   
   @Then("HTML Worksheet file is opened sucessfully in next Tab for Fluency Check")
   public void HTMLValidationforFluencyCheckCheckbox() {
	   serenityPageSteps.HTMLValidationforFluencyCheckCheckbox();
   }
   
   @And("Click on HTML Worksheet for Fluency Practice Checkbox")
   public void clickHTMLWorksheetforFluencyPracticeCheckbox() {
	   serenityPageSteps.clickOnHTMLWorksheetFluencyPracticeforFluencyBuilderTab();
   }
   
   @Then("HTML Worksheet file is opened sucessfully in next Tab for Fluency Practice")
   public void HTMLValidationforFluencyPracticeCheckbox() {
	   serenityPageSteps.HTMLValidationforFluencyPracticeCheckbox();
   }
   
   @And("Click on HTML Worksheet for Lesson Checks")
   public void clickHTMLWorksheetforLessonChecksTab() {
	   serenityPageSteps.clickOnHTMLWorksheetforLessonChecksTab();
   }
   
   @Then("HTML Worksheet file is opened sucessfully in next Tab for Lesson Checks")
   public void HTMLValidationforLessonChecks() {
	   serenityPageSteps.HTMLValidationforLessonChecks();
   }
   
   @And("Click on HTML Worksheet for Math Reader")
   public void clickHTMLWorksheetforMathReaderTab() {
	   serenityPageSteps.clickOnHTMLWorksheetforMathReaderTab();
   }
   
   @Then("HTML Worksheet file is opened sucessfully in next Tab for Math Reader")
   public void HTMLValidationforMathReader() {
	   serenityPageSteps.HTMLValidationforMathReader();
   }
   
   @Then("Click on Reset button")
   public void clickOnResetButton() {
	   serenityPageSteps.clickOnResetButton();
   }

}
