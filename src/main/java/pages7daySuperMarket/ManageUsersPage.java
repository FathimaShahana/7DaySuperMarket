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
	
	public void clickOnManageUsersButton()
	{
		manageUsersButton.click();	
	}

}
