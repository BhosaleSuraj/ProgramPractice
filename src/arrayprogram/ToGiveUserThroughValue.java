package arrayprogram;

import java.util.Scanner;

public class ToGiveUserThroughValue {
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string length:");
		
		int a=sc.nextInt();
		
		String name[]= new String[a];
		System.out.println("enter a number");
		for(int i=0;i<=a;i++)
		{
			
		  name[i]=sc.next();
		}
	}

}
