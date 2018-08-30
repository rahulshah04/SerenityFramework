package com.hmhco.hmhqe.customdrivers;

import io.github.bonigarcia.wdm.OperaDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

/**
 * Created by graced on 14/12/2016.
 */
public class CustomOperaDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        OperaDriverManager.getInstance().setup();
        return new OperaDriver();
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}

