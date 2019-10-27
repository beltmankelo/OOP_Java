import java.io.*;
import java.util.*;
class Phone{
	String brand;
	int mcap;
	interface Callable{
	void makeAudioCall(String cno);
	void makeVideoCall(String cno);
	}
}
 class BasicPhone extends Phone implements Phone.Callable{
	BasicPhone()
	{
		this.brand="Adi";
		this.mcap=0;
	}
	BasicPhone(String b,int mc)
	{
		this.brand=b;
		this.mcap=mc;
	}
	public void makeAudioCall(String cn)
	{
		System.out.println("The brand is"+brand+"\nThe maximum capacity is"+mcap+"\nThe Cell number is"+cn);
	}
	public void makeVideoCall(String cn)
	{
		System.out.println("The brand is"+brand+"\nThe maximum capacity is"+mcap+"\nThe Cell number of Video is"+cn);
	}


}
class SmartPhone extends BasicPhone implements Phone.Callable{
	SmartPhone()
	{
		this.brand="Adi";
		this.mcap=0;
	}
	SmartPhone(String b,int mc)
	{
		this.brand=b;
		this.mcap=mc;
	}
	public void makeAudioCall(String cn)
	{
		System.out.println("The brand is"+brand+"\nThe maximum capacity is"+mcap+"\nThe Cell number is"+cn);
	}
	public void makeVideoCall(String cn)
	{
		System.out.println("The brand is"+brand+"\nThe maximum capacity is"+mcap+"\nThe Cell number of Video is"+cn);
	}
}
class Phonen{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter information");
		String a=sc.nextLine();
		int p=sc.nextInt();
		SmartPhone ph=new SmartPhone(a,p);
		System.out.println("Phone number");
		a=sc.next();
		ph.makeAudioCall(a);
		ph.makeVideoCall(a);
		System.out.println("Enter information");
		a=sc.next();
		p=sc.nextInt();
		BasicPhone bp=new BasicPhone(a,p);
		System.out.println("Phone number");
		a=sc.next();
		bp.makeAudioCall(a);
		bp.makeVideoCall(a);
	}
}