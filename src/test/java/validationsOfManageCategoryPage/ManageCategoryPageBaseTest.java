package validationsOfManageCategoryPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pages7daySuperMarket.AdminUsersPage;
import pages7daySuperMarket.ManageCategoryPage;
import utils.DriverFactory;
import utils.ScreenShotUtility;

public class ManageCategoryPageBaseTest {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browserName" })
	public void initializeDriver(@Optional("chrome") String browser) {
		driver = DriverFactory.driverInitialization(browser);
	}

	@BeforeMethod
	public void NavigateToAdminUserPage() {
		DriverFactory.loginToGroceryApp(driver);

		ManageCategoryPage  manageCategoryPage = new ManageCategoryPage(driver);
		manageCategoryPage.clickOnmanageCategoryButton();
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
		ManageCategoryPage  manageCategoryPage = new ManageCategoryPage(driver);
		manageCategoryPage.doLogout();

		DriverFactory.driverClose(driver);
	}
}


