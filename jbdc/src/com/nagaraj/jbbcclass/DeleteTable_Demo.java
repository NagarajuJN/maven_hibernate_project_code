package com.nagaraj.jbbcclass;
import java.sql.*;

public class DeleteTable_Demo {

	public static void main(String[] args) throws Exception{
		  Class.forName("com.mysql.cj.jdbc.Driver");	
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccruddb?autoReconnect=true&useSSL=false","root","Naga@123");
			
			Statement st = con.createStatement();
			
			//deleting the records
			
			String delete_table = "drop table emp_info";
			
			int delete_record_row = st.executeUpdate(delete_table);

			System.out.println("Deleting the table done successfully");

			
			con.close();
	}

}

