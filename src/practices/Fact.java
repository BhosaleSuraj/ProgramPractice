package practices;

import java.util.Scanner;

public class Fact {
    static int num;
    static int n;
    
	  int fact(int add)
	{    
		num=add;
		 n=1;
		for(int i=1; i<=num;i++)
		
	    {
		n = n*i;
		}
		
		System.out.println(n);
		
		return n;
		}
	 
	 
	 
		
	
       
	
	public static void main(String[] args) 
	  {
		
		Fact f=new Fact();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("the enter a number");
		int a=sc.nextInt();
		System.out.println("the factorial :");
		f.fact(a);
		
       sc.close();
	}

}
