package in.nagaraj.java8;

import java.util.*;
import java.util.stream.Collectors;

public class CountChar {

	public static void main(String[] args) {

//		String s = "Naga";
//		
//		long total = s.chars().filter(c -> c !=' ').count();
//		System.out.println(total);

		
//		List<Integer> list = Arrays.asList(1,3,44,56,6);
//		Optional<Integer>  sum = list.stream().reduce((a,b)->a+b);
//		System.out.println(sum.get());
	
//		List<Integer> l = Arrays.asList(1,2,23,52,52);
//		List<Integer> odd = l.stream().filter(e -> e%2==0).collect(Collectors.toList());
//		System.out.println(odd);
//		
//	List<Integer>	 l = Arrays.asList(4,65,65,3,5,5);
//	List<Integer> even= l.stream().filter(c -> c%2!=0).collect(Collectors.toList());
//	System.out.println(even);
	
	
	List<Integer>	 l = Arrays.asList(4,65,65,3,5,5);
	Optional<Integer> min_valu= l.stream().min(Comparator.naturalOrder());
	System.out.println(min_valu.get());
	
	List<Integer>	 l1 = Arrays.asList(4,65,65,3,5,5);
	Optional<Integer> max_valu= l1.stream().max(Comparator.naturalOrder());
	System.out.println(max_valu.get());
	
	
	List<Integer>	 l2 = Arrays.asList(4,65,65,3,5,5);
	List<Integer> unique= l1.stream().distinct().collect(Collectors.toList());
	System.out.println(max_valu.get());
	}

}
