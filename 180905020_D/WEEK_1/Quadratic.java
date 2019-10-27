import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class Quadratic
{
	public static void main(String args[]) 
	{
	  Scanner sc= new Scanner (System.in);
	  System.out.println ("Enter a, b and c of the quadratic quation ax^2+bx+c=0>> ");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
      int c=sc.nextInt();
      int d= b*b-4*a*c;
      int f;
      if(d>0)
         f=1;
      else if(d==0)
         f=2;
      else
         f=3;
      switch (f)
      {
      	case 1: 
      	 float r1=(float)(-b+Math.sqrt(b*b-4*a*c))/(2*a) ;
      	 float r2=(float)(-b-Math.sqrt(b*b-4*a*c))/(2*a) ;
         System.out.println ("The real roots are "+r1+"and"+r2);
        break;
        case 2:
         r1=(float)(-b/2*a);
         System.out.println ("The real root is "+r1);
        break;
        case 3:
         r1=(float)(-b+Math.abs(Math.sqrt(b*b-4*a*c))/(2*a)) ;
      	 r2=(float)(-b-Math.abs(Math.sqrt(b*b-4*a*c))/(2*a)) ;
      	 System.out.println ("The roots are "+r1+"+i"+r2);

      } 
	}
}