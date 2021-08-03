package validationsOfManageUsersPage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages7daySuperMarket.ManageUsersPage;

public class DeleteAUser extends ManageUserPageBaseTest {
	@Test(priority = 0)
	public void verifyLockUserChindhuAbraham() {
		ManageUsersPage manageUserspage = new ManageUsersPage(driver);
		manageUserspage.clickonLockOfUserChIndhuAbraham();

		// boolean isDisplayed = manageUserspage.clickonLockOfUserChIndhuAbraham();
		// Assert.assertFalse(isDisplayed );

	}

	@Test(priority = 1)
	public void deleteUserChindhuAbraham() {
		ManageUsersPage manageUserspage = new ManageUsersPage(driver);
		manageUserspage.clickOnDeleteIconInUserChindhuAbraham();
		Alert alertObj = driver.switchTo().alert();
		alertObj.dismiss();
		
		/*alertObj.accept();;
		
		String actual1 = manageUserspage.validateAlertPopupAfterDeleteUser();
		String expected = "\r\n" + "            User Informations Deleted Successfully        ";
		Assert.assertEquals(actual1, expected);*/

	}

}
