package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetWaitMethod {
	
	public static WebDriver getImplicitWait(WebDriver driver)
	{
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
		
		
		return driver;
	}
	
	public static void waitForElementIn7DaySuperMarket(WebDriver driver,int seconds,WebElement element)
	{
		WebDriverWait wait= new WebDriverWait (driver,seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

}
