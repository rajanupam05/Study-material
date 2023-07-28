package pck_16_7;

import java.util.Scanner;

public class practice_1 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a maximum number: ");
		Scanner s=new Scanner(System.in);
		int max=s.nextInt();
		if(max>0)
		{
			for(int i=1;i<=max;i++)
			{
				System.out.print(i+" ");
			}
		}
	}
}
