
import java.io.*;
import java.util.Scanner;

class Comma
{
	int c=0;
	Scanner sc=new Scanner(System.in);
	String s=new String();
	void accept()
	{
		System.out.println("Input String");
		s=sc.next();
	}
	void putcomma()
	{
		int i,j;
		int [] k =new int[s.length()];
		for(j=0,i=s.length()-1;i>=0;i--,j++)
		{
			if(i==s.length())
				;
			else if((j+1)%3==0&&i!=0)
			{
				k[c]=i;
				c++;
     		}
     	}
     	String snew=new String();
     	for(i=0,j=c;i<s.length();i++)
     		{
     			if(j>0)
     			{ 
     				if(i==k[j-1])
     					{
     						snew+=",";
     						j--;
     					}
     			}
                snew+=s.charAt(i);
      			
     	   	}
     	System.out.println("The string is "+snew);

	}

}
class Com
{
	public static void main(String[] args) 
	{
		Comma c=new Comma();
		c.accept();
		c.putcomma();
	}
}
		