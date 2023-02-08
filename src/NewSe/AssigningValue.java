package NewSe;

public class AssigningValue {
	public static void main(String[] args) {
		int a=4;
		int var;
		var=a;
		System.out.println(var);
		var += a;
		System.out.println(var);
		var *= a;
		System.out.println(var);
		
		
		// conversion
		
		long l=55;
		int i= 44;
		short s=33;
		byte b=22;
		myCode(l , i , s ,b);
	}

	private static void myCode(long l, int i, short s, byte b) {
		// TODO Auto-generated method stub
		i=(int)l;
		s=(short) i;
		b=(byte) s;
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		
		//sample
		 
		int a,e,c,d;
		
		a=e=c=d=40;
		a+=e-=c*=d/=40;
		System.out.println(a+" "+e+" "+c+" "+d);
	}

}
