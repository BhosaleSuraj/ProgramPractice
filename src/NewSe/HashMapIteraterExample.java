package NewSe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public class HashMapIteraterExample {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer , String>();
		
		hm.put(110,"Ravi");  
		hm.put(120,"Prateek");  
		hm.put(130, "Davesh");    
		hm.put(140, "Kamal");   
		hm.put(150, "Pawan"); 
		
		
      		Iterator< Integer> it= hm.keySet().iterator();
      		
      		while(it.hasNext())
      		{
      			int key=(int)it.next();
      			
      			System.out.println("ROll: "+key+" "+" name: "+hm.get(key)+" ");
      			
      		}
	}

}
