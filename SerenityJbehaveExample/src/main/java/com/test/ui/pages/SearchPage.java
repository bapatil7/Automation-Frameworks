package com.test.ui.pages;

import org.openqa.selenium.WebDriver;

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

}
