package com.goibibo.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.qa.base.TestBase;
import com.goibibo.qa.util.CalenderUtil;
import com.goibibo.qa.util.DoExplicitWait;

public class FlightsPage extends TestBase {

	@FindBy(id = "gosuggest_inputSrc")
	WebElement src;

	@FindBy(id = "gosuggest_inputDest")
	WebElement des;

	@FindBy(id = "departureCalendar")
	WebElement depCal;

	@FindBy(id = "returnCalendar")
	WebElement rtrnCal;

	@FindBy(id = "roundTrip")
	WebElement roundTrp;

	@FindBy(id = "gi_search_btn")
	WebElement searchBtn;

	// PageFactory:

	public FlightsPage() {

		PageFactory.initElements(driver, this);
	}

	// Actions

	public ResultPage searchFlights(String source, String destination) {
		Actions act = new Actions(driver);
		act.moveToElement(src).click();
		act.sendKeys(source).perform();
		DoExplicitWait.ExplicitWait(src);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		DoExplicitWait.ExplicitWait(src);
		act.sendKeys(Keys.ENTER).perform();
		
		act.moveToElement(des).click();
		act.sendKeys(destination).perform();
		DoExplicitWait.ExplicitWait(des);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		DoExplicitWait.ExplicitWait(des);
		act.sendKeys(Keys.ENTER).perform();
		CalenderUtil.CalenderPopup();
		searchBtn.click();

		return new ResultPage();

	}

}
