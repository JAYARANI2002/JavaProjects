//Left triangle pattern of stars:
import java.util.Scanner;
public class LeftTrianglePattern
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=(n-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
