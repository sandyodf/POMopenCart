package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.APPconstants;
import com.qa.opencart.utils.ElementUtil;

public class LoginPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	private By emailid = By.id("input-email");
	private By passwordBy = By.id("input-password");
	private By login_btn = By.xpath("//input[@value='Login']");
	private By forgotPasswordlinkBy = By.linkText("Forgotten Password");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.elementUtil=new ElementUtil(driver);
	}

	public String getPageTitle() {
//		String title = driver.getTitle();
		String title = elementUtil.waitForTitleIsAndFetch(APPconstants.DEFAULT_SHORT_TIME_OUT,APPconstants.LOGIN_PAGE_TITLE_VALUE);
		return title;
	}
	
	public String getpageUrl() {
//		String url = driver.getCurrentUrl();
		String url =elementUtil.waitForURLContainsAndFetch(APPconstants.DEFAULT_SHORT_TIME_OUT,APPconstants.LOGIN_PAGE_URL_VALUE);
		return url;
	}
	
	public boolean isForgotPassDisplayed() {
//		return driver.findElement(forgotPasswordlinkBy).isDisplayed();
		return elementUtil.waitForElementVisible(forgotPasswordlinkBy,APPconstants.DEFAULT_SHORT_TIME_OUT).isDisplayed();
	}
	
	public AccountPage dologiin(String un, String pwd) {
//		driver.findElement(emailid).sendKeys(un);
//		driver.findElement(passwordBy).sendKeys(pwd);
//		driver.findElement(login_btn).click();
		
//		elementUtil.waitForElementVisible(emailid, APPconstants.DEFAULT_LONG_TIME_OUT);
		elementUtil.doSendKeys(emailid, un);
		elementUtil.doSendKeys(passwordBy, pwd);
		elementUtil.doClick(login_btn);
        return new AccountPage(driver);
		
	}
	

}
