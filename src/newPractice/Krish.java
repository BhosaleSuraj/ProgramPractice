package newPractice;

public class Krish {
	
	public static void main(String[] args) {
		
		
		int a=145;
		int rev=0;
		int facto=1;
		
//		while(a>0)
//		{
//			rev =a%10;
//			a=a/10;
//			
//		}
//		
		int add=0;	
		int c=a;
			while(c>0)
			{
				rev =a%10;
				
				
			for(int i=1;i<=rev;i++)
			{
				facto=facto*i;
			}
			
			
			
			
			c=c/10;
			
			}
			add=add+facto;
			System.out.println(add);
		}
		
		
	

}
