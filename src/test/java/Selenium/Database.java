package Selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Database {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://mysql-rfam-public.ebi.ac.uk:4497/Rfam","rfamro","");
		Statement st=con.createStatement();
		ResultSet result=st.executeQuery("select * from family;");
		
		while(result.next()) {
			System.out.println(result.getRow());
		}
		con.close();
		
	}

	public static void JDBC() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin@localHost:portNumber:ServiceName","UserName","Password");
		
		Statement st= con.createStatement();
		
		ResultSet result= st.executeQuery("Enter the query here.");
		
		while(result.next()) {
			System.out.println(result.getRow());
		}
	}
	
	public static void jdbc() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin@localHost:portnumber:ServiceName","UserName","Password");
		Statement st=con.createStatement();
		ResultSet result=st.executeQuery("Enter the query here");
		while(result.next()) {
			System.out.println( result.getRow() );
		}
	}
	
	public static void MySQL() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
		Statement st=con.createStatement();
		ResultSet result=st.executeQuery("Put the query here.");
		while(result.next()) {
			//sysresult.getRow();
		}
	}
	
}
