package pages7daySuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;// driver mthd contstr variabledriver,thidriver this class
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='nav-link']/img[@alt='User Image']")
	public WebElement AdminImage;
	
	public boolean displayAdminImage()
	{
	return	AdminImage.isDisplayed();
	}
	
	

}
