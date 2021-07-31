package usersPageValidations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dataProvider.DataproviderForUsers;
import pages7daySuperMarket.AdminUsersPage;

public class verifySearchOfUsers extends AdminPageBaseTest {
	
@Test(dataProvider = "dataprovider1", dataProviderClass = DataproviderForUsers.class)
	public void verifySearchButtonInAdminUsersPage(String Username, String Password, String Usertype  )
	{
		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
		
		adminUsersPage.clickOnSearchButton();
		adminUsersPage.enterSearchUserName(Username);		
		//adminUsersPage.enterSearchUserType(Usertype);
		adminUsersPage.submitSearchButton();
		
		int actual = adminUsersPage.getListedUsersCount();

		Assert.assertEquals(actual,35);
		
	}
	
	

	
	
	
	
//	WebElement ResetButton = driver.findElement(By.xpath("//div[@class='card-body']//a[text()='Reset']"));
//	ResetButton.click();
	
}
