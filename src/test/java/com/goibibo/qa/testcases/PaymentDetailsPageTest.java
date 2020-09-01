package com.goibibo.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.goibibo.qa.base.TestBase;
import com.goibibo.qa.pages.FlightsPage;
import com.goibibo.qa.pages.PaymentDetailsPage;
import com.goibibo.qa.pages.ProceedToPaymentPage;
import com.goibibo.qa.pages.ResultPage;
import com.goibibo.qa.pages.TravellerDetailsPage;

public class PaymentDetailsPageTest extends TestBase {

	FlightsPage fp;
	ResultPage rp;
	TravellerDetailsPage tdp;
	ProceedToPaymentPage ptpp;
	PaymentDetailsPage pdp;

	public PaymentDetailsPageTest() {
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
		ptpp = new ProceedToPaymentPage();
		ptpp.clickProceedPaymentBtn();

	}

	@Test
	public void clickPayNow() {
		pdp = new PaymentDetailsPage();
		pdp.clickPay();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
