package pck_2_7;

public class child_dynamic extends parent_dynamic
{
	public void method2(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("result is: "+c);
	}
	public void method3()
	{
		System.out.println("child method");
	}
	public static void main(String[] args) 
	{
		child_dynamic ob=new child_dynamic();
		ob.method2(12, 12);
		ob.method3();
		parent_dynamic ob1=new parent_dynamic();
		ob1.method2(11, 12);
		ob1.method1();
	}
}
