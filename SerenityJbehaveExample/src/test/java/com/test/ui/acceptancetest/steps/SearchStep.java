package com.test.ui.acceptancetest.steps;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.test.ui.pages.SearchPage;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchStep extends ScenarioSteps{

	private static Logger testLogs=LogManager.getLogger(SearchStep.class);
	private SearchPage searchPage;
	
	public SearchStep(final Pages pages) {
		super(pages);
		this.searchPage=getPages().get(SearchPage.class);		
	}
	
	@When("user navigates to google page")
	public void navigateToGooglePage()
	{
		this.searchPage.navigateToGooglePage();
	}
	
	@When("performs search with '$searchText'")	
	public void performsSearchWith(final @Named("searchText") String searchText) throws IOException {
	  this.searchPage.enterSearchText(searchText);
	}
	
	@When("performs search with is $searchText")
	public void performsSearchWith1(final @Named("searchText") String searchText) {
		this.searchPage.enterSearchText(searchText);
	}
	
	@Then("valid search link is displayed")	
	public void validSearchLinkIsDisplayed() {
	  this.searchPage.searchLinkDisplayed();
	}
}
