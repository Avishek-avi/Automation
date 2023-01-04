package app.xuriti.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_LoginPage 
{
	
WebDriver ldriver;
	
	@FindBy(xpath = "//input[@id='mat-input-0']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@id='mat-input-1']")
    public WebElement passwordField;

    @FindBy(xpath= "//button[@type='submit']")
    public WebElement loginButton;
	
	public Admin_LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	

    public void setEmail(String email) {
        emailField.sendKeys(email);
    }

    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
	
	
}
