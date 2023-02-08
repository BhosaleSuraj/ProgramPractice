
/*    1. method is the group of statement that  perform  some specific task and return the result
 *     
 *     2. the method is the can not use the static keyword   to  create the  class object 
 *     3. and will be use the static keyword to only the call method will be automTICALLY ACCESS 
  */


package practice;
 

public class Method   {        
	//can not return value  
	 void add()                  //method defination part
	{   

		//the can not use static keyword to or reference
		 // to create class object will be not creat class object  it will be time compile time error
		
		System.out.println("simple method define");
		
		
	}
	 
	  int sum(int a ,int b  )   //input
	 {
		return a+b;             //output
		 
	 }
	  
	  
	  static double sum(double p  , float q ) 
	  {
		  return p * q;
	  }
	  
	  
	  static void set() {
		  System.out.println("leRN COading");
	  }
	
	
	public static void main(String [] args)
	{   
		Method m=new Method();
		m.add();         //method calling
		
		int r=m.sum(10, 20);
		System.out.println("addtion of number"+r);
		int n=m.sum(40, 20);
		System.out.println("addtion of number"+n);
		double s= sum (40.0, 20);
		System.out.println("addtion of number"+s);
		set();
		
	} 
	
}
	/*public static void main(String[] args)
	{
		Method m=new Method();
	    m.add(10);
		m.add2("ram");
		
		System.out.println();
				
		 
	}
	
	
	public void add(int a ) 
	{
		System.out.println(); 
		
	}
	
	public void add2(String s)
	{
		System.out.println();
	}

} */ 


