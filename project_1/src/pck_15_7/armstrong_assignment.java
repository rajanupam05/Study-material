package pck_15_7;

import java.util.Scanner;

public class armstrong_assignment 

///			armstrong number
{
	static int r, result=0;
	public static void main(String[] args) 
	{
		System.out.println("Armstrong of a number");
		System.out.println(" ");
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a=ob.nextInt();
		while(a>0)
		{
			r=a%10;
			result=result+r*r*r;
			a=a/10;
		}
		System.out.println(" ");
		System.out.println("Result is: "+result);
	}
}

