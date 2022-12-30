package app.xuriti.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import app.xuriti.base.BaseClass;
import app.xuriti.pageObjects.LoginPage;

public class TC_001_LoginTest extends BaseClass 
{
	
	
	@Test(priority = 0)
	public void loginTest() throws InterruptedException
	{
		driver.get(baseURL);
		
		logger.info("URL is opened");
		
		LoginPage lp= new LoginPage(driver);
		lp.setEmail(email);
		logger.info("Entered email id");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickLoginButton();
		Thread.sleep(4000);
		
		if(driver.getTitle().equals("Xuriti"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		
	}
	
}
