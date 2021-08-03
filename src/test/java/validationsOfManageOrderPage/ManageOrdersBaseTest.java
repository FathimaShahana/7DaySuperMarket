package validationsOfManageOrderPage;

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
import pages7daySuperMarket.ManageOrdersPage;
import utils.DriverFactory;
import utils.GetWaitMethod;
import utils.ScreenShotUtility;

public class ManageOrdersBaseTest {

	WebDriver driver;

	@BeforeClass
	public void initializeDriver() {
		driver = DriverFactory.driverInitialization();
	}

	@BeforeMethod
	public void NavigateToAdminUserPage() {

		DriverFactory.loginToGroceryApp(driver);

		ManageOrdersPage manageOrderspage = new ManageOrdersPage(driver);
		manageOrderspage.clickOnManageOrdersPage();
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
		ManageOrdersPage manageOrderspage = new ManageOrdersPage(driver);
		manageOrderspage.doLogout();

			DriverFactory.driverClose(driver);
	}
}
