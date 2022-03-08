package com.ea.test.pages;

import com.ea.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearchResultsPage extends BasePage {
    public GoogleSearchResultsPage() {
    }

    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "www.maui-rentals.com")
    public WebElement mauiRentalsLink;

    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "www.britz.com")
    public WebElement britzRentalsLink;


    public boolean checkWhetherlinkIsPresent(String url) {
        if (url.toLowerCase().contains("maui")) {
            return mauiRentalsLink.isDisplayed();
        } else if (url.toLowerCase().contains("britz")) {
            return britzRentalsLink.isDisplayed();
        } else {
            return false;
        }
    }
}
