package angularmind;

public class SquarePattern {
	public static void main(String[] args) 
	{
		int b=1;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{   
				if(i==3 & j==2 || i==4 & j==2||  i==4&j==3) 
				{
				System.out.print(b++);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
/**    output of the 
*            *
*            **
*            *1*
*            *23*
*            *****
 * 
 * */

