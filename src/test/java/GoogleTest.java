import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void initialization()
	{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	}
	@Test
	public void GooglesearchTest()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Maven");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
