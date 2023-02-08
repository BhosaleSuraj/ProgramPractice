package NewSe;

public class NewProgram {
	public static void main(String[] args)
	{
		
		
	//revers string
     int n=19;
     int count = 0;
     if(n>1)
     {
    	for(int i=1;i<=n;i++)
    	{
    		if(n%i==0)
    		count++;
    	}
    	if(count==2)
    		
    	{
    		System.out.println("a prime number");
    	}
    	else
    	{
    		System.out.println("not a prime");
    	}
     }
     else
     {
    	 System.out.println("this is the not prime");
     }
     
     System.out.print("he java");
	}
	
	
//	int cnt=0;
//	while(true)
//
//		if(cnt > 4)
//			break; 
//	if(cnt==0)
//
//		{
//
//		cnt++; 
//		continue;
//
//		}
//
//		System.out.print(cnt +","); 
//		cnt++;

		
//	char ch[] = {'A', 'B', 'C'};
//
//	int i=0;
//   
//	do
//
//	{
//
//	System.out.print(ch[i] + ",");
//	i++;
//	}
//	while(i<ch.length);
	
//	
//int k=20;
//if(k<=5)
//{
//	System.out.println("yes");
//}
//else if(k>=5)
//{
//	System.out.println("no");
//}else
//{
//	System.out.println("null");
//}
//	switch(15)
//	{
//	case 5*2:
//		System.out.println("ten");
//		break;
//	case 5*4-5:
//	System.out.println("fifty");
//	 break;
//	case 60/5+4:
//		System.out.println("twnty");
//	
//	}
//	
//	int age=20;
//	do 
//	{
//		age++;
//	}while(age<20);
//	System.out.println(age);
//	
	
    
}
