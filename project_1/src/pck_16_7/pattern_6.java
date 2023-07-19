package pck_16_7;

//						i(row)		s(space)		j(*)
//    *					1			4				1
//   ***				2			3				3
//  *****				3			2				5
// *******				4			1				7
//*********				5			0				9

//	relationship between variables			i+s=5 ---> s=5-i		
//											2*i-1=j
public class pattern_6 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	} 
	
}
