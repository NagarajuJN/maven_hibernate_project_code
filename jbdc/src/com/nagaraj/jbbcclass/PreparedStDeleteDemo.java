package com.nagaraj.jbbcclass;

import java.sql.*;

public class PreparedStDeleteDemo {

	public static void main(String[] args) throws Exception{
		  Class.forName("com.mysql.cj.jdbc.Driver");	
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccruddb?autoReconnect=true&useSSL=false","root","Naga@123");
			
			
		  PreparedStatement pst = con.prepareStatement("delete from emp_info where eno = ?");

		  pst.setInt(1, 101);
			
			// optional
			
			int no_of_row_deleted = pst.executeUpdate();
			System.out.println("no_of_row_deleted : "+no_of_row_deleted);
			
			con.close();
			
			
			
			
			
			
			
			
			
			
	}

}
