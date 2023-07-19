package pck_16_7;

//					i(row)	s(space)	*(j)
//    *				1		4			1
//   **				2		3			2
//  ***  			3		2			3
// ****				4		1			4
//*****				5		0			5

// relationship between variables	i+s=5-->s=5-i
//									i=j(*)

public class pattern_5 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
