package validationsOfMobileSliderPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pages7daySuperMarket.AdminUsersPage;
import pages7daySuperMarket.LoginPage;
import pages7daySuperMarket.MobileSliderPage;
import utils.DriverFactory;
import utils.GetWaitMethod;
import utils.ScreenShotUtility;

public class MobilesliderBaseTest {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browserName" })
	public void initializeDriver(@Optional("chrome") String browser) {
		driver = DriverFactory.driverInitialization(browser);

	}

	@BeforeMethod
	public void NavigateToMobilesliderPage() {

		DriverFactory.loginToGroceryApp(driver);

		MobileSliderPage mobileSliderPage = new MobileSliderPage(driver);
		mobileSliderPage.clickOnMobileSliderButton();
	}

	@AfterMethod
	public void screenShot(ITestResult result) throws IOException {
		DriverFactory.screenShotCondition(driver, result);
	}

	@AfterClass
	public void quitdriver() {
		DriverFactory.quitDriver(driver);
	}

}
