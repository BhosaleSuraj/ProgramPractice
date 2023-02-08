package practice_easy_practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practice {

 
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  int len  = sc.nextInt();
	  List<Integer> value  = new ArrayList<>();
	  while(len != 0)
	  {
		  value.add(sc.nextInt());
		  len--;
	  }
	
	    System.out.println(value);
	    
	    
	    Practice obj = new Practice();
	    obj.sortMethod(value);
	    
  }
  
	public static void sortMethod(List<Integer> array)
	{
		
	  Collections.reverse(array);
	  System.out.println(array);
	  
		
	}

}
