package codingTest;

import java.util.Arrays;

public class StrongCharAsc {

	public static void main(String[] args) {

		String str = "Rama";
		char[] chArray = str.toCharArray();
		Arrays.sort(chArray);
		System.out.println(new String(chArray));
	}

}
