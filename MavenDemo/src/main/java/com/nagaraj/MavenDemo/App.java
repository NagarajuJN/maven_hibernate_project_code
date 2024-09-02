package com.nagaraj.MavenDemo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student s = new Student();
    	s.setSid(1);
    	s.setSname("Nagaraj");
    	s.setMarks(100);
    	Configuration con = new Configuration();
    	
    	SessionFactory sf = con.buildSessionFactory();

    	Session session = sf.openSession();
    	session.save(s);
    
    }
}
