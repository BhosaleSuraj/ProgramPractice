package practice;

public class Swaping 
{
	  public static void main(String args[])
	 {
	  int a=10;
	  int b=20;
	  System.out.println("After swaping number:"+a+"&"+b);
	  
	  //using third variable 
	   
	 /*  int c=a;
	     a=b;
	     b=c;
	   System.out.println("before swaping number:"+a+"&"+b); */

	   //using two variable to swaping number

	  /*   a=a+b;
	     b=a-b;
	     a=a-b;
	    System.out.println("before swaping number:"+a+"&"+b); */

	 //another logic 
	  
	  a=a*b;
	  b=a/b;
	  a=a/b;
	  System.out.println("before swaping number:"+a+"&"+b);
	 
	  }
	}
