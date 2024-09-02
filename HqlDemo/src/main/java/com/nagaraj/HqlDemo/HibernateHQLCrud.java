package com.nagaraj.HqlDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class HibernateHQLCrud {
	private static SessionFactory sessionFactory;
	
	
	public static void main(String[] args)
		{
		sessionFactory = new Configuration().configure().buildSessionFactory();
//
		HibernateHQLCrud hql= new HibernateHQLCrud();
//		hql.createPerson("Nagarj",50);
//		hql.createPerson("Teja", 33);
//		hql.createPerson("Ramu", 23);
		
		List<Person> persons = hql.getAllPersons();
		
//		System.out.println(persons);
//		for(Person persons1:persons)
//		{
//		System.out.println(persons1);
//		}
		// onther way is .foreach() 
		
		// display the records:
//		persons.forEach(person ->
//		System.out.println(person.getId()+" "+ person.getAge()+" "+person.getName()));
//		
		// update person info:
//		hql.updatePerson(1, "Nagesh", 22);
		
		// delete the records
//		hql.deletePerson(3);
		
		// to display the speicfic records using id
		Person person = hql.getPersonById(9);
		System.out.println("Person with id 9 is :"+person.getName()+"    "+person.getAge());
		
		}
	
	
	// creating the tables
		public void createPerson(String name,int age)
		{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			Person p = new Person();
			p.setName(name);
			p.setAge(age);			
			session.save(p);
			tx.commit();
			session.close();	
			
		}
		
		// reatrival or featch the data
		
		public List<Person> getAllPersons()
		{
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from Person",Person.class);
		List<Person> persons = ((org.hibernate.query.Query<Person>) q).list();
		session.close();
		return persons;
		
		}
		// to update the records
		public void updatePerson(int id,String name,int age)
		{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			Person person = session.get(Person.class, id);
			person.setName(name);
			person.setAge(age);
			session.update(person);
			tx.commit();
			session.close();
			
		}
		
		// to perform the delete
		
		public void deletePerson(int id)
		{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			Person person = session.get(Person.class, id);
			session.delete(person);
			tx.commit();
			session.close();
			
		}
		
		public Person getPersonById(int id)
		{
			Session session = sessionFactory.openSession();
			Person person = session.get(Person.class, id);
			session.close();
			return person;
		}
		
		
		
		
		
		
		
		
	}


