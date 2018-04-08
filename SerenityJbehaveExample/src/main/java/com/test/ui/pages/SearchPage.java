package com.test.ui.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.test.ui.utils.WebElementFunctions;
import com.test.ui.utils.Util;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class SearchPage extends PageObject {
	
	EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
	
	public SearchPage(final WebDriver driver)
	{
		super(driver);
	}
	
	public void navigateToGooglePage()
	{
		//getDriver().get(System.getProperty("webdriver.base.url"));		
		String url = variables.getProperty("webdriver.base.url");
		getDriver().get(url);
	}
	
	public void enterSearchText(String searchText) 
	{
		try {
			WebElementFunctions.tb_EnterText(Util.getXpath(getClass().getSimpleName(),"searchTextBox"),searchText,getDriver());
			WebElementFunctions.btn_Click(Util.getXpath(getClass().getSimpleName(),"searchButton"),getDriver());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void searchLinkDisplayed() {
		try {
			assertThat("searched record link is not displayed",WebElementFunctions.isWebElementDisplayed(Util.getXpath(getClass().getSimpleName(),"searchedRecordLink"), getDriver()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
