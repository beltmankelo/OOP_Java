import java.io.*;
import java.util.Scanner;
class Prime
{
	public static int isPrime(int a)
	{
		int i;
		int flag=0;
		if(a==2)
			return flag;
		for(i=2;i<=a/2;i++)
			if(a%i==0)
				flag=1;
		return flag;	
	}
	public static void main(String[] args) 
	{
		
  	Scanner sc= new Scanner(System.in);
  	System.out.println ("Enter the number to check for prime number>> ");
  	int p=sc.nextInt();
    int l= isPrime(p);
    
    if(l==0)
       System.out.println("The number " +p+" is prime");
   else
  	   System.out.println("The number " +p+" is composite");
  	int prim;
  	System.out.println ("Enter the number for printing primes>> ");
  	prim=sc.nextInt();
  	int i;
  	int q=0;
  	for(i=2; q<=prim ;i++)
  	{
      l=isPrime(i);
      if(l==0)
       {
       	System.out.println("The number " +i+" is prime");
        q++;
       }   
  	}

	}
}