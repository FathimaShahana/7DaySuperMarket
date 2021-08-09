package validationsOfAdminUsersPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages7daySuperMarket.AdminUsersPage;

public class VerifyResetButton extends AdminPageBaseTest {

	@Test(groups = { "Regression" })
	public void verifyResetButton() {

		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);

		adminUsersPage.clickOnSearchButton();
		adminUsersPage.enterSearchUserName("aa");
		adminUsersPage.clickOnResetButton();

		Assert.assertFalse(adminUsersPage.isTitleSearchAdminUsersDisplayed(), "search block is displayed");

	}

}
