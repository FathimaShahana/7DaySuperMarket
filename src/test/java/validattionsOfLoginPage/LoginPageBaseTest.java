package validattionsOfLoginPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pages7daySuperMarket.DashBoardPage;
import pages7daySuperMarket.LoginPage;
import utils.DriverFactory;

public class LoginPageBaseTest {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browserName" })
	public void initializeDriver(@Optional("chrome") String browser) {
		driver = DriverFactory.driverInitialization(browser);
	}

	@BeforeMethod
	public void NavigateToAdminUserPage() {

		DriverFactory.loginToGroceryApp(driver);

	}

	@AfterMethod
	public void screenShot(ITestResult result) throws IOException {
		DriverFactory.screenShotCondition(driver, result);

	}

	@AfterClass
	public void quitdriver() {
		LoginPage loginpageObj = new LoginPage(driver);
		loginpageObj.doLogout();

		DriverFactory.quitDriver(driver);
	}


}
