package Selenium;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class ExcelSheet {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		XSSFRow row=sheet.createRow(0);
		XSSFCell cell=row.createCell(0);
		cell.setCellValue("Siddharth Dalwaniya");
		
		File file=new File("/Users/siddharthdalwaniya/Desktop/PracticeFiles/SeleniumPractice/SeleniumPractice/src/Resource/Book1.xlsx");
		FileOutputStream FOUT=new FileOutputStream(file);
		workbook.write(FOUT);
		workbook.close();
	}

	public static void WriteExcel() throws Exception {
		Scanner sc=new Scanner(System.in);

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("FamilyDetail");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("FirstName");
		sheet.getRow(0).createCell(1).setCellValue("LastName");

		System.out.println("How many family members are there?");
		int Members=sc.nextInt();
		//sc.nextInt();

		for(int i=0;i<Members;i++) {
			//	sc.next();
			int j=i+1;
			System.out.println((i+1)+"Enter the firstName of the family member");
			String FirstName=sc.next();
			//sheet.createRow(j).createCell(0).setCellValue(sc.next());

			System.out.println(j+"Enter the LastName of the family member");
			String LastName=sc.next();
			//sheet.createRow(j).createCell(1).setCellValue(sc.next());

			XSSFRow person=sheet.createRow(j);
			person.createCell(0).setCellValue(FirstName);
			person.createCell(1).setCellValue(LastName);

		}
		//sheet.getRow(1).getCell(0).setCellValue("dvkjbv");
		System.out.println("What should be the excel sheet name?");
		System.out.println("***Please do not include spaces and special characters***");
		String filename=sc.next();

		System.out.println("Thanks for you valuable input. We are creating an excel sheet. Your patience is appreciated!");

		File file= new File(".//SeleniumPractice/src/ExcelSheets/"+filename+".xlsx");

		FileOutputStream FOUT=new FileOutputStream(file);

		workbook.write(FOUT);
		workbook.close();
	}

	public static void ReadExcel(String filename) throws Exception{	

		File file=new File(".//SeleniumPractice/src/ExcelSheets/"+filename);
		FileInputStream FIN= new FileInputStream(file);



		XSSFWorkbook workbook = new XSSFWorkbook(FIN);
		XSSFSheet sheet=workbook.getSheetAt(0);

		int rows=sheet.getLastRowNum();
		//System.out.println(rows);
		for(int i=0;i<rows+1;i++) {

			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) {
				System.out.print(  sheet.getRow(i).getCell(j) +"     " );
			}
			System.out.println();

		}


	}
	
	public static void writeExcel() throws Exception{
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		XSSFRow row=sheet.createRow(0);
		XSSFCell cell=row.createCell(0);
		cell.setCellValue("Siddharth Dalwaniya");
		
		
		FileOutputStream FOUT=new FileOutputStream("//src/Resource/Book1.xlsx");
		workbook.write(FOUT);
		workbook.close();
		
	}

}
