package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser {
	public static WebDriver browser(WebDriver driver, String browser) {
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chromedriver.driver","/SeleniumPractice/src/chromedriver");
			//ChromeOptions options= new ChromeOptions();
			driver= new ChromeDriver();
			//sfjkbdfvs
			driver.manage().window().maximize();
			
		}
		
		else if( browser.equalsIgnoreCase("Safari")) {
			driver=new SafariDriver();
			driver.manage().window().maximize();
		}
		
		
		else {
			driver.quit();
		}
		return driver;
	}
}