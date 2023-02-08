package practice;

import java.util.*;

public class PrimeNumberUsingMethod {
	static void Checkprime(int a) {
		
		
	 int temp=0;
	for(int i=1;i<=a-1;i++) {
		if(a %2 == 0)
		{
		  temp=temp+1;	
		}
	}
		if(temp>0)
		{
			System.out.println(a+ " : not aprime number");
		}
		else
		{
			System.out.println(a+"  : this number is prime");
		}
	

}
	 public static void main(String [] args)
	 {
		 Checkprime(1);
		 Checkprime(2);
		 Checkprime(3);
		 Checkprime(4);
	 }
}