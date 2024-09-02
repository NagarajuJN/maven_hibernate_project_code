package collection_code;

import java.util.*;
public class Demo {

	public static void main(String[] args) {
		 List<Integer> list =new ArrayList<Integer>(); 
		 list.add(1);
		 list.add(2);
		 list.add(null);   
		 list.add(4);
		 list.remove(0); 
		 
		 //Adding elements in the List  
	 
		 //Iterating the List element using for-each loop  
		 for(Integer fruit:list)  
		  System.out.println(fruit);  
		  
			System.out.println("size is"+list.size());
		}


	}


