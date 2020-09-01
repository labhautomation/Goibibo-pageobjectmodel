package com.goibibo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.qa.base.TestBase;

public class ProceedToPaymentPage extends TestBase {

	@FindBy(xpath = "//button[text()='OK']")
	WebElement okBtn;

	@FindBy(xpath = "//span[text()='Proceed To Payment']")
	WebElement proceedPaymentBtn;

	public ProceedToPaymentPage() {
		PageFactory.initElements(driver, this);
	}

	public PaymentDetailsPage clickProceedPaymentBtn() {

		okBtn.click();
		proceedPaymentBtn.click();

		return new PaymentDetailsPage();

	}

}
