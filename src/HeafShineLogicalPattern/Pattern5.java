package HeafShineLogicalPattern;

public class Pattern5 {
	
	public static void main(String[] args)
	{
		int a=9;
		int b=5;
		
		for(int i=0; i<=a;i++)
		{
			for(int j=0;j<=b;j++)
			{
				if(j-i<=0  && j+i<=8)
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


/*              *     
				**    
				***   
				****  
				***** 
				****  
				***   
				**    
				*     
				*     */