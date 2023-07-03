package pck_1_7;

public class assignment1_2 extends assignment1_1 

///parent three parameterized constructor
///parent default constructor
///parent one parameterized constructor
///parent two parameterized constructor
///child default paramterized constructor
///child three  paramterized constructor
///child one paramterized constructor
///child two paramterized constructor

{
	public assignment1_2()
	{
		super(11,12);		/// called parent two parameterized constructor
		System.out.println("child default paramterized constructor");
	}
	public assignment1_2(int a)
	{
		this(14,15,16);
		System.out.println("child one paramterized constructor");
	}
	public assignment1_2(int a, int b)
	{
		this(13);
		System.out.println("child two paramterized constructor");
	}
	public assignment1_2(int a, int b, int c)
	{
		this();
		System.out.println("child three  paramterized constructor");
	}
	public static void main(String[] args) 
	{
		assignment1_2 ob=new assignment1_2(11,12);
	}
}
