package HeafShineLogicalPattern;

public class Pattern6 {
	public static void main(String [] args)
	{
		int a=9;
		int b=5;
		for(int i=0;i<=a;i++)
		{
			
		    for(int j=0;j<=b;j++)
		    {
		    	if(j+i<=4  || j-i<=-4)
		    	{
		    		System.out.print("*");
		    		
		    	}
		    	else
		    	{
		    		System.out.print(" ");
		    	}
		    }
		    System.out.println();
		}
	}

}


/*			***** 
			****  
			***   
			**    
			*     
			**    
			***   
			****  
			***** 
			******      
			
			
*/
