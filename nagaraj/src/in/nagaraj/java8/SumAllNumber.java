package in.nagaraj.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;
import java.util.Optional;


public class SumAllNumber {

	public static void main(String[] args) {
		List<Integer>  l = Arrays.asList(1,2,3,4,45,0);
		Optional<Integer> sum =  l.stream().reduce((a, b) -> a+b)	;
		System.out.println(sum.get());

}
}