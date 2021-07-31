package usersPageValidations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataProvider.DataproviderForUsers;
import pages7daySuperMarket.AdminUsersPage;

public class UserCanCreateDifferentUsers extends AdminPageBaseTest{
	
	@Test(dataProvider = "dataprovider1", dataProviderClass = DataproviderForUsers.class)
	public void verifynewUsers(String Username,String Password,String UserType)
	{
		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
		
		adminUsersPage.clickOnNewUserButton();
		adminUsersPage.enterUsername(Username);
		adminUsersPage.enterPassword(Password);
		adminUsersPage.enterUserType(UserType);
		adminUsersPage.clickOnSaveButton();
		
		String actual=	adminUsersPage.getFirstUserInTable();
		
		Assert.assertEquals(actual, Username);
		
	}	
	
}
