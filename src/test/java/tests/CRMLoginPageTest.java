package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CRMLoginPage;
import pages.LoginPage;

public class CRMLoginPageTest extends TestBase
{
	
	CRMLoginPage loginpage ;
	@BeforeMethod
	public void initialization()
	{
		init();
		loginpage= new CRMLoginPage();
	}
	@Test
	public void validateLoginTest()
	{
		loginpage.login();
	}
	@Test
	public void validateLogoTest()
	{
		boolean actualstatus = loginpage.logoStatus();
		Assert.assertEquals(actualstatus, true);
	}
	@Test
	public void validateLinksTest()
	{
		boolean actualstatus = loginpage.linkStatus();
		Assert.assertTrue(actualstatus);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}


}
 