package pck_2_7;

public class static_polymorp

////polymorphism = when one thing is used for many purpose.

///further it is divided in two method:
//// 1. static polymorphism/ compile time method/ overloading method
//// 2. dynamic polymorphism/ run time method/ overriding method


{
	public void method1(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("test first result: "+c);
	}
	public int method1(int a, float b, int d)
	{
		int c;
		c=(int)(a+b+d);
		System.out.println("test second result: "+c);
		return c;
	}
	public static void main(String[] args) {
		static_polymorp ob1=new static_polymorp();
		ob1.method1(11, 12, 13);
		ob1.method1(12, 13);
	}

}
