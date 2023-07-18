package pck_15_7;

import java.util.Scanner;

//swapping of numbers using two variable

public class swapping_assignment_2 
{
	public void swap()
	{
		System.out.println("swapping of two numbers using two variable");
		System.out.println(" ");
		Scanner ob=new Scanner(System.in);
		System.out.print("A= ");
		int a =ob.nextInt();
		System.out.print("B= ");
		int b=ob.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" ");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
	}
	public static void main(String[] args) 
	{
		swapping_assignment_2 abc=new swapping_assignment_2();
		abc.swap();
	}
}
