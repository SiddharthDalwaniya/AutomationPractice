package Selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
}
