package org.nagaraj.classNotes;

import java.util.concurrent.*;
public class MapDemo {

	public static void main(String[] args) {

		ConcurrentMap<String , Integer> emp_info = new ConcurrentHashMap<String,Integer>();
		System.out.println(emp_info);
		emp_info.put("Nagaraj", 10000);
		System.out.println(emp_info);
		emp_info.put("Virat", 12000);
		System.out.println(emp_info);
		emp_info.put("ABD", 50000);
		System.out.println(emp_info);
		emp_info.put("Dhoni", 100000);
		System.out.println(emp_info);
		System.out.println("After entering the duplicate key name :");

		emp_info.put("Virat", 99999);
		System.out.println(emp_info);
		System.out.println("=====================");

		System.out.println("After entering the duplicate value  name :");

		emp_info.put("Virat18", 99999);
		System.out.println(emp_info);
		System.out.println("After entering wrong key to remove key :");

		
		emp_info.remove("Virat");
		System.out.println(emp_info);


		emp_info.remove("ABD");
		System.out.println(emp_info);
		
		System.out.println("After replacing the new value with old value  :");

		emp_info.replace("Nagaraj", 10000, 3333);
		System.out.println(emp_info);

		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
	}

}
