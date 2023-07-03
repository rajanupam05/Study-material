package pck_25;

public class finalkeyword 
{
	final int a=122;		// constant fixed here using 'final' keyword
 	
	public void m1(int b)		///swapping parameter to global variable
	{
		b=a;
	}
	public static void main(String[] args) {
		finalkeyword obj=new finalkeyword();
		obj.m1(1234);
		System.out.println(obj.a);
	}
}
