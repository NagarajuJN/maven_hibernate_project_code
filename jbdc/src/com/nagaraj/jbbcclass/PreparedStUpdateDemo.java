package com.nagaraj.jbbcclass;

import java.sql.*;

public class PreparedStUpdateDemo {

	public static void main(String[] args) throws Exception{
		  Class.forName("com.mysql.cj.jdbc.Driver");	
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccruddb?autoReconnect=true&useSSL=false","root","Naga@123");
			
			
		  PreparedStatement pst = con.prepareStatement("update  emp_info  set ename = ? where eno = ?");
			pst.setString(1, "Nagesh");

		  pst.setInt(2, 101);
			
			// optional
			
			int no_of_row_updated = pst.executeUpdate();
			System.out.println("no_of_row_inserted : "+no_of_row_updated);
			
			con.close();
			
			
			
			
			
			
			
			
			
			
	}

}
