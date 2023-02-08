//as number divide by one and this number

package practice;
import java.util.*;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			
			int a=sc.nextInt();
            
            int count=0;
            if(a>1)
            {
              for(int i=1;i<=a;i++) 
             {
			    if(a%i == 0)
			     count++;
             }
			     if(count==2)
			    {
				  System.out.println( " : a prime number");
			    }
			     else
			         {
				      System.out.println(" : not a prime number");
			         }
            }
            
			else
			{
				System.out.println("  : this number is not prime");
			}
		}
	

}
}