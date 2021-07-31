package pages7daySuperMarket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.GetWaitMethod;

public class AdminUsersPage {
	WebDriver driver;
	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;// driver mthd contstr variabledriver,thidriver this class
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(., 'Admin Users')]")
	public WebElement AdminUsersButton;
	
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	public WebElement NewUserButton;
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement UsernameInputField;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement PasswordInputField;
	
	@FindBy(xpath="//select[@id='user_type']")
	public WebElement UserTypeInputField;
	
	@FindBy(xpath="//button[@name='Create']")
	public WebElement SaveButton;
	
	@FindBy(xpath="//div[@class='card']/div/table/tbody")
	public WebElement UserTable;
	
	@FindBy(xpath="//div[@class='card']/div/table/tbody/tr[1]/td[1]")
	public WebElement FirstUserInTable;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	public WebElement SearchButton;
	
	@FindBy(xpath=("//input[@id='un']"))
	public WebElement SearchUserName;
	
	@FindBy(xpath=("//select[@id='ut']"))
	public WebElement SearchUserType;
	
	@FindBy(xpath=("//button[@name='Search']"))
	public WebElement SubmitSearch;
	
	@FindBy(xpath=("//a[@class='btn btn-rounded btn-warning']"))
	public WebElement ResetButton;
	
	@FindBy(xpath="//h4[text()='Search Admin Users']")
	public WebElement searchAdminUsersTitle;
	
	@FindBy(xpath="//td[text()='Fathima123']/parent::tr/td/a[@class='btn btn-sm btn btn-danger btncss']")	
	public WebElement deleteIconForFathima123;
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement UsernameInputFieldForFathima123;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement PasswordInputFieldForFathima123;
	
	@FindBy(xpath="//select[@id='user_type']")
	public WebElement UserTypeInputFieldForFathima123 ;
	
	@FindBy(xpath="//button[@name='Create']")
	public WebElement SaveButtonForFathima123;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	public WebElement alertPopUpAfterDeletionOfFathima123;
	public String validateAlertPopupAfterDeleteUser()
	{
	return	alertPopUpAfterDeletionOfFathima123.getText();
	}
	
	public void enterUsernameForFathima123()
	{
		UsernameInputFieldForFathima123.sendKeys("Fathima123");
	}
	public void clickOnSaveButtonForFathima123()
	{
		SaveButtonForFathima123.click();
	}
	public void enterUserTypeForFathima123()
	{
		UserTypeInputFieldForFathima123.sendKeys("Admin");	
	}
	public void enterPasswordForFathima123()
	{
		PasswordInputFieldForFathima123.sendKeys("Password");
	}
	

	public void clickOnDeleteIconForFathima123()
	{
		deleteIconForFathima123.click();
	}
	
	
	
	
	public boolean isTitleSearchAdminUsersDisplayed()
	{
		return searchAdminUsersTitle.isDisplayed();
		
	}
		
	public int getListedUsersCount()
	{
		return UserTable.getSize().height;
	}
	
	public void clickOnResetButton()
	{
		GetWaitMethod.waitForElementIn7DaySuperMarket(driver, 5, ResetButton);
		
		ResetButton.click();
	}
	
	public void submitSearchButton()
	{
		SubmitSearch.click();
	}
	
	public void enterSearchUserName(String Username)
	{
		SearchUserName.clear();
		SearchUserName.sendKeys(Username);
	}
		
	public void enterSearchUserType(String Usertype)
	{
		SearchUserType.clear();
		SearchUserType.sendKeys(Usertype);
	}
		
	public void clickOnSearchButton()
	{
		SearchButton.click();
	}
	
	public String getFirstUserInTable()
	{
		return	FirstUserInTable.getText();
	}
		
	public void clickOnSaveButton()
	{
		SaveButton.click();
	}
	
	public void enterUserType(String UserType)
	{
		UserTypeInputField.sendKeys(UserType);	
	}
	
	public void enterPassword(String Password)
	{
		PasswordInputField.sendKeys(Password);
	}
	
	public void enterUsername(String Username)
	{
		UsernameInputField.sendKeys(Username);
	}
	
	public void clickOnNewUserButton()
	{
		NewUserButton.click();
	}
	
	public void clickOnAdminUsers()
	{
		AdminUsersButton.click();
	}
	
	
}
