package com.hrms.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.page.LoginPage;
import com.hrms.utility.BrowserUtility;

public class LoginRegressionSuite {
	
	BrowserUtility browserUtility;
	LoginPage loginPage;
	WebDriver driver;


	@BeforeMethod
	public void appLaunch() {
		driver = browserUtility.launchBrowser("Chrome", "https://admin-demo.nopcommerce.com/");
	}

	
	@Test(priority = 0 , enabled = true, description="TC_001: Verifying valid login functionality")
	public void verifyValidLogin() {
		try {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
		loginPage.passwordEntry("admin"); // Entering valid Password.
		loginPage.checkremberme();
		loginPage.clickLoginButton(); // Clicking on Login Button.
		Assert.assertEquals(true, loginPage.verifyValidLogin()); // Verifying valid login scenario.
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	@Test(priority = 1, enabled = true, description="TC_002: Verifying invalid login functionality")
	public void verifyInvalidLogin() {
		try 
		{
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.userNameEntry("admin@yourstore1.com"); // Entering invalid User name.
		loginPage.passwordEntry("admin1"); // Entering invalid Password.
		loginPage.checkremberme();
		loginPage.clickLoginButton(); // Clicking on Login Button.
		Assert.assertEquals(false, loginPage.verifyInvalidLogin()); // Verifying valid login scenario.
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
