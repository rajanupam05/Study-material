package string;

public class striing 
{
	public void method1()
	{
		String s="abcdcba", rev="";
		int L=s.length();
		for(int i=L-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	public void method2()
	{
		String s="my name is anupam";
		String[] s1=s.split(" ");
		int l=s1.length;
		for(int i=0;i<l;i++)
		{
			System.out.println(s1[i]);
		}
	}
	public static void main(String[] args) {
		 striing st=new striing();
		 st.method2();
	}
}
