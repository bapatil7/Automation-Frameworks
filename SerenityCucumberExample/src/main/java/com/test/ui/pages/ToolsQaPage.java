package com.test.ui.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.ui.utils.WebElementFunctions;
import com.test.ui.lang.PPConstants;
import com.test.ui.utils.Util;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class ToolsQaPage extends PageObject {
	
	@FindBy(css=".multiple > li:nth-child(3)")
	private WebElement kpwbanner;
	
	//EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
	
	public ToolsQaPage(final WebDriver driver)
	{
		super(driver);
	}
	
	public void navigateToGooglePage()
	{
		getDriver().get(System.getProperty("webdriver.base.url"));		
		//String url = variables.getProperty("webdriver.base.url");
		//getDriver().get(url);
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
	
	public boolean checkKPWBanner() {
		return this.kpwbanner.getText().equalsIgnoreCase(PPConstants.LABEL_FASTERPAYMENT);
	}
	
	public void navigateToToolsQaPage()
	{
		getDriver().get("http://www.store.demoqa.com");		
		//String url = variables.getProperty("webdriver.base.url");
		//getDriver().get(url);
	}
	
	public void navigateToLoginPage() {
		try {
			WebElementFunctions.btn_Click(Util.getXpath(getClass().getSimpleName(),"loginLink"),getDriver());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loginToToolsQaDemoPage(String userName,String password)
	{
		try {
			WebElementFunctions.tb_EnterText(Util.getXpath(getClass().getSimpleName(),"userNameTxtBox"),userName,getDriver());
			WebElementFunctions.tb_EnterText(Util.getXpath(getClass().getSimpleName(),"passwordTxtBox"),password,getDriver());
			WebElementFunctions.btn_Click(Util.getXpath(getClass().getSimpleName(),"loginButton"),getDriver());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
