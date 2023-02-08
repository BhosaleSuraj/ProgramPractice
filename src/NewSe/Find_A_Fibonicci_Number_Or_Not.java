package NewSe;

import java.util.Scanner;

public class Find_A_Fibonicci_Number_Or_Not {
	
	public static void main(String[] args) {
		
		System.out.println("enter a number");
		
		Scanner sc=new Scanner(System.in);
		
		int d=sc.nextInt();
		
		int a=0;int b=1;int c=0;
		
		for(int i=0;i<=d;i++)
		{
			c=a+b;
			
			a=b;
			b=c;
			
			//System.out.println(c);
			if(c==d)
			{
				System.out.println("this number is fibonicci");
			}
			else
			{
				System.out.println("this is not fiboniccci");
			}
			
		}
		
		//System.out.println(c);
		
		
		
//		while(c<d)
//		{
//			c=a+b;
//			
//			a=b;
//			b=c;
//		}
//		
//		if(c==d)
//		{
//				System.out.println("this number is fibonicci");
//			}
//			else
//			{
//				System.out.println("this is not fiboniccci");
//			}
//		
	}

}
