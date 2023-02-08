package newPractice;

public class PeterssonNumber {
	public static void main(String[] args)
	{
		
		int a=145;
		int rem=0;
		
		int temp=0;
		while(a>0)
		{
			int mul=1;
			rem=a%10;
			for(int i=rem;i>0;i--)
			{
				mul=mul*i;
				
			}
			
			temp=temp+mul;
			a=a/10;
			
		}
		System.out.println(temp);
		/*
		 * for(int i=0;i<=a;i++) { rem=a%10;
		 * 
		 * a= a/10; }
		 * 
		 * System.out.println(rem);
		 */
	}

}
