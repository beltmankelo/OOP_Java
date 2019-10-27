import java.io.*;
import java.util.Scanner;
class Fact
{
	public static int facto(int f)
	{
      int fac=f;
       while(f>1)
       	{
            f--; 
            fac=fac*(f);
        }
        return fac;
	}
  public static void main(String args[])
  {
  	Scanner sc= new Scanner(System.in);
  	System.out.println ("Enter the number whose factorial you want to find>> ");
  	int f=sc.nextInt();
  
  	System.out.println("The factorial of number " +f+" is: "+ facto(f));
  	System.out.println ("Enter the n and r whose combination you want to find>> ");
    int n=sc.nextInt();
    int r=sc.nextInt();
  	int c=facto(n)/(facto(n-r)*facto(r));
  	System.out.println("The combination of n " +n+" and r "+r+ " is:" +c);
  }  
}