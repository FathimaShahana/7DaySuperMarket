package utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload {
	
	public static void uploadImage(String path) 
	{
		Robot robo;
		try {
			robo = new Robot();
		
			// TODO Auto-generated catch block
		
		
		//String myString = "
		StringSelection stringSelection = new StringSelection(path);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		}
	}


