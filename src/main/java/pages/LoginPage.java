package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase

	//loginPage for OrangeHRM
{	//to initialize webelements
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	//WebElement repository
	@FindBy(name= "username")
	WebElement usernameTxtBox;
	
	@FindBy(name="password")
	WebElement passwordTxtBox;
	
	@FindBy(xpath= "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement loginBtn;
	
	
	
	//Actions
	public void login()
	{
		usernameTxtBox.sendKeys("Admin");
		passwordTxtBox.sendKeys("admin123");
		loginBtn.click();
	}
}
