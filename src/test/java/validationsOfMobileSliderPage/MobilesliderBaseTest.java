package validationsOfMobileSliderPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages7daySuperMarket.AdminUsersPage;
import pages7daySuperMarket.LoginPage;
import pages7daySuperMarket.MobileSliderPage;
import utils.DriverFactory;
import utils.GetWaitMethod;
import utils.ScreenShotUtility;

public class MobilesliderBaseTest {
	WebDriver driver;

	@BeforeClass
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();// create object of browser, like a= this is assigned to a
		driver = GetWaitMethod.getImplicitWait(driver);

	}

	@BeforeMethod
	public void NavigateToMobilesliderPage() {

		DriverFactory.loginToGroceryApp(driver);

		MobileSliderPage mobileSliderPage = new MobileSliderPage(driver);
		mobileSliderPage.clickOnMobileSliderButton();
	}

	@AfterMethod
	public void screenShot(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.SUCCESS) {

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			ScreenShotUtility.ScreenShot(driver, result.getName() + "_Failure.png");
		}
	}

	@AfterClass
	public void quitdriver() {
		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
		adminUsersPage.doLogout();
		
		DriverFactory.driverClose(driver);
	}

}
