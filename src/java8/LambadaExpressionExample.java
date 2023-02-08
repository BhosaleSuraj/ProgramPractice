package java8;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Lamd 
{
	public void say();
}


public class LambadaExpressionExample {
	
	
	
	public static void main(String[] args) {
		
		
		//LambadaExpressionExample le=new LambadaExpressionExample();
		//le.say();
		
		Lamd  le= ()->{ System.out.println("this is print lamda");};
		le.say();
			
		
		// type of creating lis 
		List<Integer> list= List.of(12,3,44,55,556); //not changebale
		
		System.out.println(list);
		
		
		List<Integer> list1= Arrays.asList(12,3,44,55,556);
		
		
		  list.forEach(  
		            (n)->System.out.println(n)  
		        );
		  
		  list1.forEach((n2)->System.out.println(n2));
//		list.forEach {
//			
//			(n)->System.out.println(n);
//		};
		
		       
		
	}

	

}
