package app.xuriti.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	@FindBy(id = "mat-input-0")
    public WebElement emailField;

    @FindBy(id = "mat-input-1")
    public WebElement passwordField;

    @FindBy(xpath= "//*[@id=\"login-page\"]/div/div[3]/div/div/form/div[4]/button")
    public WebElement loginButton;
	
	public LoginPage(WebDriver rdriver)
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
