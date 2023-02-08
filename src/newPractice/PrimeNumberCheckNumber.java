package newPractice;

public class PrimeNumberCheckNumber {
	public static void main(String[] args) {
		int a=3;
		
		int count=0;
		if(a>=1)
		{
			for(int i=1;i<=a;i++)
			{
				if(a%i==0) {
					count++;
				}
				
			}
			
			if(count==2)
			{
				System.out.println("This number is  a prime");
			}
			
			else
			{
				System.out.println("this is a not a prime number");
			}
		}
		else
		{
			System.out.println("this is not a prime number");
		}
		
		
	}

}
