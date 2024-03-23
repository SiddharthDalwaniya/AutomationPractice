package NaukriPortalAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNaukriHome {

	
	static WebDriver driver;
	

	public static WebDriver NaukriHome() throws InterruptedException {
		
		WebDriverManager.chromedriver().arm64().setup();
		//ChromeOptions options= new ChromeOptions();
		//options.addArguments("--headless=new");
//		ChromeOptions options=WebDriverManager.chromedriver().arm64().setup();
//		options.addArguments("--disable-gpu");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--allow-insecure-localhost");
		
		driver= new ChromeDriver();	
		driver.get("https://www.naukri.com/mnjuser/homepage");

		driver.manage().window().maximize();
		if(driver.getTitle().contains("Mynaukri")) {
			System.out.println( "Successfully opened"+driver.getTitle());
		}
		
	//	Thread.sleep(3000);
		//driver.findElement(By.xpath(".//input[@id='usernameField']")).sendKeys("helloBro");
		return driver;
			
	}
}