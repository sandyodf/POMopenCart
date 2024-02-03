package com.qa.opencart.factory;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionsManager {
	
	private Properties prop;
	private ChromeOptions co;
	private FirefoxOptions fo;
	
	public OptionsManager(Properties prop) {
		this.prop=new Properties();
		
	}
	
	public ChromeOptions getChromeOptions() {
		co = new ChromeOptions();
		 if (Boolean.parseBoolean(prop.getProperty("headless"))) {
			 System.out.println("==running chrome in headless mode===");
			 co.addArguments("--headless");
		}
		 if (Boolean.parseBoolean(prop.getProperty("incognitowindow"))) {
			 System.out.println("==running chrome in "+"incognitowindow " +"mode===");
			 co.addArguments("--incognito");
		}
		
	
		return co;
		
	}
	
	
	public FirefoxOptions getFireFoxOptions() {
		fo = new FirefoxOptions();
		 if (Boolean.parseBoolean(prop.getProperty("headless"))) {
			 System.out.println("==running firefox in headless mode===");
			 fo.addArguments("--headless");
		}
		 if (Boolean.parseBoolean(prop.getProperty("privateWindow"))) {
			 System.out.println("==running firefox in "+"privatewindow " +"mode===");
			 co.addArguments("--private");
		}
		
		
		
		return fo;
	
	}
	
	
	

}
