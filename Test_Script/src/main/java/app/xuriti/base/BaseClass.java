package app.xuriti.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

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
	public String companyname = readconfig.getCompanyName();
	public String sellername = readconfig.getSellerName();
	public String pincode = readconfig.getPincode();
	public String annualturnover = readconfig.getAnnualTurnover();
	public String creditlimit = readconfig.getCreditLimit();
	public String comment = readconfig.setComment();
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)throws InterruptedException
	{
		logger =Logger.getLogger("Xuriti_Webapp");
		PropertyConfigurator.configure("Log4J.properties");
		
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
        	Thread.sleep(3000);
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
	        Thread.sleep(3000);
		}
		
		
	}
	

	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}


}
