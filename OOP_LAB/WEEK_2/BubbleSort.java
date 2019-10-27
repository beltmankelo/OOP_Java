import java.io.* ;
import java.util.Scanner ;

class BubbleSort
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
        System.out.println("Please enter A-Ascending or D-Descending");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
        	case ('A'):
               bubblesa(a,n);
               break;
            case ('D'):
                bubblesd(a,n);
                break;
        }
        //bubbles(a,n);
	}
	public static void bubblesd(int[] a,int n)
	{		
		int i,j;
		for(i=0;i<n-1;i++)
			for(j=0;j<n-1-i;j++)
				if (a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
		System.out.println("The sorted descending array is: ");
        for(i=0;i<n;i++)
        {
        	System.out.println(a[i]);
        }
    }
    public static void bubblesa(int[] a,int n)
    {
        int i,j;    
        for(i=0;i<n-1;i++)
			for(j=0;j<n-1-i;j++)
				if (a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				} 
		System.out.println("The sorted ascending array is: ");
        for(i=0;i<n;i++)
        {
        	System.out.println(a[i]);
        }
	}
}