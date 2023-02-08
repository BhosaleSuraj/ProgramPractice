package practice;

class Outer
{
  
	 void show()
	 {
		System.out.println("this is the outer method"); 
	 }
	 
	static class Inner
	 {
		 void display()
		 {
			 System.out.println("this method oi inner");
		 }
	 }
}

public class ExampleOfInnerClass {
	
	public static void main(String []a) 
	{
		
		Outer obj= new Outer();
		 obj.show();
		 Outer.Inner obj1=new Outer.Inner();
		 obj1.display();
	}

}
