package validationsOfDashBoardPage;

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
import pages7daySuperMarket.DashBoardPage;
import pages7daySuperMarket.LoginPage;
import utils.DriverFactory;
import utils.GetWaitMethod;
import utils.ScreenShotUtility;

public class DashBoardPageBaseTest {
	WebDriver driver;

	@BeforeClass(alwaysRun = true)
	@Parameters({ "browserName" })
	public void initializeDriver(@Optional("chrome") String browser) {
		driver = DriverFactory.driverInitialization(browser);
	}

	@BeforeMethod(alwaysRun = true)
	public void NavigateToAdminUserPage() {

		DriverFactory.loginToGroceryApp(driver);

	}

	@AfterMethod(alwaysRun = true)
	public void screenShot(ITestResult result) throws IOException {
		DriverFactory.screenShotCondition(driver, result);

	}

	@AfterClass(alwaysRun = true)
	public void quitdriver() {
		DashBoardPage dashboardPage = new DashBoardPage(driver);
		dashboardPage.doLogout();

		DriverFactory.quitDriver(driver);
	}

}
