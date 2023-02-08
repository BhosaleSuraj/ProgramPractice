package practice;

public class PassingArray {
	
	public static void add(int a[])
	{   
		for(int i=0;i<a.length;i++)
		{
		 System.out.println	( a[i]);
		}
		 
	}
	
	
	public static void main(String []args)
	{
		int b[]= {1,2,3,4,5};
		add(b);
		int[]  number=arrayreturn(b);
		System.out.println("reverce array");
		add(number);
		
	}
	
	
	public static int[] arrayreturn(int[] a)
	{
		int []revers=new int[a.length];
		for(int i=0 , j= revers.length-1;i<a.length;i++,j--)
		{    
			 revers[j]= a[i];
			 
		}return revers;
		
	}

}
