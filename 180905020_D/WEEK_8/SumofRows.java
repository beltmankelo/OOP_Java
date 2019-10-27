import java.util.*;
class RowSum{
	//int a[]=new int[10];
	synchronized public int rsum(int []a){
		int s=0;
		for(int i=0;i<a.length;i++)
			s+=a[i];
		//System.out.println(s);
		return s;
	}
}
class Threadcalc implements Runnable{
	Thread t;
	int s;
	int a[]=new int[10];
	static RowSum rs=new RowSum();
	Threadcalc(String n,int []a)
	{
		t=new Thread(this,n);
		this.a=a;
		t.start();
	}
	public void run()
	{
		System.out.println("Starting thread\n");
		this.s=rs.rsum(a);
		//System.out.println(this.s);
	}
	public int disp()
	{
		return s;
	}

}
class SumofRows{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int k=0;
		System.out.println("Enter number of rows and columns");
		int m=sc.nextInt();
		int n=sc.nextInt();
		Threadcalc []tc=new Threadcalc[m];
		int [][]a=new int[m][n];
		System.out.println("Enter array elements");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			tc[i]=new Threadcalc("t",a[i]);
			try{
				tc[i].t.join();
			}
			catch(InterruptedException exc)
			{
				System.out.println(exc);
			}
			k+=tc[i].disp();
			System.out.println("Row sum of "+i+" is "+tc[i].disp());
		}
		System.out.println("Total sum is:"+k);
	}

}

