package NewSe;
import java.util.*;

public class ToCheckUpperToLower {
	// Java program to check whether a given character is upper case, lower case, number or special character 

	
	
		public static void main(String[] args)
		{
			char ch;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter any value");
			ch = sc.next().charAt(0);
			
			if(ch >= 65 && ch <= 90)
			{
				
				System.out.println("Upper");
			}
			else if(ch >= 97 && ch <= 122)
			{
				
				System.out.println("Lower");
			}
			else if(ch >= 48 && ch <= 57)
			{
				
				
				System.out.println("number");
			}
			else
			{


				System.out.println("symbol");
			}
		}
	}


