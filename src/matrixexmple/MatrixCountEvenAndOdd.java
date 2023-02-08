package matrixexmple;

public class MatrixCountEvenAndOdd {
	public static void main(String[] args) {
		
	
	
	int a[][]= {
			
			{1,4,6},
			{5,6,7},
			{2,4,3}
			
			};
	
	
	int col,row ,even=0,odd=0;
	
	row=a.length;
	col=a[0].length;
	
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			if(a[i][j]%2==0)
			{
				System.out.print(a[i][j]+" ");
				even++;
			}
			else
			{
				System.out.print(a[i][j]+" ");
				odd++;
			}
		}
	}
	System.out.println("count even no"+even);
	System.out.println("count odd no"+odd);

}
}
