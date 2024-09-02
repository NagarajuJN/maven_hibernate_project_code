package com.nagaraj.jbbcclass;

import java.sql.*;
public class PreparedStDropTableDemo {

	public static void main(String[] args) throws Exception {
				

		        // Step 1: Load the JDBC driver
		        Class.forName("com.mysql.cj.jdbc.Driver");

		        // Step 2: Establish the connection
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/std_details?autoReconnect=true&useSSL=false", "root", "root");


		        // Step 3: Create a statement
		        Statement st = con.createStatement();

		        // Step 4: Execute a query
		        ResultSet rs = st.executeQuery("SELECT * FROM std_details");

		        // Step 5: Process the result set
		        System.out.println("s_id\tfirstname\tlastname\tdob\tgender\temail\tphone");
		        System.out.println("-----------------------------------------------------------");
		        while (rs.next()) {
		            System.out.println(rs.getInt("s_id") + "\t" +rs.getString("firstname") + "\t" +
		                               rs.getString("lastname") + "\t" +
		                               rs.getDate("DateOfBirth") + "\t" +
		                               rs.getString("gender") + "\t" +
		                               rs.getString("email") + "\t" +
		                               rs.getInt("phone"));
		        }

		      con.close();
		        // Step 6: Close the resources
	}
}
