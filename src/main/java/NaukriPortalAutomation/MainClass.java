package NaukriPortalAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.This;
import NaukriPortalAutomation.*;

public class MainClass extends WaitClass1{
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		//do bakchodi here.
		
		//---------open naukri portal and login--------//
		driver=OpenNaukriHome.NaukriHome();
		EnterCreds creds= new EnterCreds();
		
		
		//------GetCreds-----//
		creds.login(driver);
		
		
		//------Go to the profile page and upload a resume------//
		GoToUploadPage.uploadPage(driver);
		UploadDoc.uploadDoc(driver);
		
		
		driver.quit();
		System.out.println("//---------------------------------------------------Successfull---------------------------------------------------//");
	}
}