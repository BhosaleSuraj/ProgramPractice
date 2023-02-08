package flowcontrol;

import java.util.*;

public class MultipleCondion {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int m=sc.nextInt();
		
		
		
		if(m>=45 && m<=100) 
		{
			System.out.println("condition first is true");
			
		}
		else if(m>=45 && m<=60)
		{
			System.out.println("execute a second condition is true");
		}
		else if(m>=33 && m<=45)
		{
			System.out.println("above two condition will be ");
		}
		
		else
		{
			System.out.println("failed");
		} 
		
		sc.close();
		
	}

}
