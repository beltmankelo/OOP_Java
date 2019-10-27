import java.util.*;
import java.lang.*;
class Queue{
	int n;
	boolean avail=false;
	public synchronized void put(int i)
	{
		while(avail)
		{
			try{
				wait();
			}
			catch(InterruptedException exc)
			{
				System.out.println(exc);
			}

		}
		this.n=i;
		System.out.println("Putting:"+i);
		avail=true;
		notify();

	}
	public synchronized void get()
	{
		while(!avail)
		{
			try{
				wait();
			}
			catch(InterruptedException exc)
			{
				System.out.println(exc);

			}
			System.out.println("Got:"+n);
			avail=false;
			notify();
		}
	}
}
class Producer implements Runnable{
	Queue q;
	Producer(Queue qu)
	{
		q=qu;
		new Thread(this,"PRODUCER").start();
		System.out.println("Starting Producer");
	}
	public void run()
	{
		int k=0;
		while(true)
		q.put(k++);
	}
}
class Consumer implements Runnable{
	Queue q;
	Consumer(Queue qu)
	{
		q=qu;
		new Thread(this,"CONSUMER").start();
		System.out.println("Started Consumer");
	}
	public void run()
	{
		while(true)
		q.get();
	}
}
class ProCon{
	public static void main(String[] args) {
		Queue q=new Queue();
		Consumer c=new Consumer(q);	
		Producer p=new Producer(q);
		System.out.println("Ctrl-C to end");
	}
}