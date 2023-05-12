package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.TestBase;

	public class Util extends TestBase 
	{
	public static void switchToMainPanelFrame()
	{
		driver.switchTo().frame("mainpanel");
	}
	public static void mouseHoverAction(WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
}
