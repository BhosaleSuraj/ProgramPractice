package NewSe;

public class FindRectangleAndParameter {
	public static void main(String[] args) 
	   {
		
		int width=5;
		int length=20;
		
		myCode(width , length);
	    }
	  
	  public static void myCode(int width , int length)
	  {
		  
		int  rectangle = width*length;
		int rectangleofperiameter=2*width*length;
		double areaofcircle=2*3.14*width*width;
		//3/4*side*side
		//area of equilateral triangale
		double aet=Math.sqrt(3);
		double a=aet*(width)*(width)/4;
		
		//compound intrest 
		//a=p
		
		System.out.println("rectangle"+rectangle);
		System.out.println("rectangleofparameter"+rectangleofperiameter);
		System.out.println("area of circle:"+areaofcircle);
		System.out.println("area of equilateral triangale "+a);
		System.out.println(aet);
		
	  }
	   

}
