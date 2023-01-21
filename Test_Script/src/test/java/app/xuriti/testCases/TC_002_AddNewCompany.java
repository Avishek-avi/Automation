package app.xuriti.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import app.xuriti.base.BaseClass;
import app.xuriti.pageObjects.CompaniesPage;
import app.xuriti.pageObjects.RegisterEntityPage;

public class TC_002_AddNewCompany extends BaseClass {
	
	@Test(priority = 1)
	public void loginTest() throws InterruptedException {
	TC_001_LoginTest lt= new TC_001_LoginTest();
	lt.loginTest();
	
	}
	
	@Test(priority = 2)
	public void addNewCompanyTest() throws InterruptedException {
		
		CompaniesPage cp= new CompaniesPage(driver);
		
		cp.clickAddnewCompany();
		Thread.sleep(4000);
	
		if(driver.getTitle().equals("Xuriti"))
		{
			Assert.assertTrue(true);
			logger.info("Clicked on add new company button");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Cannot locate addnewcompany button");
		}
		
		RegisterEntityPage rp= new RegisterEntityPage(driver);
		
		//Entering Company's GST no in GST field
		rp.setCompanyGstNo(gstno);
		logger.info("Gst no entered");
		Thread.sleep(2000);
		
		//Clicking get company details button
		rp.getCompanyDetails();
		logger.info("Get company details button clicked");
		Thread.sleep(2000);
		
		//Submitting the company
		rp.registerEntity();
		logger.info("Register company button clicked");
		Thread.sleep(2000);
	
	}
	

}
