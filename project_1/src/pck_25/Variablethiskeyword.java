package pck_25;

public class Variablethiskeyword 
{
	// direct method using two variable
	int b;
	public void m2(int abc)
	{
		b=abc;
	}
	// without using 'this' keyword
	int c;
	public void m3(int c)
	{
		c=c;
	}
	// with using this keyword
	int a;							///	global variable
	public void m1(int a)			///	local variable
	{
		this.a=a;					// always pont local to global variable
	}
	public static void main(String[] args) 
	{
		Variablethiskeyword obj=new Variablethiskeyword();
		obj.m2(12233);
		System.out.println("Without using 'This' keyword: "+obj.b);
		obj.m3(123344);
		System.out.println("Using 'This' keyword: "+obj.c);
		obj.m1(122);				// object called in m1 method with 122
		System.out.println("Local to global variable in same variable is: "+obj.a);
	}
}
