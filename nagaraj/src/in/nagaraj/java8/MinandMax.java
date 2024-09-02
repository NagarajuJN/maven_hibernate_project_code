package in.nagaraj.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinandMax {

	public static void main(String[] args) {

		List<Integer> l =Arrays.asList(2,3,343,34,34,3,2,2,2,3,4,5);
		
		Optional<Integer> min = l.stream().min(Comparator.naturalOrder());
		System.out.println(min);
		
		Optional<Integer> max = l.stream().max(Comparator.naturalOrder());
		System.out.println(max);
		

	}

}
