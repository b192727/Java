import java.util.Scanner;

import java.lang.Math;

public class calculator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		String ch=sc.next();
		double sum;
		switch(ch)
		{
			case "+":
				sum=a+b;
				System.out.println("Sum:"+sum);
				break;
			case "-":
				sum=a-b;
				System.out.println("Difference:"+sum);
				break;
			case "*":
				sum=a*b;
				System.out.println("Product:"+sum);
				break;
			case "/":
				sum=a/b;
				System.out.println("Quotient:"+sum);
				break;
			case "^":
				sum=(Math.pow(a,b));
				System.out.println("Power:"+sum);
				break;
		}
	}
	}
	
