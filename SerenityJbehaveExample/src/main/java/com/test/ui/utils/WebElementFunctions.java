package com.test.ui.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementFunctions {
public static void tb_EnterText(String xpath,String textToEnter,WebDriver driver){
	driver.findElement(By.xpath(xpath)).clear();
	driver.findElement(By.xpath(xpath)).sendKeys(textToEnter);
}

public static void btn_Click(String xpath,WebDriver driver) {
	driver.findElement(By.xpath(xpath)).click();
}

public static boolean isWebElementDisplayed(String xpath,WebDriver driver) {
	return driver.findElement(By.xpath(xpath)).isDisplayed();
}

}
