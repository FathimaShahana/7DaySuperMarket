package validationsOfDashBoardPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages7daySuperMarket.AdminUsersPage;
import pages7daySuperMarket.DashBoardPage;

public class DashBoardPageTest extends  DashBoardPageBaseTest{
	@Test
	public void methd()
	{
		DashBoardPage dashboardPage = new DashBoardPage(driver);
	
		boolean actual=dashboardPage.displayAdminImage();
		boolean expected=true;
		Assert.assertEquals(actual, expected);
		
	}

}
