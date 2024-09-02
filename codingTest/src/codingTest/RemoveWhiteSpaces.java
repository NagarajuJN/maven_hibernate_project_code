package codingTest;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str = " da ad w w rr ww greg "; 
		String npSpaceStr = str.replaceAll("\\s", "");  // by using unicode chareater(resp the singal space)
		System.out.println(npSpaceStr);

	}

}
