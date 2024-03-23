package NaukriPortalAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadDoc {
	
	public static void uploadDoc(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@id='attachCV']")).sendKeys("/Users/siddharthdalwaniya/Documents/Siddharth/Work/Resume/Latest_SiddharthDalwaniya_Quality_Engineer_Analyst_Automation_tester.pdf");
		Thread.sleep(5000);
	}
}