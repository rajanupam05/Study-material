package pck_1_7;

public class assignment1_1 

/// Parent constructor with parameter

{
	public assignment1_1()
	{
		this(11,12,13);
		System.out.println("parent default constructor");
	}
	public assignment1_1(int a)
	{
		this();
		System.out.println("parent one parameterized constructor");
	}
	public assignment1_1(int a, int b)
	{
		this(1);
		System.out.println("parent two parameterized constructor");
	}
	public assignment1_1(int a, int b, int c)
	{
		System.out.println("parent three parameterized constructor");
	}
}
