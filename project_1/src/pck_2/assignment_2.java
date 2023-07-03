package pck_2;

public class assignment_2 
{	
	///// 	assgnment 2	===(((((10*2)-2)+2)-2)/2)===
	
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
		assignment_2 ref=new assignment_2();
		int result1=ref.product(10, 2);
		int result2=ref.subtract(result1, 2);
		int result3=ref.add(result2, 2);
		int result4=ref.subtract(result3, 2);
		int seg=ref.divide(result4, 2);
		System.out.println("final reuslt:"+seg);
	}
}



