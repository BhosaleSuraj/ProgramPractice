package practices;
import java.util.*;

public class Student {
	
	
	
	
	
	public int   adding()               //initilization the object through value	
	{
		
		Scanner sc=new Scanner(System.in);
	    
		System.out.println("enter a new number");
		int number=sc.nextInt();
		 
		System.out.println("enter a new string");
       int name=sc.nextInt();
       int c=number+name;
       System.out.println("addition of two number"+ c);
       return 1;
		
	}
	public void disp(String arg)
	{   
	String a =arg;
	System.out.println(a);		// pass argumet through pass String 
	}
	
	
	
	public static void main(String [] args)
	{
		Student s= new Student();
		s.adding();
		s.disp("ankush");
		
		
	} 
	

}














































/*
 * public class Student {
 * 
 * 
 * 
 * 
 * 
 * public void adding() //initilization the object through value {
 * 
 * Scanner sc=new Scanner(System.in);
 * 
 * System.out.println("enter a new number"); int number=sc.nextInt();
 * 
 * System.out.println("enter a new string"); int name=sc.nextInt();
 * 
 * int c= number+name;
 * 
 * System.out.println("Print the out put screen "+c); return; }
 * 
 * 
 * public static void main(String [] args) { Student s= new Student();
 * 
 * s.adding();
 * 
 * }
 * 
 * 
 * }
 */