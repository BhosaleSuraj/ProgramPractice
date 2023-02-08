package HeafShineLogicalPattern;


	
		class U { V v = new V();
 
		  U() {System.out.println("U"); }
		  
		  U(int i) {System.out.println("u"); }
		  
		  }
		 
		  class V { V() {System.out.println("V"); }
		  
		  V(int i) {System.out.println("v"); } }
		  
		  class T extends V { T() {System.out.println("T"); }
		  
		  T(int i) {System.out.println("t"); } }
		  
		  public class MyClass { public static void main(String []args) { myCode();
		  
		  } private static void myCode() { U u = new U(); U u1 = new U(1);
		  
		  V v = new V(); V v1 = new V(1);
		  
		  T t =new T(); T t1 = new T(1); } 
		 
	
	
	
	{
		
		
		int bin[]=new int[15];
		int temp=0;
		int dec=10;
		while(dec>0)
		{
			bin[temp++]=dec%2;
			dec=dec/2;
		}
		for(int i=temp-1;i>=0;i--)
		{
			System.out.println(bin[i]);
		}
		
	}
}




/*
 * a =a-10; a = -a; a = 7+a;
 * 
 * System.out.println("a = " +a);
 * 
 * a = a%a; a =a*a-3; System.out.println("a = " +a);
 */







/*
 * public class MyClass { public static void main(String args []) {
 * FinalPersonClass fpc = new FinalPersonClass("hii", 94); FinalPersonClass fc =
 * new FinalPersonClass("Hello", 65);
 * 
 * System.out.println(fpc.name + " - "+ fpc.age);
 * 
 * System.out.println(fc.getName() + " - " + fc.getAge()); } }
 * 
 * class FinalPersonClass { public String name; public int age;
 * 
 * public FinalPersonClass(final String name, final int age) { super();
 * 
 * this.name = name; this.age = age; }
 * 
 * public int getAge() {return age;}
 * 
 * public String getName() {return name;} }
 */






/*
 * package HeafShineLogicalPattern;
 * 
 * class U { V v = new V();
 * 
 * U() {System.out.println("U"); }
 * 
 * U(int i) {System.out.println("u"); }
 * 
 * }
 * 
 * class V { V() {System.out.println("V"); }
 * 
 * V(int i) {System.out.println("v"); } }
 * 
 * class T extends V { T() {System.out.println("T"); }
 * 
 * T(int i) {System.out.println("t"); } }
 * 
 * public class MyClass { public static void main(String []args) { myCode();
 * 
 * } private static void myCode() { U u = new U(); U u1 = new U(1);
 * 
 * V v = new V(); V v1 = new V(1);
 * 
 * T t =new T(); T t1 = new T(1); } }
 * 
 * 
 * 
 * 
 * class U {
 * 
 * V v = new V () ;
 * 
 * U() { System.out.print("U"); }
 * 
 * 
 * U(int i) { System.out.print ( " u" ) ; } }
 * 
 * class V {
 * 
 * V () { System.out.print("V"); } V(int i) { System.out.print("v"); } }
 * 
 * 
 * 
 * class T extends V {
 * 
 * T() { System.out.print ("T" ) ; }
 * 
 * T(int i) { System.out.print("t"); }
 * 
 * 
 * 
 * class MyClass {
 * 
 * public static void main(String[] args) { myCode(); }
 * 
 * } {
 * 
 * //cons19
 * 
 * 
 * }
 * 
 * private static void myCode() { //WriteCode Here
 * 
 * U u = new U(); U u1 = new U(1) ;
 * 
 * V v= new V(); V vl = new V(1) ;
 * 
 * 
 * T t = new T(); T t1 = new T(1); }
 * 
 * }
 */
		  
		  
		  
		  
		  