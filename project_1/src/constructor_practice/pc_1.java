package constructor_practice;

public class pc_1 
			//// volume with the help of constructor and method **volume=p*r*h**
{
	float r,h,v;
	float p=(float)3.14;
	public pc_1() 
	{
		r=10;
		h=10;
		
		// TODO Auto-generated constructor stub
	}
	public pc_1(float x1, float x2)
	{
		System.out.println("consructor with parameter");
		r=x1;
		h=x2;
	}
	public float volume()
	{
		v=p*r*h;
		return v;
	}
	public static void main(String[] args) 
	{
		System.out.println("constructor without parameter");
		pc_1 abc=new pc_1();
		System.out.println("volume is :"+abc.volume());
		pc_1 ab=new pc_1(11, 11);
		float vresult=ab.volume();
		System.out.println("new volume is: "+vresult);
	}
	
}
