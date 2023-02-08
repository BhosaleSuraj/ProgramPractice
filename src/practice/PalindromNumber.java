package practice;
import java.util.*;


public class PalindromNumber {
	public static void main(String args[])
	{   
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");  //pallindrom number means this number will be revers will be same
		String a=sc.nextLine();
		//String a="425";
		String num="";
		int nam=a.length();
		for(int i=nam-1;i>=0;i--)
		{
			num=num+a.charAt(i);
			
		}
		System.out.println(num);
		if(a.equals(num))
		{
			System.out.println("this number is paliendrom");
		}
		else
		{
			System.out.println("this number is not paliendrom");
		}
		sc.close();
	
	}
}
