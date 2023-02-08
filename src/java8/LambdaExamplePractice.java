package java8;


interface Drawable{ 
	
    public void draw();  
} 



 class LambdaExamplePractice {
	 
		
	
	public static void main(String[] args) {
		
		
		LambdaExamplePractice lp=new LambdaExamplePractice();
		
		
	
		Drawable d2=() -> {System.out.println( "this is lambda example");
		};
		
		d2=()->{System.out.println("this is directly use lambda");};
	
}


}
