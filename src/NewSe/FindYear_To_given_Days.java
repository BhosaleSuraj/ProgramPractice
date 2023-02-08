package NewSe;

public class FindYear_To_given_Days {
	
	public static void main(String[] args) {
		
		 double days=400;
		 
		 double year=400/365;
		 double month=days/30;
		 double week=days/7;
		 System.out.println("yera: "+year);
		 System.out.println("month :"+month);
		 System.err.println("week : "+ week);
		 
		 int years=400/365;
		 double reminder1=days%365;
		 double months=reminder1/30;
		 double rem=reminder1%30;
		 double weeks=rem/7;
		 
		 System.out.println("yera: "+years);
		 System.out.println("month :"+months);
		 System.err.println("week : "+ weeks);
	}

}
