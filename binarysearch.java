import java.util.Scanner;

class binarysearch
{
	public static int binarysearc(int arr[],int low,int high,int target)
	{
		while(low<high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==target) return 1;
			else if(target>arr[mid]) low=mid+1;
			else high=mid-1;
		}
		return 0;
	}
		
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter the element to be searched:");
		
		int target=sc.nextInt();
		
		int f=binarysearc(arr,0,n,target);
		
		if(f==1) System.out.println("Target Reached");
		else System.out.println("Mission failed");
		
	}
}
