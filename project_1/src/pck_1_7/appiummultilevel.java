package pck_1_7;

public class appiummultilevel extends seleniummultilevel
{
	public void method3()
	{
		System.out.println("child method");
	}
	public static void main(String[] args) 
	{
		appiummultilevel ob=new appiummultilevel();
		ob.method1();
		ob.method2();
		ob.method3();
	}
}
