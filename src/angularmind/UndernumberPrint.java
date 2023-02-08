/*/*      output of the following program
 ******
 *123*
 *456*
 *789*
 *****
 */

package angularmind;

public class UndernumberPrint {
	public static void main(String[] args)
	{  
		int a=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{   
				if(i==0 || j==0 || j==4 || i==4)        
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(a++);
				}
			}
			System.out.println();
		}
	}


/*          *****
            *123*
            *456*
            *789*
            *****
 */
 }