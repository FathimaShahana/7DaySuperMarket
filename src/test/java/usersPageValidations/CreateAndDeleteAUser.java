package usersPageValidations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages7daySuperMarket.AdminUsersPage;

public class CreateAndDeleteAUser extends AdminPageBaseTest{
	
	@Test(priority=0)
	public void verifyNewUserCreate()
	{
		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
		adminUsersPage.clickOnNewUserButton();
		adminUsersPage.enterUsernameForFathima123();
		adminUsersPage.enterPasswordForFathima123();
		adminUsersPage.enterUserTypeForFathima123();
		adminUsersPage.clickOnSaveButtonForFathima123();
		
        String actual=	adminUsersPage.getFirstUserInTable();
		Assert.assertEquals(actual, "Fathima123");
			}
@Test(priority=1)
	public void verifyDeleteOfUser()
	{
		
		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
		adminUsersPage.clickOnDeleteIconForFathima123();
		
		Alert alertObj= driver.switchTo().alert();
		alertObj.accept();
	
	
		String actual1=adminUsersPage.validateAlertPopupAfterDeleteUser();
		String expected="×\nAlert!\nUser Deleted Successfully";
	Assert.assertEquals(actual1, expected);
		
}
}
