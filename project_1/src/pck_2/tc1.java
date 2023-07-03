package pck_2;

public class tc1 
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum of value is: " +c);
		return c;
	}
	public int subtract(int e, int f)
	{
		int d;
		d=e-f;
		System.out.println("subtract of value is: " +d);
		return d;
	}
	public int multiply(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("multiplication of value is: " +z);
		return z;
	}
	public static void main(String[] args) 
	{
		tc1 abc=new tc1();
		int sumresult=abc.sum(10, 2);
		int subresult=abc.subtract(10, 2);
		abc.multiply(sumresult,subresult);
	}
}