import java.util.Scanner;
import java.lang.Math;
public class primefactors
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			int f=1;
			if(n%i==0)
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0) 
					{
						f=0;
						break;
					}
				}
				if(f==1) System.out.println(i);
			}
		}
	}
}
