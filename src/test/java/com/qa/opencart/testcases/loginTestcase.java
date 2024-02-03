package com.qa.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class loginTestcase extends BaseTest{
	
	
	@Test
	
	public void loginPageTitleTest() {
	 String  actualTitle= loginPage.getPageTitle();
	Assert.assertEquals(actualTitle, "Account Login");
		
	}
	@Test
	public void loginPageUrlTest() {
		String actualurl =loginPage.getpageUrl();
		
		System.out.println("browser :"+prop.getProperty("browser")+" headless: "+prop.getProperty("headless"));

		Assert.assertTrue(actualurl.contains("route=account/login"));
		
		
	}
	
	@Test
	public void doLoginTest() throws Exception {
//		loginPage.dologiin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
		loginPage.dologiin("deepu.odf@gmail.coom", "Tet@1234");
		System.out.println("username :"+prop.getProperty("username")+" password: "+prop.getProperty("password"));
	}
	
	
	
	

}
