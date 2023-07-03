package pck_1_7;

public class assignment2_2 extends assignment2_1
	//parent three parameterized method
	//parent default parameterized method
	//parent one parameterized method
	//parent two parameterized method
	//child two parameterized method
	//child default parameterized method
	//child three parameterized method
	//child one parameterized method
{
	public void method1()
	{
		System.out.println("child default parameterized method");
	}
	public void method2(int a)
	{
		System.out.println("child one parameterized method");
	}
	public void method3(int a, int b)
	{
		super.m4(11,12,13);
		super.m1();
		super.m2(11);
		super.m3(12, 13);
		System.out.println("child two parameterized method");
		this.method1();
		this.method4(11,12,13);
		this.method2(11);
	}
	public void method4(int a, int b, int c)
	{
		System.out.println("child three parameterized method");
	}
	public static void main(String[] args) 
	{
		assignment2_2 ob=new assignment2_2();
		ob.method3(11,12);
		
	}
}
