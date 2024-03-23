package Selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public  void implicitWait(WebDriver driver, WebElement element, int timeout) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}
	
	public void explicitWait(WebDriver driver, WebElement element, int timeout) {
		WebElement wait= new WebDriverWait(driver,Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void fluentWait(WebDriver driver, WebElement element, int timout, int poll) {
		FluentWait wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	}
	
//	
//	Wait wait= new FleuntWait(driver).withTimeout(Duration.ofSeconds(0)).
//			pollingEvery().
//			ignoring
}
