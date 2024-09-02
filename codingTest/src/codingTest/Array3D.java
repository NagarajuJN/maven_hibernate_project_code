package codingTest;
import java.util.*;

public class Array3D {

	public static void main(String [] args) {
		int i ,j,k;
	Scanner sc = new Scanner(System.in);
	int[][][] a = new int[2][3][4];
	for(i = 0 ;i<=a.length -1 ; i++)
	{
		for(j =0 ;j<=a[i].length -1 ; j++)
		{
			for(k = 0 ;k<=a[i][j].length -1 ; k++)
			{
				System.out.println("Enter a element:");
				a[i][j][k]= sc.nextInt();		
			}
		}
	}
	//---------------------
	
	for(i = 0 ;i<=a.length -1 ; i++)
	{
		for(j =0 ;j<=a[i].length -1 ; j++)
		{
			for(k = 0 ;k<=a[i][j].length -1 ; k++)
			{
				System.out.print(a[i][j][k]);
			}
			System.out.println();
		}
	}
	}
	}
