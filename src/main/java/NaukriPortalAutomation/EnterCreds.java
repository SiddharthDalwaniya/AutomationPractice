package NaukriPortalAutomation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterCreds{


	public void login(WebDriver driver) throws Exception{
	File file=new File("/Users/siddharthdalwaniya/Desktop/PracticeFiles/SeleniumPractice/SeleniumPractice/src/Resource/creds.xlsx");
	FileInputStream FIN= new FileInputStream(file);
	
	XSSFWorkbook wb= new XSSFWorkbook(FIN);
	
	//------GetCreds-------//
	XSSFSheet sheet=  wb.getSheetAt(0);
	XSSFCell username=sheet.getRow(1).getCell(0);
	XSSFCell password=sheet.getRow(1).getCell(1);
	
	//-------FillCreds-----//
//	driver.findElement(By.xpath(".//*[@id='usernameField']")).sendKeys(username.getStringCellValue());
//	driver.findElement(By.xpath(".//*[@id='passwordField']")).sendKeys(password.getStringCellValue());
	
	WaitClass1.fluentWait(driver, ".//*[@id='usernameField']", 20).sendKeys(username.getStringCellValue());
	WaitClass1.fluentWait(driver, ".//*[@id='passwordField']", 20).sendKeys(password.getStringCellValue());
	WaitClass1.fluentWait(driver, ".//button[@data-ga-track='spa-event|login|login|Save||||true']", 20).click();
	}
}