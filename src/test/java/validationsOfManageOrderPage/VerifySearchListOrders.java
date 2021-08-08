package validationsOfManageOrderPage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages7daySuperMarket.ManageOrdersPage;

public class VerifySearchListOrders extends ManageOrdersBaseTest {
	@Test
	public void verifySearchofOrdersInList()

	{
		ManageOrdersPage manageOrderspage = new ManageOrdersPage(driver);
		manageOrderspage.clickOnSearchButton();
		manageOrderspage.enterInOrderIdTextBox("128");
		manageOrderspage.clickOnSubmitSearch();

		int actual = manageOrderspage.verifyListofTableCount();
		Assert.assertEquals(actual, 1);

	}

	@Test
	public void verifyDropDownstatusPaid() {
		ManageOrdersPage manageOrderspage = new ManageOrdersPage(driver);
		manageOrderspage.clickOnSearchButton();

		manageOrderspage.clickToSelectpaymentmodeDropDown();
		manageOrderspage.enterPaymentMode("COD");
		
		manageOrderspage.clickToSelectStatusDropdown();
		manageOrderspage.enterstatus("Paid");
		
		manageOrderspage.clickOnSubmitSearch();

		int actual = manageOrderspage.getsizeOfPaidOrderList();
		Assert.assertEquals(actual, 5);

	}

}
