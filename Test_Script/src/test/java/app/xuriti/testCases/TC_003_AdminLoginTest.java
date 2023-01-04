package app.xuriti.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import app.xuriti.base.BaseClass;
import app.xuriti.pageObjects.Admin_LoginPage;

public class TC_003_AdminLoginTest extends BaseClass {
	
	@Test(priority = 3)
	public void adminLoginTest() throws InterruptedException
	{
		driver.get(baseURL2);
		
		logger.info("Admin page's URL is opened");
		
		Admin_LoginPage lp= new Admin_LoginPage(driver);
		lp.setEmail(email2);
		logger.info("Entered admin's email id");
		
		lp.setPassword(password);
		logger.info("Entered admin's password");
		
		lp.clickLoginButton();
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("Admin"))
		{
			Assert.assertTrue(true);
			logger.info("Admin Login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Admin Login test failed");
		}
		
		
	}

}
