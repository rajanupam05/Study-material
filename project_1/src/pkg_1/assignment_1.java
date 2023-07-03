package pkg_1;

public class assignment_1														//class			//piller1 
{
	int roll_no;
	int	age;
	public void display1()													//user-defined_method		//piller2
	{
		System.out.println("welcome to my world");
	}
	public void display2()													//user-defined_method		//piller2
	{
		System.out.println("automation is very easy");
	}
	public static void main(String[] args)									//pre-defined_method		//piller2
	{
		assignment_1 xyz=new assignment_1();											//object creation			//piller3
		xyz.display1();														//call variable				//piller4
		xyz.display2();														//call variable 			//piller4
		xyz.roll_no=123;
		xyz.age=22;
		System.out.println(xyz.roll_no);									//call variable				//piller4	
		System.out.println(xyz.age);
	}

}