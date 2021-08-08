package validattionsOfLoginPAge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages7daySuperMarket.DashBoardPage;
import pages7daySuperMarket.LoginPage;

public class LoginPageTest {
	WebDriver driver;
	@BeforeClass
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();// create object of browser, like a= this is assigned to a
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
		driver.get("http://groceryapp.uniqassosiates.com/admin/login");// browsergets open now login so need username element
		LoginPage loginpageObj = new LoginPage(driver);
		loginpageObj.login("Admin", "admin");
	}
	
	@Test
	public void verifyDashBoardPage()
	{
		DashBoardPage dashBoardPageObj = new DashBoardPage(driver);
		boolean isDisplayed =(dashBoardPageObj.adminImageDisplayed());
		Assert.assertTrue(isDisplayed);	
	}
	
	@AfterClass
	public void quitdriver()
	{
		driver.quit();
	}
}

