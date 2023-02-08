package practice;

import java.util.Scanner;

public class ReversThreeType {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		String num=sc.next();
		int rev=0;
		
		
		/*while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("the revers number"+rev);
		*/
		
		/*StringBuffer bf=new StringBuffer(String.valueOf(num));
		StringBuffer revs = bf.reverse();
		System.out.println("the revers number"+revs);*/
		
		
		StringBuilder bf=new StringBuilder();
		bf.append(num);
		StringBuilder reves=bf.reverse();
		System.out.println("the revers number"+reves);
		
		
		//Reverse a number in the following form this is palindrome or not
		
		//Scanner mb=new Scanner(System.in);
		System.out.println("enter any number");
		int p=sc.nextInt();
		int pp=p;
		int re=0;
		while(p!=0)
		{
			re=re*10+p%10;
			p=p/10;
		}
		if(pp==re)
		{
		System.out.println(pp+"the palindrom");
		}
		else
		{
			System.out.println(pp+"the not pallindrom");
		}
		
	    
		
		
	}

	

}
