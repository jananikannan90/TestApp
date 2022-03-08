package com.ea.test.steps;

import com.ea.test.pages.GoogleHomePage;
import com.ea.test.pages.GoogleSearchResultsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static com.ea.framework.base.Base.CurrentPage;
import static com.ea.framework.base.Base.GetInstance;

public class SearchSteps {
    @Given("^I search with the keyword (.+)$")
    public void searchWithKeyword(String keyword) throws InterruptedException {
        CurrentPage = GetInstance(GoogleHomePage.class);
        CurrentPage.As(GoogleHomePage.class).enterSearchKeyword(keyword);
        CurrentPage = CurrentPage.As(GoogleHomePage.class).search();
    }

    @Then("^Search results should have a link to (.+)$")
    public void verifyLinkToUrl(String url) {
        Assert.assertTrue("The url " + url + "is not displayed", CurrentPage.As(GoogleSearchResultsPage.class).checkWhetherlinkIsPresent(url));
    }
}
