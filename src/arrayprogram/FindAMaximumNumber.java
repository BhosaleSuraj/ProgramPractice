package arrayprogram;
//find given array in maximum array
public class FindAMaximumNumber {
	public static void main(String[] args)
	{
		int a[] = {90,40,50,60,20};
		
		int max=a[0];
		//int maxs=a[0];
		
		for(int i=1;i<a.length;i++)
		{   
			if(a[i]>max )
			{
				max=a[i];
				
				
			}
			
			System.out.print(max);
		}
		System.out.println(max);
	/*	for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}*/
		
		
		
		
		//System.out.println(max);
		
		
		
		
		
		
		// compare  array in find minimum number
		
		/*int d[]= {10,20,100,150};
		int min=d[0];
		for(int i=1;i<d.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		*/
	}

}
