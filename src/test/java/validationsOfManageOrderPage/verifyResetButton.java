package validationsOfManageOrderPage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages7daySuperMarket.ManageOrdersPage;
import utils.ScreenShotUtility;

public class verifyResetButton extends ManageOrdersBaseTest {
	@Test
	public void validateResetButton() throws IOException {
		ManageOrdersPage manageOrderspage = new ManageOrdersPage(driver);

		manageOrderspage.clickOnSearchButton();
		manageOrderspage.enterInOrderIdTextBox("128");

		manageOrderspage.clickOnResetButton();

		Assert.assertFalse(manageOrderspage.isDisplayedsearchListOrdersTitle(), "search block is displayed");
	}

}
