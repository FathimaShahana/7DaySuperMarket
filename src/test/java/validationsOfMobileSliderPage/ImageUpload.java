package validationsOfMobileSliderPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages7daySuperMarket.MobileSliderPage;
import utils.JavaExecutorUtility;

public class ImageUpload extends MobilesliderBaseTest {
	
	@Test
	public void verifyImageUpload() throws AWTException
	{
		MobileSliderPage mobileSliderPage = new MobileSliderPage(driver);
		mobileSliderPage.clickOnNewButton();
		
		mobileSliderPage.selectDropdown();
		mobileSliderPage.clickOnChooseFileButton();
		
		mobileSliderPage.clickOnSave();
		
		String actual=mobileSliderPage.getTextInAlertWindow();
		String expected="�\nAlert!\nMobile Slider Created Successfully";
		
		Assert.assertEquals(actual, expected);
		
	}
	
	

}
