package matrixexmple;

public class TransposeMatrixExample {
	public static void main(String[] args) 
	{
		int a[][]= {
				
				{1,4,6},
				{5,6,7},
				{2,4,3},
				{4,5,6}
				
				};
		
		int col,row;
		
		col=a[0].length;
		row=a.length;
		
		int t[][]=new int [col][row];
		//System.out.println(col);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				//t[i][j]=a[j][i];
				System.out.print(a[j][i]);
			}
			System.out.println();
		}
		
	    System.out.println("Transpose of given matrix: ");    
        for(int i = 0; i < col; i++){    
            for(int j = 0; j < row; j++){    
               System.out.print(t[i][j] + " ");    
            }    
            System.out.println();    
        }  
	
	}

}
