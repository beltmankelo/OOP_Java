import java.util.*;
class Student{
	String n;
	int rno;
	Student(String name,int r)
	{
		n=name;
		rno=r;
	}
	public String toString()
	{
		return "Name is:"+n+"\nRoll number is:"+rno;
	}
}
class StackFull extends Exception{
	public String toString()
	{
		return "Stack Full";
	}
}
class StackEmpty extends Exception{
	public String toString()
	{
		return "Stack Empty";
	}
}
class Employee{
	String n;
	int eid;
    double pay;
	Employee(String name,int r,double p)
	{
		n=name;
		eid=r;
		pay=p;
	}
	public String toString()
	{
		return "Name is:"+n+"\nEmployee id is:"+eid+"\nPay is:"+pay;
	}
}
interface Stacks<T>{
	 Boolean isFull();
	 Boolean isEmpty();
	 void push(T i) throws StackFull;
	 T pop() throws StackEmpty;
}
class Stack<T> implements Stacks<T>{
	int top;
	T arr[];
	final int size=5;
	Stack(T i[]){
		top=-1;
		arr=i;
	}
	public Boolean isFull()
	{
		if(top>5)
			return true;
		return false;
	}
	public Boolean isEmpty()
	{		
		if(top==-1)
		{
			return true;
		}
		return false;
	}
	public void push(T i) throws StackFull
	{
		if(!isFull())
		{
			System.out.println("\nAdding:\n"+i);
			arr[++top]=i;
		}
		else
			throw new StackFull();

	}
	public T pop() throws StackEmpty	
	{
		if(!isEmpty())
		{
			System.out.println("\nDeleted:\n"+arr[top]);
			return arr[top--];
		}
		else
			throw new StackEmpty();
	}
}
class StackTest{
	public static void main(String[] args) {
		Integer p[]={1,2,3,4,5};
		Integer f[]={0,0,0,0,0,0,0,0};
		Employee i[]=new Employee[10];
		 i[0]=new Employee("Adi",7,1010101010);
		 i[1]=new Employee("Chetan",8,20010001);
		 i[2]=new Employee("Adesh",9,100);
		Stack<Employee> s=new Stack<>(i);
		try{
		for(int k=0;k<3;k++)
			{
				s.push(i[k]);
				try {
					Thread.sleep(10);
				}
				catch(InterruptedException ex)
				{
					ex.toString();
				}
			}
		}
	catch(StackFull ex)
	{
		System.out.println(ex);
	}
	try{
		for(int k=0;k<3;k++)
			s.pop();
		
	}
	catch(StackEmpty ex)
	{
		System.out.println(ex);
	}
	}
}
