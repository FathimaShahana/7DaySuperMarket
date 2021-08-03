package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages7daySuperMarket.LoginPage;

public class DriverFactory {
	static String browserName = "chrome";
	
	public static WebDriver driverInitialization() {
		if(browserName=="firefox")
		{
			return getFireFoxDriver();
		}
		else if(browserName== "chrome")
		{
			return getChromeDriver();
		}
		else
		{
			return getChromeDriver();
		}
	}
	
	private static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// create object of browser, like a= this is assigned to a
		driver = GetWaitMethod.getImplicitWait(driver);
		return driver;
	}

	private static WebDriver getFireFoxDriver() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Program Files\\webdrivers\\geckodriver-v0.29.1-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	

	public static void driverClose(WebDriver driver) {

		driver.quit();
	}

	public static void loginToGroceryApp(WebDriver driver) {

		driver.get("http://groceryapp.uniqassosiates.com/admin/login");// browsergets open now login so need username

		LoginPage loginpageObj = new LoginPage(driver);
		loginpageObj.login("Admin", "admin");
	}

}
