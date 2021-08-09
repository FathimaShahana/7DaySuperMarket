package pages7daySuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.JavascriptExecutorUtility;

public class ManageCategoryPage {
	WebDriver driver;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;// driver mthd contstr variabledriver,thidriver this class
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[contains(.,' Manage Category ')]/parent::*")
	public WebElement manageCategoryButton;

	@FindBy(xpath = "//a[@data-toggle='dropdown']/parent::*")
	public WebElement adminImageAndTextButton;

	@FindBy(xpath = "//a[@class='dropdown-item'][2]")
	public WebElement logoutButton;

	@FindBy(xpath = "//p[text()='Category']/parent::a")
	public WebElement categoryRadioButton;

	@FindBy(xpath = "//div[@class='col-sm-12']//a[@onclick='click_button(1)']")
	public WebElement newButton;

	@FindBy(xpath = "//input[@id='category']")
	public WebElement addCategoryTextBox;

	@FindBy(xpath = "//li[@id='1-selectable']")
	public WebElement firstGroup;

	@FindBy(xpath = "//input[@id='main_img']")
	public WebElement chooseFileButton;

	@FindBy(xpath = "//div[@class='col-md-4'][1]//following-sibling::*/following-sibling::*[3]")
	public WebElement radioButtonNoInTopMenu;

	@FindBy(xpath = "//div[@class='col-md-4'][2]//following-sibling::*/following-sibling::*[3]")
	public WebElement radioButtonYesInLeftMenu;

	@FindBy(xpath = "//div[@class='card-footer']/child::*[1]")
	public WebElement saveButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	public WebElement alertWindow;

	public String getAlertWindowText() {
		return alertWindow.getText();
	}

	public void clickOnSaveButton() {
		saveButton.submit();
	}

	public void selectYesRadioButton() {
		radioButtonYesInLeftMenu.click();

	}

	public void selectGroup() {
		firstGroup.click();
	}

	public void selectNoRadioButton() {
		radioButtonNoInTopMenu.click();
	}

	public void insertImage(String path) {
		chooseFileButton.sendKeys(path);

	}

	public void enterTextToAddCategoryTextBox(String category) {
		addCategoryTextBox.sendKeys(category);
	}

	public void clickOnNewButton() {
		newButton.click();
	}

	public void clickOnCategoryRadioButton() {
		categoryRadioButton.click();

	}

	public void doLogout() {
		adminImageAndTextButton.click();
		adminImageAndTextButton.click();
		logoutButton.click();
	}

	public void navigateToManageCategoryButton() {
		manageCategoryButton.click();
	}
}
