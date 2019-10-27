import java.io.*;
import java.util.*;

class Student
{
	int r=Student.counter();
	String s=new String();
		short sem;
	float gp;
	float cg;
	GregorianCalendar g;
	static int c=0;
	final int size=2;
	void accept()
	{
		this.r-=((g.get(Calendar.YEAR)%100))*100;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter students name,Semester,GPA,CGPA and date of joining in (YYYY:MM:DD)");
		s=sc.nextLine();
		sem=(short)sc.nextInt();
		gp=sc.nextFloat();
		cg=sc.nextFloat();
		int y=sc.nextInt();
		int m=sc.nextInt();
		int d=sc.nextInt();
		g=new GregorianCalendar(y,m,d);
		this.r+=((g.get(Calendar.YEAR)%100))*100;
	}
	static int counter()
	{
		c++;
		return c;
	}
	Student()
	{
		s="Adithya";
		sem=3;
		gp=(float)9.3;
		cg=(float)9.0;
		g=new GregorianCalendar();
		this.r+=((g.get(Calendar.YEAR)%100))*100;
	}
	Student(String n,int y,int m,int d,short se,float gpa,float ca)
	{
		s=n;
		g=new GregorianCalendar(y,m,d);
		sem=se;
		gp=gpa;
		cg=ca;
		this.r+=((g.get(Calendar.YEAR)%100))*100;
	}
	void display()
	{
		System.out.println("Student records are:");
		System.out.println("\nReg no.:"+r+"\nName:"+s+"\nSem:"+sem+"\nGPA:"+gp+"\nCGPA:"+cg);
	}
	void sort1(Student [] st)
	{
				for(int i=0;i<size-1;i++)
				{
					for(int j=0;j<size-1-i;j++)
					{
						if(st[j].sem>st[j+1].sem)
						{				
								Student temp=st[j];
								st[j]=st[j+1];
								st[j+1]=temp;
						}
					}
				}
				for(int i=0;i<size-1;i++)
				{
					for(int j=0;j<size-1-i;j++)
					{
						if(st[j].sem==st[j+1].sem)
						{				
							if(st[j].cg>st[j+1].cg)
							{
								Student temp=st[j];
								st[j]=st[j+1];
								st[j+1]=temp;
							}
						}
					}
				}		
	}
	void sort2(Student  [] st)
	{
		for(int i=0;i<size-1;i++)
				{
					for(int j=0;j<size-1-i;j++)
					{
						if(st[j].s.compareTo(st[j+1].s)>0)
						{
							Student temp=st[j];
								st[j]=st[j+1];
								st[j+1]=temp;
						}

	                }

				}
	}
	void startn(Student [] st,String ch)
	{
		int i,j;
		for( i=0;i<size;i++)
		{
			if(st[i].s.startsWith(ch))
				System.out.println(st[i].s);
		}
	}
	void sub(Student []st,String str)
	{
		for(Student std:st)
		if(std.s.contains(str))
			System.out.println(std.s);
	}
	void reacc(String k)
	{
		this.s=k;
	}
	void showname(Student []st)
	{
		for(int i=size;i>0;i--)
		{
		String [] h=st[i-1].s.split(" ");
		char y=h[0].charAt(0);
		char z=h[1].charAt(0);
		String x=h[2];
		String ss=y+"."+z+"."+x;
		st[i-1].reacc(ss);

		}
	}
}


class Strings
{
	final static int sz=2;
	public static void main(String[] args) {
		char t;
		Scanner sc=new Scanner(System.in);
		Student p=new Student();
		Student q=new Student("Nayak",2018,6,12,(short)5,(float)9.9,10);
		p.display();
		q.display();
		Student[] s=new Student[sz];
		int i;
		for(i=0;i<sz;i++)
		{
			s[i]=new Student();
			s[i].accept();
		}
		System.out.println("Enter: \nS-Sort w.r.t Sem and CGPA\nO-Sort w.r.t name\nL-List start character name\nI-List substrings\nC-Change name\nD-Display\nE-Exit");
		do
		{
			System.out.println("Enter choice");
			t=sc.next().charAt(0);
			switch(t)
			{
				case 'S':
				p.sort1(s);
				break;
				case 'O':
				q.sort2(s);
				break;
				case 'L':
				System.out.println("Enter character");
				String ch=sc.next();
				q.startn(s,ch);
				break;
				case 'I':
				System.out.println("Enter String");
				String stri=sc.next();
				q.sub(s,stri);
				break;
				case 'C':
				//for(i=0;i<sz;i++)
				p.showname(s);
				break;
				case 'D':
				for(i=0;i<sz;i++)
					s[i].display();
				break;
			}

			}while(t!='E');
		}
	}
