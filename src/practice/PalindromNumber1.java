package practice;

public class PalindromNumber1 {
public static void main(String[] args)
{
	int a=0;
	int temp;
	int n=454;
	temp=n;
	while(n>0)
	{
		a=a*10+n%10;
		//sum=( sum * 10)+a;
		n=n/10;
		
	}
	System.out.println(a);
	
	if(temp==a)
	{
		System.out.println("the number is  paliendrom");
	}
	else
	{
		System.out.print("The number is not palindrom" );
	}
	
	
}
}


/*class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  */
