package TestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.After;

public class dummyCode {

	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before Suite");
	}
	
	@BeforeTest(enabled=true)
	public void beforeTest() {
		System.out.println("This is before test 1");
	}
	
	@BeforeClass()
	public void beforeClass1() {
		System.out.println("This is before class 1");
	}
	
	@BeforeClass()
	public void beforeClass2() {
		System.out.println("This is before class 2");
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
	
	@Test(groups="sanity")
	public void _0() {
		System.out.println("This is test A");
	}
	
	@Test(groups="sanity")
	public void _2() {
		System.out.println("This is test C");
	}
	
	@Test(groups="sanity")
	public void _1() {
		System.out.println("This is test B");
	}
	
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("This is before Suite");
	}
	
	@AfterTest(enabled=true)
	public void AfterTest() {
		System.out.println("This is After test 1");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This is After class 1");
	}
	
	@AfterGroups(value="sanity")
	public void AfterGroup1() {
		System.out.println("This is After group 1");
	}
	
	@AfterGroups
	public void AfterGroup2() {
		System.out.println("this is After group 2 ");
	}
	
	@AfterMethod
	public void AfterMethod0() {
		System.out.println("This is After Method 2.");
	}
	
	@AfterMethod
	public void AfterMethod1() {
		System.out.println("This is After Method 1.");
	}
	
}
