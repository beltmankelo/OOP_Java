import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class Stacks
{
  int st[]=new int[100];
  int top;
  int i;
  int n;
  Scanner sc=new Scanner(System.in);
  Stacks (int no)
  {
  	top=-1
  	n=no;
  }
  void push()
  {
    boolean f=True;
    while(f)
    {
    	st[++top]=sc.nextInt();
    	if(top>n)
    	{
    		System.out.println("Stack overflow");
    		f=False;
    	}
    }
  }
  void pop()
  {
  	boolean f=True;
  	while(f)
  	{
  		st[top--];
  		if(top<0)
    	{
    		System.out.println("Stack underflow");
    		f=False;
    	}

  	}
  }
  void Display()
	{
		System.out.println("The Stack Contents are ");
        for(i=top;i>=0;i--)
        {
        	System.out.println(st[i]);
        }
	}
}
class sta
{
	public static void main(String[] args) 
	{
		Stacks s=new Stack(5);
		do{
	  System.out.println("Please enter P-Push or O-Pop or D-Displayor E-Exit");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
        	case ('P'):
               s.push();
               break;
            case ('O'):
                s.pop();
                break;
            case 'D':
                s.Display();
                break;


        }

	}while(ch!='E');

   }
}