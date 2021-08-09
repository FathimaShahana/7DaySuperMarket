package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorUtility {

	public static void javaExecuterClick(WebDriver driver, String path) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript(path);
		jse.executeScript(path + "[0].click();");
	}

	public static void scrollWindow(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");
	}
	
	public static void scrollToFindElement(WebDriver driver,WebElement Element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
	}
	
	public static void scrollToBottomOfPage(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}
