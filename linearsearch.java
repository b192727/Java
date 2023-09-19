import java.util.*;

class linearsearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		
		System.out.println("Enter the element to be searched:");
		
		int target=sc.nextInt();
		
		
		int f=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==target) 
			{
			    f=1;
			    break;
			}
		}
		
		if(f==1) System.out.println("Target Reached");
		else System.out.println("Mission Failed");
		
	}
}
