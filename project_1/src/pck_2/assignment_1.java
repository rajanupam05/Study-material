package pck_2;

public class assignment_1 
{	
	///// 	assgnment 1	===(((((10+2)+2)-2)*2)/2)===
	
	public int add(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int subtract(int d, int e)
	{
		int f;
		f=d-e;
		return f;
	}
	public int product(int g, int h)
	{
		int i;
		i=g*h;
		return i;
	}
	public int divide(int j, int k)
	{
		int l;
		l=j/k;
		return l;
	}
	public static void main(String[] args) 
	{
		assignment_1 ref=new assignment_1();
		int result1=ref.add(10, 2);
		int result2=ref.add(result1, 2);
		int result3=ref.subtract(result2, 2);
		int result4=ref.product(result3, 2);
		int seg=ref.divide(result4, 2);
		System.out.println("final reuslt:"+seg);
	}
}