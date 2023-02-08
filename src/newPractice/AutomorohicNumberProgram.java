package newPractice;

public class AutomorohicNumberProgram {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		int a=76;
		int b=a*a;
		int temp=0;
		int c=0;
		
		for(int i=0;i<=b;i++)
		{
			temp=b%10;
			c++;
			
			b=b/10;
		}
		
		System.out.println(temp);
		
	}

}
