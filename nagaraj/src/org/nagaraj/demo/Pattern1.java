package org.nagaraj.demo;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int  i , k , j;
	int num = 4;
	for(i = 1 ; i<=num ;i++)
	{
		for(k=1;k<=num;k--)
		{
			System.out.print(" ");
		}
		for(j = 1;j<=2*i-1;j++)
		{
			System.out.print(i);

		}
		System.out.println();

	}
	}

}
