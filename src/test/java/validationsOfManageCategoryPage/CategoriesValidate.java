package validationsOfManageCategoryPage;

import org.testng.annotations.Test;

import pages7daySuperMarket.ManageCategoryPage;

public class CategoriesValidate extends ManageCategoryPageBaseTest {
@Test
public void verifyRadioButton()
{
	ManageCategoryPage  manageCategoryPage = new ManageCategoryPage(driver);
	manageCategoryPage.selectCategoryDropDown();
	manageCategoryPage.clickOnNewButton();
	manageCategoryPage.enterTextToAddCategoryTextBox();
	
	manageCategoryPage. insertImage();
}
}
