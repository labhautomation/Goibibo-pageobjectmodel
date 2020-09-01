package com.goibibo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.qa.base.TestBase;
import com.goibibo.qa.util.DoExplicitWait;

public class ResultPage extends TestBase {

	@FindBy(id = "PRICE")
	WebElement price;

	@FindBy(xpath = "(//span[@class='custRad'])[1]")
	WebElement selectFlight;

	@FindBy(css = "input[type='button']")
	WebElement bookBtn;

	public ResultPage() {
		PageFactory.initElements(driver, this);
	}

	public TravellerDetailsPage clickBookBtn() {
		price.click();
		selectFlight.click();
		DoExplicitWait.ExplicitWait(bookBtn);
		bookBtn.click();

		return new TravellerDetailsPage();
	}

}
