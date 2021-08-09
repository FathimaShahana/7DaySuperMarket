package pages7daySuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='nav-link']/img[@alt='User Image']")
	public WebElement adminImage;

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	public WebElement adminImageAndTextButton;

	@FindBy(xpath = "//a[@class='dropdown-item'][2]")
	public WebElement LogoutButton;

	public void doLogout() {
		adminImageAndTextButton.click();
		LogoutButton.click();
	}

	public boolean adminImageDisplayed() {
		return adminImage.isDisplayed();
	}

}
