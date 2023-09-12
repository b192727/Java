import java.util.*;
import java.lang.Math;
public class quadratic
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		double root1,root2,discriminant;
		discriminant=b*b-4*a*c;
		if(discriminant>0) 
		{
			System.out.println("Real Roots:");
			root1=(-b+(Math.sqrt(b*b-4*a*c)))/(2*a);
			root2=(-b-(Math.sqrt(b*b-4*a*c)))/(2*a);
			System.out.println("Root1="+root1);
			System.out.println("Root2="+root2);
		}
		else if(discriminant<0)
		{
			System.out.println("Imaginary Roots:");
			root1=(-b+(Math.sqrt(b*b-4*a*c)))/(2*a);
			root2=(-b-(Math.sqrt(b*b-4*a*c)))/(2*a);
			System.out.println("Root1="+root1+"i");
			System.out.println("Root2="+root2+"i");
		}
		else 
		{
			System.out.println("Real and equal Roots:");
			root1=(-b)/(2*a);
			root2=(-b)/(2*a);
			System.out.println("Root1="+root1);
			System.out.println("Root2="+root2);
		}
	}
}

