package com.goibibo.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.goibibo.qa.base.TestBase;
import com.goibibo.qa.pages.FlightsPage;
import com.goibibo.qa.pages.ResultPage;
import com.goibibo.qa.pages.TravellerDetailsPage;

public class TravellerDetailsPageTest extends TestBase {

	FlightsPage fp;
	ResultPage rp;
	TravellerDetailsPage tdp;

	public TravellerDetailsPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		fp = new FlightsPage();
		fp.searchFlights(prop.getProperty("source"), prop.getProperty("Destination"));
		rp = new ResultPage();
		rp.clickBookBtn();
	}

	@Test
	public void proceedBtn() {
		tdp = new TravellerDetailsPage();
		tdp.clickToProceed(prop.getProperty("TitleMale"), prop.getProperty("firstname"), prop.getProperty("lastname"),
				prop.getProperty("email"), prop.getProperty("mobile"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
