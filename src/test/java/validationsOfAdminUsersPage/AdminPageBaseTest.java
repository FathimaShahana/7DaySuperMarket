package validationsOfAdminUsersPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages7daySuperMarket.AdminUsersPage;
import utils.DriverFactory;
import utils.ScreenShotUtility;

public class AdminPageBaseTest {
	WebDriver driver;

	@BeforeClass
	public void initializeDriver() {
		driver = DriverFactory.driverInitialization();
	}

	@BeforeMethod
	public void NavigateToAdminUserPage() {
		DriverFactory.loginToGroceryApp(driver);

		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
		adminUsersPage.clickOnAdminUsers();
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
