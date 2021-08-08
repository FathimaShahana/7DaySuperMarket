package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;

import pages7daySuperMarket.LoginPage;

public class DriverFactory {

	public static WebDriver driverInitialization(String browserName) {

		if (browserName.equals("firefox")) {
			return getFireFoxDriver();
		}

		else if (browserName.equals("chrome")) {
			return getChromeDriver();
		}

		else {
			return getChromeDriver();

		}
	}

	private static WebDriver getChromeDriver() {
		System.setProperty(DriverSettings.chromeKey, DriverSettings.chromeLocation);
		WebDriver driver = new ChromeDriver();
		driver = GetWaitMethod.getImplicitWait(driver);
		return driver;
	}

	private static WebDriver getFireFoxDriver() {
		System.setProperty(DriverSettings.firefoxKey, DriverSettings.firefoxLocation);
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

	public static void loginToGroceryApp(WebDriver driver) {

		driver.get(ApplicationSettings.loginUrl);

		LoginPage loginpageObj = new LoginPage(driver);
		loginpageObj.login(ApplicationSettings.username, ApplicationSettings.password);
		WindowSettings.maximiseWindow(driver);

	}

	public static void screenShotCondition(WebDriver driver, ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.SUCCESS) {

		} else if (result.getStatus() == ITestResult.FAILURE) {
			ScreenShotUtility.ScreenShot(driver, result.getName() + "_Failure.png");
		}
	}

	public static void quitDriver(WebDriver driver) {
		driver.quit();
	}

}
