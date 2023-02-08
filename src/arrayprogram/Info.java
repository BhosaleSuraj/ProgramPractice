package arrayprogram;

public class Info {
	public static void main(String[] args) {
		
		
		int a[]=  {45,67,8,9,007,780}; 
		int temp=0; int num;
		for(int i=0;i<a.length;i++)
		{      
			num=i;
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[j]<a[num])
				{
					num=j;
				}
				
			}
			
			temp=a[i];
			a[i]=a[num];
			a[num]=temp;
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	
	
	

}
