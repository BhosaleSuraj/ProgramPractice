package practice;

public class FibonacciSeries {
	public static void main(String[] args)
	{
		int a=0,b=1,c,n=10;
		System.out.println(a+ "\n"+ b);
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			
			a=b;
			b=c;
			System.out.println("" + c);
			
			
		}
		
	}

}
