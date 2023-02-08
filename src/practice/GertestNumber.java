package practice;

import java.util.Scanner;

public class GertestNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number first:");
		int a=sc.nextInt();
		
		System.out.println("enter number first:");
		int b=sc.nextInt();
		
		System.out.println("enter number first:");
		int c=sc.nextInt();
		
		/*if(a>b && a>c)
		{
			System.out.println("a is gretest number"+a);
		}
		else if(b>a && b>c) 
		{
			System.out.println("b is geestest number:"+b);
		}
		else
		{
			System.out.println("c is greter numbe r:"+c);
		}*/
		
		int gretest = a>b?a:b;                      
		int greter2 = gretest>c?gretest:c;
		System.out.println("greter number is"+greter2);
		
	}

}
