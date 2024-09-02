package org.nagaraj.classNotes;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> box = new Stack<Integer>();
		System.out.println(box);
		box.push(10);
		box.push(20);
		box.push(30);
		box.push(40);
		System.out.println(box);
		System.out.println("after poping 40:");
		box.pop();
		System.out.println(box);
		System.out.println("after poping 30:");
		box.pop();
		System.out.println(box);

		

		

		
	}

}
