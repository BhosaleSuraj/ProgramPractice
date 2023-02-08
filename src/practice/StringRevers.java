package practice;

import java.util.Scanner;

public class StringRevers {
	public static void main(String args[])
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String a=sc.next();
		String rev="";
		String p=a;
		int b=a.length();
		for(int i=b-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
			
		}
		//System.out.println(rev);
		if(p.equals(rev))
		{
			System.out.println(p+":this is number is palindrom string");
		}
		else
		{
			System.out.println(p+"this is not palindrom number");
		}
		
		StringBuffer sb=new StringBuffer("aman");
		 sb.reverse();
		 System.out.println(sb);
	}
	

}
