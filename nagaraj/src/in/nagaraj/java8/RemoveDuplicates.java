package in.nagaraj.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<Integer> l =Arrays.asList(2,3,343,34,34,3,2,2,2,3,4,5);

		List<Integer> noduplicates = l.stream().distinct().collect(Collectors.toList());
		System.out.println(noduplicates);
	}

}
