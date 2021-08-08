package validationsOfDashBoardPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages7daySuperMarket.AdminUsersPage;
import pages7daySuperMarket.DashBoardPage;

public class DashBoardPageTest extends DashBoardPageBaseTest {
	@Test(groups = { "Sanity" })
	public void isAdminImageDisplayed() {
		DashBoardPage dashboardPage = new DashBoardPage(driver);

		boolean actual = dashboardPage.adminImageDisplayed();
		boolean expected = true;
		Assert.assertEquals(actual, expected);

	}

}
