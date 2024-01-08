package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import Selenium.TakeScreen;

@Test(groups="test")
public class Revision {

	WebDriver driver;
	String TestNGScreenshot="/SeleniumPractice/SeleniumPractice/src/Screenshots/";
	

	@Test(priority = 0, groups="open")
	public void openBrowser() {
		driver= new SafariDriver();
		System.out.println("Safari is open");
	}
	
	@Test(priority=1, groups="chrome")
	public void login() throws InterruptedException, IOException {
		driver.get("https://www.google.com");
//		Thread.sleep(5000);
		driver.manage().window().maximize();
		TakeScreen.TakeScreenShot(driver);
		String actualTitle=driver.getTitle();
		SoftAssert assesrtion = new SoftAssert();
		AssertJUnit.assertEquals(actualTitle, "Google1");
		
		System.out.println(actualTitle);
		assesrtion.assertAll();
		System.out.println("Chrome test is completed");
	}
	
	@Test(priority=2, groups="close")
	public void closeBrowser() {
		driver.close();
		System.out.println("Safari is closed");
	}
	
	
}
