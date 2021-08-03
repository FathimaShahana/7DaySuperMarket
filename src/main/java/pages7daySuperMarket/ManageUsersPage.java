package pages7daySuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageUsersPage {
	WebDriver driver;
	public ManageUsersPage(WebDriver driver) {
		this.driver = driver;// driver mthd contstr variabledriver,thidriver this class
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(., 'Manage Users')]")
	public WebElement manageUsersButton;
	
	@FindBy( xpath="//td[text()='Chindhu Abraham					  					  ']/following-sibling::*[5]/a[1]")
	public WebElement lockIconForUserChindhuAbraham;
	
	@FindBy(xpath="//td[text()='Chindhu Abraham					  					  ']/following-sibling::*[5]/a[2]")
	public WebElement deleteIconOfUserChindhuAbraham;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	public WebElement alertPopUpAfterDeletionOfaUser;
	
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	public WebElement adminImageAndTextButton;

	@FindBy(xpath = "//a[@class='dropdown-item'][2]")
	public WebElement LogoutButton;
	
	
//@FindBy(xpath="(//td[contains(text(),'Asna Abid')])[1]/following-sibling::*//span[@class='badge bg-warning']")
	//public WebElement 


public String validateAlertPopupAfterDeleteUser()
	{
	return	alertPopUpAfterDeletionOfaUser.getText();
	}
	public void clickOnDeleteIconInUserChindhuAbraham()
	{
		lockIconForUserChindhuAbraham.click();
	}
	
	public boolean clickonLockOfUserChIndhuAbraham()
	{
		lockIconForUserChindhuAbraham.click();
		return lockIconForUserChindhuAbraham.isDisplayed();
	}
	
	public void clickOnManageUsersButton()
	{
		manageUsersButton.click();	
	}
	
	public void doLogout() {
		adminImageAndTextButton.click();
		LogoutButton.click();
	}
	

}
