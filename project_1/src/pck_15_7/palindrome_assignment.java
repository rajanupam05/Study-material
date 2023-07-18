package pck_15_7;

import java.util.Scanner;

/// whether palindrome or not---reverse of number


public class palindrome_assignment 
{
	int r=0, result=0, b;
	public void reverse()
	{
		System.out.println("whether palindrome or not---reverse of numebr");
		Scanner ob=new Scanner(System.in);
		System.out.println(" ");
		System.out.print("Enter a number: ");
		int num=ob.nextInt();
		b=num;
		while(num>0)
		{
			r=num%10;
			result=result*10+r;
			num=num/10;
		}	
		System.out.println("");
		System.out.println("Result is: "+result);
		System.out.println(" ");
		if(result==b)
		{
			System.out.println("It's a palindrome number");
		}
		else
		{
			System.out.println("It's not a palindrome number");
		}
	}
	public static void main(String[] args) 
	{
		palindrome_assignment abc=new palindrome_assignment();
		abc.reverse();
		
	}
}


