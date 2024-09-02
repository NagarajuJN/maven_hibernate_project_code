package com.nagaraj.jbbcclass;

import java.sql.*;

public class PreparedStInsertDemo {

	public static void main(String[] args) throws Exception{
		  Class.forName("com.mysql.cj.jdbc.Driver");	
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccruddb?autoReconnect=true&useSSL=false","root","Naga@123");
			
			
		  PreparedStatement pst = con.prepareStatement("insert into emp_info values(?,?,?,?)");
			pst.setInt(1, 101);
			pst.setString(2, "Nagaraj");
			pst.setInt(3,10000);
			pst.setString(4,"Bangalore");
			
			// optional
			
			int no_of_row_inserted = pst.executeUpdate();
			System.out.println("no_of_row_inserted : "+no_of_row_inserted);
			
			con.close();
			
			
			
			
			
			
			
			
			
			
	}

}
