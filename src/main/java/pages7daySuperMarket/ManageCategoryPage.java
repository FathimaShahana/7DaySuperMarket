package pages7daySuperMarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategoryPage {
	WebDriver driver;
	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;// driver mthd contstr variabledriver,thidriver this class
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//p[contains(.,' Manage Category ')]")
public WebElement manageCategoryButton;

@FindBy(xpath = "//a[@data-toggle='dropdown']")
public WebElement adminImageAndTextButton;

@FindBy(xpath = "//a[@class='dropdown-item'][2]")
public WebElement LogoutButton;

@FindBy(xpath = "//a[@class='active nav-link']")
public WebElement CategoryDropdown;

@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
public WebElement NewButton;

@FindBy(xpath="//input[@id='category']")
public WebElement addCategoryTextBox;

@FindBy(xpath="//input[@id='main_img']")
public WebElement chooseFileButton;

@FindBy(xpath="//div[@class='col-md-4'][1]//label[@class='radio-inline'][2]")
public WebElement noInRadioButton;

public void selecteNoInRAdioButton()
{
	noInRadioButton.click();
}

public void insertImage()
{
	chooseFileButton.sendKeys("C:\\Users\\ANVER\\Desktop\\11.PNG");
	
}
public void enterTextToAddCategoryTextBox()
{
	addCategoryTextBox.sendKeys("Organic Spices");
}

public void clickOnNewButton()
{
	NewButton.click();
}

public void clickOnCategory()
{
	CategoryDropdown.click();
}


public void doLogout() {
	
		adminImageAndTextButton.click();
		LogoutButton.click();
	}

public void selectCategoryDropDown() {
	manageCategoryButton.click();
}
public void clickOnmanageCategoryButton() {
	manageCategoryButton.click();
}




	
}



