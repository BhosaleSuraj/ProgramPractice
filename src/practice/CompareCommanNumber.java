package practice;

import java.util.Arrays;

public class CompareCommanNumber {
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7,2,2,2,3,5,5};
		int c[]= {0};
		int d[]= {0};
	    
		for(int i=0;i<a.length;i++)         //   1  2
		
		{
			for(int j=1+i;j<a.length;j++)
			{
				if( a[i]==a[j])
				{
					System.out.print(a[i]);
				}
				
				
				
				
			}
			
		}
	}

}
