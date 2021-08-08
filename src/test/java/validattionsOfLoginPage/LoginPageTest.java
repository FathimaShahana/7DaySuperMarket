package validattionsOfLoginPage;

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

public class LoginPageTest extends LoginPageBaseTest {
	
	@Test
	
	public void verifyDashBoardPage()
	{
		DashBoardPage dashBoardPageObj = new DashBoardPage(driver);
		boolean isDisplayed =(dashBoardPageObj.adminImageDisplayed());
		Assert.assertTrue(isDisplayed);	
	}
	
	
}

