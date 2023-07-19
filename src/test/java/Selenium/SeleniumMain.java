package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Selenium.Browser;

import java.io.File;
import java.util.*;

public class SeleniumMain { 
	static WebDriver driver;
	public static void main(String[] args) throws Exception{

		Scanner sc=new Scanner(System.in);
System.out.println("Choose the browser name:");
		//Open chrome and go to google.com
		driver=Browser.browser(driver, sc.next());

//		driver.get("https://www.google.com/");
//		
//		
//		//Search and open youtube 
//		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Youtube");
//		Actions action=new Actions(driver);
//		action.sendKeys(Keys.RETURN).perform();
//		TakeScreen.TakeScreenShot(driver);
//		ExcelSheet.WriteExcel();
//
//		System.out.println("To see the excel data, enter your excel file name:");
//
//		ExcelSheet.ReadExcel(sc.next());
		
		
		driver.get("https://www.reduceimages.com");
		driver.findElement(By.xpath(".//button[text()='Select Image']")).click();
		Runtime.getRuntime().exec(".//SeleniumPractice/FileUploadScript.scpt");
		
		Thread.sleep(5000);
		System.out.println("Success");
//		File file=new File("/Users/siddharthdalwaniya/Desktop/Screenshot 2023-05-23 at 9.38.43 PM.png");
//		upload.sendKeys(file.getAbsolutePath());
		
	//	"/Users/siddharthdalwaniya/Desktop/Screenshot 2023-05-23 at 9.38.43 PM.png"
	}

}
