package com.qa.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class accountPageTest extends BaseTest {

	@BeforeClass

	public void accountSetup() {
		accPage=loginPage.dologiin(prop.getProperty("username").trim(), prop.getProperty("password").trim());


	}

	@Test

	public void getAccPageTitleTest() {
	String accTitle =	accPage.getAccPageTitle();
	Assert.assertEquals(accTitle, "My Account");

	}

	@Test

	public void getAccPageUrlTest() {
	String accUrl =	accPage.getAccpageUrl();
	Assert.assertTrue(accUrl.contains("route=account/account"));

	}
	
//	@Test(priority = 4)
//
//	public void clickOnAccountElementsTest() {
//		accPage.clickOnAccountElements("Password");
//
//	}
//	
	
	

}
