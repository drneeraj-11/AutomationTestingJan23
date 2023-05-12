package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CRMHomePage;
import pages.CRMLoginPage;


	public class CRMHomePageTest extends TestBase
	{ 
		CRMHomePage homePage;
		@BeforeMethod
		public void initialization()
		{
			init();
			CRMLoginPage  loginPage= new CRMLoginPage();      
			homePage= loginPage.login();
					}
		@Test
	public void validateuserTest()
		{
			homePage.userCheck();
		}
		@Test
		public void validateLogoutTest()
		
		{
			homePage.logout();
		}
		@Test
		public void validateHomePageLogoTest()
		{
			homePage.logocheck();
		}
		@Test
		public void validateRedirectionCreateContactTest()
		{
			homePage.NewContact();
		}
		@Test
		public void validateRedirectionOfCreateCompanyTest()
		{
			homePage.createCompany();
		}
		@Test
		public void validateRedirectionofcreateDealTest()
		{
			homePage.createDeal();
		}
		@Test
		public void validteRedirectionofCreateTaskTest()
		{
			homePage.createTask();
		}
		@AfterMethod
		
		public void tearDown()
		{
			driver.close();
		}
}
