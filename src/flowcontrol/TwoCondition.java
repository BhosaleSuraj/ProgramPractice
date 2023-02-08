// using a program two conditonal statement 
package flowcontrol;

import java.util.Scanner;

public class TwoCondition {

	public static void main(String[] args) 
		{
		     Scanner obj=new Scanner(System.in);
		      System.out.println("entre a number");
		      int pwd=obj.nextInt();
		      
		      /*if(pwd==231)
		      {
		    	  System.out.println("print a njumber useer through value");
		    	  System.out.print("print a number a single condition");
		      }
		 else
	      {
	    	  System.out.println("out of loop the condition");
	      }*/
		// TODO Auto-generated method stub
		      
		      if(pwd>=18)
		      {
		    	  System.out.println("the eligible the candidate to vote");
		      }
		      else
		      {
		    	  System.out.println("the candidate cannot eligible to vote");
		  
		      }
     obj.close();
	}

}
