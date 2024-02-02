package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	private By emailid = By.id("input-email");
	private By passwordBy = By.id("input-password");
	private By login_btn = By.xpath("//input[@value='Login']");
	private By forgotPasswordlinkBy = By.linkText("Forgotten Password");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		String title = driver.getTitle();

		return title;
	}
	
	public String getpageUrl() {
		String url = driver.getCurrentUrl();

		return url;
	}
	
	public boolean isForgotPassDisplayed() {
		return driver.findElement(forgotPasswordlinkBy).isDisplayed();
	}
	
	public AccountPage dologiin(String un, String pwd) {
		driver.findElement(emailid).sendKeys(un);
		driver.findElement(passwordBy).sendKeys(pwd);
		driver.findElement(login_btn).click();
        return new AccountPage(driver);
		
	}
	

}
