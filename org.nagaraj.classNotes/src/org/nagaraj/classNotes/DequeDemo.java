package org.nagaraj.classNotes;
import java.util.*;
public class DequeDemo {

	public static void main(String[] args) {

		Deque<String> dq = new ArrayDeque<String>();
		dq.add("Bangalore");
		dq.add("Nagaraj");
		dq.add("J N");
		System.out.println(dq);
		dq.addFirst("Hy");
		System.out.println(dq);
		dq.addLast("12324235");
		System.out.println(dq);
		dq.push("Virat ");
		System.out.println(dq);
		dq.push("ABD ");
		System.out.println(dq);
		dq.add("Dhoni");
		System.out.println(dq);
		dq.removeFirst();
		System.out.println(dq);
		dq.removeLast();
		System.out.println(dq);
		dq.remove("Nagaraj");
		System.out.println(dq);
		
		
		
		


		
		
	}

}
