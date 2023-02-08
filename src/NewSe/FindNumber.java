package NewSe;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		if(n<9)
		{
			System.out.println("true");
		}
		else if(n<99)
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("by by");
		}
	}

}
