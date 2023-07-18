package pck_15_7;

import java.util.Scanner;

/// whether prime or not

public class prime_number_assignment 
{
	int i;
	int c=0;
	public void prime()
	{
		System.out.println("Whether prime or not prime");
		System.out.println(" ");
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter a +ve number: ");
		int a=ob.nextInt();
		for(i=1; i<a; i++)
		{
			if(a%i==0)
			{
				c++;
			}
		}
		System.out.println(" ");
		if(c>1)
		{
			System.out.println("Not prime number");
		}
		else
		{
			System.out.println("prime number");
		}
	}
	public static void main(String[] args) 
	{
		prime_number_assignment abc=new prime_number_assignment();
		abc.prime();
	}
}
