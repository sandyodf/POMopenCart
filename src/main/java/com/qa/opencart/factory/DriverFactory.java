package com.qa.opencart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		
		System.out.println("Selected browser is "+browserName+" in general mode");
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		default:
			System.out.println("Enter valid browser !!"+browserName+"is not valid browser");
			break;
		}
		return driver;
		
	}

}
