package practice;

 abstract class Addition {
	
	void show()
	{
		System.out.println("the using abstract method i the following inherita a class body");
	}
	
	abstract void view();
	abstract void add();
}
class AbstractMethod extends Addition

{
	 void view()
	{
		System.out.println("call the view method");
	}
	 void add()
	 {
		 System.out.println("call the add method");
	 }
	 public static void main(String [] args)
	 {
		 Addition s=new AbstractMethod();
		 s.add();
		 s.view();
		 s.show();
				 
	 }
}