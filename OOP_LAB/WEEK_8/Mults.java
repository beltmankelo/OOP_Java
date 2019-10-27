import java.util.*;
import java.lang.*;
class MultTable extends Thread{
	int x;
	MultTable(int x)
	{
		this.x=x;
	}
	public void run()
	{
		System.out.println("\nThe table of "+x+" is:");
		for(int i=1;i<=12;i++)
			System.out.println(x+"x"+i+"="+(x*i));
	}
}
class Mults{
	public static void main(String[] args) {
		MultTable m1=new MultTable(5);
		MultTable m2=new MultTable(7);
		m1.start();
		try{
			m1.join();
			}
			catch(Exception exc)
			{
				System.out.println(exc);
			}
		m2.start();
		}

}