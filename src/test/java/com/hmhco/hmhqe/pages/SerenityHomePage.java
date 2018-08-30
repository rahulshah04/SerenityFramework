package com.hmhco.hmhqe.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.webdriver.driverproviders.ChromeDriverProvider;
import net.thucydides.core.pages.PageObject;

import org.apache.tools.ant.taskdefs.Sleep;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opera.core.systems.scope.protos.EcmascriptProtos.EvalResult.Status;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

   
public class SerenityHomePage extends PageObject {

    @FindBy(id = "gradek")
    public WebElementFacade Gradegk;
    
    @FindBy(xpath ="//*[@class='dropdown' and @id='mathactivitycenter']/label")
    public WebElementFacade mathActivityCenterdropdown;
    
    @FindBy(id = "grk/math_activity_center_se_9781328786838_/index.html#/landing")
    public WebElementFacade selectMAC_student;
    
    @FindBy(id = "certreview")
    public WebElementFacade EnvironmentCertView;
    
    @FindBy(xpath = "/html/body/div/div[5]/div/section[2]/div[3]/button")
    public WebElementFacade launchBtn;
    
    @FindBy(xpath = "//*[@class='student-container student-units-container']/div/div")
    public List <WebElementFacade> LessonTiles;

    @FindBy(id = "worksheet2")
    public WebElementFacade Lesson_WorksheetTab;
    
    @FindBy(xpath="//*[@class='student-lessons-container student-units-container']/div/div/div")
    public WebElementFacade LessonChallengeWorksheetTab;
    
    @FindBy(css = "div.student-primary")
    public WebElementFacade lessonPracticeTab;
    
    @FindBy(xpath="//*[@id='elem_student']/div[2]")
    public WebElementFacade lessonChallengeTab;
    
    @FindBy(xpath="//*[@id='elem_student']/div[3]")
    public WebElementFacade lessonChecksTab;
    
    @FindBy(xpath="//*[@id='elem_student']/div[4]")
    public WebElementFacade StudentMathReaderTab;
    
    @FindBy(xpath="//*[@id='elem_student']/div[5]")
    public WebElementFacade StudentGamesTab;
    
    @FindBy(xpath="//*[@id='elem_student']/div[6]")
    public WebElementFacade StudentFluencyPracticeTab;
     
    @FindBy(id="Unit1")
    public WebElementFacade unit1Tab;
    
    @FindBy(xpath="//*[@class='student-container student-units-container']/div/div")
    public List <WebElementFacade> unitTiles;
    
    @FindBy(xpath="//*[@class='unit-container']/div")
    public List <WebElementFacade> unitTabsSize;
    
    @FindBy(xpath="//*[@class='student-container student-units-container']/div/div")
    public List <WebElementFacade> MathReaderUnitTabs;
    
    @FindBy(xpath="//*[@id=\'dmc-main-container\']/practice/div/div/header-component/header/div[1]/div[2]/div/a")
    public WebElementFacade unitHeader;
    
    @FindBy(xpath="//*[@id='dmc-main-container']/challenge/div/div/header-component/header/div[1]/div[2]/div/a")
    public WebElementFacade unitHeaderChallenge;
    
    @FindBy(xpath="//*[@id=\'dmc-main-container\']/practice/div/div/header-component/header/div[1]/div[2]/a")
    public WebElementFacade lessonPracticeHeader;
    
    @FindBy(xpath="//*[@id='dmc-main-container']/challenge/div/div/header-component/header/div[1]/div[2]/a")
    public WebElementFacade lessonChallengeHeader;
    
    @FindBy(xpath="//*[@id=\'dmc-main-container\']/practice/div/div/header-component/header/div[1]/div[2]/div/div[2]")
    public WebElementFacade lessonHeader;
    
    @FindBy(xpath="//*[@id=\"dmc-main-container\"]/challenge/div/div/header-component/header/div[1]/div[2]/a")
    public WebElementFacade lessonHeaderforChallengeTab;
    
    @FindBy(xpath="//*[@id='dmc-main-container']/lessonchecks/div/div/header-component/header/div[1]/div[2]/a")
    public WebElementFacade lessonHeaderforLessonChecksTab;
    
    @FindBy(xpath="//*[@id=\'dmc-main-container\']/practice/div/div/header-component/header/div[1]/div[1]")
    public WebElementFacade MAC_logo;
    
    @FindBy(xpath="//*[@class='topnav-row']/div")
    public WebElementFacade MACLogo;
    
    // Teacher Drop down Selection
    
    @FindBy(id = "grk/math_activity_center_te_9781328786906_/index.html#/landing")
    public WebElementFacade selectMAC_teacher;
    
    @FindBy(xpath ="//*[@id='elem_teacher']/div[1]")
    public WebElementFacade teacherPracticeTab;
    
    @FindBy(xpath ="//*[@id='elem_teacher']/div[2]")
    public WebElementFacade teacherReteachTab;
    
    @FindBy(xpath ="//*[@id='elem_teacher']/div[3]")
    public WebElementFacade teacherChallengeTab;
    
    @FindBy(xpath ="//*[@id='elem_teacher']/div[5]")
    public WebElementFacade teacherFluencyBuildersTab;
    
    @FindBy(xpath ="//*[@id='elem_teacher']/div[6]")
    public WebElementFacade teacherGamesTab;
    
    @FindBy(xpath ="//*[@id='elem_teacher']/div[7]")
    public WebElementFacade teacherPMTLessonChecksTab;
    
    @FindBy(xpath ="//*[@id='elem_teacher']/div[8]")
    public WebElementFacade teacherActivityCardsTab;
    
    @FindBy(xpath ="//*[@id='elem_teacher']/div[9]")
    public WebElementFacade teacherMathReaderTab;
    
    @FindBy(xpath ="//*[@id='elem_teacher']/div[10]")
    public WebElementFacade teacherCenterPlanningGuideTab;
    
    @FindBy(xpath ="//*[@id='elem_teacher']/div[11]")
    public WebElementFacade teacherInquiryBasedTaskTab;
  
    @FindBy(id="contentMode")
    public WebElementFacade filterContent;
    
    @FindBy(xpath="//*[@class='dropbtn filter-drps ']/div")
    public WebElementFacade selectUnitDropdwn;
    
    @FindBy(xpath="//*[@id=\'UnitDropdown\']/div")
    public List <WebElementFacade> dropdwnOptionsTeacher;
    
    @FindBy(css="div#teacher")
    public WebElementFacade teacherEditionCheckbox;
    
    @FindBy(css="div#student")
    public WebElementFacade studentEditionCheckbox;
    
    @FindBy(css="div#onLevel")
    public WebElementFacade onLevelCheckbox;
    
    @FindBy(css="div#challenge")
    public WebElementFacade challengeCheckbox;
    
