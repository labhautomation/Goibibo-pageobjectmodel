package com.goibibo.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.goibibo.qa.base.TestBase;
import com.goibibo.qa.pages.FlightsPage;

public class FlightPageTest extends TestBase {

	FlightsPage fp;

	public FlightPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		fp = new FlightsPage();
	}

	@Test
	public void searchflights() {

		fp.searchFlights(prop.getProperty("source"), prop.getProperty("Destination"));

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
