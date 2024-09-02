package org.nagaraj.classNotes;
import java.util.*;
public class PqueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> q= new PriorityQueue<String>();
		q.add("Zyhn");
		q.add("Nagaraj");
		q.add("J N");
		q.add("Dhoni");
		q.add("Hyb");
		q.add("Trainer");
	
		System.out.println(q);
		System.out.println("Head ele:"+q.peek());
		System.out.println("Head ele:"+q.element());
		
	
		System.out.println(q);
		q.remove("Trainer");
		System.out.println(q);
		



		
	}

}