    @FindBy(css="div#gameboards")
    public WebElementFacade gameBaordsCheckbox;
    
    @FindBy(css="div#checks")
    public WebElementFacade fluencyCheckCheckbox;
    
    @FindBy(css="div#practice")
    public WebElementFacade fluencyPracticeCheckbox;
    
    @FindBy(xpath="//*[@class=\'disp-text-url\']/div")
    public List <WebElementFacade> selectedPDFsDownload;
    
    @FindBy(xpath="//*[@class='disp-text-url']/div")
    public List <WebElementFacade> openSelectedHTMLs;
    
    @FindBy(xpath="//*[@class='tile-data']")
    public List <WebElementFacade> openselectedHTMLMathReader;
    
    @FindBy(xpath="//*[@class='wide-tile wide-tile-mathreader']/div")
    public List <WebElementFacade> selectedPDFsDownloadInquiryTask;
    
    @FindBy(xpath="//*[@class='pagination next']")
    public WebElementFacade paginationNext;
    
    @FindBy(xpath="//*[@id=\'unit-text-dropdown\']")
    public WebElementFacade selectUnitNextOptions;
    
    @FindBy(xpath="//*[@id=\'unit-text-dropdown\']")
    public WebElementFacade selectUnitOptions;
    
    @FindBy(css="div.reset")
    public WebElementFacade reset;
    
    
    //Student Edition PDF Validation Methods
    
    public void handleWinAuthentication() {
    	String username = "hmh";
		String password = "L3(70r4!";
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys(username + Keys.TAB.toString()+password);
//		alert.accept();
    }
    
    public void navigateToDashboardPage() {
    	getDriver().get("https://hmh.lectoraonline.com/playground/MX2018/MXLauncher/");
    }
    
