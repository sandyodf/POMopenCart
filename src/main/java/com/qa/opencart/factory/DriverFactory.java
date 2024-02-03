package com.qa.opencart.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;
	public static Properties prop;
	public OptionsManager optionsManager;
	public static String hightlight;

	public WebDriver initDriver(Properties prop) {

		optionsManager = new OptionsManager(prop);

		String browserName = prop.getProperty("browser").trim().toLowerCase();

		hightlight = prop.getProperty("hightlight");

		String url = prop.getProperty("url");
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(optionsManager.getChromeOptions());
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(url);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(optionsManager.getFireFoxOptions());

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(url);
			break;
		default:
			System.out.println("Enter valid browser !!" + browserName + "is not valid browser");
			break;
		}
		return driver;

	}

	public Properties intProp() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return prop;

	}

}
