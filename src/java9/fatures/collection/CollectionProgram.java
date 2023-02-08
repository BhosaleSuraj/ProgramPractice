package java9.fatures.collection;

import java.util.ArrayList;

public class CollectionProgram {
	
	public static void main(String[] args) {
		
		
		ArrayList<Staf> st=new ArrayList<Staf>();
		
		Staf s=new Staf();
		
		s.setSid(1);
		s.setSname("patil");
		s.setDiv(2);
		
		st.add(s);
		
		System.out.println(st);
	}

}
