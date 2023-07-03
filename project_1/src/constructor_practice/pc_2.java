package constructor_practice;

public class pc_2
{
	////area and circumference of circle using constructor and method
	float r;
	float p=(float)(3.14);
	public pc_2() 
	{
		r=12;	// TODO Auto-generated constructor stub
		
	}
	public pc_2(int x1)
	{
		r=x1;
	}
	
	public float area()
	{
		return p*r*r;
	}
	public float circumference()
	{
	////	float p,r;
		return 2*p*r;
	}
	public static void main(String[] args) 
	{
		pc_2 a=new pc_2();
		System.out.println("consructor without parameter");
		System.out.println("area is:"+a.area());
		System.out.println("circcumference is: "+a.circumference());
		pc_2 b=new pc_2(10);
		System.out.println("constructor with parameter");
		System.out.println("new area is: "+b.area());
		System.out.println("new circumference is: "+b.circumference());
	}
}
