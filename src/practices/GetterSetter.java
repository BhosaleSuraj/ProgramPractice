package practices;

public class GetterSetter {
	
	private int number;
	private String arr;
	
	public void setNum(int num)
	{
		number=num;
	}
	public int getNum()
	{
		 return number;
		
	}
	

}
class Get
{
	public static void main(String [] args)
	{
		GetterSetter gs=new GetterSetter();
		 gs.setNum(100);
		 System.out.println("the print numbe using setter method and view get method"+gs.getNum());
	}
}
