package TestNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviders {

	
	//Noraml external dataprovider
//	@DataProvider(name="External")
//	public static Object[][] data(){
//		return new Object[][] {
//			{"Search","1"},
//			{"Search","2"}
//		};
//	}
	
	
	//Universal data provider
	@DataProvider(name="Siddharth")
	public static Object[][] data(Method m){
		Object[][] testdata=null; 
		
		if(m.getName().equalsIgnoreCase("Verify_Title")) {
			return new Object[][] {
				{"Search","3"}
			};
		}
		else return null;
		
	//	return testdata;
	}
}
