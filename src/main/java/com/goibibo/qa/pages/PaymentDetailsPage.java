package com.goibibo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.qa.base.TestBase;

public class PaymentDetailsPage extends TestBase {
	
	@FindBy(xpath="//span[text()='Wallets']")
	WebElement walletsMenu;
	
	
	public PaymentDetailsPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickPay(){
		
		walletsMenu.click();
	}

}
