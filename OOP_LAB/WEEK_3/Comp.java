import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class Complex
{
	float a;
	float b;
	void assign(int c, int d)
	{
		a=c;
		b=d;
	}
    public Complex add(Complex x)
    {
    	Complex s=new Complex();
    	s.a=this.a+x.a;
        s.b=this.b+x.b;
        return s;
    }
    public Complex sub(Complex x)
    {
    	Complex s=new Complex();
    	s.a=(this.a-x.a);
        s.b=(this.b-x.b);
        return s;
    }
     void Display(Complex x)
    {
    	System.out.println("The complex number is: "+x.a+"+i"+x.b);
    }
}
class Comp
{
	public static void main(String args[])
	{
		Complex c=new Complex();
        Complex o=new Complex();
		int a,b;
		System.out.println("Enter the values to assign to the complex numbers 1 and 2(Real and Imaginary)");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c.assign(a,b);
		a=s.nextInt();
		b=s.nextInt();
		o.assign(a,b);
        System.out.println("Enter option A-Add or S-Subtract");
        char ch;
        ch=s.next().charAt(0);
        switch (ch)
        {
        	case 'A':
        	Complex A=c.add(o);
        	c.Display(A);
            break;
        	case 'S':
        	A=c.sub(o);
        	c.Display(A);
        }

	}
}
