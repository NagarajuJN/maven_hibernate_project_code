package com.nagaraj.jbbcclass;

import java.sql.*;

public class PreparedStSelectDemo {

	public static void main(String[] args) throws Exception{
		  Class.forName("com.mysql.cj.jdbc.Driver");	
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccruddb?autoReconnect=true&useSSL=false","root","Naga@123");
			
			
		  PreparedStatement pst = con.prepareStatement("Select * from emp_info");
		  ResultSet res = pst.executeQuery();
		  while(res.next())
		  {
			  System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getInt(3)+"\t"+res.getString(4));
		  }
		
			
			// optional
			
			
			con.close();
			
			
			
			
			
			
			
			
			
			
	}

}
