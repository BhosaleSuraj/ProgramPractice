package practice;

import java.util.Scanner;

public class NumberCount {
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a any");
		int a=sc.nextInt();
		int rev=0;
		while(a!=0)
		{  
			rev=rev*10+a%10;   //0*10+3=3   30+2=32  320+1=321
			a=a/10;            //123/10=12  12/10=1 1/1=0
			
		}
		System.out.println(rev); 
		
		
		
		System.out.println("enter a any");
		int num=sc.nextInt();
		int odd=0;
		int even=0;
		while(num>0)
		{
			int rem=num%10;
			
			// 1234567/10=123456   
			if(num%2==0)          //  134==0 
			{
				even++;
				
			}
			else
			{
				odd++;
				
			}
			num=num/10;
			System.out.println("the count the odd number"+even);
			System.out.println("the number is the even"+odd);
		}
		
		
	}

}
