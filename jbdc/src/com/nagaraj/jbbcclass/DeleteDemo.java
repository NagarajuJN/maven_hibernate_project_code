package com.nagaraj.jbbcclass;

import java.sql.*;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception{
		  Class.forName("com.mysql.cj.jdbc.Driver");	
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccruddb?autoReconnect=true&useSSL=false","root","Naga@123");
			
			Statement st = con.createStatement();
			
			//deleting the records
			
			String delete_record = "delete from emp_info where eno=1";
			
			System.out.println("Deleting the record done successfully");

			int delete_record_row = st.executeUpdate(delete_record);
			System.out.println("the number rows deleted :"+delete_record_row);
			
			con.close();
	}

}
