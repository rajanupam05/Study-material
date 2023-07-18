package pck_15_7;

import java.util.Scanner;

// fibonacci series

public class fibonacci_assignment 
{
	static int i, r=0, b=1, c;
	public static void main(String[] args) 
	{
		System.out.println("## fibonacci series ##");
		System.out.println(" ");
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number till where series needed: ");
		int a=ob.nextInt();
		System.out.println(" ");
		System.out.println(r);
		System.out.println(b);
		for(i=2; i<a; i++)
		{
			c=r+b;
			System.out.println(c);
			r=b;
			b=c;
		}
	}
}
