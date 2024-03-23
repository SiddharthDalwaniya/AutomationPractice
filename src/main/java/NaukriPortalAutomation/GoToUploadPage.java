package NaukriPortalAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoToUploadPage {

	
	public static void uploadPage(WebDriver driver) throws InterruptedException {
		
		WaitClass1.fluentWait(driver, ".//*[@class='view-profile-wrapper']", 20).click();

		//System.out.println("");
	}

	
}
