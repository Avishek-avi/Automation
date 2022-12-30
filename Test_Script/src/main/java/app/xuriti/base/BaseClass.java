package app.xuriti.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import app.xuriti.utilities.ReadConfig;

import org.apache.log4j.PropertyConfigurator;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public String email = readconfig.getEmail();
	public String password = readconfig.getPassword();
	public String gstno = readconfig.getGstNo();
	public String baseURL2 = readconfig.getAdminPanelURL();
	public String email2 = readconfig.getAdminEmail();
	public String email3 = readconfig.getCreditManagerEmail();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup()throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
        Thread.sleep(4000);
		
		logger =Logger.getLogger("Xuriti_Webapp");
		PropertyConfigurator.configure("Log4J.properties");
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}


}
