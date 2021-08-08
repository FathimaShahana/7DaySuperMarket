package utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void uploadImage(WebDriver driver,WebElement element,String path) {
		Actions act =new Actions(driver);
		act.moveToElement(element).click().perform();
		
		GetWaitMethod.getImplicitWait(driver);
		
		Robot robo;
		try {
			robo = new Robot();

			copyFilePathIntoClipboard(path);

			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_V);
			robo.keyRelease(KeyEvent.VK_V);
			robo.keyRelease(KeyEvent.VK_CONTROL);

		}
		catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public static Clipboard copyFilePathIntoClipboard(String path) {
		StringSelection stringSelection = new StringSelection(path);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		return clipboard;
	}
}
