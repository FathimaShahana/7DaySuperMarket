package validationsOfAdminUsersPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages7daySuperMarket.AdminUsersPage;

public class CreateAndDeleteAUser extends AdminPageBaseTest {

	@Test(priority = 0, groups = { "Sanity", "Regression" })
	public void verifyNewUserCreate() {
		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
		adminUsersPage.clickOnNewUserButton();
		adminUsersPage.enterUsername("Fathima123");
		adminUsersPage.enterPassword("12334");
		adminUsersPage.enterUserType("Admin");
		adminUsersPage.clickOnSaveButton();

		String actual = adminUsersPage.getFirstUserInTable();
		Assert.assertEquals(actual, "Fathima123");
	}

	@Test(priority = 1, groups = { "Sanity", "Regression" })
	public void verifyDeleteOfUser() {

		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
		adminUsersPage.doDelete();

		Alert alertObj = driver.switchTo().alert();
		alertObj.accept();

		String actual1 = adminUsersPage.validateAlertPopupAfterDeleteUser();
		String expected = "×\nAlert!\nUser Deleted Successfully";
		Assert.assertTrue(actual1.equals(expected));

	}
}
