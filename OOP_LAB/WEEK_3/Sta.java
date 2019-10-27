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
  	top=-1;
  	n=no;
  }
  void push()
  {
    System.out.println("Enter the element");
    	if(top>n)
    	{
    		System.out.println("Stack overflow");
    			
    	}
    	st[++top]=sc.nextInt();
    	if(top>n)
    	{
    		System.out.println("Stack overflow");
    			
    	}
    }
  
  void pop()
  {
  	

  		System.out.println("Deleted element "+st[top--]);
  		if(top<0)
    	{
    		System.out.println("Stack underflow");
    		
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
class Sta
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Stacks s=new Stacks(5);
		char ch;
		do{
	  System.out.println("Please enter P-Push or O-Pop or D-Display or E-Exit");
        ch=sc.next().charAt(0);
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