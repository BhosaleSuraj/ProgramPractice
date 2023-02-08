package arrayprogram;

public class BubbalSortArray {
	
	public void bubbalsort(int[] arr)
	{
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		BubbalSortArray ba=new BubbalSortArray();
		int a[]= {10,30,90,35,67};
		
		
		System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < a.length; i++){  
                System.out.print(a[i] + " ");  
        }  
        System.out.println();  
          
        ba.bubbalsort(a);//sorting array elements using bubble sort  
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < a.length; i++){  
                System.out.print(a[i] + " ");  
        }  

}  
	}
	
	

