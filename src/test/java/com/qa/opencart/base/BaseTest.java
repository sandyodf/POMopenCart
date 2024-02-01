package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {

	DriverFactory du;
	WebDriver driver;
	protected LoginPage loginPage;

	@BeforeTest

	public void setup() {
		du = new DriverFactory();
		driver= du.initDriver("chrome");
		loginPage = new LoginPage(driver);

	}

	@AfterTest
	public void tearDown() {
		driver.close();

	}

}
