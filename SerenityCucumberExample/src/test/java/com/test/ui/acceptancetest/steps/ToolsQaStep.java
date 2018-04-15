package com.test.ui.acceptancetest.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

import com.test.ui.lang.Credentials;
import com.test.ui.pages.SearchPage;
import com.test.ui.pages.ToolsQaPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;

public class ToolsQaStep extends ScenarioSteps {
	
	private ToolsQaPage toolsQaPage;
	
	public ToolsQaStep(final Pages pages) {
		super(pages);
		this.toolsQaPage=getPages().get(ToolsQaPage.class);		
	}    
    
    @Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		this.toolsQaPage.navigateToToolsQaPage();
	}
    
    @When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		this.toolsQaPage.navigateToLoginPage();
	}
    
    @When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
		this.toolsQaPage.loginToToolsQaDemoPage(username, password);
	}
    
    @Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}
    
    @When("^User enters Credentials to LogIn$")
	public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable { 		
		List<List<String>> data = usercredentials.raw();	    
	    this.toolsQaPage.loginToToolsQaDemoPage(data.get(0).get(0), data.get(0).get(1));
	}
    
    @When("^User enters LogIn Credentials$")
	public void user_enters_testuser_and_Test(List<Credentials>  usercredentials) throws Throwable {		
		for (Credentials credentials : usercredentials) {			
		    this.toolsQaPage.loginToToolsQaDemoPage(credentials.getUsername(),credentials.getPassword());
			}		
	}

}
