package org.nagaraj.classNotes;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		System.out.println(v);
		v.add("Nagarj");
		v.add("King Maker");
		v.add("Rakesh");
		System.out.println(v);

		Iterator<String> itr = v.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
