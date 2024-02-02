package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
		String title = elementUtil.waitForTitleIsAndFetch(10,"Account Login");
		return title;
	}
	
	public String getpageUrl() {
//		String url = driver.getCurrentUrl();
		String url =elementUtil.waitForURLContainsAndFetch(10,"route=account/login");
		return url;
	}
	
	public boolean isForgotPassDisplayed() {
//		return driver.findElement(forgotPasswordlinkBy).isDisplayed();
		return elementUtil.waitForElementVisible(forgotPasswordlinkBy,10).isDisplayed();
	}
	
	public AccountPage dologiin(String un, String pwd) {
//		driver.findElement(emailid).sendKeys(un);
//		driver.findElement(passwordBy).sendKeys(pwd);
//		driver.findElement(login_btn).click();
		
		elementUtil.waitForElementVisible(emailid, 10);
		elementUtil.doSendKeys(passwordBy, pwd);
		elementUtil.doClick(login_btn);
        return new AccountPage(driver);
		
	}
	

}
