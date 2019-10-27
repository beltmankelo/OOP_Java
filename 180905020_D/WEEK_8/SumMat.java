import java.util.Scanner;

class Row implements Runnable
{
	int x;
	int c;
	int []row=new int[10];
	int sum;
	Row(int x, int c)
	{
		this.c=c;
		this.x=x;
		sum=0;
	}
	public void run()
	{
		for(int i=0;i<c; i++)
		{
			sum+=row[i];
		}
		System.out.println("Sum of row "+x + " is "+sum);
	}
}
class SumMat
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of rows and columns: ");
		int r,c;
		Scanner in=new Scanner(System.in);
		r=in.nextInt();
		c=in.nextInt();
		int [] elem =new int[c];
		Row [] arr = new Row[r];
		Thread [] newArr =new Thread[r];
		for(int i=0;i<r;i++)
		{
			System.out.println("Enter the elements for row "+(i+1));
			arr[i]=new Row(i+1,c);
			for(int j=0;j<c;j++)
			{
				arr[i].row[j]=in.nextInt();
			}
			newArr[i]=new Thread(arr[i]);
		}
		for(int i=0;i<r;i++)
		{
			newArr[i].run();
		}

	}
}