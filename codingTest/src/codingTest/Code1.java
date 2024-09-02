package codingTest;
import java.util.*;
public class Code1 {

	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter num:");
		int num = 5;
		
//		
//		for (i = 1;i<=num ;i++)
//		{
//			for(j=1;j<=num;j++)
//			{
//				System.out.print("* ");
//			}
//		System.out.println();
//		Enter num:
//			5
//			* * * * * 
//			* * * * * 
//			* * * * * 
//			* * * * * 
//			* * * * * 
//==========================
//		for ( i = 1 ; i<=num;i++) {
//			for (j = 1 ; j<=i;j++)
//			{
//				System.out.print("*");
//				
//			}
//		System.out.println();
//		
//		}
//	}
//		Enter num:
//			5
//			*
//			**
//			***
//			****
//			*****
//=========================
//		
//		for(i = 1 ; i<=num ;i++)
//		{
		
//			for(j =i ; j<=num;j++)
//			{
//				System.out.print("*");
//				
//			}
//		System.out.println();
////		}
		
//		*****
//		****
//		***
//		**
//		*
//		for(i=1;i<=num ;i++)
//		{
//			for(j=1;j<=num;j++)
//			{
//				if(i==1||i==5||j==1||j==5)
//				{
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		*****
//		*   	*
//		*   	*
//		*   	*
//		*****
		
//	for(i  = 1;i<=num;i++)
//	{
//		for(j = 1;j<=i;j++)
//		{
//			System.out.print("*");	
//		}
//			System.out.println();
//		}
//	for(i  = 1;i<=num;i++)
//	{
//		for(j = i;j<=num-1 ;j++)
//		{
//			System.out.print("*");	
//		}
//			System.out.println();
//		}
////	
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
//=======================
		
for(i =1;i<=num ; i++)
{
	for(k=i;k<=(num-i);k++)
	{
		System.out.print(" ");
	}
	for(j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
	
	
	
	
	}
}
