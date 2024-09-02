package org.nagaraj.demo;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		System.out.println(l);
		l.add("Nagaraj");
		l.add(100);
		l.add("8971540150");
		l.add(null);
		l.add(100); // add the object to old linked list 
		System.out.println(l);
		// linked list specfic method
		l.addFirst("Full Stack Trainer");
		System.out.println(l);
		l.addLast("Bangalore");
		System.out.println(l);
		
		System.out.println(l.getFirst());
		
		System.out.println(l.getLast());
		
		System.out.println(l.removeFirst());
		
		System.out.println(l);

		System.out.println(l.removeLast());
		
		System.out.println(l);
		
		
		l.set(2, "Male"); // update the old object with a new object in a same index position
		System.out.println(l);
		l.add(3,"Nagas"); // it will add the ele to mentioned position , and old element shifted to next node
		System.out.println(l); 
		
		l.remove(3);
		System.out.println(l); 


		
		
		
		
		
	}

}
