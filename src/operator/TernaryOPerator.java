package operator;

public class TernaryOPerator {
	public static void main() {
		int a=20 ,b= 25,c=50;
		 
		int r=(a>b)?(a>c?a:c):(b>c?b:c);
		
		
		System.out.println(r);
		

		  int gretest = a>b?a:b;                      
		    int greter2 = gretest>c?gretest:c;
		    
		    System.out.println(greter2);
	}

}
