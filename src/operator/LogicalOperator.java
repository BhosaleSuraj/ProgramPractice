package operator;

public class LogicalOperator {
	public static void main(String [] args)
	{
	   int a=30;
	   int b=30;
	   if(a==b && a!=b)  //this two condition will be true willbe  statement execuet other wise condition forword else block 
	   {
		   System.out.println("the two condition will be true");
	   }
		   else if (a == b || a != b)    // the operator will be execute  only one condition will be true the statement will be execute
		   {
		
		   System.out.println("The both condition will be false");
		   }
	   
		   else
		   {
			   System.out.println("the condition will be failed");
		   }
	}

}
