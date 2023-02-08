package practices;

public class ThreadExample 
	{  
	public static void main(String[] args)
	{
		Simple obj=new Simple();
		ThreadExample2 obj1=new ThreadExample2();
		obj.start();
		obj1.start();
		obj1.display();
	
		
		
		obj.setPriority(3);  
		obj1.setPriority(9); 
		
		System.out.println("Priority of the thread obj is : " + obj.getPriority());
		System.out.println("Priority of the thread obj1 is : " + obj1.getPriority());
		
		System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
		  
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority()); 
		
		Thread.currentThread().setPriority(10);  
		  
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority()); 
	}
	   
	}
 class ThreadExample2 extends Thread 
{
   public void display()
   {
	   for(int i=0;i<=5;i++)
	   {
		   System.out.println("hi");
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
   }
}
class Simple extends Thread
{
	public void run()
	   {
		   for(int i=0;i<=5;i++)
		   {
			   System.out.println("hello");
			   try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		   }
	   }
}}