package NewSe;

public class Swap_two_number {
	public static void main(String[] args) {
		int no1=10 ;
		int no2=20 ;
		
		System.out.println("before swaping:"+no1+""+no2);
		no1 = no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println("after swaping"+no1 +""+no2);
		

	}

}
