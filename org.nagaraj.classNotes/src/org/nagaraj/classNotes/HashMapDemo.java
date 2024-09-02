package org.nagaraj.classNotes;

import java.util.HashMap;
public class HashMapDemo {
	public static void main(String[] args)
	{
	
	HashMap ipl_info = new HashMap();
	ipl_info.put("RCB",null);
	ipl_info.put("SRH",null);
	ipl_info.put("CSK",5);
	ipl_info.put("MI",5);
	ipl_info.put("GT",1);
	ipl_info.put(null,1);
	ipl_info.put(null,2);
	ipl_info.put(null,3);



	
	System.out.println(ipl_info);
	System.out.println("Size of the hashmap:"+ipl_info.size());
	
	
	
	
	
}
}
