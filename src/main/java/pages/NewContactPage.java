package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class NewContactPage extends TestBase
{
	//initialization
	public NewContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//webelements
	@FindBy(name="title")
	WebElement Title;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement companyName;
	//@FindBy(xpath="//input[@value='Lookup']")
	//WebElement lookupBtn;
	//@FindBy(id="search")
	//WebElement searchBtnTxt;
	//@FindBy(xpath="//input[@value='Search']")
	//WebElement searchBtn;
	@FindBy(id="mobile")
	WebElement MobileNo;
	@FindBy(id="email")
	WebElement emailId;
	
	@FindBy(name="address")
	WebElement address;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")
	WebElement saveBtn;
	
	
	//actions
public void createNewContact(String FN,String LN,String CN,String MobNo,String EID,String Add)
	{
	//Select sel=new Select(Title);
	//sel.selectByVisibleText("Mrs.");
	firstName.sendKeys(FN);
	lastName.sendKeys(LN);
	companyName.sendKeys(CN);
	MobileNo.sendKeys(MobNo);
	emailId.sendKeys(EID);
	address.sendKeys(Add);
	saveBtn.click();
	
	
	}
}
