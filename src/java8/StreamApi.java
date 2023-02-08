package java8;

import java.util.Arrays;
import java.util.List;



public class StreamApi {
	public static void main(String[] args)
	{
		List<String> list=Arrays.asList("raman","","lakhan","pream","sumit");
		
		long count=list.stream().filter(x->x.isEmpty()).count();
		
		System.out.println(" count="+count);
	}

}
