package TestNG;

import org.testng.annotations.Test;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listners implements ITestListener{

	public  void onTestSuccess(ITestResult result) {
	    // not implemented
		System.out.println("Listner has marked this as passed");
	  }
	
	public void onFinish(ITestContext context) {
	    // not implemented
		System.out.println("Test completed");
	  }
}
