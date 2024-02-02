package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.constants.APPconstants;
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
		String title = elementUtil.waitForTitleIsAndFetch(APPconstants.DEFAULT_SHORT_TIME_OUT,APPconstants.Account_PAGE_TITLE_VALUE);

		return title;
	}

	public String getAccpageUrl() {
//		String url = driver.getCurrentUrl();
		String url =elementUtil.waitForURLContainsAndFetch(APPconstants.DEFAULT_SHORT_TIME_OUT,APPconstants.Account_PAGE_URL_VALUE);

		return url;
	}
	
	public List<WebElement> getaccountRightPaneLinks(){
//		return driver.findElements(accountRightPaneLinks);
		return elementUtil.waitForElementsVisible(accountRightPaneLinks, APPconstants.DEFAULT_SHORT_TIME_OUT);
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
