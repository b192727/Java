import java.util.Scanner;

public class largestandsmallest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		int n5=sc.nextInt();
		int largest=n1;
		int smallest=n1;
		
		if(n2>largest) largest=n2;
		if(n3>largest) largest=n3;
		if(n4>largest) largest=n4;
		if(n5>largest) largest=n5;
		
		System.out.println("The Largest number among those is:"+largest);
		
		if(n2<smallest) smallest=n2;
		if(n3<smallest) smallest=n3;
		if(n4<smallest) smallest=n4;
		if(n5<smallest) smallest=n5;
		
		System.out.println("The Smallest among those is:"+smallest);
	}
}
