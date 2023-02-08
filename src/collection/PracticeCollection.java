package collection;

import java.util.ArrayList;
import java.util.Collection;

public class PracticeCollection {
   public static void main(String[] args) {
	
	   Collection<Integer> a=new ArrayList();
	   
	   a.add(12);
	   a.add(34);
	   a.add(4567);
	   a.add(2);
	   a.add(89);
	   
	   for(int o:a)
	   {
		  System.out.println(o); 
	   }
	   
} 
   
}
