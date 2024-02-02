package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.ElementUtil;


public class AccountPage {

	private static WebDriver driver;
	private ElementUtil elementUtil;
	private By accountRightPaneLinks = By.cssSelector("div.list-group a");

	public AccountPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtil=new ElementUtil(driver);
	}

	public String getAccPageTitle() {
//		String title = driver.getTitle();
		String title = elementUtil.waitForTitleIsAndFetch(10,"My Account");

		return title;
	}

	public String getAccpageUrl() {
//		String url = driver.getCurrentUrl();
		String url =elementUtil.waitForURLContainsAndFetch(10,"route=account/account");

		return url;
	}
	
	public List<WebElement> getaccountRightPaneLinks(){
//		return driver.findElements(accountRightPaneLinks);
		return elementUtil.waitForElementsVisible(accountRightPaneLinks, 10);
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
