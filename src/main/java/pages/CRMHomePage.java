package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.Util;

public class CRMHomePage extends TestBase
{ //to initialize webelements
	public CRMHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	//WebElementsRepository
	
	@FindBy (xpath="/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
	WebElement user;
	
	@FindBy(xpath="(//a[@class='topnavlink'])[3]")
	WebElement logoutBtn;
	
	@FindBy(xpath="//td[text()='CRMPRO']")
	WebElement logo;
	
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement Contacts;
	
	@FindBy(xpath="//a[text()='New Contact']")
	WebElement NewContact;
	
	@FindBy(xpath="//a[text()='Companies']")
	WebElement company;
	
	@FindBy(xpath="//a[text()='New Company']")
	WebElement newCompany;
	
	@FindBy(xpath="//a[text()='Deals']")	
	WebElement deal;
	
	@FindBy(xpath="//a[text()='New Deal']")
	WebElement newDeal;
	
	@FindBy(xpath="//a[text()='Tasks']")
	WebElement task;
	
	@FindBy(xpath="//a[text()='New Task']")
	WebElement newTask;
	//actions
	public String userCheck()
	{
		//driver.switchTo.frame("mainpanel");
		Util.switchToMainPanelFrame();

		String userName =user.getText();
		return userName;
	}
	public void logout()
	{
		//driver.switchTo().frame("mainpanel");
		Util.switchToMainPanelFrame();

		logoutBtn.click();
	}
	public boolean logocheck()
	{
		//driver.switchTo.frame("mainpanel");
		Util.switchToMainPanelFrame();

		boolean status = logo.isDisplayed();
		return status;
	}
	public NewContactPage NewContact()
	{
		//driver.switchTo.frame("mainpanel");
		Util.switchToMainPanelFrame();

		//Actions act= new Actions(driver);
		//act.moveToElement(Contacts).build().perform();
		Util.mouseHoverAction(Contacts);
		NewContact.click();
		return new NewContactPage();
	}
	public void createCompany()
	{
		//driver.switchTo.frame("mainpanel");
		Util.switchToMainPanelFrame();

		//Actions act= new Actions(driver);
		//act.moveToElement(company).build().perform();
		Util.mouseHoverAction(company);
		newCompany.click();

	}
	public void createDeal()
	{
		//driver.switchTo.frame("mainpanel");
		Util.switchToMainPanelFrame();
		//Actions act= new Actions(driver);
		//act.moveToElement(deal).build().perform();
		Util.mouseHoverAction(deal);
		newDeal.click();
	}
	public void createTask()
	{
		//driver.switchTo.frame("mainpanel");
		Util.switchToMainPanelFrame();

		//Actions act= new Actions(driver);
		//act.moveToElement(task).build().perform();
		Util.mouseHoverAction(task);
		newTask.click();
	}
}
