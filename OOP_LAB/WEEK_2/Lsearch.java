import java.io.* ;
import java.util.Scanner ;

class Lsearch
{
	public static void main(String[] args) 
	{
		int a[]= new int[30];
        int i;
        Scanner sc= new Scanner (System.in);
        System.out.println("Please enter number of elements of the array");
        int n=sc.nextInt();
        System.out.println("Please enter the elements of the array");
        for(i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to find");
        int f=sc.nextInt();
        int b=ls(a,n,f);
        if (b!=0)
          System.out.println("The element is at position "+(b+1));
        else 
          System.out.println("The element was not found");      
        }
        public static int ls(int []a,int n, int f)
        {
          int i;
          for(i=0;i<n;i++)
           {
                if(f==a[i])
                        return i;
           } 
        
          return 0;
        }
}
