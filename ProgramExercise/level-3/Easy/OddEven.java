import java.util.Scanner;
public class OddEven
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
	        {
			if(a[i]%2==0)
			{
			    System.out.println("Even :"+a[i]);
			}
			else
		            System.out.println("Odd : " +a[i]);
		}
	}
}
