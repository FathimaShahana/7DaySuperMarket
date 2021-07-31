package usersPageValidations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages7daySuperMarket.AdminUsersPage;
import pages7daySuperMarket.DashBoardPage;
import pages7daySuperMarket.LoginPage;
import utils.GetWaitMethod;

public class AdminPageBaseTest {
	WebDriver driver;

	@BeforeClass
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();// create object of browser, like a= this is assigned to a
		driver = GetWaitMethod.getImplicitWait(driver);

		driver.get("http://groceryapp.uniqassosiates.com/admin/login");// browsergets open now login so need username
																		// element
		LoginPage loginpageObj = new LoginPage(driver);
		loginpageObj.login("Admin", "admin");

		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
		adminUsersPage.clickOnAdminUsers();
	}

	@AfterClass
	public void quitdriver() {
		driver.quit();
	}
}
