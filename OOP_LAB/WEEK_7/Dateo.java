import java.io.*;
import java.util.*;
class InvalidDayException extends Exception{
	private int d;
	public InvalidDayException(int d)
	{
		this.d=d;
	}
	public int getd()
	{
		return d;
	}
}
class InvalidMonthException extends Exception{
	private int m;
	public InvalidMonthException(int m)
	{
		this.m=m;
	}
	public int getm()
	{
		return m;
	}
}

class CurrentDate {
	GregorianCalendar g;
	void createdate(int y,int m,int d) throws InvalidDayException,InvalidMonthException
	{
				if (d>31)
					throw new InvalidDayException(d);
				else if(m>12)
					throw new InvalidMonthException(m);
				else
				{
					g=new GregorianCalendar(y,m,d);
					System.out.println("Date is-----"+g.get(Calendar.YEAR)+":"+g.get(Calendar.MONTH)+":"+g.get(Calendar.DATE));
				}

	}

}
class Dateo{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		CurrentDate cd=new CurrentDate();
		int y=sc.nextInt();
		int m=sc.nextInt();
		int d=sc.nextInt();
		try{
		cd.createdate(y,m,d);
		}
		catch(InvalidDayException exc)
			{
				System.out.println("Exceeding date");
			}
		catch(InvalidMonthException ex)
			{
				System.out.println("Exceeding month");
			}
	}
}