package arrayprogram;

public class Incressing_Pattern {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1,p=0;i<=n;i++,p+=4)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
	}

}
