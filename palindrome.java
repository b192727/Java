import java.util.Scanner;

public class palindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		if(rev==temp) System.out.println("Palindrome");
		else System.out.println("Not a Palindrome");
}
}
