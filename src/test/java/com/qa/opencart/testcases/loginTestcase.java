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
		Assert.assertTrue(actualurl.contains("route=account/login"));
		
		
	}
	
	
	
	

}
