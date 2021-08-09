package validationsOfManageOrderPage;

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
import pages7daySuperMarket.ManageOrdersPage;
import utils.DriverFactory;
import utils.GetWaitMethod;
import utils.ScreenShotUtility;

public class ManageOrdersBaseTest {

	WebDriver driver;

	@BeforeClass
	@Parameters({ "browserName" })
	public void initializeDriver(@Optional("chrome") String browser) {
		driver = DriverFactory.driverInitialization(browser);
	}

	@BeforeMethod
	public void NavigateToAdminUserPage() {

		DriverFactory.loginToGroceryApp(driver);

		ManageOrdersPage manageOrderspage = new ManageOrdersPage(driver);
		manageOrderspage.clickOnManageOrdersPage();
	}

	@AfterMethod
	public void screenShot(ITestResult result) throws IOException {
		DriverFactory.screenShotCondition(driver, result);
	}

	@AfterClass
	public void quitdriver() {
		ManageOrdersPage manageOrderspage = new ManageOrdersPage(driver);
		manageOrderspage.doLogout();

			DriverFactory.quitDriver(driver);
	}
}
