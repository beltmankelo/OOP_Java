import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class Counter
{
   static int count=0;
   Counter()
   {
   	count++;
   }
   static void showcount()
   {
   	System.out.println("The value of counter is:"+count);
   }
}
class Count
{
	public static void main(String[] args) {
		Counter C=new Counter();
		int n;
		System.out.println("Enter the number of objects to declare");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Counter [] c= new Counter[n];
		int i;
		for(i=0;i<n;i++)
			c[i]=new Counter();
		Counter.showcount();
	}
}