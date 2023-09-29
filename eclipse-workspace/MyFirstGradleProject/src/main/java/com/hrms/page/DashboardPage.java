package com.hrms.page;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.WaitElement;

public class DashboardPage {

	WebDriver driver;
	WaitElement wait;


	@FindBy(xpath="(//p[contains(text(),'Customers')])[1]")
	WebElement cust1;
	@FindBy(xpath="//li[@class='treeview menu-open']//ul[@class='treeview-menu']//li//span[@class='menu-item-title'][contains(text(),'Customers')]")
	WebElement childcustomers;
	@FindBy(xpath="//p[contains(text(),'Customer roles')]")
	WebElement cust_roles;
	@FindBy(xpath="//span[contains(text(),'Online customers')]")
	WebElement online_cust;
	@FindBy(xpath="//span[contains(text(),'Vendors')]")
	WebElement Vendor;
	@FindBy(xpath="//span[contains(text(),'Activity log')]")
	WebElement Activity_log;
	@FindBy(xpath="//span[contains(text(),'Activity Types')]")
	WebElement Activity_Types;
	@FindBy(xpath="//span[contains(text(),'GDPR requests (log)')]")
	WebElement GDPR_requests;
	@FindBy(xpath="//span[@class='menu-item-title'][contains(text(),'Customers')]")
	WebElement customer;
	@FindBy(xpath="//a[@class='btn bg-blue']")
	WebElement addNew;
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement fname;
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lname;
	@FindBy(xpath="//input[@id='Gender_Male']")
	WebElement genderM;
	@FindBy(xpath="//span[@class='k-select']")
	WebElement dob;
	@FindBy(xpath="//a[@class='k-link'][contains(text(),'18')]")
	WebElement date;
	@FindBy(xpath="//input[@id='Company']")
	WebElement com_name;
	@FindBy(xpath="//input[@id='IsTaxExempt']")
	WebElement tax_exemt;
	@FindBy(xpath="//input[@name='SelectedNewsletterSubscriptionStoreIds']")
	WebElement stor_name;
	@FindBy(xpath="//div[@class='k-multiselect-wrap k-floatwrap']")
	WebElement cust_role;
	@FindBy(xpath="//li[contains(text(),'Vendors')]")
	WebElement vendor;
	@FindBy(xpath="//select[@id='VendorId']")
	WebElement vendorID;
	@FindBy(xpath="//input[@id='Active']")
	WebElement active;
	@FindBy(xpath="//textarea[@id='AdminComment']")
	WebElement admin_coment;
	@FindBy(xpath="//button[@name='save']")
	WebElement save;
	@FindBy(xpath="//span[@class='caret']")
	WebElement export;
	@FindBy(xpath="//button[@name='exportexcel-all']")
	WebElement exportToexcel;
	@FindBy(xpath="//input[@id='SearchFirstName']")
	WebElement FirstName;
	@FindBy(xpath="//input[@id='SearchLastName']")
	WebElement LastName;
	//@FindBy(xpath="//td[contains(text(),'John Smith')]")
	//WebElement checked;
	@FindBy(xpath="//button[@id='search-customers']")
	WebElement searchbtn;
	@FindBy(xpath="//table[@id='customers-grid']")
	WebElement Checked;
	@FindBy(xpath="//input[@id='SearchEmail']")
	WebElement emailchk;
	@FindBy(xpath="//input[@id='SearchCompany']")
	WebElement comnamechk;
	@FindBy(xpath="//a[@class='btn bg-blue']")
	WebElement addnew_custrole;
	@FindBy(xpath="//input[@id='Name']")
	WebElement custrolename;
	@FindBy(xpath="//input[@id='FreeShipping']")
	WebElement chkfreeshiping;
	@FindBy(xpath="//input[@id='TaxExempt']")
	WebElement taxexp;
	@FindBy(xpath="//input[@id='OverrideTaxDisplayType']")
	WebElement dfttaxdisply;
	@FindBy(xpath="//input[@id='EnablePasswordLifetime']")
	WebElement enbpassliftim;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement chosprdut;
	@FindBy(xpath="//tr[2]//td[1]//button[1]")
	WebElement selectprodtbtn;
	@FindBy(xpath="//input[@id='SystemName']")
	WebElement sysname;
	@FindBy(xpath="//button[@name='save']")
	WebElement savecustrole;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissable']")
	WebElement chkvalidation;
	@FindBy(xpath=("//span[contains(text(),'Catalog')]"))
	WebElement catlog;
	@FindBy(xpath=("//span[contains(text(),'Products')]"))
	WebElement product;
	@FindBy(xpath=("//span[contains(text(),'Categories')]"))
	WebElement catagory;
	@FindBy(xpath=("//a[@class='btn bg-blue']"))
	WebElement addcatagory;
	@FindBy(xpath=("//span[@class='onoffswitch-switch']"))
	WebElement onoffswitch;
	@FindBy(xpath=("//input[@id='Name']"))
	WebElement nameofcatagory;
	@FindBy(xpath=("//button[@id='mce_44-open']")) 
	WebElement fileclick;
	@FindBy(xpath=("//span[contains(text(),'New document')]")) 
	WebElement newdoc;
	@FindBy(xpath="//body[@id='tinymce']")
	WebElement wrightdoc;
	@FindBy(xpath=("//select[@id='ParentCategoryId']")) 
	WebElement selectoption; 
	@FindBy(xpath="//input[@name='qqfile']") 
	WebElement uploadfile; 
	@FindBy(xpath=("//div[contains(@class,'content-header clearfix')]//button[1]")) 
	WebElement savecategory; 
	@FindBy(xpath=("//div[@class='alert alert-success alert-dismissable']")) 
	WebElement checktext;
	@FindBy(xpath=("//input[@id='SearchCategoryName']")) 
	WebElement searchname;
	@FindBy(xpath=("//button[@id='search-categories']")) 
	WebElement searchbton;
	@FindBy(xpath=("//div[@class='dataTables_scrollBody']")) 
	WebElement serchedvalue;
	@FindBy(xpath=("//span[contains(text(),'Sales')]")) 
	WebElement salesbtn;
	@FindBy(xpath=("//span[contains(text(),'Promotions')]")) 
	WebElement promotionbtn;
	@FindBy(xpath=("//span[contains(text(),'Configuration')]")) 
	WebElement configurationbtn;
	@FindBy(xpath=("//span[contains(text(),'System')]")) 
	WebElement systembtn;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public void visibilityofCustomerOption() {
		WaitElement.waitForElement(cust1, 50, driver);
		cust1.click();
		WaitElement.waitTill(1000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	}


	public void visibilityofCustomerMoreOptions() {
		WaitElement.waitForElement(cust1, 50, driver);
		cust1.click();
		WaitElement.waitTill(1000);
		WaitElement.waitForElement(cust_roles, 100, driver);
		cust_roles.click();
		WaitElement.waitTill(1000);
	}

	public boolean addNewCustomer(String emailid,String passwd, String fnme, String lnme, String dat,String company_name,  int cust_rol, String vendr, String admin_commt) throws AWTException {
		WaitElement.waitForElement(cust1, 50, driver);
		cust1.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(childcustomers, 50, driver);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WaitElement.waitTill(3000);
		childcustomers.click();
		WaitElement.waitForElement(addNew, 50, driver);
		addNew.click();
		WaitElement.waitForElement(email, 50, driver);
		email.sendKeys(emailid);
		WaitElement.waitForElement(password, 50, driver);
		password.sendKeys(passwd);
		WaitElement.waitForElement(fname, 50, driver);
		fname.sendKeys(fnme);
		WaitElement.waitForElement(lname, 50, driver);
		lname.sendKeys(lnme);
		if(!genderM.isSelected()) {
			genderM.click();
			WaitElement.waitTill(3000);
		}
		WaitElement.waitForElement(dob, 50, driver);
		dob.click();
		WaitElement.waitForElement(date, 50, driver);
		date.click();
		//Select select = new Select();
		//select.selectByVisibleText(dat);
		WaitElement.waitForElement(com_name, 50, driver);
		com_name.sendKeys(company_name);
		if(!tax_exemt.isSelected()) {
			tax_exemt.click();
			WaitElement.waitTill(3000);
		}
		WaitElement.waitForElement(stor_name, 50, driver);
		stor_name.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(cust_role, 50, driver);
		cust_role.click();
		WaitElement.waitTill(3000);
		//Select select = new Select(cust_role);
		//select.selectByIndex(cust_rol);
		//WaitElement.waitTill(3000);
		WaitElement.waitForElement(vendor, 50, driver);
		vendor.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(vendorID, 50, driver);
		vendorID.click();
		Select select = new Select(vendorID);
		select.selectByVisibleText(vendr);
		WaitElement.waitTill(3000);
		//WaitElement.waitForElement(active, 50, driver);
		//if(active.isSelected()) {
			//active.click();
			//WaitElement.waitTill(3000);
		//}
		WaitElement.waitForElement(admin_coment, 50, driver);
		admin_coment.sendKeys(admin_commt);
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(save, 50, driver);
		save.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(export, 50, driver);
		export.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(exportToexcel, 50, driver);
		exportToexcel.click();
		WaitElement.waitTill(3000);
		String ExptUrl = "https://admin-demo.nopcommerce.com/Admin/Customer/List";
		String ActlUrl = driver.getCurrentUrl();
		if(ExptUrl.equals(ActlUrl)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean searchbyFname(String fname) {
		WaitElement.waitForElement(cust1, 50, driver);
		cust1.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(childcustomers, 50, driver);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WaitElement.waitTill(3000);
		childcustomers.click();
		WaitElement.waitForElement(FirstName, 50, driver);
		FirstName.click();
		FirstName.sendKeys(fname);
		WaitElement.waitTill(3000);
		searchbtn.click();
		WaitElement.waitTill(3000);
		FirstName.clear();
		WaitElement.waitTill(3000);
		if(Checked.equals(null)) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean searchbyLname(String lname) {
		WaitElement.waitForElement(cust1, 50, driver);
		cust1.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(childcustomers, 50, driver);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WaitElement.waitTill(3000);
		childcustomers.click();
		WaitElement.waitForElement(LastName, 50, driver);
		LastName.click();
		LastName.sendKeys(lname);
		WaitElement.waitTill(3000);
		searchbtn.click();
		WaitElement.waitTill(3000);
		LastName.clear();
		WaitElement.waitTill(3000);
		if(Checked.equals(null)) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean searchbyEmail(String mail) {
		WaitElement.waitForElement(cust1, 50, driver);
		cust1.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(childcustomers, 50, driver);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WaitElement.waitTill(3000);
		childcustomers.click();
		WaitElement.waitForElement(emailchk, 50, driver);
		emailchk.click();
		emailchk.sendKeys(mail);
		WaitElement.waitTill(3000);
		searchbtn.click();
		WaitElement.waitTill(3000);
		emailchk.clear();
		WaitElement.waitTill(3000);
		if(Checked.equals(null)) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean searchbycompanynm(String comname) {
		WaitElement.waitForElement(cust1, 50, driver);
		cust1.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(childcustomers, 50, driver);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WaitElement.waitTill(3000);
		childcustomers.click();
		WaitElement.waitForElement(comnamechk, 50, driver);
		comnamechk.click();
		comnamechk.sendKeys(comname);
		WaitElement.waitTill(3000);
		searchbtn.click();
		WaitElement.waitTill(3000);
		comnamechk.clear();
		WaitElement.waitTill(3000);
		if(!Checked.equals(null)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyCustomerRoles() {
		WaitElement.waitForElement(cust1, 50, driver);
		cust1.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(cust_roles, 50, driver);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WaitElement.waitTill(3000);
		cust_roles.click();
		WaitElement.waitTill(3000);
		String ExpectedUrl = "https://admin-demo.nopcommerce.com/Admin/CustomerRole/List";
		String ActualUrl = driver.getCurrentUrl();
		if(ExpectedUrl.equals(ActualUrl)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean addCustomerRoles(String name1,String name2 ) throws IOException {
		WaitElement.waitForElement(cust1, 50, driver);
		cust1.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(cust_roles, 50, driver);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WaitElement.waitTill(3000);
		cust_roles.click();
		WaitElement.waitTill(3000);
		addnew_custrole.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(custrolename, 50, driver);
		custrolename.click();
		custrolename.sendKeys(name1);
		WaitElement.waitTill(3000);
		if(!chkfreeshiping.isSelected()) {
			chkfreeshiping.click();
			WaitElement.waitTill(3000);
		}
		if(!taxexp.isSelected()) {
			taxexp.click();
			WaitElement.waitTill(3000);
		}
		if(!taxexp.isSelected()) {
			taxexp.click();
			WaitElement.waitTill(3000);
		}
		if(!dfttaxdisply.isSelected()) {
			dfttaxdisply.click();
			WaitElement.waitTill(3000);
		}
		if(!enbpassliftim.isSelected()) {
			enbpassliftim.click();
			WaitElement.waitTill(3000);
		}
		//WaitElement.waitForElement(chosprdut, 50, driver);
		//chosprdut.click();
		//WaitElement.waitTill(3000);
		//Runtime.getRuntime().exec(".\\autoIT\\auto.exe");
		//driver.switchTo().alert().accept();
		//WaitElement.waitForElement(selectprodtbtn, 50, driver);
		//selectprodtbtn.click();
		//WaitElement.waitTill(3000);
		WaitElement.waitForElement(sysname, 50, driver);
		sysname.click();
		WaitElement.waitTill(3000);
		sysname.sendKeys(name2);
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(savecustrole, 50, driver);
		savecustrole.click();
		WaitElement.waitTill(3000);
		String ActualText = chkvalidation.getText();
		System.out.println(ActualText);
		String ExpectedVal = "The new customer role has been added successfully.";
		WaitElement.waitTill(3000);
		if(ExpectedVal.equals(ActualText)) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean verifycatalogoption() {
		WaitElement.waitForElement(catlog, 50, driver);
		WaitElement.waitTill(3000);
		if(catlog.isDisplayed()==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyproductsoption() {
		WaitElement.waitForElement(catlog, 50, driver);
		WaitElement.waitTill(3000);
		catlog.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(product, 50, driver);
		product.click();
		WaitElement.waitTill(3000);
		if(product.isDisplayed()==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifycatagoriesoption() {
		WaitElement.waitForElement(catlog, 50, driver);
		WaitElement.waitTill(3000);
		catlog.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(catagory, 50, driver);
		catagory.click();
		WaitElement.waitTill(3000);
		if(catagory.isDisplayed()==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyaddcatagoryoption(String firtname,String anything,int position) throws IOException {
		WaitElement.waitForElement(catlog, 50, driver);
		WaitElement.waitTill(3000);
		catlog.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(catagory, 50, driver);
		catagory.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(addcatagory, 50, driver);
		addcatagory.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(onoffswitch, 50, driver);
		onoffswitch.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(nameofcatagory, 50, driver);
		nameofcatagory.click();
		nameofcatagory.sendKeys(firtname);
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(fileclick, 50, driver);
		fileclick.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(newdoc, 50, driver);
		newdoc.click();
		WaitElement.waitTill(3000);
		//WaitElement.waitForElement(wrightdoc, 50, driver);
		//wrightdoc.click();
		//WaitElement.waitTill(3000);
		//wrightdoc.sendKeys(anything);
		WaitElement.waitForElement(selectoption, 50, driver);
		selectoption.click();
		WaitElement.waitTill(3000);
		Select select = new Select(selectoption);
		select.selectByIndex(position);
		//WaitElement.waitForElement(uploadfile, 50, driver);
		//uploadfile.click();
		//WaitElement.waitTill(3000);
		//Runtime.getRuntime().exec(".\\autoIT\\auto.exe");
		WaitElement.waitForElement(savecategory, 50, driver);
		savecategory.click();
		WaitElement.waitTill(3000);
		String ActualText = checktext.getText();
		String ExpectedText = "The new category has been added successfully.";
		if(ActualText.contains(ExpectedText)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean categorySearch(String cat_search_name) {
		WaitElement.waitForElement(catlog, 50, driver);
		WaitElement.waitTill(3000);
		catlog.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(catagory, 50, driver);
		catagory.click();
		WaitElement.waitTill(3000);
		WaitElement.waitForElement(searchname, 50, driver);
		WaitElement.waitTill(3000);
		searchname.click();
		searchname.sendKeys(cat_search_name);
		WaitElement.waitForElement(searchbton, 50, driver);
		WaitElement.waitTill(3000);
		searchbton.click();
		WaitElement.waitTill(3000);
		if(serchedvalue.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifysalesoption() {
		WaitElement.waitForElement(salesbtn, 50, driver);
		WaitElement.waitTill(3000);
		salesbtn.click();
		WaitElement.waitTill(3000);
		String expectedTitle = "Dashboard / nopCommerce administration";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifypromotionoption() {
		WaitElement.waitForElement(promotionbtn, 50, driver);
		WaitElement.waitTill(3000);
		promotionbtn.click();
		WaitElement.waitTill(3000);
		String expectedTitle = "Dashboard / nopCommerce administration";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyconfigurationoption() {
		WaitElement.waitForElement(configurationbtn, 50, driver);
		WaitElement.waitTill(3000);
		configurationbtn.click();
		WaitElement.waitTill(3000);
		String expectedTitle = "Dashboard / nopCommerce administration";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifysystemoption() {
		WaitElement.waitForElement(systembtn, 50, driver);
		WaitElement.waitTill(3000);
		systembtn.click();
		WaitElement.waitTill(3000);
		String expectedTitle = "Dashboard / nopCommerce administration";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyVisibilityofCustomerOption() {
	String expectedTitle = "Dashboard / nopCommerce administration";
	String actualTitle = driver.getTitle();
	//if(js.executeScript("arguments[0].scrollIntoView();", cust).equals(cust)) {
	//	return true;
	//}else {
	//	return false;
	//}
	if(expectedTitle.equals(actualTitle)) {
		return true;
	}else {
		return false;
	}
	}
	
	public boolean verifyVisibilityofCustomerMoreOptions() {
		String Expectedurl = "https://admin-demo.nopcommerce.com/Admin/CustomerRole/List";
		String ActualUrl = driver.getCurrentUrl();
		//Select select = new Select(cust2);
		//select.selectByVisibleText(Customers);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//waitTime.waitTill(3000);
		if(Expectedurl.equals(ActualUrl)) {
			return true;
		}else {
			return false;
		}
		
	}
	}