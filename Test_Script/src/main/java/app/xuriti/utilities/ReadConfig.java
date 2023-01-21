package app.xuriti.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src= new File("./Configuration/Config.properties");
		
		try 
		{
			FileInputStream fis= new FileInputStream(src);	
			pro =new Properties();
			pro.load(fis);
		} catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url= pro.getProperty("baseURL");
		return url;
	}
	
	public String getEmail() {
		String email= pro.getProperty("email");
		return email;
	}
	
	public String getPassword() {
		String password= pro.getProperty("password");
		return password;
	}
	
	public String getChromepath() {
		String chromepath= pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxpath() {
		String firefoxpath= pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getGstNo() {
		String gstno= pro.getProperty("gstno");
		return gstno;
	}
	
	public String getAdminPanelURL()
	{
		String url2 = pro.getProperty("baseURL2");
		return url2;
	}
	
	public String getAdminEmail() {
		String email2 = pro.getProperty("email2");
		return email2;
	}
	
	public String getCreditManagerEmail() {
		String email3 = pro.getProperty("email3");
		return email3;
	}
	
	public String getCompanyName() {
		String companyname = pro.getProperty("companyname");
		return companyname;
	}
	
	public String getSellerName() {
		String sellername = pro.getProperty("sellername");
		return sellername;
	}
	
	public String getPincode() {
		String pincode = pro.getProperty("pincode");
		return pincode;
	}
	
	public String getAnnualTurnover() {
		String annualturnover = pro.getProperty("annualturnover");
		return annualturnover;
	}
	
	public String getCreditLimit() {
		String creditlimit = pro.getProperty("creditlimit");
		return creditlimit;
	}
	
	public String setComment() {
		String comment = pro.getProperty("comment");
		return comment;
	}
	
}
