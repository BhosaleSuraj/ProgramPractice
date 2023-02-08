package NewSe;

public class ArmstrongNumberProgram {

	public static void main(String[] args)
	{
		
		int n=153;
		
		int temp=n;
		
		int result=0;
		
		int c=0;
		
		for(int i=0;i<=n;i++)
		{
			int amr=n%10;
			
			result=result+(amr*amr*amr);
			n=n/10;
			
			
		}
		System.out.println(c);
		if(temp==result)
		{
			System.out.println("this is a armstrong");
		}
		else
		{
			System.out.println("not a armstrong");
		}
		
		System.out.println(result);
	}
}
