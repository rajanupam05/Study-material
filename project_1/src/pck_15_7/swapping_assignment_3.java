package pck_15_7;

import java.util.Scanner;

/// swapping of two numbers using three variable

public class swapping_assignment_3 
{

	int c;
	public void swap()
	{
		System.out.println("swapping of two numbers using three variable");
		System.out.println(" ");
		Scanner ob=new Scanner(System.in);
		System.out.print("A= ");
		int a=ob.nextInt();
		System.out.print("B= ");
		int b=ob.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("  ");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
	}
	public static void main(String[] args) 
	{	
		swapping_assignment_3 abc=new swapping_assignment_3();
		abc.swap();	
	}
}
