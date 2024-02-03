package com.qa.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class loginTestcase extends BaseTest{
	
	
	@Test(priority = 1)
	
	public void loginPageTitleTest() {
	 String  actualTitle= loginPage.getPageTitle();
	Assert.assertEquals(actualTitle, "Account Login");
		
	}
	
	@Test(priority = 2)
	public void loginPageUrlTest() {
		String actualurl =loginPage.getpageUrl();
		
		System.out.println("browser :"+prop.getProperty("browser")+" headless: "+prop.getProperty("headless"));

		Assert.assertTrue(actualurl.contains("route=account/login"));
		
		
	}
	
	@Test(priority = 3)
	public void doLoginTest() throws Exception {
		loginPage.dologiin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
//		loginPage.dologiin("deepu.odf@gmail.coom", "Tet@1234");
		System.out.println("username :"+prop.getProperty("username")+" password: "+prop.getProperty("password"));
	}
	
	
	
	

}
