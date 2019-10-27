
import java.io.*;
import java.util.*;
//import java.uil.GregorianCalendar;

class Person{
private
	String name;
	GregorianCalendar g;//=new GregorianCalendar();
public
	Person()
	{
		name="Adi";
		g=new GregorianCalendar(2000,10,02);
	}
	String getname()
	{
		return name;
	}
	int getdob()
	{
		System.out.println(g.get(Calendar.YEAR)+":"+g.get(Calendar.MONTH)+":"+g.get(Calendar.DATE));
		return 0;
	}


} 
class CollegGraduate extends Person{
private
	double cg;
	GregorianCalendar yog;
public
	
	CollegGraduate()
	{
		super();
		cg=9.8;
		yog=new GregorianCalendar(2022,05,05);
	}
	double getcg()
	{
		return cg;
	}
	int getyog()
	{
		System.out.println(yog.get(Calendar.YEAR));
		return 0;
	}
}
class Persstud extends CollegGraduate{

	public static void main(String[] args) {
		CollegGraduate ps=new CollegGraduate();
		System.out.println("Date of Birth:");
		ps.getdob();
		System.out.println("The name of the person is "+ps.getname()+" with CGPA "+ps.getcg());
		System.out.println("Year of graduate");
		ps.getyog();
	}
}
