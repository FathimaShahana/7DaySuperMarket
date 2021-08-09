package validationsOfManageCategoryPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import utils.GetWaitMethod;
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

		ManageCategoryPage manageCategoryPage = new ManageCategoryPage(driver);
		manageCategoryPage.navigateToManageCategoryButton();
		manageCategoryPage.clickOnCategoryRadioButton();
	}

	@AfterMethod
	public void screenShot(ITestResult result) throws IOException {

		DriverFactory.screenShotCondition(driver, result);
		ManageCategoryPage manageCategoryPage = new ManageCategoryPage(driver);
		manageCategoryPage.doLogout();

	}

	@AfterClass
	public void quitdriver() {
		DriverFactory.quitDriver(driver);
	}
}
