package in.nagaraj.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddorEven {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(3,4,21,34,35,1);

			 List<Integer> evenList = l.stream().filter(e -> e%2 ==0).collect(Collectors.toList());
			System.out.println(evenList);
	

			 List<Integer> oddList = l.stream().filter(e -> e%2 !=0).collect(Collectors.toList());
			System.out.println(oddList);
	
	}

}
