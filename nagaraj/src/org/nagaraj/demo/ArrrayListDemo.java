package org.nagaraj.demo;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> Student_marks  = new ArrayList<>( ); 
		System.out.println(Student_marks);
		Scanner sc = new Scanner(System.in);
		int student_count =5;
		for(int i =0;i<student_count ;i++)
		{
			System.out.println("Enter the marks:");
			int mark = sc.nextInt();
			
			Student_marks.add(mark);
		}
		System.out.println(Student_marks);
		
		
		
		
		
		
//		System.out.println(arr);
//		arr.add(10);
//		System.out.println(arr);
//		arr.add(11.11);
//		System.out.println(arr);
//		arr.add('J');
//		System.out.println(arr);
//		arr.add("Nagaraj");
//		System.out.println(arr);
//		arr.add(10);
//		System.out.println(arr);
//		arr.add(20);
//		System.out.println(arr);
//		arr.add(null);
//		System.out.println(arr);
//		System.out.println("After remove method");
//		arr.remove(3);	
//		System.out.println(arr);
//		
//		System.out.println(arr.size()); // size method used find the no of ele or object in arraylist
//arr.clear();
//System.out.println(arr);

	}

}
