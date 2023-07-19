package CucumberStepsAndRunners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class LoginStepDefinition {
	static WebDriver driver=null;
	@Given("Webdriver is set to chrome")
	public void webdriver_is_set_to_chrome() {
	   System.setProperty("webdriver.chromedriver.driver", "/Users/siddharthdalwaniya/Desktop/PracticeFiles/SeleniumPractice/SeleniumPractice/src/chromedriver");
	}

	@Given("chrome is open")
	public void chrome_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		driver= new ChromeDriver();
	}

	@Given("google website is open")
	public void google_website_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com");
	}

	@When("^searched for (.*)$")
	public void searched_for_youtube(String search) {
		System.out.println(search);
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys(search);
	}

	@When("pressed Enter key")
	public void pressed_enter_key() {
	    // Write code here that turns the phrase above into concrete actions
		Actions action=new Actions(driver);
		//saction.sendKeys(Keys.RETURN);
		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys(Keys.RETURN);

	}

	@Then("Search results should appear")
	public void search_results_should_appear() {
	    // Write code here that turns the phrase above into concrete actions
		Date date= new Date();
		String name=date.toString().replace("-","_").replace(".","_").trim();
		TakesScreenshot screenshot= (TakesScreenshot) driver;
		File photo=screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(photo, new File("/Users/siddharthdalwaniya/Desktop/PracticeFiles/SeleniumPractice/SeleniumPractice/target/CucumberScreenshots/"+name+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Screenshots should be taken")
	public void screenshots_should_be_taken() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Screenshot Taken");
		driver.close();
	}
	
}
