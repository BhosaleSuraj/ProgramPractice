package NewSe;

public class Calculate_loss_or_Profit {
	public static void main(String[] args) {
		
		//Selling_Price  Cost_Price 
		int Se=1200;
		int Cp=300;
		if(Se-Cp>0)
		{
			System.out.println("profit"+(Cp-Se));
		}
		else if(Se-Cp<0)
		{
			System.out.println("loss"+(Se-Cp));
		}
		else
		{
			System.out.println("neutral");
		}
	}

}
