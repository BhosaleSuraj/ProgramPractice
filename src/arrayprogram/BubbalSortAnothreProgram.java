package arrayprogram;

public class BubbalSortAnothreProgram 
{
	static void b(int[] m)
	{
	  int a=m.length;
	 int temp=0;
	  for(int i=0;i<a;i++)
	  {
		  for(int j=1;j<a-i;j++)
		  {
			  if(m[j-1]>m[j])
			  {
				temp=m[j-1];
				m[j-1]=m[j];
				m[j]=temp;
			  }
		  }
	  }
	  }
	
	public static void main(String[] args) {
		
		int a[]= {11,23,44,55,12,22};
		
		System.out.println("after bubbal sort");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		b(a);
		System.out.println("bubbal sort");
         for(int i=0;i<a.length;i++)
         {
        	 System.out.print(a[i] +" ");
         }
	}

}
