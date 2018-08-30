package com.hmhco.hmhqe.pages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.json.simple.parser.ParseException;

import net.serenitybdd.core.pages.PageObject;

public class writeJsontoFile extends PageObject {
		public static String filePath;
		public static String filename;
		public void getTheLogs() throws JSONException, IOException, ParseException, InterruptedException {
	        for (int n = 0; n <= 1; n++) {
	            Actions actions = new Actions(getDriver());
	            actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
	            Thread.sleep(3000);
	            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	            LogEntries entries = getDriver().manage().logs().get(LogType.PERFORMANCE);

//	            Actions actions2 = new Actions(getDriver());
//	            actions2.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();

	            for (LogEntry entry : entries.getAll()) {
	            	System.out.println(entry.getMessage());
	                if (entry.getMessage().contains("XHR")) {
						File file = new File(filename);
	                    FileWriter fw = new FileWriter(file.getName(), true); // the true will append the new data
	                    filePath = file.getAbsolutePath();
	                    System.out.println(filePath);
	                    fw.write(entry.getMessage() + "\n");// appends the string to the file
	                    fw.close();

	                }
	            }
	        }
	}

		
}
