package com.goibibo.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.goibibo.qa.base.TestBase;
import com.goibibo.qa.pages.FlightsPage;
import com.goibibo.qa.pages.ResultPage;

public class ResultPageTest extends TestBase {

	FlightsPage fp;
	ResultPage rp;

	public ResultPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		fp = new FlightsPage();
		fp.searchFlights(prop.getProperty("source"), prop.getProperty("Destination"));
	}

	@Test
	public void bookTicket()  {
		rp.clickBookBtn();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
