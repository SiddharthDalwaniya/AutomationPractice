package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class TakeScreen {

	public static void TakeScreenShot(WebDriver driver) throws IOException {
		
//		Date CurrentDate= new Date();
//		String FileName=CurrentDate.toString().replace(" ", "-").replace(":", "-");//+Integer.toString(CurrentDate.getHours())+;
//		
//		
//		
//		TakesScreenshot screenshot =(TakesScreenshot) driver;
//		File photo=screenshot.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(photo, new File(".//SeleniumPractice/src/Screenshots/"+FileName+".png"));
		
		
		Date CurrentDate= new Date();
		String FileName= CurrentDate.toString().replace(" ", "_").replace(":", "_");
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File screen= screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File(".//SeleniumPractice/src/Screenshots/"+FileName+".png"));
		
		
		
//////////--------------Practice one-----------/////////		
//
//		TakesScreenshot screen1= (TakesScreenshot) driver;
////		String File Name = CurrentDate.toString()CurrentD
//		File screenshot1=screen1.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screen1, FILENAMw)l
		
	}
	
	
public static void TakeScreenShot(WebDriver driver,String location) throws IOException {
		
//		Date CurrentDate= new Date();
//		String FileName=CurrentDate.toString().replace(" ", "-").replace(":", "-");//+Integer.toString(CurrentDate.getHours())+;
//		
//		
//		
//		TakesScreenshot screenshot =(TakesScreenshot) driver;
//		File photo=screenshot.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(photo, new File(".//SeleniumPractice/src/Screenshots/"+FileName+".png"));
		
		
		Date CurrentDate= new Date();
		String FileName= CurrentDate.toString().replace(" ", "_").replace(":", "_");
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File screen= screenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screen, new File(location+FileName+".png"));
		System.out.println("Screenshot taken successfully. Thanks.");
	}
}


