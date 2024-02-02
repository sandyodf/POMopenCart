package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AccountPage {

	private static WebDriver driver;
	private By accountRightPaneLinks = By.cssSelector("div.list-group a");

	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getAccPageTitle() {
		String title = driver.getTitle();

		return title;
	}

	public String getAccpageUrl() {
		String url = driver.getCurrentUrl();

		return url;
	}
	
	public List<WebElement> getaccountRightPaneLinks(){
		return driver.findElements(accountRightPaneLinks);
	}
	
	public void clickOnAccountElements(String link) {
		
		List<WebElement>accountLinksElements= getaccountRightPaneLinks();
		
		for (WebElement element : accountLinksElements) {
			if(element.getText().equals(link)) {
				element.click();
			}
			}
			
			
		
	}
	
	
	
	
	
	

}
