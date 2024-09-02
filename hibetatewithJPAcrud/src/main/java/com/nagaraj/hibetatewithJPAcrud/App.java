package com.nagaraj.hibetatewithJPAcrud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    // look JPA create one with a name called student and insert records
    	// persist() used to store the data permentaly
    	
    	Student s = new Student();
//    	s.setId(105);
//    	s.setName("Rakesh");
//    	s.setAge(22);
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	
    	EntityManager em= emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	// 
    	
//    	em.persist(s);
    	
//    	
//    	  s = em.find(Student.class,105);
//    	System.out.println(s);
    	
    	

  
    	
    	// update the existing records
    	
//    	Student existingStudent = em.find(Student.class, 105);
//    	if(existingStudent!=null) {
//    		existingStudent.setName("Ramu");
//    		existingStudent.setAge(99);
//    		
//    	}
//    	
//      	em.getTransaction().commit();
//      	// to check wheather it's updated or not 
//      	
//      	existingStudent = em.find(Student.class, 105);
//      	System.out.println("Updated studnet_info is :"+existingStudent);
//    	
//    	
//    	
    	// delete the records 
//    	Student  studentToDelete = em.find(Student.class, 102);
//    	if(studentToDelete !=null)
//    	{
//    		em.remove(studentToDelete);
//    	}
//    	
//    	em.getTransaction().commit();
//    	
//    	// to check if the record is deleted
//    	
//    	Student deletedStudent = em.find(Student.class, 102);
//    	System.out.println("deleted student:"+deletedStudent);
    	
    	
    	// delete the all rows in the table
    	
    	
    	int deltetedCount = em.createQuery("delete from Student").executeUpdate();
    	
    	em.getTransaction().commit();
    	// optional 
    	System.out.println(" Delete the all  rows in the student table . total rows deleted is:"+deltetedCount);
    	
    	em.close();
    	emf.close();
    	
    	
    	
    	
    	
    	
    	
    }
}
