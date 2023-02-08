package practice;

public class SuperCon {
	
	int a=20;
	void add()
	{
		System.out.println("using the supper in parent method");
	}
	
    }
	class B extends SuperCon
	{   int a=10;
		void show()
		{
		
		System.out.println(a);
		System.out.println(super.a);           //to use super keyword to direct access parenr instance variable
		}
		 void mod()
		 {    
			  super.add();
			  System.out.println("to reffer the parent method using supeer keyword");
		 }
	
	}
	class Rmm{
		public static void main (String [] args)
		{
		 B n=new B();
		 n.show();
		 
		 n.mod();
		 
		}
	}
   
		
  


