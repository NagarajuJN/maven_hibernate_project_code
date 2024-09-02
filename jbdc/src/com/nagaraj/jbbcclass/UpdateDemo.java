package com.nagaraj.jbbcclass;
import java.sql.*;

public class UpdateDemo {

	public static void main(String[] args) throws Exception{
		  Class.forName("com.mysql.cj.jdbc.Driver");	
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccruddb?autoReconnect=true&useSSL=false","root","Naga@123");
			
			Statement st = con.createStatement();
				
			String update_query = "update emp_info set salary=88888 where ename = 'Akhlia'";
			
			System.out.println("Updating the records done successfully");

			int updateCount_row = st.executeUpdate(update_query);
			System.out.println("the number rows updated :"+updateCount_row);
			
			con.close();
			
	}

}
