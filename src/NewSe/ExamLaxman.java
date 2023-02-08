package NewSe;

public class ExamLaxman {
	public static void main(String[] args) {
		/*
		 * int n=484; int sum = 0; while(n > 0) { n = n/10;
		 * 
		 * } System.out.println(" the number is "+ n);
		 */
		
        int num=123456;
        int digit=0;
        int sum=0;
        int c=0;
        while(num!=0)
        {
        	digit=num%10;
        	
        	if(digit%2==0)
        	{
        		sum= sum +digit;
        	}
        	num = num/10;
        	c++;
        }
    	System.out.println("the Sum is "+sum );
    	System.out.println(c);

		/*
		 * int n=0; int add=0; while(num!=0) { n=num%10; if(n%2==0) { add=add+n; }
		 * num=num/10; } System.out.println(add);
		 * 
		 */
	}
}
