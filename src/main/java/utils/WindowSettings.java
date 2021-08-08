package utils;

import org.openqa.selenium.WebDriver;

public class WindowSettings {
	
	public  static void maximiseWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}

}
