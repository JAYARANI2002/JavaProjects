//12. Write a Java program to find the duplicate values of an array of integer values.
import java.util.Scanner;
public class FindDuplicate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Duplicate element");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
		                {
				  System.out.println(a[i]+" ");
			        }
			}
		}
	}
}


