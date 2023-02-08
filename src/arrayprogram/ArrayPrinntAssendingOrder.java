package arrayprogram;

public class ArrayPrinntAssendingOrder {
	
	public static void main(String[] args) {
		
		
		int a[]= {12,34,56,768,8787,66,43,3,6};
		
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			//System.out.println(temp);
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
