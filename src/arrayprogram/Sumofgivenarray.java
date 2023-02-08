package arrayprogram;

import java.util.Arrays;

public class Sumofgivenarray {
	public static void main(String []args)
	{
		int arr[]= {5,10,20,45,1,6};
		 int add=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			add=add+arr[i];
			
		}
		System.out.println(add);
		
		
		int a[]= {1,2,3,4,5};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even number"+a[i]);
			}
			else
			{
				System.out.println("odd number"+a[i]);
			}
		}
	}

}

