package com.nagaraj.jbbcclass;
import java.sql.*;
public class InsertDemo {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");	
		
		String jdbc_url = "jdbc:mysql://localhost:3306/jdbccruddb";
		String user = "root";
		String pwd="Naga@123";
		Connection con=DriverManager.getConnection(jdbc_url,user,pwd);

//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccruddb?autoReconnect=true&useSSL=false","root","Naga@123");
		
		Statement st = con.createStatement();
		
		//inserting the records:
		
		String insert_data = "insert into emp_info values(01,'Raj',2000,'Hud')";
		
		st.executeUpdate(insert_data);
		
		// optional
		int updateCount_row = st.executeUpdate(insert_data);
		System.out.println("the number rows inserted :"+updateCount_row);
		
		con.close();
		
		
		
		
		


	}

}
