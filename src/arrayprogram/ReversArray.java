package arrayprogram;

public class ReversArray {
	
	public static void main(String[] args)
	{
	
	int []a= {1,2,3,4,5,6,7,8,9};
	
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
	
	
	int b[]= {12,34,45,67,89,90,98};
	int max=b[0];
	
	for(int i=0;i<=b.length-1;i++)
	{    
		if(b[i]>=max)
		{
		  max=b[i];
		}
	}
	  System.out.println(max);
	}

}
