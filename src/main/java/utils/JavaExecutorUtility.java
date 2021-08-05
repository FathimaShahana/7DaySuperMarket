package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutorUtility {

	public static void javaExecuterClick(WebDriver driver, String path) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript(path);
		jse.executeScript(path + "[0].click();");
	}

}
