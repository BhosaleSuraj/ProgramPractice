package practice;

public class ReturnArray_FromMethod {
	public static void main(String[] args) 
	{     
		
		 
	       int[] a;
	       a=new int[] {12,23,45,67,7};
	       
	       for(int i=0;i<a.length;i++)
	       {
	    	    
	    	   System.out.println(a[i]);
	       }
	       
	       ReturnArray_FromMethod s= new ReturnArray_FromMethod();
	       System.out.println("print my method call to number");
	      
	       int m[];
	       m=new int[] {5,5,8,9,0};
	       
	      s.add(m);                //method call
	}
	
	public  void add(int[] sum)       //method
	{
		
		for(int i=0;i<sum.length;i++)
		{
			System.out.println(sum[i]);
		}
	}
	

}
