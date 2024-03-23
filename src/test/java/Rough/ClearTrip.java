package Rough;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().arm64().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.cleartrip.com/");
		
//		driver.findElement(By.xpath(".//*[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
//		driver.findElement(By.xpath(".//div[@class='p-relative br-4']")).click();
//		List<WebElement> plusButton= driver.findElements(By.xpath(".//li[@class='flex-inline']"));
		//WebElement plus
		driver.navigate().to("https://www.google.com");
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		WebElement searchBar=driver.findElement(By.xpath(".//textarea[@title='Search']"));
		
		ex.executeScript("arguments[0].setAttribute('disabled',true);", searchBar);
		
		ex.executeScript("prompt('Search Bar is disabled now')");
		Alert alert=driver.switchTo().alert();
	//	driver.is
		//plusButton.get(0).click();
	}

}
