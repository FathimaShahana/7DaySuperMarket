package pages7daySuperMarket;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.GetWaitMethod;

public class AdminUsersPage {
	WebDriver driver;

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;// driver mthd contstr variabledriver,thidriver this class
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(., 'Admin Users')]")
	public WebElement adminUsersButton;

	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	public WebElement newUserButton;

	@FindBy(xpath = "//input[@id='username']")
	public WebElement userNameInputField;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordInputField;

	@FindBy(xpath = "//select[@id='user_type']")
	public WebElement userTypeInputField;

	@FindBy(xpath = "//button[@name='Create']")
	public WebElement saveButton;

	@FindBy(xpath = "//div[@class='card']/div/table/tbody")
	public WebElement userTable;

	@FindBy(xpath = "//div[@class='card']/div/table/tbody/tr")
	public List<WebElement> userRows;

	@FindBy(xpath = "//div[@class='card']/div/table/tbody/tr[1]/td[1]")
	public WebElement firstUserInTable;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	public WebElement searchButton;

	@FindBy(xpath = ("//input[@id='un']"))
	public WebElement searchUserName;

	@FindBy(xpath = ("//select[@id='ut']"))
	public WebElement searchUserType;

	@FindBy(xpath = ("//button[@name='Search']"))
	public WebElement submitSearch;

	@FindBy(xpath = ("//a[@class='btn btn-rounded btn-warning']"))
	public WebElement resetButton;

	@FindBy(xpath = "//h4[text()='Search Admin Users']")
	public WebElement searchAdminUsersTitle;

	@FindBy(xpath = "//td[text()='Fathima123']/parent::tr/td/a[@class='btn btn-sm btn btn-danger btncss']")
	public WebElement deleteIconForAUser;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	public WebElement alertPopUpAfterDeletingAUser;

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	public WebElement adminImageAndTextButton;

	@FindBy(xpath = "//a[@class='dropdown-item'][2]")
	public WebElement LogoutButton;

	public void doLogout() {
		adminImageAndTextButton.click();
		LogoutButton.click();
	}

	public String validateAlertPopupAfterDeleteUser() {
		return alertPopUpAfterDeletingAUser.getText();
	}

	public void enterUsernameForFathima123() {
		userNameInputField.sendKeys("Fathima123");
	}

	public void clickOnSaveButtonForFathima123() {
		saveButton.click();
	}

	public void enterUserTypeForFathima123() {
		userTypeInputField.sendKeys("Admin");
	}

	public void enterPasswordForFathima123() {
		passwordInputField.sendKeys("Password");
	}

	public void clickOnDeleteIconofFathima123() {
		deleteIconForAUser.click();

	}

	public boolean isTitleSearchAdminUsersDisplayed() {
		return searchAdminUsersTitle.isDisplayed();

	}

	public int getListedUsersCount() {
		return userRows.size() / 2;
	}

	public void clickOnResetButton() {
		GetWaitMethod.waitForElementIn7DaySuperMarket(driver, 5, resetButton);
		resetButton.click();
	}

	public void submitSearchButton() {
		submitSearch.click();
	}

	public void enterSearchUserName(String Username) {
		searchUserName.clear();
		searchUserName.sendKeys(Username);
	}

	public void enterSearchUserType(String UserType) {
		// searchUserType.clear();

		Select userTypeObj1 = new Select(searchUserType);
		userTypeObj1.selectByVisibleText(UserType);
		// searchUserType.sendKeys(Usertype);
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public String getFirstUserInTable() {
		return firstUserInTable.getText();
	}

	public void clickOnSaveButton() {
		saveButton.click();
	}

	public void enterUserType(String UserType) {

		Select userTypeobj = new Select(userTypeInputField);
		userTypeobj.selectByVisibleText(UserType);

	}

	public void enterPassword(String Password) {
		passwordInputField.sendKeys(Password);
	}

	public void enterUsername(String Username) {
		userNameInputField.sendKeys(Username);
	}

	public void clickOnNewUserButton() {
		newUserButton.click();
	}

	public void clickOnAdminUsers() {
		adminUsersButton.click();
	}

}
