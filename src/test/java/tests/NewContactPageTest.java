package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CRMHomePage;
import pages.CRMLoginPage;
import pages.NewContactPage;
import utility.ReadData;

public class NewContactPageTest extends TestBase
{
	CRMHomePage homePage;
	NewContactPage newContactpage;
	
	@BeforeMethod
	public void initialization()
	{
		init();
		CRMLoginPage loginPage= new CRMLoginPage();
		 homePage = loginPage.login();
		 newContactpage = new NewContactPage();
	}
	@DataProvider(name="ContactData")
	public String[][] passData()
	{
		return ReadData.testData();
	}
	@Test(dataProvider="ContactData")
	public void validatecreateContactTest(String FirstName,String LastName,String CompanyName,String MobileNumber,String EmailID,String Address)
	{
		homePage.NewContact();
		newContactpage.createNewContact(FirstName,LastName,CompanyName,MobileNumber,EmailID,Address);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
