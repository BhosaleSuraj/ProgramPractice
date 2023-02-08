package newPractice;

public class AdditionOftheGivenNumbe 
{
	public static void main(String[] args)
	{
		int a=234432567;
		
		int b;
		int c=0;
		for(int i=0;i<=a;i++)
		{
			b=a%10;
			c=c+b;
			a=a/10;
			
		}
		System.out.println(c);
	}

}
