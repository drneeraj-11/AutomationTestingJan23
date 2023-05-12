package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import base.TestBase;
import pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginpage ;
	@BeforeMethod
	public void initialization()
	{
		init();
		loginpage= new LoginPage();
	}
	@Test
	public void validateLoginTest()
	{
		loginpage.login();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
