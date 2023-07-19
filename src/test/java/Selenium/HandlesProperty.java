package Selenium;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class HandlesProperty {
	
	public static void main(String[] args) throws Exception {
		WriteProperty();
	}
	
	public static void ReadProperty() throws Exception{
		FileReader reader= new FileReader(".//SeleniumPractice/Sample.properties");
		Properties property = new Properties();
		
		property.load(reader);
		
		System.out.println("FirstName: "+property.getProperty("FirstName"));
		System.out.println("LastName: "+property.getProperty("LastName"));
		
	}
	
	
	public static void WriteProperty() throws Exception{
		
		Properties p= new Properties();
		p.setProperty("CarTyres", "4");
		p.setProperty("Country", "US");
		
		p.store(new FileWriter("/Users/siddharthdalwaniya/Desktop/PracticeFiles/SeleniumPractice/SeleniumPractice/SeleniumPractice/Sample.properties"), "Property has been set");
		System.out.println("Successful");
	}

}
