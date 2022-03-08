package com.ea.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameworkInitialize extends Base {
    public void initializeBrowser(BrowserType browserType) {
        WebDriver driver = null;
        switch (browserType) {
            case Chrome: {
                driver = new ChromeDriver();
                break;
            }
            case Firefox: {
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\JananiKannan\\OneDrive - The Testing Consultancy\\Desktop\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            }
        }
        //Set the driver
        DriverContext.setDriver(driver);
        //Browser
        DriverContext.Browser = new Browser(driver);

    }

}
