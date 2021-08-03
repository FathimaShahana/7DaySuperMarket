package validationsOfMobileSliderPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages7daySuperMarket.MobileSliderPage;

public class ImageUpload extends MobilesliderBaseTest {
	
	@Test
	public void verifyImageUpload() throws AWTException
	{
		MobileSliderPage mobileSliderPage = new MobileSliderPage(driver);
		mobileSliderPage.clickOnNewButton();
		mobileSliderPage.selectDropdown();
		mobileSliderPage.clickOnChooseFileButton();
		mobileSliderPage.uploadImage("C:\\Users\\ANVER\\Desktop\\img.PNG");
		
		mobileSliderPage.clickOnSave();
		String expected="\r\n" +"            Mobile Slider Created Successfully        ";
		String actual=mobileSliderPage.getTextInAlertWindow();
		Assert.assertEquals(actual, expected);
	}
	
	

}
