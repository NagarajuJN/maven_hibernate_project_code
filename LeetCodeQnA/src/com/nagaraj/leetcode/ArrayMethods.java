package com.nagaraj.leetcode;

import java.util.*;

public class ArrayMethods {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(11);
		l.add(22);
		l.add(33);
		System.out.println(l);
		
		// Instead of above we can use aslist method
		
		List<Integer> l1 = Arrays.asList(11,22,33,44);
		System.out.println(l1);
		
		// Sort method
	int arr[] = new int[] {1,311,44,5,232,323,23};
		
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
	//if i want sort only after 3rd array
	Arrays.sort(arr,3,arr.length-1);
	System.out.println(Arrays.toString(arr));
	
	}

}
