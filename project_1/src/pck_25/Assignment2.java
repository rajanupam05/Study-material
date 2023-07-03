package pck_25;

public class Assignment2
{
	// ----assignment should be in below sequence---
	//	three parameterized method
	//	default parameterized method
	//	one parameterized method
	//	four parameterized method
	//	two parameterized method
	
	public void m1()
	{
		this.m4(11, 12, 13);
		System.out.println("default parameterized method");
		this.m2(11);
		this.m5(11, 12, 13, 14);
		this.m3(11, 12);
	}
	public void m2(int a)
	{
		System.out.println("One parameterized method");
	}
	public void m3(int a, int b)
	{
		System.out.println("Two parameterized method");
	}
	public void m4(int a, int b, int c)
	{
		System.out.println("Three parameterized method");
	}
	public void m5(int a, int b ,int c, int d)
	{
		System.out.println("Four parameterized method");
	}
	public static void main(String[] args) 
	{
		Assignment2 obj2=new Assignment2();
		obj2.m1();
	}
}
