package app.xuriti.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class RegisterEntityPage {

	WebDriver ldriver;
	
	 @FindBy(xpath="//*[@id=\"mat-input-2\"]")
	public WebElement gstField;
	 
	 @FindBy(xpath="//*[@id=\"buyer-page\"]/div/div[2]/div[1]/form[1]/div[2]/div/button")
	 public WebElement getCompanyDetailsField;
	 
	 
	 @FindBy(xpath="//*[@id=\"buyer-page\"]/div/div[2]/div/form[2]/div[4]/div/div/button")
	 public WebElement createButton;
	 
	 public RegisterEntityPage(WebDriver rdriver)
	 	{
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
	 
	 public void setCompanyGstNo(String gstno) {
		  gstField.sendKeys(gstno);
	 }
	 
	 public void getCompanyDetails() {
		 getCompanyDetailsField.click();
	 }
	 
	 public void registerEntity() {
		 createButton.click();
	 }
	 
}
