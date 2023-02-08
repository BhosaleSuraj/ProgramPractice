package java_itrPractice;

public class Employee {
	
	
	public static void main(String[] args) {
		
		
		HashCodeAndEquql hs=new  HashCodeAndEquql();
		hs.setId(1);
		hs.setName("laxman");
		
		
		HashCodeAndEquql h=new  HashCodeAndEquql();
		
		h.setId(1);
		h.setName("laxman");
		
		
		
		System.out.println(hs==h);
		
		System.out.println(hs.equals(h));
	}

	

}
