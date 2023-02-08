package practice;

public class ExplainVariable {
	
	
		
	int a=10;  //instance variable            out side of the method or the following
	
	
	static char c='s';  //static variable 
	 
	public void show()
	 {
		 int name=35;              //local vriable  only declered block          only visiable in method
			System.out.println(name);
	 }

	
	public static void main(String[] args) {
		
	ExplainVariable s= new ExplainVariable();
	 
	 s.show();
	System.out.println(s.a +"\n"+c+"\n");
		

	}

}
