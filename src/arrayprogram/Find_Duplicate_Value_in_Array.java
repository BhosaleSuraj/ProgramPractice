package arrayprogram;

public class Find_Duplicate_Value_in_Array {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,1,3,5,6,1,1,1};
		
		boolean b=false;
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
					b=true;
				}
			}
		}
		
		if(b==false)
		{
			System.out.println("duplicATE NUmber are not found");
		}
	}

}
