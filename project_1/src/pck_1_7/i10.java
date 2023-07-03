package pck_1_7;

public class i10 extends hyundai
{
	public i10()
	{
		super(120);
		System.out.println("i20 default parameterized constructor");
	}
	public i10(int a)
	{
		System.out.println("i20 one parameterized constructor");
	}
	public i10(int a, int b)
	{
		System.out.println("i20 two parameterized constructor");
	}
	public static void main(String[] args) 
	{
		i10 ob=new i10();
	}
}
