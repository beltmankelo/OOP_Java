import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class Time
{
	int h;
	int m;
	int s;
	Scanner sc=new Scanner(System.in);
	Time()
	{
		h=3;
		m=5;
		s=11;
	}
	Time (int hh,int mm,int ss)
	{
		h=hh;
		m=mm;
		s=ss;
	}
	void assign()
	{
      System.out.println("Enter values for Time ");
      this.h=sc.nextInt();
      this.m=sc.nextInt();
      this.s=sc.nextInt();      
	} 
	void display(Time t)
	{
		System.out.println("The time is"+t.h+":"+t.m+":"+t.s);
	}
	Time add(Time t1)
	{
		Time T=new Time();
		T.s=this.s+t1.s;
		if(T.s>60)
		{
			T.s=T.s-60;
		T.m=this.m+t1.m+1;
	}
	    else
	    T.m=this.m+t1.m;
	    if(T.m>60)
	    {
	    	T.m=T.m-60;
		T.h=this.h+t1.h+1;
	}
	    else
	    T.h=this.h+t1.h;
	    if(T.h>24)
	    	T.h=T.h-24;
	    return T;
	}
	Time sub(Time t1)
	{
		Time T=new Time();
		T.s=this.s-t1.s;
		if(T.s<0)
	    {
	     T.s=60+T.s;
		 T.m=this.m-t1.m-1;
		}
	    else
	     T.m=this.m-t1.m;
	    if(T.m<0)
	    {
	    	T.m=60+T.m;
		    T.h=this.h-t1.h-1;
	    }
	    else
	    T.h=this.h-t1.h;
	   if(T.h<0)
	    	T.h=Math.abs(T.h);
	    return T;
	}
	void Comp(Time t1)
	{
		if(this.h>t1.h)
		{
			System.out.println("Time 1 is greater");
		}
		else if (this.h<t1.h)
           System.out.println("Time 2 is greater");
       else if (this.m>t1.m)
       	System.out.println("Time 1 is greater");
       else if (this.m<t1.m)
       	System.out.println("Time 2 is greater");
       else if (this.s>t1.s)
       	System.out.println("Time 1 is greater");
       else if (this.s<t1.s)
       	System.out.println("Time 2 is greater");
       else 
       	System.out.println("Time is equal");
       	


	}
}
class Tim
{
	public static void main(String[] args) {
	
	Time t1=new Time();
	Time t2=new Time();
	Time t3=new Time();
	System.out.println("Displaying Default constructor");
	t3.display(t3);
	Time t4=new Time(5,30,30);

	System.out.println("Displaying Arguemented constructor");
	t4.display(t4);
	t1.assign();
	t2.assign();
	char ch;
	Scanner sc=new Scanner (System.in);
	System.out.println("Please enter A-Add or S-Sub or C-Compare");
        ch=sc.next().charAt(0);
        switch(ch)
        {
        	case ('A'):
               
               Time T;
               T=t1.add(t2);
               T.display(T);
               break;
            case ('S'):

                T=t1.sub(t2);
                T.display(T);
                break;
            case 'C':
                t1.Comp(t2);
                break;


        }

	

   }
}