package validationsOfManageCategoryPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages7daySuperMarket.ManageCategoryPage;

public class AddNewCategory extends ManageCategoryPageBaseTest {
	@Test
	public void verifyNewCategoryAdding() {
		ManageCategoryPage manageCategoryPage = new ManageCategoryPage(driver);

		manageCategoryPage.clickOnNewButton();
		manageCategoryPage.enterTextToAddCategoryTextBox("Organic Flowers1");
		manageCategoryPage.selectGroup();
		manageCategoryPage.insertImage("C:\\Users\\ANVER\\Desktop\\11.PNG");
		
		manageCategoryPage.clickOnSaveButton();

		String actual1 = manageCategoryPage.getAlertWindowText();
		String expected = "�\nAlert!\nCategory Created Successfully";
		Assert.assertTrue(actual1.equals(expected));

	}
}
