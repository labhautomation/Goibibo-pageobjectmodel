package com.goibibo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.goibibo.qa.base.TestBase;

public class TravellerDetailsPage extends TestBase {

	@FindBy(id = "Adulttitle1")
	WebElement nameTitle;

	@FindBy(id = "AdultfirstName1")
	WebElement firstName;

	@FindBy(id = "AdultlastName1")
	WebElement lastName;

	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "mobile")
	WebElement mobNum;

	@FindBy(xpath = "//div[text()='Proceed ']")
	WebElement proceedBtn;

	@FindBy(xpath = "//div[@id='insCard']//input[@id='secure-trip']")
	WebElement secureTrip;

	public TravellerDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public ProceedToPaymentPage clickToProceed(String title, String firstname, String lastname, String emailid,
			String num) {

		secureTrip.click();

		Select sel = new Select(nameTitle);
		sel.selectByVisibleText(title);
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		email.sendKeys(emailid);
		mobNum.sendKeys(num);
		proceedBtn.click();

		return new ProceedToPaymentPage();

	}

}
