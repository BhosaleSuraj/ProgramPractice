package newPractice;

public class FibonacciSeriesPrintUsingRecursion {
	static int a=0;
	static int b=1;
	static int c;
	
	public void fibona(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			fibona(i-1);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(a+"\n"+b);
		
		FibonacciSeriesPrintUsingRecursion fb=new FibonacciSeriesPrintUsingRecursion();
		fb.fibona(10);
		
	}

}
