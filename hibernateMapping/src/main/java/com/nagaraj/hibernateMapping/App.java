package com.nagaraj.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Laptop laptop = new Laptop();
       laptop.setLid(100);
       laptop.setLname("Hp");
       
       Student s = new Student();
       s.setSid(1);
       s.setName("Nagaraj");
       s.setMarks(35);
       s.getLaptop().add(laptop);
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);

       SessionFactory sf = con.buildSessionFactory();
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();

       session.save(laptop);
       session.save(s);
       tx.commit();
       
       
       
       
       
       
       
       
    }
}