    public void navigateToHomePage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("The user is on Home Page", getURL_title.contains("MXLauncher"));
    }
    
    public void loginSuccess() {
    	Assert.assertTrue("User is able to Sucessfully Login", Gradegk.isDisplayed());
    }
    
    public void selectMathActivityOption() {
    	mathActivityCenterdropdown.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    	selectMAC_student.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }
    
    public void clickCretViewEnvironment() {
    	EnvironmentCertView.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }
    
    public void clickLaunchButton() {
    	String winHandel = getDriver().getWindowHandle();
		System.out.println(winHandel);
    	launchBtn.click();
    	for(String windowHandles:getDriver().getWindowHandles()) {
			System.out.println(windowHandles);
			getDriver().switchTo().window(windowHandles);
    	}
    }
    
    public void navigateToMathExpLaunchPage() {
    	String getURL_title1 = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Math Expression Page", getURL_title1.contains("landing"));
    }
     
    public void clickLessonPracticeTab() {
    	lessonPracticeTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    }
    
    public void clickLessonChallenegeTab() {
    	lessonChallengeTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    }
    
    public void clickLessonChecksTab() {
    	lessonChecksTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    }
    
    public void clickStudentMathReaderTab() {
    	StudentMathReaderTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    }
    
    public void clickStudentFluencyPracticeTab() {
    	StudentFluencyPracticeTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    }
    
    public void clickStudentGamesTab() {
    	StudentGamesTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    }
    
    public void navigateToLessonPracticePage() {
    	String getURL_title2 = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Math Expression Page", getURL_title2.contains("practice"));
    }
    
    public void navigateToLessonChallenegePage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Lesson Challenge Page", getURL_title.contains("challenge"));
    }
    
    public void navigateToLessonChecksPage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Lesson Checks Page", getURL_title.contains("lessonchecks"));
    }
    
    public void navigateToStudentMathReaderPage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Student Edition Math Reader Page", getURL_title.contains("mathreader"));
    }
    
    public void navigateToStudentFluencyPracticePage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Student Edition Fluency Practice Page", getURL_title.contains("fluencybuilders"));
    }
    
    public void navigateToStudentGamesPage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Student Edition Games Page", getURL_title.contains("games"));
    }
     
    public void clickOnUnitTabPractice() {
    	System.out.println(unitTiles.size());
    	for(int i=1; i<=unitTiles.size();i++) {
    		getDriver().findElement(By.id("Unit" + i)).click();
			System.out.println("Unit"+ i + " is clicked");
			for(WebElement lessonTile : LessonTiles) {
				try{
				String getLessonName = lessonTile.getText();
				lessonTile.click();
				Assert.assertTrue(getLessonName + " is clicked", lessonHeader.isDisplayed());
				Lesson_WorksheetTab.click();
				Thread.sleep(1000);
				readJsonFromFile pdfDownloadstatus = new readJsonFromFile();
				pdfDownloadstatus.downloadedPdfList();
				unitHeader.click();
				System.out.println("User navigate back to Lesson Practice Launch Page");
			}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			lessonPracticeHeader.click();
			System.out.println("User navigate back to Unit Practice Page");
		}  	
    }
    
    public void clickOnUnitTabChallenge() {
    	System.out.println(unitTiles.size());
    	for(int i=1; i<=unitTiles.size();i++) {
    		getDriver().findElement(By.id("Unit" + i)).click();
			System.out.println("Unit"+ i + " is clicked");
			for(WebElement lessonTile : LessonTiles) {
				try{
				String getLessonName = lessonTile.getText();
				lessonTile.click();
				Assert.assertTrue(getLessonName + " is clicked", lessonHeaderforChallengeTab.isDisplayed());
				Lesson_WorksheetTab.click();
				Thread.sleep(1000);
				readJsonFromFile pdfDownloadstatus = new readJsonFromFile();
				pdfDownloadstatus.downloadedChallengePdfListforStudent();
				unitHeaderChallenge.click();
				System.out.println("User navigate back to Lesson Challenge Launch Page");
			}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			lessonChallengeHeader.click();
			System.out.println("User navigate back to Unit Challenge Page");
		}
    }
    
    public void clickOnUnitTabLessonChecks() {
    	System.out.println(unitTabsSize.size());
    	for(int a=1;a<=unitTabsSize.size();a++) {
    		WebElement LessonChecksUnitTab = getDriver().findElement(By.xpath("//*[@class='unit-container']/div["+a+"]"));
    		LessonChecksUnitTab.click();
			System.out.println("Unit " +a+ " is clicked");
			for(WebElement lessonTile : LessonTiles) {
				try {
					String winhandel_HTML = getDriver().getWindowHandle();
    				System.out.println(winhandel_HTML);
    				String getLessonName = lessonTile.getText();
    				lessonTile.click();
    				Thread.sleep(1000);
    				System.out.println(getLessonName + " is clicked");
    				for(String windowHandels_HTML: getDriver().getWindowHandles()) {
    					getDriver().switchTo().window(windowHandels_HTML);		
    				}
    				Thread.sleep(1000);
    				String getURL = getDriver().getCurrentUrl();
    				try{					
    					Object obj = new JSONParser().parse(new FileReader("JSONFile\\DatafileLessonChecks.json"));
    					JSONObject jsonObject = (JSONObject) obj;
    					String gradeGK = (String) jsonObject.get("grade");
    					System.out.println(gradeGK);
    					JSONArray jasonArray = (JSONArray) jsonObject.get("teacher");
    					JSONObject jsonObject2 = (JSONObject) jasonArray.get(0);
    					JSONArray jasonArray2 = (JSONArray) jsonObject2.get("libraryItems");
    					JSONObject jsonObject3;
    					for(int i=0; i<jasonArray2.size(); i++) {
    						jsonObject3 = (JSONObject) jasonArray2.get(i);
    						String pdfName = (String) jsonObject3.get("HMH_ID");
    						if(getURL.contains(pdfName)) {
    							System.out.println("HTML file for Lesson Checks is opened in next tab with HMH_ID : " + pdfName);
    							Assert.assertTrue("HTML file for Lesson Checks is opened in next tab with HMH_ID : " + pdfName, getURL.contains(pdfName));
    						}
    					}

    				}

    				catch (FileNotFoundException e) {
    					e.printStackTrace();
    					System.out.println(e.getMessage());
    				}
    				catch (IOException e) {
    					e.printStackTrace();
    					System.out.println(e.getMessage());
    				}
    				catch (ParseException e) {
    					e.printStackTrace();
    					System.out.println(e.getMessage());
    				}

    				Thread.sleep(1000);
    				getDriver().close();
    				System.out.println("Current Window is closed");
    				getDriver().switchTo().window(winhandel_HTML);
    				String OriginalWindow_URL = getDriver().getTitle();
    				Assert.assertTrue("Control shifted back to Original Window", OriginalWindow_URL.contains("MX 2018"));
    				Thread.sleep(1000);
    			}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			lessonHeaderforLessonChecksTab.click();
			System.out.println("User navigate back to Lesson Checks Launch Page");
    	}
    }
    
    public void clickOnUnitTabMathReader() {
    	System.out.println(MathReaderUnitTabs.size());
    	for(WebElement MathReaderUnitTab : MathReaderUnitTabs) {
			try {	
				String winhandel_HTML = getDriver().getWindowHandle();
				System.out.println(winhandel_HTML);
			    	String getUnitName = MathReaderUnitTab.getText();
			    	MathReaderUnitTab.click();
					System.out.println(getUnitName + " is clicked");
    				Thread.sleep(500);
    				for(String windowHandels_HTML: getDriver().getWindowHandles()) {
    					getDriver().switchTo().window(windowHandels_HTML);		
    				}
    				Thread.sleep(1000);
    				String getURL = getDriver().getCurrentUrl();
    				try{					
    					Object obj = new JSONParser().parse(new FileReader("JSONfile\\DatafileMathReader.json"));
    					JSONObject jsonObject = (JSONObject) obj;
    					JSONArray jasonArray = (JSONArray) jsonObject.get("student");
    					JSONObject jsonObject2;
    					for(int i=0; i<jasonArray.size(); i++) {
    						jsonObject2 = (JSONObject) jasonArray.get(i);
    						String pdfName = (String) jsonObject2.get("relative_url");
    						if(getURL.contains(pdfName)) {
    							System.out.println("HTML file for Student Edition Math Reader is opened in next tab with URL : " + pdfName);
    							Assert.assertTrue("HTML file for Student Edition Math Reader is opened in next tab with URL : " + pdfName, getURL.contains(pdfName));
    						}
    					}

    				}

    				catch (FileNotFoundException e) {
    					e.printStackTrace();
    					System.out.println(e.getMessage());
    				}
    				catch (IOException e) {
    					e.printStackTrace();
    					System.out.println(e.getMessage());
    				}
    				catch (ParseException e) {
    					e.printStackTrace();
    					System.out.println(e.getMessage());
    				}

    				Thread.sleep(4000);
    				getDriver().close();
    				System.out.println("Current Window is closed");
    				getDriver().switchTo().window(winhandel_HTML);
    				String OriginalWindow_URL = getDriver().getTitle();
    				Assert.assertTrue("Control shifted back to Original Window", OriginalWindow_URL.contains("MX 2018"));
    				Thread.sleep(2000);
    			}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
    }
    
    public void clickOnUnitTabFluencyPractice() {
    	System.out.println(MathReaderUnitTabs.size());
    	for(WebElement FluencyPracticeUnitTab : MathReaderUnitTabs) {
			try {	
				String winhandel_HTML = getDriver().getWindowHandle();
				System.out.println(winhandel_HTML);
			    	String getUnitName = FluencyPracticeUnitTab.getText();
			    	FluencyPracticeUnitTab.click();
					System.out.println(getUnitName + " is clicked");
    				Thread.sleep(500);
    				for(String windowHandels_HTML: getDriver().getWindowHandles()) {
    					getDriver().switchTo().window(windowHandels_HTML);		
    				}
    				Thread.sleep(1000);
    				String getURL = getDriver().getCurrentUrl();
    				try{					
    					Object obj = new JSONParser().parse(new FileReader("JSONfile\\DatafileFluencyBuilder.json"));
    					JSONObject jsonObject = (JSONObject) obj;
    					JSONArray jasonArray = (JSONArray) jsonObject.get("student");
    					JSONObject jsonObject2;
    					for(int i=0; i<jasonArray.size(); i++) {
    						jsonObject2 = (JSONObject) jasonArray.get(i);
    						String pdfName = (String) jsonObject2.get("HMH_ID");
    						if(getURL.contains(pdfName)) {
    							System.out.println("HTML file for Student Edition Fluency Builder is opened in next tab with HMH_ID : " + pdfName);
    							Assert.assertTrue("HTML file for Student Edition Fluency Builder is opened in next tab with HMH_ID : " + pdfName, getURL.contains(pdfName));
    						}
    					}

    				}

    				catch (FileNotFoundException e) {
    					e.printStackTrace();
    					System.out.println(e.getMessage());
    				}
    				catch (IOException e) {
    					e.printStackTrace();
    					System.out.println(e.getMessage());
    				}
    				catch (ParseException e) {
    					e.printStackTrace();
    					System.out.println(e.getMessage());
    				}

    				Thread.sleep(4000);
    				getDriver().close();
    				System.out.println("Current Window is closed");
    				getDriver().switchTo().window(winhandel_HTML);
    				String OriginalWindow_URL = getDriver().getTitle();
    				Assert.assertTrue("Control shifted back to Original Window", OriginalWindow_URL.contains("MX 2018"));
    				Thread.sleep(1000);
    			}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
    }
    
    public void clickOnUnitTabGames() {
    	System.out.println(MathReaderUnitTabs.size());
    	for(WebElement GamesUnitTab : MathReaderUnitTabs) {
    		try {	
    			String winhandel_HTML = getDriver().getWindowHandle();
    			System.out.println(winhandel_HTML);
    			String getUnitName = GamesUnitTab.getText();
    			GamesUnitTab.click();
    			System.out.println(getUnitName + " is clicked");
    			Thread.sleep(500);
    			for(String windowHandels_HTML: getDriver().getWindowHandles()) {
    				getDriver().switchTo().window(windowHandels_HTML);		
    			}
    			Thread.sleep(1000);
    			String getURL = getDriver().getCurrentUrl();
    			String pdfName="content/hsp/math/mx2018/na/grk/math_activity_center_se_9781328786838_/";
    			if(getURL.contains(pdfName)) {
    				System.out.println("HTML file for Student Edition Games is opened in next tab with HMH_ID : " + pdfName);
    				Assert.assertTrue("HTML file for Student Edition Games is opened in next tab with HMH_ID : " + pdfName, getURL.contains(pdfName));
    			}
    			Thread.sleep(5000);
    			getDriver().close();
    			System.out.println("Current Window is closed");
    			getDriver().switchTo().window(winhandel_HTML);
    			String OriginalWindow_URL = getDriver().getTitle();
    			Assert.assertTrue("Control shifted back to Original Window", OriginalWindow_URL.contains("MX 2018"));
    		}
    		catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    }
    
    public void navigateToUnitLessonPage() {
    	Assert.assertTrue("User navigate to Unit Lesson Practice Page", ((WebElement) LessonTiles).isDisplayed() );
    }
    
    public void clickLessonTab() {
    	for(int j =1; j<=20;j++) {
			try{
			getDriver().findElement(By.id("Lesson" + j)).click();
			Thread.sleep(1000);
			clickLessonWorksheetTab();
			Thread.sleep(1000);
			unitHeader.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			navigateToUnitLessonPage();
			}
			catch(Exception e) {
				System.out.println("Lesson Tab is not Found!!");
			}
    	}
    }
    
    public void displayLessonWorksheetTab() {
    	Assert.assertTrue("User is displayed with Lesson11 Worksheet Tab", Lesson_WorksheetTab.isDisplayed());
    }
    
    public void clickLessonWorksheetTab() {
    	Lesson_WorksheetTab.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    }
    
    public void clickLessonWorkSheet() {
    	String winhandel_PDF = getDriver().getWindowHandle();
		System.out.println(winhandel_PDF);
		Lesson_WorksheetTab.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
		System.out.println("Lesson 11 Worksheet is clicked");
		for(String windowHandels_PDF: getDriver().getWindowHandles()) {
			System.out.println("windowHandels_PDF");
			getDriver().switchTo().window(windowHandels_PDF);		
		}
    	
    }
    
    public static boolean isFiledownload(String downloadPath, String fileName){
		boolean flag = false;
		File dir = new File(downloadPath);
		File[] dir_contents = dir.listFiles();
		
		for(int i =0; i < dir_contents.length; i++) {
			if(dir_contents[i].getName().equals(fileName))
				return flag = true;
		}
		
	return flag;
    }
        
    public void PDFdownloaddValidation() {
    	System.out.println("PDF file is downloaded sucessfully");
    }
    
    public void HTMLWorksheetValidationforLessonChecks() {
    	System.out.println("HTML Worksheet  for Lesson Checks is opened sucessfully in next Tab");
    }
    
    public void HTMLWorksheetValidationforMathReader() {
    	System.out.println("HTML Worksheet  for Student Edition Math Reader is opened sucessfully in next Tab");
    }
    
    public void HTMLWorksheetValidationforFluencyPractice() {
    	System.out.println("HTML Worksheet  for Student Edition Fluency Practice is opened sucessfully in next Tab");
    }
    
    public void HTMLWorksheetValidationforGames() {
    	System.out.println("HTML Worksheet  for Student Edition Games is opened sucessfully in next Tab");
    }
    
    
  //Teacher Edition PDF Validation Functions
    
    public void selectMathActivityOptionTeacher() {
    	mathActivityCenterdropdown.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    	selectMAC_teacher.withTimeoutOf(5, TimeUnit.SECONDS).waitUntilClickable().click();
    }
    
    public void clickTeacherPracticeTab() {
    	try {
    		Thread.sleep(4000);
    		teacherPracticeTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    	}
    	catch(Exception e) {
    		System.out.println("Element not Visible");
    	}
    }
    
    public void clickTeacherReteachTab() {
    	try {
    		Thread.sleep(4000);
    		teacherReteachTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    	}
    	catch(Exception e) {
    		System.out.println("Element not Visible");
    	}
    }
    
    public void navigateToLessonReteachTeacherPage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Reteach Landing Page", getURL_title.contains("reteach"));
    }
    
    public void clickTeacherChallengeTab() {
    	try {
    		Thread.sleep(4000);
    		teacherChallengeTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    	}
    	catch(Exception e) {
    		System.out.println("Element not Visible");
    	}
    }
    
    public void navigateToLessonChallengeTeacherPage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Challenge Landing Page", getURL_title.contains("challenge"));
    }
    
    public void clickTeacherActivityCardsTab() {
    	try {
    		Thread.sleep(4000);
    		teacherActivityCardsTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    	}
    	catch(Exception e) {
    		System.out.println("Element not Visible");
    	}
    }
    
    public void navigateToActivityCardsTeacherPage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Activity Cards Landing Page", getURL_title.contains("activitycards"));
    }
    
    public void clickTeacherIndepthInquiryTaskTab() {
    	try {
    		Thread.sleep(4000);
    		teacherInquiryBasedTaskTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    	}
    	catch(Exception e) {
    		System.out.println("Element not Visible");
    	}
    }
    
    public void navigateToInquirybasedTaskTeacherPage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Indepth Inquiry based Task Landing Page", getURL_title.contains("inquirybasedtasks"));
    }
    
    public void clickTeacherPlanningGuideTab() {
    	try {
    		Thread.sleep(4000);
    		teacherCenterPlanningGuideTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    	}
    	catch(Exception e) {
    		System.out.println("Element not Visible");
    	}
    }
    
    public void clickTeacherGamesTab() {
    	try {
    		Thread.sleep(4000);
    		teacherGamesTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    	}
    	catch(Exception e) {
    		System.out.println("Element not Visible");
    	}
    }
    
    public void navigateToGamesTeacherPage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Games Landing Page", getURL_title.contains("games"));
    }
    
    public void clickTeacherOnlineFluencyBuilderTab() {
    	try {
    		Thread.sleep(4000);
    		teacherFluencyBuildersTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    	}
    	catch(Exception e) {
    		System.out.println("Element not Visible");
    	}
    }
    
    public void navigateToFluencyBuilderTeacherPage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Games Landing Page", getURL_title.contains("fluencybuilders"));
    }
    
    public void clickTeacherPMTLessonChecksTab() {
    	try {
    		Thread.sleep(4000);
    		teacherPMTLessonChecksTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    	}
    	catch(Exception e) {
    		System.out.println("Element not Visible");
    	}
    }
    
    public void navigateToLessonChecksTeacherPage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Games Landing Page", getURL_title.contains("lessonchecks"));
    }
    
    public void clickTeacherMathReaderTab() {
    	try {
    		Thread.sleep(4000);
    		teacherMathReaderTab.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilClickable().click();
    	}
    	catch(Exception e) {
    		System.out.println("Element not Visible");
    	}
    }
    
    public void navigateToMathReaderTeacherPage() {
    	String getURL_title = getDriver().getCurrentUrl();
    	Assert.assertTrue("User navigate to Games Landing Page", getURL_title.contains("mathreader"));
    }
    
    public void clickWorksheetPDFTeacherEdition() {
    	selectUnitNextOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	System.out.println(dropdwnOptionsTeacher.size());
    	for(WebElement teacherDropdwnOption : dropdwnOptionsTeacher) {
			String getUnitName = teacherDropdwnOption.getText();
			System.out.println(getUnitName + " is Selected");
			teacherDropdwnOption.click();
			teacherEditionCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Teacher Checkbox is selected", teacherEditionCheckbox.isDisplayed());
			System.out.println(selectedPDFsDownload.size());
			for(WebElement TeacherselectedPDF : selectedPDFsDownload) {
				try {
					TeacherselectedPDF.click();
					Thread.sleep(1000);
					readJsonFromFile pdfDownloadstatus = new readJsonFromFile();
					pdfDownloadstatus.downaloadedPdfListforTeacher();
				}
				catch(Exception e) {
					JavascriptExecutor jse = (JavascriptExecutor)getDriver();
					jse.executeScript("window.scrollBy(0,-250)", "");
					paginationNext.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
					System.out.println("User Navigate to next Pagination page");
					TeacherselectedPDF.click();
				}
			}
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("window.scrollBy(0,-250)", "");
			teacherEditionCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Teacher Checkbox is deselected", teacherEditionCheckbox.isDisplayed());
			selectUnitNextOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
		}
    }
    
    public void clickWorksheetPDFStudentEdition() {
    	selectUnitNextOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	System.out.println(dropdwnOptionsTeacher.size());
    	for(WebElement studentDropdwnOption : dropdwnOptionsTeacher) {
			String getUnitName = studentDropdwnOption.getText();
			System.out.println(getUnitName + " is Selected");
			studentDropdwnOption.click();
			studentEditionCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Student Checkbox is selected", studentEditionCheckbox.isDisplayed());
			System.out.println(selectedPDFsDownload.size());
			for(WebElement StudentselectedPDF : selectedPDFsDownload) {
				try {
					StudentselectedPDF.click();
					Thread.sleep(1000);
					readJsonFromFile pdfDownloadstatus = new readJsonFromFile();
					pdfDownloadstatus.downaloadedPdfListforTeacher();
				}
				catch(Exception e) {
					JavascriptExecutor jse = (JavascriptExecutor)getDriver();
					jse.executeScript("window.scrollBy(0,-250)", "");
					paginationNext.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
					System.out.println("User Navigate to next Pagination page");
					StudentselectedPDF.click();
				}
			}
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("window.scrollBy(0,-250)", "");
			studentEditionCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Student Checkbox is deselected", studentEditionCheckbox.isDisplayed());
			selectUnitNextOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
		}
    }
    
    public void clickWorksheetPDFforReteachTeacherEdition() {
    	selectUnitNextOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	System.out.println(dropdwnOptionsTeacher.size());
    	for(WebElement teacherDropdwnOption : dropdwnOptionsTeacher) {
			String getUnitName = teacherDropdwnOption.getText();
			System.out.println(getUnitName + " is Selected");
			teacherDropdwnOption.click();
			teacherEditionCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Teacher Checkbox is selected", teacherEditionCheckbox.isDisplayed());
			System.out.println(selectedPDFsDownload.size());
			for(WebElement TeacherselectedPDF : selectedPDFsDownload) {
				try {
					TeacherselectedPDF.click();
					Thread.sleep(1000);
					readJsonFromFile pdfDownloadstatus = new readJsonFromFile();
					pdfDownloadstatus.downloadedReteachPdfListforTeacher();
				}
				catch(Exception e) {
					JavascriptExecutor jse = (JavascriptExecutor)getDriver();
					jse.executeScript("window.scrollBy(0,-250)", "");
					paginationNext.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
					System.out.println("User Navigate to next Pagination page");
					TeacherselectedPDF.click();
				}
			}
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("window.scrollBy(0,-250)", "");
			teacherEditionCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Teacher Checkbox is deselected", teacherEditionCheckbox.isDisplayed());
			selectUnitNextOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
		}
    }
    
    public void clickWorksheetPDFforReteachStudentEdition() {
    	selectUnitNextOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	System.out.println(dropdwnOptionsTeacher.size());
    	for(WebElement studentDropdwnOption : dropdwnOptionsTeacher) {
			String getUnitName = studentDropdwnOption.getText();
			System.out.println(getUnitName + " is Selected");
			studentDropdwnOption.click();
			studentEditionCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Student Checkbox is selected", studentEditionCheckbox.isDisplayed());
			System.out.println(selectedPDFsDownload.size());
			for(WebElement StudentselectedPDF : selectedPDFsDownload) {
				try {
					StudentselectedPDF.click();
					Thread.sleep(1000);
					readJsonFromFile pdfDownloadstatus = new readJsonFromFile();
					pdfDownloadstatus.downloadedReteachPdfListforTeacher();
				}
				catch(Exception e) {
					JavascriptExecutor jse = (JavascriptExecutor)getDriver();
					jse.executeScript("window.scrollBy(0,-250)", "");
					paginationNext.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
					System.out.println("User Navigate to next Pagination page");
					StudentselectedPDF.click();
				}
			}
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("window.scrollBy(0,-250)", "");
			studentEditionCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Student Checkbox is deselected", studentEditionCheckbox.isDisplayed());
			selectUnitNextOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
		}
    }
    
    public void clickWorksheetPDFforChallengeTeacherEdition() {
    	selectUnitNextOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	System.out.println(dropdwnOptionsTeacher.size());
    	for(WebElement teacherDropdwnOption : dropdwnOptionsTeacher) {
			String getUnitName = teacherDropdwnOption.getText();
			System.out.println(getUnitName + " is Selected");
			teacherDropdwnOption.click();
			teacherEditionCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Teacher Checkbox is selected", teacherEditionCheckbox.isDisplayed());
			System.out.println(selectedPDFsDownload.size());
			for(WebElement TeacherselectedPDF : selectedPDFsDownload) {
				try {
					TeacherselectedPDF.click();
					Thread.sleep(1000);
					readJsonFromFile pdfDownloadstatus = new readJsonFromFile();
					pdfDownloadstatus.downloadedChallengePdfListforTeacher();
				}
				catch(Exception e) {
					JavascriptExecutor jse = (JavascriptExecutor)getDriver();
					jse.executeScript("window.scrollBy(0,-250)", "");
					paginationNext.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
					System.out.println("User Navigate to next Pagination page");
					TeacherselectedPDF.click();
				}
			}
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("window.scrollBy(0,-250)", "");
			teacherEditionCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Teacher Checkbox is deselected", teacherEditionCheckbox.isDisplayed());
			selectUnitNextOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
		}
    }
    
    public void clickWorksheetPDFforChallengeStudentEdition() {
    	selectUnitNextOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	System.out.println(dropdwnOptionsTeacher.size());
    	for(WebElement studentDropdwnOption : dropdwnOptionsTeacher) {
			String getUnitName = studentDropdwnOption.getText();
			System.out.println(getUnitName + " is Selected");
			studentDropdwnOption.click();
			studentEditionCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Student Checkbox is selected", studentEditionCheckbox.isDisplayed());
			System.out.println(selectedPDFsDownload.size());
			for(WebElement StudentselectedPDF : selectedPDFsDownload) {
				try {
					StudentselectedPDF.click();
					Thread.sleep(1000);
					readJsonFromFile pdfDownloadstatus = new readJsonFromFile();
					pdfDownloadstatus.downloadedChallengePdfListforTeacher();
				}
				catch(Exception e) {
					JavascriptExecutor jse = (JavascriptExecutor)getDriver();
					jse.executeScript("window.scrollBy(0,-250)", "");
					paginationNext.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
					System.out.println("User Navigate to next Pagination page");
					StudentselectedPDF.click();
				}
			}
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("window.scrollBy(0,-250)", "");
			studentEditionCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Student Checkbox is deselected", studentEditionCheckbox.isDisplayed());
			selectUnitNextOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
		}
    }
    
    public void clickWorksheetPDFOnLevelEditionActivityCards() {
    	selectUnitOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	System.out.println(dropdwnOptionsTeacher.size());
    	for(WebElement teacherDropdwnOption : dropdwnOptionsTeacher) {
			String getUnitName = teacherDropdwnOption.getText();
			System.out.println(getUnitName + " is Selected");
			teacherDropdwnOption.click();
			onLevelCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("OnLevel Checkbox is selected", onLevelCheckbox.isDisplayed());
			System.out.println(selectedPDFsDownload.size());
			for(WebElement OnLevelselectedPDF : selectedPDFsDownload) {
				try {
					OnLevelselectedPDF.click();
					Thread.sleep(1000);
					readJsonFromFile pdfDownloadstatus = new readJsonFromFile();
					pdfDownloadstatus.downloadedActivityCardsPdfListforTeacher();
				}
				catch(Exception e) {
					JavascriptExecutor jse = (JavascriptExecutor)getDriver();
					jse.executeScript("window.scrollBy(0,-250)", "");
					paginationNext.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
					System.out.println("User Navigate to next Pagination page");
					OnLevelselectedPDF.click();
				}
			}
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("window.scrollBy(0,-250)", "");
			onLevelCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("OnLevel Checkbox is deselected", onLevelCheckbox.isDisplayed());
			selectUnitOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
		}
    }
    
    public void clickWorksheetPDFChallengeEditionActivityCards() {
    	selectUnitOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	System.out.println(dropdwnOptionsTeacher.size());
    	for(WebElement studentDropdwnOption : dropdwnOptionsTeacher) {
			String getUnitName = studentDropdwnOption.getText();
			System.out.println(getUnitName + " is Selected");
			studentDropdwnOption.click();
			challengeCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Challenge Checkbox is selected", challengeCheckbox.isDisplayed());
			System.out.println(selectedPDFsDownload.size());
			for(WebElement ChallengeselectedPDF : selectedPDFsDownload) {
				try {
					ChallengeselectedPDF.click();
					Thread.sleep(1000);
					readJsonFromFile pdfDownloadstatus = new readJsonFromFile();
					pdfDownloadstatus.downloadedActivityCardsPdfListforTeacher();
				}
				catch(Exception e) {
					JavascriptExecutor jse = (JavascriptExecutor)getDriver();
					jse.executeScript("window.scrollBy(0,-250)", "");
					paginationNext.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
					System.out.println("User Navigate to next Pagination page");
					ChallengeselectedPDF.click();
				}
			}
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
			jse.executeScript("window.scrollBy(0,-250)", "");
			challengeCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
			Assert.assertTrue("Challenge Checkbox is deselected", challengeCheckbox.isDisplayed());
			selectUnitOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
		}
    }
    
    public void clickWorksheetPDFIndepthInquiryTask() {
    	for(WebElement InquiryTaskselectedPDF : selectedPDFsDownloadInquiryTask) {
			try {
				InquiryTaskselectedPDF.click();
				Thread.sleep(1000);
				readJsonFromFile pdfDownloadstatus = new readJsonFromFile();
				pdfDownloadstatus.downloadedInquirybasedTaskPdfListforTeacher();
				Thread.sleep(400);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,-250)", "");
		Assert.assertTrue("Inquiry Task based PDF is downloaded successfully", MACLogo.isDisplayed());
		MACLogo.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
	}
    
    public void clickWorksheetPDFGamesBoardsforGamesTab() {
    	gameBaordsCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	Assert.assertTrue("Game Baords Checkbox is selected", gameBaordsCheckbox.isDisplayed());
    	System.out.println(selectedPDFsDownload.size());
    	for(WebElement GamesboardselectedPDF : selectedPDFsDownload) {
    		try {
    			GamesboardselectedPDF.click();
    			Thread.sleep(1000);
    			readJsonFromFile pdfDownloadstatus = new readJsonFromFile();
    			pdfDownloadstatus.downloadedGamesPdfListforTeacher();
    		}
    		catch(Exception e) {
    			JavascriptExecutor jse = (JavascriptExecutor)getDriver();
    			jse.executeScript("window.scrollBy(0,-250)", "");
    			paginationNext.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    			System.out.println("User Navigate to next Pagination page");
    			gameBaordsCheckbox.click();
    		}
    	}
    	JavascriptExecutor jse = (JavascriptExecutor)getDriver();
    	jse.executeScript("window.scrollBy(0,-250)", "");
    	gameBaordsCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	Assert.assertTrue("Challenge Checkbox is deselected", gameBaordsCheckbox.isDisplayed());
    }
    
    public void clickHTMLWorksheetFluencyChecksforFluencyBuilderTab() throws InterruptedException {
    	fluencyCheckCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	Assert.assertTrue("Fluency Check Checkbox is selected", fluencyCheckCheckbox.isDisplayed());
    	System.out.println(openSelectedHTMLs.size());
    	for(WebElement FluencyCheckselectedHTML : openSelectedHTMLs) {
    		String winhandel_HTML = getDriver().getWindowHandle();
    		System.out.println(winhandel_HTML);
    		FluencyCheckselectedHTML.click();
    		Thread.sleep(1000);
    		System.out.println("HTML File for Fluency Checks is clicked");
    		for(String windowHandels_HTML: getDriver().getWindowHandles()) {
    			getDriver().switchTo().window(windowHandels_HTML);		
    		}
    		Thread.sleep(1000);
    		String getURL = getDriver().getCurrentUrl();
    		try{					
    			Object obj = new JSONParser().parse(new FileReader("JSONFile\\DatafileFluencyBuilder.json"));
    			JSONObject jsonObject = (JSONObject) obj;
    			String gradeGK = (String) jsonObject.get("grade");
    			System.out.println(gradeGK);
    			JSONArray jasonArray = (JSONArray) jsonObject.get("teacher");
    			JSONObject jsonObject2 = (JSONObject) jasonArray.get(0);
    			JSONArray jasonArray2 = (JSONArray) jsonObject2.get("libraryItems");
    			JSONObject jsonObject3;
    			for(int i=0; i<jasonArray2.size(); i++) {
    				jsonObject3 = (JSONObject) jasonArray2.get(i);
    				String pdfName = (String) jsonObject3.get("HMH_ID");
    				if(getURL.contains(pdfName)) {
    					System.out.println("HTML file for Fluency Checks is opened in next tab with HMH_ID : " + pdfName);
    					Assert.assertTrue("HTML file for Fluency Checks is opened in next tab with HMH_ID: " + pdfName, getURL.contains(pdfName));
    				}
    			}

    		}

    		catch (FileNotFoundException e) {
    			e.printStackTrace();
    			System.out.println(e.getMessage());
    		}
    		catch (IOException e) {
    			e.printStackTrace();
    			System.out.println(e.getMessage());
    		}
    		catch (ParseException e) {
    			e.printStackTrace();
    			System.out.println(e.getMessage());
    		}

    		Thread.sleep(500);
    		getDriver().close();
    		System.out.println("Current Window is closed");
    		getDriver().switchTo().window(winhandel_HTML);
    		String OriginalWindow_URL = getDriver().getTitle();
    		Assert.assertTrue("Control shifted back to Original Window", OriginalWindow_URL.contains("MX 2018"));
    		Thread.sleep(1000);
    	}
    }
    
    public void clickHTMLWorksheetFluencyPracticeforFluencyBuilderTab() throws InterruptedException {
    	fluencyPracticeCheckbox.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	Assert.assertTrue("Fluency Practice Checkbox is selected", fluencyPracticeCheckbox.isDisplayed());
    	System.out.println(openSelectedHTMLs.size());
    	for(WebElement FluencyCheckselectedHTML : openSelectedHTMLs) {
    		String winhandel_HTML = getDriver().getWindowHandle();
    		System.out.println(winhandel_HTML);
    		FluencyCheckselectedHTML.click();
    		Thread.sleep(1000);
    		System.out.println("HTML File for Fluency Practice is clicked");
    		for(String windowHandels_HTML: getDriver().getWindowHandles()) {
    			getDriver().switchTo().window(windowHandels_HTML);		
    		}
    		Thread.sleep(1000);
    		String getURL = getDriver().getCurrentUrl();
    		try{					
    			Object obj = new JSONParser().parse(new FileReader("JSONFile\\DatafileFluencyBuilder.json"));
    			JSONObject jsonObject = (JSONObject) obj;
    			String gradeGK = (String) jsonObject.get("grade");
    			System.out.println(gradeGK);
    			JSONArray jasonArray = (JSONArray) jsonObject.get("teacher");
    			JSONObject jsonObject2 = (JSONObject) jasonArray.get(0);
    			JSONArray jasonArray2 = (JSONArray) jsonObject2.get("libraryItems");
    			JSONObject jsonObject3;
    			for(int i=0; i<jasonArray2.size(); i++) {
    				jsonObject3 = (JSONObject) jasonArray2.get(i);
    				String pdfName = (String) jsonObject3.get("HMH_ID");
    				if(getURL.contains(pdfName)) {
    					System.out.println("HTML file for Fluency Practice is opened in next tab with HMH_ID : " + pdfName);
    					Assert.assertTrue("HTML file for Fluency Practice is opened in next tab with HMH_ID : " + pdfName, getURL.contains(pdfName));
    				}
    			}

    		}

    		catch (FileNotFoundException e) {
    			e.printStackTrace();
    			System.out.println(e.getMessage());
    		}
    		catch (IOException e) {
    			e.printStackTrace();
    			System.out.println(e.getMessage());
    		}
    		catch (ParseException e) {
    			e.printStackTrace();
    			System.out.println(e.getMessage());
    		}

    		Thread.sleep(500);
    		getDriver().close();
    		System.out.println("Current Window is closed");
    		getDriver().switchTo().window(winhandel_HTML);
    		String OriginalWindow_URL = getDriver().getTitle();
    		Assert.assertTrue("Control shifted back to Original Window", OriginalWindow_URL.contains("MX 2018"));
    		Thread.sleep(1000);

    	}
    }
    
    public void clickHTMLWorksheetforLessonChecksTab() throws InterruptedException {
    	selectUnitOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	System.out.println(dropdwnOptionsTeacher.size());
    	for(WebElement lessonChecksDropdwnOption : dropdwnOptionsTeacher) {
    		String getUnitName = lessonChecksDropdwnOption.getText();
    		System.out.println(getUnitName + " is Selected");
    		lessonChecksDropdwnOption.click();
    		System.out.println(openSelectedHTMLs.size());
    		for(WebElement LessonCheckselectedHTML : openSelectedHTMLs) {
    			try {
    				String winhandel_HTML = getDriver().getWindowHandle();
    				System.out.println(winhandel_HTML);
    				LessonCheckselectedHTML.click();
    				Thread.sleep(1000);
    				System.out.println("HTML File for Lesson Checks is clicked");
    				for(String windowHandels_HTML: getDriver().getWindowHandles()) {
    					getDriver().switchTo().window(windowHandels_HTML);		
    				}
    				Thread.sleep(1000);
    				String getURL = getDriver().getCurrentUrl();
    				try{					
    					Object obj = new JSONParser().parse(new FileReader("JSONFile\\DatafileLessonChecks.json"));
    					JSONObject jsonObject = (JSONObject) obj;
    					String gradeGK = (String) jsonObject.get("grade");
    					System.out.println(gradeGK);
    					JSONArray jasonArray = (JSONArray) jsonObject.get("teacher");
    					JSONObject jsonObject2 = (JSONObject) jasonArray.get(0);
    					JSONArray jasonArray2 = (JSONArray) jsonObject2.get("libraryItems");
    					JSONObject jsonObject3;
    					for(int i=0; i<jasonArray2.size(); i++) {
    						jsonObject3 = (JSONObject) jasonArray2.get(i);
    						String pdfName = (String) jsonObject3.get("HMH_ID");
    						if(getURL.contains(pdfName)) {
    							System.out.println("HTML file for Lesson Checks is opened in next tab with HMH_ID : " + pdfName);
    							Assert.assertTrue("HTML file for Lesson Checks is opened in next tab with HMH_ID : " + pdfName, getURL.contains(pdfName));
    						}
    					}

    				}

    				catch (FileNotFoundException e) {
    					e.printStackTrace();
    					System.out.println(e.getMessage());
    				}
    				catch (IOException e) {
    					e.printStackTrace();
    					System.out.println(e.getMessage());
    				}
    				catch (ParseException e) {
    					e.printStackTrace();
    					System.out.println(e.getMessage());
    				}

    				Thread.sleep(500);
    				getDriver().close();
    				System.out.println("Current Window is closed");
    				getDriver().switchTo().window(winhandel_HTML);
    				String OriginalWindow_URL = getDriver().getTitle();
    				Assert.assertTrue("Control shifted back to Original Window", OriginalWindow_URL.contains("MX 2018"));
    				Thread.sleep(1000);
    			}
    			catch(Exception e) {
    				JavascriptExecutor jse = (JavascriptExecutor)getDriver();
    				jse.executeScript("window.scrollBy(0,-250)", "");
    				paginationNext.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    				System.out.println("User Navigate to next Pagination page");
    				LessonCheckselectedHTML.click();
    				Thread.sleep(1000);
    				getDriver().close();
    			}
    		}
    		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
    		jse.executeScript("window.scrollBy(0,-250)", "");
    		selectUnitOptions.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	}
    }
    
    public void clickHTMLWorksheetforMathReaderTab() throws InterruptedException {
	System.out.println(openselectedHTMLMathReader.size());
	for(WebElement MathReaderselectedHTML : openselectedHTMLMathReader) {
		String winhandel_HTML = getDriver().getWindowHandle();
		System.out.println(winhandel_HTML);
		MathReaderselectedHTML.click();
		Thread.sleep(1000);
		System.out.println("HTML File for Math Reader is clicked");
		for(String windowHandels_HTML: getDriver().getWindowHandles()) {
			getDriver().switchTo().window(windowHandels_HTML);		
		}
		Thread.sleep(1000);
		String getURL = getDriver().getCurrentUrl();
		try{					
			Object obj = new JSONParser().parse(new FileReader("JSONFile\\DatafileMathReader.json"));
			JSONObject jsonObject = (JSONObject) obj;
			String gradeGK = (String) jsonObject.get("grade");
			System.out.println(gradeGK);
			JSONArray jasonArray = (JSONArray) jsonObject.get("teacher");
			JSONObject jsonObject2 = (JSONObject) jasonArray.get(0);
			JSONArray jasonArray2 = (JSONArray) jsonObject2.get("libraryItems");
			JSONObject jsonObject3;
			for(int i=0; i<jasonArray2.size(); i++) {
				jsonObject3 = (JSONObject) jasonArray2.get(i);
				String pdfName = (String) jsonObject3.get("relative_url");
				if(getURL.contains(pdfName)) {
					System.out.println("HTML file for Math Reader is opened in next tab with URL : " + pdfName);
					Assert.assertTrue("HTML file for Math Reader is opened in next tab with URL: " + pdfName, getURL.contains(pdfName));
				}
			}

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (ParseException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		Thread.sleep(5000);
		getDriver().close();
		System.out.println("Current Window is closed");
		getDriver().switchTo().window(winhandel_HTML);
		String OriginalWindow_URL = getDriver().getTitle();
		Assert.assertTrue("Control shifted back to Original Window", OriginalWindow_URL.contains("MX 2018"));
		Thread.sleep(1000);
	}
}
     
    public void PDFdownloadValidationforTeacherEdition() {
    	System.out.println("PDF file is downloaded sucessfully");
    }
    
    public void PDFdownloadValidationforStudentEdition() {
    	System.out.println("PDF file is downloaded sucessfully");
    }
    
    public void PDFdownloadValidationforOnLevelEdition() {
    	System.out.println("PDF file for OnLevel Checkbox is downloaded sucessfully");
    }
    
    public void PDFdownloadValidationforChallengeEdition() {
    	System.out.println("PDF file for Challenge Checkbox is downloaded sucessfully");
    }
    
    public void PDFdownloadValidationforIndepthInquiryTask() {
    	System.out.println("PDF file for Inquiry based Task is downloaded sucessfully");
    }
    
    public void PDFdownloadValidationforCenterPlanningGuide() {
    	readJsonFromFile pdfDownloadstatus = new readJsonFromFile();
		pdfDownloadstatus.downloadedInquirybasedTaskPdfListforTeacher();
		Assert.assertTrue("PDF file for Center Planning Guide is downloaded", teacherCenterPlanningGuideTab.isDisplayed());
    	System.out.println("PDF file for Center Planning Guide is downloaded sucessfully");
    }
    
    public void PDFdownloadValidationforGameBaordsCheckbox() {
    	System.out.println("PDF file for Games Baords Checkbox is downloaded sucessfully");
    }
    
    public void HTMLValidationforFluencyCheckCheckbox() {
    	System.out.println("HTML file for FluencyCheck Checkbox is open sucessfully in next tab");
    }
    
    public void HTMLValidationforFluencyPracticeCheckbox() {
    	System.out.println("HTML file for FluencyPractice Checkbox is open sucessfully in next tab");
    }
    
    public void HTMLValidationforLessonChecks() {
    	System.out.println("HTML file for Lesson Checks is open sucessfully in next tab");
    }
    
    public void HTMLValidationforMathReader() {
    	System.out.println("HTML file for Math Readers is open sucessfully in next tab");
    }
    
    public void clickResetButton() {
    	reset.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().click();
    	Assert.assertTrue("Reset Button is clicked", reset.isDisplayed());
    }
    
}

