package NaukriPortalAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class WaitClass1 {

	static WebDriverWait  wait;
	static FluentWait	FWait;
	public static WebElement ExplicitWait(WebDriver driver, WebElement element, int timeout) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static WebElement fluentWait(WebDriver driver,String locator, int timeout) {
//		FWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(timeout)).pollingEvery(Duration.ofSeconds(1)).ignoring(TimeoutException.class);
//		return (WebElement) FWait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		
		FWait=new FluentWait(driver).withTimeout(Duration.ofSeconds(timeout)).pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);
		return (WebElement) FWait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}
	
	
	
	
}