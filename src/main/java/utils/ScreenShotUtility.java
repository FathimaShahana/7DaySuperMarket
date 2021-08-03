package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {
	
	public static void ScreenShot(WebDriver driver,String fileName) throws IOException
	{//takeScreenshot not svaed it in clipboaedr
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//creat new file no contenrt
File dest=new File("C:\\Users\\ANVER\\eclipse-workspace\\project7rMart\\7DaySuperMarket\\target\\"+fileName);
	//copy 
FileUtils.copyFile(screenshot,dest);//to copy file from source

	}

}
