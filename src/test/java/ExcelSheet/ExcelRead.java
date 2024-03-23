package ExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.mysql.cj.jdbc.Driver;

public class ExcelRead {

	static WebDriver driver;
	
	public static void main(String[] args) {
		selenium();
	}
	
	public void ReadExcel(String location,String SheetName) throws Exception {

		
		
		File file=new File(location);
		
		FileInputStream FIN= new FileInputStream(file);
		
		XSSFWorkbook wb= new XSSFWorkbook(FIN);
		
		XSSFSheet sheet=wb.getSheet(SheetName);
		
		int TotalRow= sheet.getLastRowNum();
		
		for(int i =0; i<TotalRow;i++) {
			
			XSSFRow row= sheet.getRow(i);
			
			for(int j=0;i<row.getLastCellNum();j++) {
				System.out.println(row.getCell(j));
			}
			
		}
		
		
		
		
		
		
		
	}
	
	public static void selenium() {
		//System.setProperty("webdriver.chrome.driver", "/SeleniumPractice/src/chromedriver/chromedriver");
		driver= new SafariDriver();
		driver.get("https:/www.google.com");
	}

}
