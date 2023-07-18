package pck_15_7;

import java.util.Scanner;

public class scanner_condition 
{
	public static void main(String[] args) 
	{
		System.out.print("Please Enter a number: ");
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
		if(a%2==0)
		{
			System.out.println("Even number "+a);
		}
		else
		{
			System.out.println("Odd number "+a);
		}
		
	}
}
