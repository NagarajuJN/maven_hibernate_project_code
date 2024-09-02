package codingTest;
import java.util.*;
public class RemoveRepeatedchar {

	public static void main(String[] args) {

		String str = "aaafdfddaaa";
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new LinkedHashSet();
		for(int i = 0; i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(char c : set)
		{
			sb.append(c);
		}
		
		System.out.println(sb);
	}

}
