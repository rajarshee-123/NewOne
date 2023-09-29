package com.hrms.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.page.DashboardPage;
import com.hrms.page.LoginPage;
import com.hrms.utility.BrowserUtility;

public class DashboardRegressionSuite {

	BrowserUtility browserUtility;
	LoginPage loginPage;
	WebDriver driver;
	DashboardPage dashboardpage;
	
	
	@BeforeMethod
	public void appLaunch() {
		driver = browserUtility.launchBrowser("Chrome", "https://admin-demo.nopcommerce.com/");
	}
	
	@Test(priority = 0, enabled = true)
	public void verifycustomerOptionExist() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			//dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
			dashboardpage.visibilityofCustomerOption();
			Assert.assertEquals(true, dashboardpage.verifyVisibilityofCustomerOption());
			//dashboardpage = loginPage.loginToSite("admin@yourstore.com", "admin");
			//loginpage.enterUserName("admin@yourstore.com");
			//loginpage.enterPassword("admin");
			//dashboardpage = loginpage.clickButton();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
	
	
	@Test(priority = 1, enabled = true)
	public void verifycustomerMoreOptionsExist() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			dashboardpage.visibilityofCustomerMoreOptions();
			//dashboardpage = loginpage.loginToSite("admin@yourstore.com", "admin");
			//dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		Assert.assertEquals(true, dashboardpage.verifyVisibilityofCustomerMoreOptions());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
	

	@Test(priority = 2, enabled = false)
	public void addNewCoustomer() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			//loginpage.enterUserName("admin@yourstore.com");
			//loginpage.enterPassword("admin");
			//dashboardpage = loginpage.clickButton();
		Assert.assertEquals(true, dashboardpage.addNewCustomer("rajabc@gmail.com", "1234", "raj", "bhatt", "abc", "glocal", 1, "Vendor 2", "HI"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
	
	@Test(priority = 3, enabled = false)
	public void searchFCustomer() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			//loginpage.enterUserName("admin@yourstore.com");
			//loginpage.enterPassword("admin");
			//dashboardpage = loginpage.clickButton();
		Assert.assertEquals(true, dashboardpage.searchbyFname("John"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
	
	@Test(priority = 4, enabled = false)
	public void searchLCustomer() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			//loginpage.enterUserName("admin@yourstore.com");
			//loginpage.enterPassword("admin");
			//dashboardpage = loginpage.clickButton();
		Assert.assertEquals(true, dashboardpage.searchbyLname("Smith"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
	
	@Test(priority = 5, enabled = false)
	public void searchbyEmailCustomer() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			//loginpage.enterUserName("admin@yourstore.com");
			//loginpage.enterPassword("admin");
			//dashboardpage = loginpage.clickButton();
		Assert.assertEquals(true, dashboardpage.searchbyEmail("admin@yourStore.com"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
	@Test(priority = 6, enabled = false)
	public void searchbycompanynm() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			//loginpage.enterUserName("admin@yourstore.com");
			//loginpage.enterPassword("admin");
			//dashboardpage = loginpage.clickButton();
		Assert.assertEquals(true, dashboardpage.searchbycompanynm("glocal"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}

	@Test(priority = 7, enabled = false)
	public void verifycustomerroleoptionavalability() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			//loginpage.enterUserName("admin@yourstore.com");
			//loginpage.enterPassword("admin");
			//dashboardpage = loginpage.clickButton();
		Assert.assertEquals(true, dashboardpage.verifyCustomerRoles());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
	
	@Test(priority = 8, enabled = false)
	public void verifycustomerroleaddtion() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			//loginpage.enterUserName("admin@yourstore.com");
			//loginpage.enterPassword("admin");
			//dashboardpage = loginpage.clickButton();
		Assert.assertEquals(true, dashboardpage.addCustomerRoles("Hello","Computer"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
	@Test(priority = 9, enabled = false)
	public void verifycatalogoption() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			Assert.assertEquals(true, dashboardpage.verifycatalogoption());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Test(priority = 10, enabled = false)
	public void verifyproductoption() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			Assert.assertEquals(true, dashboardpage.verifyproductsoption());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Test(priority = 11, enabled = false)
	public void verifycatagoryoption() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			Assert.assertEquals(true, dashboardpage.verifycatagoriesoption());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Test(priority = 12, enabled = false)
	public void verifynewcategoryoption() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			Assert.assertEquals(true, dashboardpage.verifyaddcatagoryoption("Hello","Human", 3));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Test(priority = 13, enabled = false)
	public void verifynewcategoryoptionsearch() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			Assert.assertEquals(true, dashboardpage.categorySearch("computers"));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Test(priority = 14, enabled = false)
	public void verifysalesoption() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			Assert.assertEquals(true, dashboardpage.verifysalesoption());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Test(priority = 15, enabled = false)
	public void verifypromotionoption() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			Assert.assertEquals(true, dashboardpage.verifypromotionoption());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Test(priority = 16, enabled = false)
	public void verifyconfigurationoption() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			Assert.assertEquals(true, dashboardpage.verifyconfigurationoption());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Test(priority = 17, enabled = false)
	public void verifysystemoption() {
		try {
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			loginPage.userNameEntry("admin@yourstore.com"); // Entering valid User name.
			loginPage.passwordEntry("admin"); // Entering valid Password.
			dashboardpage =	loginPage.clickLoginButton(); // Clicking on Login Button.
			Assert.assertEquals(true, dashboardpage.verifysystemoption());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
