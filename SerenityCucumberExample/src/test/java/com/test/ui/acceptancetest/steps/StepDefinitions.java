package com.test.ui.acceptancetest.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.test.ui.pages.SearchPage;

import cucumber.api.java.en.And;

public class StepDefinitions extends ScenarioSteps {
	
	private SearchPage searchPage;
	
	public StepDefinitions(final Pages pages) {
		super(pages);
		this.searchPage=getPages().get(SearchPage.class);		
	}
	
    @When("^user navigates to google page$")
    public void user_navigates_to_google_page() throws Throwable {
    	this.searchPage.navigateToGooglePage();
    }

    @When("^performs search with \"(.*)\"$")
    public void performs_search_with(String searchText) throws Throwable {
    	this.searchPage.enterSearchText(searchText);
    }

    @Then("^valid search link is displayed$")
    public void valid_search_link_is_displayed() throws Throwable {
    	this.searchPage.searchLinkDisplayed();
    }

}
