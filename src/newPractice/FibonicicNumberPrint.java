package newPractice;

public class FibonicicNumberPrint {
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int c=0;
		/*
		 * System.out.println(a); System.out.println(b);
		 */
		for(int i=2;i<=10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println("fibonicic number print"+c);
		}
		
		System.out.println("totel fibonicic :"+c);
	}

}
