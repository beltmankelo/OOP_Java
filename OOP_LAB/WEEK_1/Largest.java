import java.io.* ;
import java.util.Scanner ;

class Largest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers>>");
		int a=sc.nextInt(); 
		int b=sc.nextInt();
		int c=sc.nextInt();
		int large;
		if (a>b)
		
			if (a>c)
				large=a;
			else
			    large=c; 
		else
			if(b>c)
				large=b;
			else
				large=c;
		
	    System.out.println("The largest out of " +a+", "+b+" and "+c+" is :"+large);
	}
}