import java.util.*;
import java.lang.*;
class Priorities extends Thread {
	Thread thread;
	String name;
	Priorities(String n)
	{
		thread=new Thread(this,n);
		name=n;
		thread.start();
	}
	public void run()
	{
		System.out.println("Running thread:"+name);
	}
}
class PriorityDemo{
	public static void main(String[] args) {
		Priorities p=new Priorities("First Thread");
		Priorities p1=new Priorities("Second Thread");
		Priorities p2=new Priorities("Third Thread");
		System.out.println("The priorities are--"+p.getPriority()+":"+p1.getPriority()+":"+p2.getPriority());
		p.setPriority(2);
		p1.setPriority(6);
		p2.setPriority(9);
		System.out.println("The new priorities are--"+p.getPriority()+":"+p1.getPriority()+":"+p2.getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println("The new priorities are--"+p.getPriority()+":"+p1.getPriority()+":"+p2.getPriority()+":"+Thread.currentThread().getPriority());

	}
}