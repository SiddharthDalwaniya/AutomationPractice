package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
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

public class TestNG_Tests {//extends Listners{
	WebDriver driver=null;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before Suite");
	}
	
	@BeforeTest(enabled=true)
	public void beforeTest() {
		System.out.println("This is before test 1");
	}
	
	@BeforeClass()
	public void beforeClass() {
		System.out.println("This is before class 1");
	}
	
	@BeforeGroups(value="sanity")
	public void beforGroup1() {
		System.out.println("This is before group 1");
	}
	
	@BeforeGroups()
	public void beforegroup2() {
		System.out.println("this is before group 2 ");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("This is before Method.");
	}
	
	//@Parameters({"Browser"})
	@Test(priority=-2, groups = "sanity")
	public void lsetdriver(){//String browser) {
		
//		if(browser.equalsIgnoreCase("chrome")) {
//		System.setProperty("webdriver.chromedriver.driver", "/Users/siddharthdalwaniya/Desktop/PracticeFiles/SeleniumPractice/SeleniumPractice/src/chromedriver");
//		driver=new ChromeDriver();
//		}
//		else if(browser.equalsIgnoreCase("safari")){
//			driver=new SafariDriver();
//			
//		}
		
//		System.out.println("NO PRIORITY");
	}

	@Test(priority = -1, groups = {"sanity"})
	public void site(){
//		driver.navigate().to("https://www.google.com");
//		driver.manage().window().maximize();
//		System.out.println("Zero");
	}
	
	@Test(priority =0 , groups={"sanity"})//, dataProvider="Siddharth", dataProviderClass=DataProviders.class)//, retryAnalyzer = Retry.class)
	public void Verify_Title(){//String search, String key){
//		Assert.assertEquals(driver.getTitle(), "Google");
//		SoftAssert sassert = new SoftAssert();
//		//sassert.assertEquals(driver.getTitle(), "Google");
//		AssertJUnit.assertFalse(true);
//		
//		System.out.println(search + " = "+key);
		
	}
	
	
	@Test(priority = 1, groups="sanity", dependsOnGroups = "sanity")
	public void closedriver() {
//		driver.close(); 
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
