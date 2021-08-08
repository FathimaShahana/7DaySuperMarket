package validationsOfAdminUsersPage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataProvider7rMartAdminUsersAdding.DataproviderForUsers;
import pages7daySuperMarket.AdminUsersPage;
import utils.ScreenShotUtility;

public class UserCanCreateDifferentUsers extends AdminPageBaseTest {

	@Test(dataProvider = "dataprovider1", dataProviderClass = DataproviderForUsers.class)
	public void verifynewUsers(String Username, String Password, String UserType) throws IOException {
		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);

		adminUsersPage.clickOnNewUserButton();
		adminUsersPage.enterUsername(Username);
		adminUsersPage.enterPassword(Password);
		adminUsersPage.enterUserType(UserType);
		adminUsersPage.clickOnSaveButton();

		ScreenShotUtility.ScreenShot(driver, "fileNameScreenshot1.png");

		String actual = adminUsersPage.getFirstUserInTable();
		Assert.assertEquals(actual, Username);

	}

}
