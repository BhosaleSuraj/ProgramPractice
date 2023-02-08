package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleofStreamApi {
	public static void main(String[] args) {
		
	
	
	List<Integer> list= List.of(12,22,33,33,23,445,54,56);
	
	List<Integer> listevnt=new ArrayList<>();
	
	for(int a:list)
	{
		if(a%2==0)
		{
			listevnt.add(a);
		}
	}
    System.out.println(listevnt);
	
    
    
    List<String> list1=Arrays.asList("raman","","lakhan","pream","sumit");
    
    Stream<String> it=list1.stream();
    
    System.out.println(it);
	}
}
