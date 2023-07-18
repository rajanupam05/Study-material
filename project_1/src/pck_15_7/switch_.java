package pck_15_7;

import java.util.Scanner;


////     case sensitive issue write anything with carefully

public class switch_ 
{
	public static void main(String[] args) 
	{
		System.out.print("enter a number: ");
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
		System.out.print("enter another number: ");
		int b=ob.nextInt();
		System.out.print("enter operation need to perform: ");
		int op=ob.nextInt();
		switch(op)
		{
		case 1:
		{
			System.out.println("additon operation");
			int result=a+b;
			System.out.println("result is: "+result);
			break;
		}
		case 2:
		{
			System.out.println("subtraction operation");
			int result=a-b;
			System.out.println("result is: "+result);
			break;
		}
		case 3:
		{
			System.out.println("multiplication operation");
			int result=a*b;
			System.out.println("result is: "+result);
			break;
		}
		case 4:
		{
			int result=a/b;
			System.out.println("divide operation");
			System.out.println("result is: "+result);
			break;
		}
		default:
		{
			System.out.println("please choose correct option");
			break;
		}
		}
		
		
	}
}
