package pck_1_7;

public class selenium extends Automation
{
	/// single level inheritance
	
	public void method2()
	{
		System.out.println("child method");
	}
	public static void main(String[] args) 
	{
		selenium ob1=new selenium();
		ob1.method1();
		ob1.method2();
	}
}
