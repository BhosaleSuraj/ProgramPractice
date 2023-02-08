package flowcontrol;

import java.util.Scanner;

public class While {
	public static void main(String args[])
	
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a any number");
		
		int n=sc.nextInt();
		int i=1;
		while(i<=n) 
		{    
		
			 System.out.println(i);
			 i++;
			
			
			if(n%2==0)
			{
				System.out.println("this number is even");
				
			}
			else
			{
				System.out.println("this number is odd");
				
			} 
			
		} 
		
	}

}
