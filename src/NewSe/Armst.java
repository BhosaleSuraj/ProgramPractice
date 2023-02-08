package NewSe;

public class Armst {
	public static void main(String[] args) {
		
		
		int a=53;
		int b=a;
		int count=0;
		
		while(a>0)
		{
			a=a/10;
			count++;
		}
		//System.out.println(count);
		System.out.println(b);
		int add=0;
		int num=0;
		
		for(int i=0;i<b;i++)
		{
			
			//System.out.println(count);
			num=b%10;
			System.out.println(num);
			
			add=add+num*count;
			
			b=b/10;
			
			
		}
		
		System.out.println(add);
	}

}
