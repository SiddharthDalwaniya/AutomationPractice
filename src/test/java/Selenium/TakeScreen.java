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
		
		Date CurrentDate= new Date();
		String FileName=CurrentDate.toString().replace(" ", "-").replace(":", "-");//+Integer.toString(CurrentDate.getHours())+;
		
		
		
		TakesScreenshot screenshot =(TakesScreenshot) driver;
		File photo=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(photo, new File(".//SeleniumPractice/src/Screenshots/"+FileName+".png"));
	}
}
