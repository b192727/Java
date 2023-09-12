import java.util.Scanner;

public class linearsearch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched:");
		int target=sc.nextInt();
		int f=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==target)
			{
				f=1;
				break;
			}
		}
		if(f==1) System.out.println("Found");
		else System.out.println("Not Found");

	}
}
