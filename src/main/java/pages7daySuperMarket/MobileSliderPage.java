package pages7daySuperMarket;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.FileUpload;
import utils.JavaExecutorUtility;

public class MobileSliderPage {

	WebDriver driver;

	public MobileSliderPage(WebDriver driver) {
		this.driver = driver;// driver mthd contstr variabledriver,thidriver this class
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(., 'Mobile Slider')]")
	public WebElement mobileSliderButton;
	
	@FindBy (xpath="//a[@class='btn btn-rounded btn-danger']")
	public WebElement NewButton;
	
	@FindBy(xpath="//select[@id='cat_id']")
	public WebElement selectCategoryButton;
	@FindBy(xpath="//select[@id='cat_id']/option[2]")
	public WebElement dropDownFruitsAndVegitableSelect;
	
	@FindBy(xpath="//input[@id='main_img']")
	public WebElement chooseFileButton;	
	
	@FindBy(xpath="//button[@name='create']")
	public WebElement saveButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	public WebElement alertWindowAfterSave;

	
	
	/*public void jseChooseButtonClick()
	{
		JavaExecutorUtility.javaExecuterClick ( driver,"document.getElementsByName('main_img')");
	}(*/
	
	public void clickOnSave()
	{
		saveButton.click();
	}
	public String getTextInAlertWindow()
	{
	return	alertWindowAfterSave.getText();
	}
	
	public void clickOnChooseFileButton()
	{
		chooseFileButton.sendKeys("C:\\Users\\ANVER\\Desktop\\11.PNG");
		

	}
	
	public void selectDropdown()
	{
		dropDownFruitsAndVegitableSelect.click();
	}
	
	
	public void selectCategoryDropdown()
	{
		selectCategoryButton.click();
	}
	
	public void clickOnNewButton()
	{
		NewButton.click();
	}

	public void clickOnMobileSliderButton() {
		mobileSliderButton.click();
		
	}
	public void uploadImage(WebDriver driver,WebElement element,String path) {
		FileUpload.uploadImage(driver,element,path);
	}
	public void doLogout() {
		driver.quit();
		
	}
}
