package codingTest;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
	int i ;
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String str = sc.next();
		String temp = str;
		String  rev = "";
		// count the number of chart in str
		int c = 0 ;
		for( i = str.length()-1;i>=0;i--)
		{
			c = c+1;
		}
		System.out.println(c);
		// str reverse using charAt();
		
		for( i = str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));

		}
		System.out.println();

		
		for( i = str.length()-1;i>=0;i--)
		{
			rev =rev+ str.charAt(i);
		}
		System.out.println(rev);
		
		// to check palindrome or not 
		if(rev.equals(temp))
			System.out.println("Palindrome");
		else
		{
			System.out.println("Not Palindrome");

		}
		
// Str reverse using tocharArray
		
		char[] ch = str.toCharArray();
		for(  i = ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();

// using String buffer class 
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		// using String builder class 
				StringBuilder sbul = new StringBuilder(str);
				System.out.println(sbul.reverse());
				
	}

}
