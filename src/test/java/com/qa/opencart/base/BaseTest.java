package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountPage;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {

	DriverFactory du;
	protected Properties prop;
	
	WebDriver driver;
	protected LoginPage loginPage;
	protected AccountPage accPage;

	@BeforeTest

	public void setup() {
		du = new DriverFactory();
		prop=du.intProp();
		driver= du.initDriver(prop);
		loginPage = new LoginPage(driver);

	}

	@AfterTest
	public void tearDown() {
		driver.close();

	}

}
