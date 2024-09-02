package org.nagaraj.classNotes;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<String , Integer> product_info = new TreeMap<String,Integer>();
		product_info.put("Pen",10);
		product_info.put("Ice Cream",100);
		product_info.put("Book",50);
		
	
		product_info.put("Marker",30);
		System.out.println(product_info);
		
		int value_ofPen = product_info.get("Pen");
		System.out.println(value_ofPen);
		
			for(String key:product_info.keySet())
			{
				System.out.println("Product_name:" +key+   "  : price:"+product_info.get(key));
			}
			
			
			
			
			
			
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


