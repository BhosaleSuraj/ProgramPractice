package NewSe;

@FunctionalInterface 
interface A
{
	public void show();
	
	 
	
}

public class LambdaExpressionExample 

{
  public static void main(String [] args)
  {
	 
	  
	A obj = ()->
	{
		System.out.println(" hello");
	};

	
			
 obj.show();

}
}
