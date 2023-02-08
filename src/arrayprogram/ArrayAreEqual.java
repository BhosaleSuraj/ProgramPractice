package arrayprogram;

import java.util.Arrays;

public class ArrayAreEqual {
	public static void main(String []args)
	{
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
		boolean c=Arrays.equals(a,b);
		
		if(c==true)
		{
			System.out.println("this aray is equal");
		
		}
		else
		{
			System.out.println("this array are not equal");
		}
		
	}

}
