package com.hmhco.hmhqe.testsuites.steps.serenity;

import com.hmhco.hmhqe.config.EnvironmentConfiguration;
import com.hmhco.hmhqe.pages.SerenityHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by graced on 21/09/2017.
 */
public class SerenityPageSteps extends ScenarioSteps {

    @Steps
    private SerenityHomePage serenityHomePage;

    @Step
    public void openMXAppUrl() {
//        serenityHomePage.openAt(EnvironmentConfiguration.getValue("Application.Url"));
    	serenityHomePage.getDriver().get("https://hmh:L3(70r4!@hmh.lectoraonline.com/playground/MX2018/MXLauncher/");
    }
    
    @Step
    public void verifyNavigationToHomePage() {
        serenityHomePage.navigateToHomePage();
    }
    
    @Step
    public void verifyLoginSuccess() {
        serenityHomePage.loginSuccess();
    }

    @Step
    public void selectMathActivityCenterOption() {
        serenityHomePage.selectMathActivityOption();
    }
    
    @Step
    public void clickCretViewEnvironment() {
        serenityHomePage.clickCretViewEnvironment();
    }
    
    @Step
    public void clickLaunchButton() {
        serenityHomePage.clickLaunchButton();
    }

    @Step
    public void verifyNavigationToMathExpLaunchPage() {
        serenityHomePage.navigateToMathExpLaunchPage();
    }
    
    @Step
    public void clickOnLessonPracticeTab() {
        serenityHomePage.clickLessonPracticeTab();
    }
    
    @Step
    public void clickOnLessonChallengeTab() {
        serenityHomePage.clickLessonChallenegeTab();
    }
    
    @Step
    public void clickOnStudentLessonChecksTab() {
        serenityHomePage.clickLessonChecksTab();
    }
    
    @Step
    public void clickOnStudentMathReaderTab() {
        serenityHomePage.clickStudentMathReaderTab();
    }
    
    @Step
    public void clickOnStudentFluencyPracticeTab() {
        serenityHomePage.clickStudentFluencyPracticeTab();
    }
    
    @Step
    public void clickOnStudentGamesTab() {
        serenityHomePage.clickStudentGamesTab();
    }
    
    @Step
    public void verifyNavigationToLessonPracticePage() {
    	serenityHomePage.navigateToLessonPracticePage();
    }
    
    @Step
    public void verifyNavigationToLessonChallenegePage() {
    	serenityHomePage.navigateToLessonChallenegePage();
    }
    
    @Step
    public void verifyNavigationToStudentLessonChecksPage() {
    	serenityHomePage.navigateToLessonChecksPage();
    }
    
    @Step
    public void verifyNavigationToStudentMathReaderPage() {
    	serenityHomePage.navigateToStudentMathReaderPage();
    }
    
    @Step
    public void verifyNavigationToStudentFluencyPracticePage() {
    	serenityHomePage.navigateToStudentFluencyPracticePage();
    }
    
    @Step
    public void verifyNavigationToStudentGamesPage() {
    	serenityHomePage.navigateToStudentGamesPage();
    }
    
    @Step
    public void clickOnLessonWorksheetTab() {
    	serenityHomePage.clickOnUnitTabPractice();
    }
    
    @Step
    public void clickonLessonChallengeWorksheetTab() {
    	serenityHomePage.clickOnUnitTabChallenge();
    }
    
    @Step
    public void clickonUnitTabLessonChecks() {
    	serenityHomePage.clickOnUnitTabLessonChecks();
    }
    
    @Step
    public void clickonUnitTabStudentMathReader() {
    	serenityHomePage.clickOnUnitTabMathReader();
    }
    
    @Step
    public void clickonUnitTabStudentFluencyPractice() {
    	serenityHomePage.clickOnUnitTabFluencyPractice();
    }
    
    @Step
    public void clickonUnitTabStudentGames() {
    	serenityHomePage.clickOnUnitTabGames();
    }
    
    @Step
    public void PDFfileDownloadValidation() {
    	serenityHomePage.PDFdownloaddValidation();
    }
    
