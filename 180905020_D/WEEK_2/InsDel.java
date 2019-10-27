import java.io.* ;
import java.util.Scanner ;

class InsDel
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
        System.out.println("Please enter I-Inserting or D-Deleting");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
        	case ('I'):
               System.out.println("Enter which element to insert and what position");
               int f=sc.nextInt();
               int p=sc.nextInt(); 
               inserta(a,n,f,p);
               break;
            case ('D'):
                System.out.println("Enter which element position to delete"); 
                p=sc.nextInt();
                deleta(a,n,(p-1));
                break;
        }
    }
    public static void inserta(int[] a,int n, int f, int p)
    {
      int i;
      for(i=n-1;i>=p-1;i--)
      {
        a[i+1]=a[i];
      }
      a[p-1]=f;
      n++;
      System.out.println("The array is: ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void deleta(int[] a,int n,int p)
    {
      int i;
      for(i=p;i<n-1 ;i++)
      {
        a[i]=a[i+1];
      }
      
      n--;
      System.out.println("The array is: ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}    