package pages7daySuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;// driver mthd contstr variabledriver,thidriver this class
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	public WebElement userNameInputField;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement passwordInputField;

	@FindBy(xpath = "//button[text()='Sign In']")
	public WebElement signInButton;

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	public WebElement adminImageAndTextButton;

	@FindBy(xpath = "//a[@class='dropdown-item'][2]")
	public WebElement LogoutButton;

	public void login(String userName, String password) {
		enterUserName(userName);
		enterPassWord(password);
		enterSignIn();
	}

	public void enterUserName(String userName) {
		userNameInputField.sendKeys(userName);
	}

	public void enterPassWord(String password) {
		passwordInputField.sendKeys(password);
	}

	public void enterSignIn() {
		signInButton.click();
	}

	public void doLogout() {
		adminImageAndTextButton.click();
		LogoutButton.click();
	}
}
