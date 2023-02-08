package java8;
interface Cons
{
	void getMessage(String msg);
}

class Message
{
	 Message(String msg){  
	        System.out.print(msg);  
	    }  
}

public class ConstructorReferance {
	
	public static void main(String[] args) {
		
		Cons c= Message::new;
		c.getMessage("helloconref");
	}

}
