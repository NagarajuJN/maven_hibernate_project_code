package org.nagaraj.classNotes;

import java.util.concurrent.*;

public class ConcuurentSkipListMapDemo {

	public static void main(String[] args) {

		ConcurrentMap<String,Integer> student_info = new ConcurrentSkipListMap<String,Integer>();
		student_info.put("101", 25);
		student_info.put("102", 34);
		student_info.put("103", 23);
		student_info.put("104", 25);
		
		System.out.println(student_info);
		System.out.println("==========================");
		System.out.println("By get method to find the value inside the key:");
		
		System.out.println("Marks inside in 102 id :"+ student_info.get("102"));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