    @Step
    public void HTMLWorksheetValidationforStudentLessonChecks() {
    	serenityHomePage.HTMLWorksheetValidationforLessonChecks();
    }
    
    @Step
    public void HTMLWorksheetValidationforStudentMathReader() {
    	serenityHomePage.HTMLWorksheetValidationforMathReader();
    }
    
    @Step
    public void HTMLWorksheetValidationforStudentFluencyParctice() {
    	serenityHomePage.HTMLWorksheetValidationforFluencyPractice();
    }
    
    @Step
    public void HTMLWorksheetValidationforStudentGames() {
    	serenityHomePage.HTMLWorksheetValidationforGames();
    }
    
    @Step
    public void selectMathActivityCenterOptionTeacher() {
    	serenityHomePage.selectMathActivityOptionTeacher();
    }
    
    @Step
    public void clickTeacherPracticeTab() {
    	serenityHomePage.clickTeacherPracticeTab();
    }
    
    @Step
    public void clickTeacherReteachTab() {
    	serenityHomePage.clickTeacherReteachTab();
    }
    
    @Step
    public void clickTeacherChallengeTab() {
    	serenityHomePage.clickTeacherChallengeTab();
    }
    
    @Step
    public void clickTeacherActivityCardsTab() {
    	serenityHomePage.clickTeacherActivityCardsTab();
    }
    
    @Step
    public void clickTeacherIndepthInquiryTaskTab() {
    	serenityHomePage.clickTeacherIndepthInquiryTaskTab();
    }
    
    @Step
    public void clickTeacherPlanningGuideTab() {
    	serenityHomePage.clickTeacherPlanningGuideTab();
    }
    
    @Step
    public void clickTeacherGamesTab() {
    	serenityHomePage.clickTeacherGamesTab();
    }
    
    @Step
    public void clickTeacherOnlineFluencyBuilderTab() {
    	serenityHomePage.clickTeacherOnlineFluencyBuilderTab();
    }
    
    @Step
    public void clickTeacherPMTLessonChecksTab() {
    	serenityHomePage.clickTeacherPMTLessonChecksTab();
    }
    
    @Step
    public void clickTeacherMathReaderTab() {
    	serenityHomePage.clickTeacherMathReaderTab();
    }
    
    @Step
    public void verifyNavigationToLessonReteachTeacherPage() {
    	serenityHomePage.navigateToLessonReteachTeacherPage();
    }
    
    @Step
    public void verifyNavigationToLessonChallengeTeacherPage() {
    	serenityHomePage.navigateToLessonChallengeTeacherPage();
    }
    
    @Step
    public void verifyNavigationToActivityCardsTeacherPage() {
    	serenityHomePage.navigateToActivityCardsTeacherPage();
    }
    
    @Step
    public void verifyNavigationToIndepthInquiryTaskTeacherPage() {
    	serenityHomePage.navigateToInquirybasedTaskTeacherPage();
    }
    
    @Step
    public void verifyNavigationToGamesTeacherPage() {
    	serenityHomePage.navigateToGamesTeacherPage();
    }
    
    @Step
    public void verifyNavigationToFluencyBuilderTeacherPage() {
    	serenityHomePage.navigateToFluencyBuilderTeacherPage();
    }
    
    @Step
    public void verifyNavigationToLessonChecksTeacherPage() {
    	serenityHomePage.navigateToLessonChecksTeacherPage();
    }
    
    @Step
    public void verifyNavigationToMathReaderTeacherPage() {
    	serenityHomePage.navigateToMathReaderTeacherPage();
    }
    
    @Step
    public void clickOnWorksheetPDFTeacherEdition() {
    	serenityHomePage.clickWorksheetPDFTeacherEdition();
    }
    
    @Step
    public void clickOnWorksheetPDFStudentEdition() {
    	serenityHomePage.clickWorksheetPDFStudentEdition();
    }
    
    @Step
    public void clickOnWorksheetPDFReteachTeacherEdition() {
    	serenityHomePage.clickWorksheetPDFforReteachTeacherEdition();
    }
    
