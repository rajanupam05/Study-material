package pck_1_7;

public class inhconstchild extends inhconstparent
{
	public inhconstchild()
	{
		System.out.println("child default paramterized constructor");
	}
	public inhconstchild(int a )
	{
		System.out.println("child one paramterized constructor");
	}
	public inhconstchild(int a, int b)
	{
		System.out.println("child two paramterized constructor");
	}
	public static void main(String[] args) 
	{
		inhconstchild ob=new inhconstchild(122,123);
		
	}
}
