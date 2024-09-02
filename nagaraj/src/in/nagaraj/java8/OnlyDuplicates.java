package in.nagaraj.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OnlyDuplicates {

	public static void main(String[] args) {
	
		List<Integer> l =Arrays.asList(2,3,343,34,34,3,2,2,2,3,4,5);
		
		Set<Integer> dupNum = new HashSet<Integer>();
		
		Set<Integer> dup = l.stream().filter(e ->!dupNum.add(e)).collect(Collectors.toSet());
		System.out.println(dup);
	}

}