    @Step
    public void clickOnWorksheetPDFReteachStudentEdition() {
    	serenityHomePage.clickWorksheetPDFforReteachStudentEdition();
    }
    
    @Step
    public void clickOnWorksheetPDFChallengeTeacherEdition() {
    	serenityHomePage.clickWorksheetPDFforChallengeTeacherEdition();
    }
    
    @Step
    public void clickOnWorksheetPDFChallengeStudentEdition() {
    	serenityHomePage.clickWorksheetPDFforChallengeStudentEdition();
    }
    
    @Step
    public void clickOnWorksheetPDFOnLevelEditionActivityCards() {
    	serenityHomePage.clickWorksheetPDFOnLevelEditionActivityCards();
    }
    
    @Step
    public void clickOnWorksheetPDFChallengeEditionActivityCards() {
    	serenityHomePage.clickWorksheetPDFChallengeEditionActivityCards();
    }
    
    @Step
    public void clickOnWorksheetPDFIndepthInquiryTask() {
    	serenityHomePage.clickWorksheetPDFIndepthInquiryTask();
    }
    
    @Step
    public void clickOnWorksheetPDFGamesBoards() {
    	serenityHomePage.clickWorksheetPDFGamesBoardsforGamesTab();
    }
    
    @Step
    public void clickOnHTMLWorksheetFluencyChecksforFluencyBuilderTab() {
    	try {
			serenityHomePage.clickHTMLWorksheetFluencyChecksforFluencyBuilderTab();
		} 
    	catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
    @Step
    public void clickOnHTMLWorksheetFluencyPracticeforFluencyBuilderTab() {
    	try {
			serenityHomePage.clickHTMLWorksheetFluencyPracticeforFluencyBuilderTab();
		} 
    	catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
    @Step
    public void clickOnHTMLWorksheetforLessonChecksTab() {
    	try {
			serenityHomePage.clickHTMLWorksheetforLessonChecksTab();
		} 
    	catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
    @Step
    public void clickOnHTMLWorksheetforMathReaderTab() {
    	try {
			serenityHomePage.clickHTMLWorksheetforMathReaderTab();
		} 
    	catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
    @Step
    public void PDFdownloadValidationforTeacherEdition() {
    	serenityHomePage.PDFdownloadValidationforTeacherEdition();
    }
    
    @Step
    public void PDFdownloadValidationforStudentEdition() {
    	serenityHomePage.PDFdownloadValidationforStudentEdition();
    }
    
    @Step
    public void PDFdownloadValidationforOnLevelCheckbox() {
    	serenityHomePage.PDFdownloadValidationforOnLevelEdition();
    }
    
    @Step
    public void PDFdownloadValidationforChallengeCheckbox() {
    	serenityHomePage.PDFdownloadValidationforChallengeEdition();
    }
    
    @Step
    public void PDFdownloadValidationforIndepthInquiryTask() {
    	serenityHomePage.PDFdownloadValidationforIndepthInquiryTask();
    }
    
    @Step
    public void PDFdownloadValidationforCenterPlanningGuide() {
    	serenityHomePage.PDFdownloadValidationforCenterPlanningGuide();
    }
    
    @Step
    public void PDFdownloadValidationforGameBoardsCheckbox() {
    	serenityHomePage.PDFdownloadValidationforGameBaordsCheckbox();
    }
    
    @Step
    public void HTMLValidationforFluencyCheckCheckbox() {
    	serenityHomePage.HTMLValidationforFluencyCheckCheckbox();
    }
    
    @Step
    public void HTMLValidationforFluencyPracticeCheckbox() {
    	serenityHomePage.HTMLValidationforFluencyCheckCheckbox();
    }
    
    @Step
    public void HTMLValidationforLessonChecks() {
    	serenityHomePage.HTMLValidationforLessonChecks();
    }
    
    @Step
    public void HTMLValidationforMathReader() {
    	serenityHomePage.HTMLValidationforMathReader();
    }
    
    @Step
    public void clickOnResetButton() {
    	serenityHomePage.clickResetButton();
    }
    
}
