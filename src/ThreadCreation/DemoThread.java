package ThreadCreation;

public class DemoThread implements Runnable {
	
	



	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("my thread is start-");
	}
	
	public static void main(String[] args) {
		
		
		DemoThread dt=new DemoThread();
		Thread t=new Thread(dt);
		t.start();
	}

}
