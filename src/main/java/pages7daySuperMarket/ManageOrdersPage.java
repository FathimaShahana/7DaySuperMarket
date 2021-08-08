package pages7daySuperMarket;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageOrdersPage {
	WebDriver driver;

	public ManageOrdersPage(WebDriver driver) {
		this.driver = driver;// driver mthd contstr variabledriver,thidriver this class
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(., 'Manage Orders')]")
	public WebElement manageOrdersButton;

	@FindBy(xpath = "//a[@onclick='click_button(2)']")
	public WebElement clickOnSearch;

	@FindBy(xpath = "//input[@id='od']")
	public WebElement orderIdTextBox;

	@FindBy(xpath = "//button[@name='Search']")
	public WebElement submitSearch;

	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr")
	public List<WebElement> tableList;

	@FindBy(xpath = "//select[@name='pt']")
	public WebElement paymentMode;

	@FindBy(xpath = "//select[@name='pt']/option[text()='COD']")
	public WebElement dropdownCOD;

	@FindBy(xpath = "//select[@name='st']")
	public WebElement statusDropDown;

	@FindBy(xpath = "//select[@name='st']/option[@value='Paid']")
	public WebElement paidSelect;

	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr")
	public List<WebElement> tablePaidList;

	@FindBy(xpath = "//button[@name='Reset']")
	public WebElement resetButton;

	@FindBy(xpath = "//h4[text()='Search List Orders']")
	public WebElement searchListOrdersTitle;

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	public WebElement adminImageAndTextButton;

	@FindBy(xpath = "//a[@class='dropdown-item'][2]")
	public WebElement logoutButton;

	public void enterstatus(String status) {

		Select statusObj = new Select(statusDropDown);
		statusObj.selectByVisibleText(status);
	}

	public void enterPaymentMode(String mode) {

		Select statusObj = new Select(paymentMode);
		statusObj.selectByVisibleText(mode);
	}

	public boolean isDisplayedsearchListOrdersTitle() {
		return searchListOrdersTitle.isDisplayed();
	}

	public void clickOnResetButton() {
		resetButton.click();
	}

	//
	public void clickToSelectpaymentmodeDropDown() {
		paymentMode.click();
	}
	

	public int getsizeOfPaidOrderList() {
		return tablePaidList.size();
	}

	
	
	public void clickToSelectStatusDropdown() {
		statusDropDown.click();

	}

	public int verifyListofTableCount() {
		return tableList.size();

	}

	public void clickOnSubmitSearch() {
		submitSearch.click();
	}

	public void clickOnSearchButton() {
		clickOnSearch.click();
	}

	public void enterInOrderIdTextBox(String id) {
		orderIdTextBox.sendKeys(id);

	}

	public void clickOnManageOrdersPage() {

		manageOrdersButton.click();
	}

	public void doLogout() {
		adminImageAndTextButton.click();
		logoutButton.click();

	}
}
