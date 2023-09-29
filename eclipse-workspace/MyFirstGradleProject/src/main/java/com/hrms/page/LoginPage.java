package com.hrms.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utility.WaitElement;

public class LoginPage {
	
	WebDriver driver;
	WaitElement Wait;

	@FindBy(xpath="//input[@id='Email']") 
	WebElement txtBoxUserName;
	
	@FindBy(xpath="//input[@id='Password']") 
	WebElement txtBoxPassword;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]") 
	WebElement btnLogin;
	
	@FindBy(xpath="//input[@id='RememberMe']") 
	WebElement checkBox; 
	
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void userNameEntry(String userName)
	{
		WaitElement.waitForElement(txtBoxUserName, 30, driver);
		txtBoxUserName.clear();
		txtBoxUserName.sendKeys(userName);
	}

	public void passwordEntry(String password)
	{
		WaitElement.waitForElement(txtBoxPassword, 30, driver);
		txtBoxPassword.clear();
		txtBoxPassword.sendKeys(password);
	}
	
	public void checkremberme() {	
		WaitElement.waitForElement(checkBox, 30, driver);
		if(!checkBox.isSelected())
		{
			checkBox.click();
		}		
	}
	
	public DashboardPage clickLoginButton()
	{
		WaitElement.waitForElement(btnLogin, 50, driver);
		btnLogin.click();
		WaitElement.waitTill(5000);
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	
	/*public DashboardPage loginToSite(String uid, String passw) {

		uname.sendKeys(uid);
		pass.sendKeys(passw);
		btn.click();
		return PageFactory.initElements(driver, DashboardPage.class);
	}*/
		
	public boolean verifyValidLogin() {
		String expectedTitle = "Dashboard / nopCommerce administration";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			return true;
		}
		else{
			return false;
		}
	}
	public boolean verifyInvalidLogin() {
		String expectedTitle = "Dashboard / nopCommerce administration";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			return true;
		}
		else{
			return false;
		}
	}

}
