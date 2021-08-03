package validationsOfAdminUsersPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import dataProvider7rMartAdminUsersAdding.DataproviderForUsers;
import pages7daySuperMarket.AdminUsersPage;

public class verifyCreateAndSearchOfUsers extends AdminPageBaseTest {

	@Test(dataProvider = "excelread", dataProviderClass = dataProvider7rMartAdminUsersAdding.DataproviderForUsers.class)
	public void verifySearchButtonInAdminUsersPage(String Username, String Password, String UserType) {

		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);

		adminUsersPage.clickOnNewUserButton();
		adminUsersPage.enterUsername(Username);
		adminUsersPage.enterPassword(Password);
		adminUsersPage.enterUserType(UserType);
		adminUsersPage.clickOnSaveButton();

		adminUsersPage.clickOnSearchButton();
		adminUsersPage.enterSearchUserName(Username);
		adminUsersPage.enterSearchUserType(UserType);
		adminUsersPage.submitSearchButton();

		String actualFirstUser = adminUsersPage.getFirstUserInTable();
		Assert.assertEquals(actualFirstUser, Username);

		int actualUserCount = adminUsersPage.getListedUsersCount();
		Assert.assertEquals(actualUserCount, 1);

	}
	

}
