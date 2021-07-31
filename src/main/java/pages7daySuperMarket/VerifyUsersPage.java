package pages7daySuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyUsersPage {
	WebDriver driver;
	public VerifyUsersPage(WebDriver driver) {
		this.driver = driver;// driver mthd contstr variabledriver,thidriver this class
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[contains(.,'Verify Users')]")
	public WebElement VerifyUsersButton;
	
	public void VerifyUsersButtonFunctionality()
	{
		VerifyUsersButton.click();
	}
	
}
