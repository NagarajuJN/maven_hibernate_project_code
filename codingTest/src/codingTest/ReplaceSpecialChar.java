package codingTest;

public class ReplaceSpecialChar {

	public static void main(String[] args) {

		String str = "!@!@sasa@!@*((23";
		String planStr = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(planStr);

	}

}
