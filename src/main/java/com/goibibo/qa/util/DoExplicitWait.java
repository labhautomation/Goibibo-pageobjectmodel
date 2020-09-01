package com.goibibo.qa.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.goibibo.qa.base.TestBase;

public class DoExplicitWait extends TestBase {
	
	public static void ExplicitWait(WebElement element){
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
