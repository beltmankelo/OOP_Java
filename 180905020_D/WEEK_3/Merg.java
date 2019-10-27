import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class Mixer
{
	int arr[]= new int[100];
	int n;
	Scanner sc=new Scanner (System.in);
    int i;
	void Accept()
	{
		System.out.println("Enter Array size");
        n=sc.nextInt();
		System.out.println("Please enter the elements of the array in ascending order without any duplicates");
		for (i=0;i<n;i++)
			this.arr[i]=sc.nextInt();

	}
	Mixer merge(Mixer a)
	{
		int j;
		Mixer M=new Mixer();
		

			for(i=0,j=0;j<this.n;i++,j++)
				M.arr[i]=this.arr[j];
			for(j=0;j<a.n;j++,i++)
				M.arr[i]=a.arr[j];
			M.n=a.n+this.n;
		return M;
	}
	 void Display(Mixer a)
	{
		System.out.println("The sorted merged ascending array is: ");
        for(i=0;i<(a.n);i++)
        {
        	System.out.println(a.arr[i]);
        }
	}
}
class Merg
{
	public static void main(String[] args)
	{
	Mixer c=new Mixer();
    Mixer o=new Mixer();
    c.Accept();

    o.Accept();
    Mixer M=c.merge(o);
    c.Display(M);
    }
}