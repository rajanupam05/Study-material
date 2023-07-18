package pck_15_7;

import java.util.Scanner;

public class factorial_assignment 
{
	static int i, c;
	public static void main(String[] args) 
	{
		System.out.println("Factorial of number");
		System.out.println(" ");
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=ob.nextInt();
		System.out.println(" ");
		for(i=1; i<a+1; i++)
		{
			if(a%i==0)
			{
				c++;
				System.out.println(i);
			}
		}
		System.out.println(" ");
		if(c>2)
		{
			System.out.println("## Not prime number ##");
		}
		else
		{
			System.out.println("## prime number ##");
		}
		
	}
}
