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
	public WebElement UserNameInputField;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement PasswordInputField;
	
	@FindBy(xpath="//button[text()='Sign In']")
	public WebElement SignInButton;
	
	public void login(String userName, String password) {
		enterUserName(userName);//
		enterPassWord(password);
		enterSignIn();
	}
	
	public void enterUserName(String userName) {
		UserNameInputField.sendKeys(userName);
	}
	
	public void enterPassWord(String password)
	{
		PasswordInputField.sendKeys(password);
	}
	
	public void enterSignIn()
	{
		SignInButton.click();
	}
}
