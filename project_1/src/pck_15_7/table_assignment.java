package pck_15_7;

import java.util.Scanner;


public class table_assignment 
{
	int i, result, b;
	public void table()
	{
		System.out.println("Table of the given number");
		Scanner ob=new Scanner(System.in);
		System.out.println(" ");
		System.out.print("Enter number: ");
		int a=ob.nextInt();
		System.out.println("");
		b=a;
		for(i=1; i<11; i++)
		{
			result=a;
			a=a+b;
			System.out.println(result);
		}
	}
	public static void main(String[] args) 
	{
		table_assignment abc=new table_assignment();
		abc.table();
	}
}
