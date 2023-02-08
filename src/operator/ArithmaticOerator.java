package operator;

import java.util.Scanner;

public class ArithmaticOerator {

	public static void main(String [] args)
	{    int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a two numbre:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("user choice number");
		int ch=sc.nextInt();
		 
		  
			
		switch(ch)
		{
	
		
		case 1:c=a+b;
		 System.out.println("addition of two number"+c);
		 break;
		 
		case 2:c=a-b;
		 System.out.println("substraction of two number"+c);
		 break; 
		
		
		case 3:c=a*b;
		 System.out.println("multiplication of two number"+c);
		 break;
		 
		 
		case 4:c=a/b;
		 System.out.println("devision of two number"+c);
		 break;
		 
		 
		case 5:c=a%b;
		 System.out.println(" module of two number"+c);
		 break; 
		 
		 
		 default:
			 System.out.println("not a choice number");
		}
		
		}
		
		
		
	}
