package java8;


interface Target
{
	public void same();
}
public class LambdaExample {
	
	public void sum() {
		
		System.out.println("this is method not return value");
	}
	
	public static void main(String[] args) {
		
		
		
		
		Target le=()-> {
			 System.out.println("this is print lamda");
		};
		le.same();
		
	}

}

