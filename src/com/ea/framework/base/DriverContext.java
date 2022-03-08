package com.ea.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DriverContext {
    public static WebDriver Driver;
    public static Browser Browser;

    public static void setDriver(WebDriver driver) {
        Driver = driver;
    }

    public static void WaitForElementVisible(final WebElement elementFindBy) {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(elementFindBy));
    }

}
