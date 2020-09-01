package com.goibibo.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.goibibo.qa.base.TestBase;
import com.goibibo.qa.pages.FlightsPage;
import com.goibibo.qa.pages.ProceedToPaymentPage;
import com.goibibo.qa.pages.ResultPage;
import com.goibibo.qa.pages.TravellerDetailsPage;

public class ProceedToPaymentPageTest extends TestBase {

	FlightsPage fp;
	ResultPage rp;
	TravellerDetailsPage tdp;
	ProceedToPaymentPage ptpp;

	public ProceedToPaymentPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		fp = new FlightsPage();
		fp.searchFlights(prop.getProperty("source"), prop.getProperty("Destination"));
		rp = new ResultPage();
		rp.clickBookBtn();
		tdp = new TravellerDetailsPage();
		tdp.clickToProceed(prop.getProperty("TitleMale"), prop.getProperty("firstname"), prop.getProperty("lastname"),
				prop.getProperty("email"), prop.getProperty("mobile"));

	}

	@Test
	public void proceedPayment() {
		ptpp = new ProceedToPaymentPage();
		ptpp.clickProceedPaymentBtn();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
