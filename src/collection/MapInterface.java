package collection;
import java.util.*;
public class MapInterface {
	public static void main(String[] args) {
		
		Map<String,String> m=new Hashtable<String,String>();
		
		m.put("1", "aniket");
		m.put("2", "aniket");
		m.put("3", "aniket");
		m.put("4", "aniket");
		m.put("5", "aniket");
		m.put("6", "aniket");
		
		System.out.println(m+"\n");
		
		Set <String> keys=m.keySet();
		
		for(String key:keys)
		{
			System.out.println(key+""+m.get(key));
		}
	}

}
