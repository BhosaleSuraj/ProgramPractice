package newPractice;

public class KrishnmurtiNumber 
{

		
		
		
		
		//1+4*3*2*1+5*4*3*2*1
		
		//int b=0;
		
//		int sum=0;
//		while(a>0)
//		{
//			b=a%10;
//			fact(b);
//			//sum = sum +b;
//			a=a/10;
//		}
//		//System.out.println(sum);
//		
		
		

 
	public static int fact(int a) 
	{ 
		
		
		
		
		int factorial=1;
	
		
	  for(int i=1;i<=a;i++)
	  {
		  factorial=factorial*i; 
		 
		  
	 }
	  return factorial;
	
	} 
	public static void main(String[] args)
	{
		
	int a = 145;
	int tempNumber = a;
	  int sum=0;  
      
          
        
    
      while (tempNumber != 0) {   
        
          sum = sum + fact(tempNumber % 10);   

          
          tempNumber = tempNumber / 10;   
      }   
		
      System.out.println(sum);
	}
	
}
