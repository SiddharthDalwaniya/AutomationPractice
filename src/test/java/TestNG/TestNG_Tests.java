package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestNG_Tests extends Listners{
	WebDriver driver=null;
	
	@Parameters({"Browser"})
	@Test(priority=-2, groups = "sanity")
	public void lsetdriver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chromedriver.driver", "/Users/siddharthdalwaniya/Desktop/PracticeFiles/SeleniumPractice/SeleniumPractice/src/chromedriver");
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("safari")){
			driver=new SafariDriver();
			
		}
		
//		System.out.println("NO PRIORITY");
	}

	@Test(priority = -1, groups = {"sanity"})
	public void site(){
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
//		System.out.println("Zero");
	}
	
	@Test(priority=0, groups="sanity", dataProvider="Siddharth", dataProviderClass=DataProviders.class, retryAnalyzer = Retry.class)
	public void Verify_Title(String search, String key){
//		Assert.assertEquals(driver.getTitle(), "Google");
		SoftAssert sassert = new SoftAssert();
		//sassert.assertEquals(driver.getTitle(), "Google");
		Assert.assertFalse(true);
		
		System.out.println(search + " = "+key);
		
	}
	
	
	@Test(priority = 1, groups="smoke", dependsOnGroups = "sanity")
	public void closedriver() {
		driver.close(); 
//		System.out.println("one");
	}
	
	
//	@DataProvider(name="Search")
//	public Object[][] data(){
//		return new Object[][] {
//			{"Search","Youtube"},
//			{"Search","Google"},
//			{"Search","safari"}
//		};
//	}
	
}
