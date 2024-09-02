package in.nagaraj.java8;

import java.util.function.Predicate;

public class PredicateExample2 {
	public static void main(String [] args) {
		String[] list = {"Nagaraj","Ninu","Pavi"};
		Predicate<String> p = name -> name.charAt(0)=='N';
		for(String name:list)
		{
			if(p.test(name)){
				System.out.println(name);
				
			}
		}
		
		
	}

}
