package string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class assignments 
{
	public void assignment1()
	{
		String s="abcdcba", rev="";
		int L=s.length();
		for(int i=L-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.print(rev);
		System.out.println();
		if(rev.equals(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	public void assignment2()
	{
		String s="my name is anupam";
		String[] s1=s.split(" ");
		int l=s1.length;
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
	}
	public void assignment3()
	{
		String s="my name is anupam";
		String[] s1=s.split("");
		int l=s1.length;
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(s1[i]);
		}
	}
	public void assignment4()
	{
		String s="my name is anupam", result="";
		String[] s1=s.split(" ");
		int l=s1.length;
		for(int i=0;i<l;i++)
		{
			int k=s1[i].length();				/// here s[i] let  suppose s[1]=my & s[1].length will produce in k=2 now the function of loop start here
			for(int j=k-1 ;j>=0;j--)			/// here  we r getting the length of particular string as we splitted earlier 
															/// and applying loop in that particular word
			{
				 System.out.print(s1[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
	public void assignment5()
	{
		String s="my name is anupam"; 
		char searchchar='e';
		int count=0;
		String[] s1=s.split("");
		int l=s1.length;
		for(int i=0;i<l;i++)
		{
			int L=s1[i].length();
			for(int j=L-1;j>=0;j--)
			{
				if(s1[i].charAt(j)==searchchar)
				{
					count++;
				}	
			}
		}
		System.out.print("Occurence of 'e' is: "+count);
	}
	public void assignment6()
	{
		String old="mynameisanupam";
		System.out.println("old string: "+old);
		String r=old.replace("mynameisanupam", "my$name$is$anupam");
		System.out.println("new string: "+r);
	}
	public void assignment7()
	{
		String s="1010101010";
		char[] ch=s.toCharArray();
		String a="", b="";
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]=='1')
			{
				a=a+ch[i];
			}
			else
			{
				b=b+ch[i];
			}
		}
		System.out.println(a+b);
	}
	public void assignment8()
	{
		String s="my name is anupam my name", search="my";
		String[] s1=s.split(" ");
		int c=0;
		int l=s1.length;
		for(int i=0;i<l;i++)
		{
			if(s1[i].equals(search))
			{
				c++;
			}
		}
		System.out.println("occurence of 'my' word: "+c);
	}
	public void assignment9() throws IOException
	{
		int line=0, wc=0, ch=0;
		BufferedReader br=new BufferedReader(new FileReader(new File("../project_1/testing1.txt")));
		String L;
		while((L=br.readLine()) != null)																			///mandatory to write method object  with method in loop
		{
			line++;
			String[] word=L.split(" ");
			wc=wc+word.length;
			for(int i=0;i<word.length;i++)
			{
				ch=ch+word[i].length();
			}
		}
		//////br.close();
		System.out.println("Line is: "+line);
		System.out.println("words are:"+wc);
		System.out.println("characcters are: "+ch);
		
	}
	public static void main(String[] args) throws IOException {
		assignments ass=new assignments();
		ass.assignment9();
	}
}
