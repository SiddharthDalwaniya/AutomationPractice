package Rough;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IBM_Practice extends Animal{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().arm64().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchBar=driver.findElement(By.xpath(".//textarea[@title='Search']"));
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.SHIFT) // Press Shift key
        .sendKeys(searchBar, "hello") // Type "hello" while Shift key is pressed
        .keyUp(Keys.SHIFT) // Release Shift key
        .sendKeys(Keys.chord(Keys.COMMAND, "a"))
        .keyDown(Keys.COMMAND)
        .keyDown("a")// Select all text by pressing Ctrl+A
        .sendKeys(Keys.DELETE) 
        .moveToElement(searchBar)
        .contextClick()
      //  .drag
//        // Delete selected text
        .perform(); // Perform the actions
//		
//		
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_F12);
//		//robot.keyRelease(KeyEvent.VK_F12);
//		
//		Alert alert=driver.switchTo().alert();
//		//alert.
		
		
	   // myDog.animalSound();
	}
//	
//	class Animal {
//		  public void animalSound() {
//		    System.out.println("The animal makes a sound");
//		  }
//		  
//		  public void shout(){
//			System.out.println("sofbsf");
//		}
//	}
//
//		class Pig extends Animal {
//		  public void animalSound() {
//		    System.out.println("The pig says: wee wee");
//		  }
//		}
//
//		class Dog extends Animal {
//		  public void animalSound() {
//		    System.out.println("The dog says: bow wow");
//		  }
//		}
//
//		
//

}


