package validationsOfManageUsersPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages7daySuperMarket.DashBoardPage;
import pages7daySuperMarket.LoginPage;
import pages7daySuperMarket.ManageOrdersPage;
import pages7daySuperMarket.ManageUsersPage;
import utils.DriverFactory;
import utils.GetWaitMethod;
import utils.ScreenShotUtility;

public class ManageUserPageBaseTest {
	WebDriver driver;
	@BeforeClass
	public void initializeDriver() {
		driver=DriverFactory.driverInitialization();
			
		
	}
		@BeforeMethod
		public void navigateToManageOrderPage() {
			DriverFactory.loginToGroceryApp(driver);
			
			ManageUsersPage manageUserspage = new ManageUsersPage(driver);
			manageUserspage.clickOnManageUsersButton();
		}

		@AfterMethod
		public void screenShot(ITestResult result) throws IOException {
			if (result.getStatus() == ITestResult.SUCCESS) {

			} else if (result.getStatus() == ITestResult.SUCCESS) {
				ScreenShotUtility.ScreenShot(driver, result.getName() + "_Failure.png");
			}
		
	}
	
	@AfterClass
	public void quitdriver()
	{
		ManageUsersPage manageUserspage = new ManageUsersPage(driver);
		manageUserspage.doLogout();
		DriverFactory.driverClose(driver);
}
}
