package practice;

public class Comman_number {
	public static void main(String[] args)
	{
		int a[]= {6,5,9,6,7,8,7,8};
		
		int b=a.length;
		boolean m=false;
		
		for(int i=0;i<=b-1;i++) {
			for(int j=i+1;j<=b-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("print comman number:::::"+a[i]);
					
					//m=true;
				}
				
			}
			
		}
		/*if(m==false)
		{
			System.out.println("not a comman number");
		}*/
	}

}
