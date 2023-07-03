package pck_25;

public class Assignment1 
{
	// 	---output will be in the given sequence---
	// 	three parameterized constructor
	//	default parameterized  constructor
	//	one parameterized  constructor
	//	four parameterized constructor
	//  two parameterized  constructor
	
	public Assignment1(int a, int b, int c)
	{
		System.out.println("three parameterized constructor");
	}
	public Assignment1(int a)
	{
		this();
		System.out.println("one parameterized constructor");
	}
	public Assignment1(int a, int b)
	{
		this(1,2,3,4);
		System.out.println("two parameterized constructor");
	}
	public Assignment1()
	{
		this(1,2,3);
		System.out.println("default parameterized constructor");
	}
	public Assignment1(int a, int b, int c, int d)
	{
		this(5);
		System.out.println("four parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Assignment1 obj1=new Assignment1(5,6);
	}
}
