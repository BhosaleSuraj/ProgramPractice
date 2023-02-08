package matrixexmple;

public class UpperTriangulerMatrix {
	
	public static void main(String[] args) {
		
		
		int a[][]= {
				
				{1,4,6},
				{5,6,7},
				{2,4,3}
				
				};
		
		
		int col,row;
		
		row=a.length;
		col=a[0].length;
		if(row!=col)
		{
			System.out.println("it is a square matrix");
		}
		else
		{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i<j)
				{
					System.out.print('0');
				}
				else
				{
					System.out.print(a[i][j]);
				}
			}
			System.out.println();
		}
		}
	}

}
