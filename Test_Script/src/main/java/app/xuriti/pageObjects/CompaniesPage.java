package app.xuriti.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompaniesPage {

	WebDriver ldriver;

	@FindBy(xpath= "//*[@id=\"companylist-page\"]/div/div/div[2]/mat-card[1]/div/mat-card-header")
	public WebElement companycard;
	
	@FindBy(xpath="/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div[2]/mat-nav-list/mat-list-item/div")
	public WebElement addnewcompany;
	
	public CompaniesPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	public void clickAddnewCompany() {
		addnewcompany.click();
	
	}
}
