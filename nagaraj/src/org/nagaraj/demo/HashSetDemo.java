package org.nagaraj.demo;
import java.util.HashSet;
import java.util.ArrayList;
public class HashSetDemo {

	public static void main(String[] args) {

	HashSet books = new HashSet(); 
	books.add("Java");
	books.add("Python");
	books.add("C++");
	books.add("C");
	books.add("C#");
	books.add("Python");
	books.add("Python");
	books.add("Python");
	books.add("Python");
	books.add("Null");
	books.add("Null");
	books.add("WebTech");
	books.add(100);
	
	System.out.println(books);
	
	ArrayList  bag= new ArrayList();
	System.out.println("Empty bag before filling");
	System.out.println("Out put of the bag:"+bag);
	
	System.out.println("After filling in side bag");
				bag.addAll(books);
				System.out.println(bag);
	
	
	
	
	}

}
