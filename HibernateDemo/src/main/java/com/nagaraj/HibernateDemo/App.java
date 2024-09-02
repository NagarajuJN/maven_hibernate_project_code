package com.nagaraj.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )throws Exception
    {
       
    	EmpInfo emp = new EmpInfo();
//    	emp.setEid(45);
//    	emp.setEname("ABD");
//    	emp.setAge(34);
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(EmpInfo.class);// to creat the new object
    	SessionFactory sf = con.buildSessionFactory();  	
    	Session session = sf.openSession();   
    	Transaction tx = session.beginTransaction();
    	//session.save(emp);  	// to store the data
    	
    	// to fetch the data:
    	
    	emp =session.get(EmpInfo.class,null);
    System.out.println(emp);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	tx.commit();  
    }
}
