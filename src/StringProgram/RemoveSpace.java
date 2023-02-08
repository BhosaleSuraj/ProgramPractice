package StringProgram;

public class RemoveSpace {
	
public static void main(String[] args) {
	
	String str="public static void main  ";
	String s =str;
	s=s.replaceAll("\\s+", "");
	
	String t=str.trim();
	
	System.out.println(t);
}

}
