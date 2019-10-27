import java.util.*;
interface Series{
	int getn(int y);
	void reset(int x);
	void sets(int x);
}
class ByTwos implements Series{
	int y;
	public int getn(int y)
	{
		this.y+=2;
		return this.y;
	}
	public void reset(int x)
	{
		 this.y=x;
	}
	public void sets(int x)
	{
		  this.y=x;
	}

}
class Twoser{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ByTwos b=new ByTwos();
		int ch,x,k;
		System.out.println("Enter number");
		x=sc.nextInt();
		k=x;
		b.sets(x);
		System.out.println("Enter choice:\n1-Start\n2-Reset\n3-New Number\n4-Exit");
		do{
			System.out.println("Enter choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Series");
				for(int i=0;i<10;i++)
				System.out.println(b.getn(x)-2);
				break;
				case 2:
				b.reset(k);
				break;
				case 3:
				System.out.println("Enter number");
				x=sc.nextInt();
				k=x;
				b.sets(x);
				break;
			}
		}while(ch!=4);
}
}