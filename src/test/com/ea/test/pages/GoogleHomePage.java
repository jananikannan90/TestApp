package com.ea.test.pages;

import com.ea.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.openqa.selenium.support.How.LINK_TEXT;

public class GoogleHomePage extends BasePage {
    public GoogleHomePage() {

    }

    @FindBy(how = How.XPATH, using = "//input[@title='Search']")
    public WebElement searchTextBox;

    @FindBy(how = How.XPATH, using = "(//input[@value='Google Search'])[2]")
    public WebElement searchButton;


    public void enterSearchKeyword(String keyword) {
      searchTextBox.sendKeys(keyword);
    }

    public GoogleSearchResultsPage search() {
        searchButton.click();
        return GetInstance(GoogleSearchResultsPage.class);
    }


}
