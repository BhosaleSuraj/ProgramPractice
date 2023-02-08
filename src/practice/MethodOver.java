package practice;

//program fo method overrriding
class Temp
{
	public void df()
	{
		System.out.println("this is the parent class");
	}
}
class Temp1 extends Temp
{    
	 
	public void df()
	{    
		super.df();
		System.out.println("this is the cheild class method");
	}
	
	
	
}

public class MethodOver {
  public static void main (String [] args)
	{
	  Temp1 se =new Temp1();
	  se.df();
	  se.df();
	  
	}
	
	

}
