package manageUsersPageValidation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages7daySuperMarket.LoginPage;
import pages7daySuperMarket.ManageOrdersPage;
import pages7daySuperMarket.ManageUsersPage;
import utils.GetWaitMethod;

public class ManageUserPageBaseTest {
	WebDriver driver;
	@BeforeClass
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();// create object of browser, like a= this is assigned to a
		driver=GetWaitMethod.getImplicitWait(driver);
			
		driver.get("http://groceryapp.uniqassosiates.com/admin/login");// browsergets open now login so need username element
		LoginPage loginpageObj = new LoginPage(driver);
		loginpageObj.login("Admin", "admin");
		
		ManageUsersPage manageUserspage = new ManageUsersPage(driver);
		manageUserspage.clickOnManageUsersButton();
	}
	
	@AfterClass
	public void quitdriver()
	{
	driver.quit();
}
}
