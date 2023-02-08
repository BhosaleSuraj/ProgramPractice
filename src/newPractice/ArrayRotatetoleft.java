package newPractice;

public class ArrayRotatetoleft {
	public static void main(String[] args)
	{
		
		int a[]= {3,4,5,6,37,2,57,8,89};
		
		mycode(a);
		
	}
	
	private static void mycode(int a[])
	{
		
		int temp=a[0];
		
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		for(int i:a)
		{
			System.out.print(i+",");
		}
	}

}
