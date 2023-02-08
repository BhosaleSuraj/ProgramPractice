package newPractice;

public class ReversNumberProgram {

	
	public int revers(int a)
	{
		
		int b=a;
		
		int temp=0;
		for(int i=0;i<=b;i++)
		{
			temp=temp*10+b%10;
			
			b=b/10;
		}
		return temp;
	}
	
	public static void main(String[] args)
	{
		ReversNumberProgram rs=new ReversNumberProgram();
		
		int rm=rs.revers(976789);
		System.out.println(rm);
		
		char m=(char) rm;
		System.out.println(m);
	}
}
