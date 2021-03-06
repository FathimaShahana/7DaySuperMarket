package pages7daySuperMarket;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageOrdersPage {
	WebDriver driver;
	public ManageOrdersPage(WebDriver driver) {
		this.driver = driver;// driver mthd contstr variabledriver,thidriver this class
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(., 'Manage Orders')]")
	public WebElement manageOrdersButton;
	
	@FindBy(xpath="//a[@onclick='click_button(2)']")
	public WebElement ClickOnSearch;
	
	@FindBy(xpath="//input[@id='od']")
	public WebElement orderIdTextBox;
	@FindBy(xpath="//button[@name='Search']")
	public WebElement submitSearch;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr")
	public List<WebElement> tableList;
	
	@FindBy(xpath="//select[@name='pt']")
	public WebElement paymentMode;
	
	@FindBy(xpath="//select[@name='pt']/option[text()='COD']")
	public WebElement dropdownCOD;
	
	
	@FindBy(xpath="//select[@name='st']")
	public WebElement statusDropDown;

	@FindBy(xpath="//select[@name='st']/option[@value='Paid']")
	public WebElement paidSelect;
			
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr")
	public List<WebElement> tablePaidList;
	
	@FindBy(xpath="//button[@name='Reset']")
	public WebElement resetButton;
	@FindBy(xpath="//h4[text()='Search List Orders']")
	public WebElement searchListOrdersTitle;
	
	public boolean isDisplayedsearchListOrdersTitle()
	{
	return	searchListOrdersTitle.isDisplayed();
	}
	
	public void clickOnResetButton()
	{
		resetButton.click();
	}
	
	public void paymentmodeDropDown()
	{
		paymentMode.click();
	}
	
	public void selectdropdownCOD()
	{
		dropdownCOD.click();
	}
	public int sizeOfPaidOrderList()
	{
	return	tablePaidList.size();
	}
	
	public void selectionOfPaidFromDropDown()
	{
		paidSelect.click();
	}
	
	public void selectStatusDropdown()
	{
		statusDropDown.click();
		
	}
	
	public int verifyListofTableCount()
	{
		return	tableList.size();
	}
	
	public void clickOnSubmitSearch()
	{
		submitSearch.click();
	}
	
	public void clickOnSearchButton()
	{
		ClickOnSearch.click();
	}
	
	
	public void enterInOrderIdTextBox()
	{
		orderIdTextBox.sendKeys("492");
		
	}
	
	public void clickOnManageOrdersPage() {
		
		manageOrdersButton.click();
	}
}
