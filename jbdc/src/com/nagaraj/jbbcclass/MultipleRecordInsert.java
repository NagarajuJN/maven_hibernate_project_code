package com.nagaraj.jbbcclass;
import java.util.*;
import java.sql.*;

public class MultipleRecordInsert {

	public static void main(String[] args) throws Exception{
  Class.forName("com.mysql.cj.jdbc.Driver");	
		
//		String jdbc_url = "jdbc:mysql://localhost:3306/jdbccruddb";
//		String user = "root";
//		String pwd="Naga@123";
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccruddb?autoReconnect=true&useSSL=false","root","Naga@123");
		
		Statement st = con.createStatement();
		
		// to ask MultipleRecord and insert from the user / keyboard
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("Enter the Emp Number :");
		int eno = sc.nextInt();
		
		System.out.println("Enter the Emp Name :");
		String ename = sc.next();

		System.out.println("Enter the Emp Salary :");
		int salary = sc.nextInt();
		
		System.out.println("Enter the Emp Address :");
		String eaddr = sc.next();

		// String formating to store different datatype and multi records
		String insert_data = String.format("insert into emp_info values(%d,'%s',%d,'%s')",eno,ename,salary,eaddr);

		
		
		st.executeUpdate(insert_data);

		System.out.println("Record inserted  successfully ... !");
		
		System.out.println("!------ Do u want to insert or add one more employee record [Yes/No]:----!");
		
		String option = sc.next();
		if(option.equalsIgnoreCase("No"))
		{
			System.out.println("Stop this process");
			break;

			
		}

		}
		
		con.close();
		
		
		
		
		
		
	}

}
