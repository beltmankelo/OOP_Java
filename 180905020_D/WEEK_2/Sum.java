import java.io.* ;
import java.util.Scanner ;

class Sum
{
	public static void main(String[] args) 
	{
	int a[][]= new int[30][30];
        int b[][]= new int[30][30];
        int i,j;
        Scanner sc= new Scanner (System.in);
        System.out.println("Please enter the order of the square matrix for both A and B");
        int n=sc.nextInt();
        System.out.println("Please enter the elements of the array A");
        for(i=0;i<n;i++)
                for(j=0;j<n;j++)
                	a[i][j]=sc.nextInt();
        System.out.println("Please enter the elements of the array B");
        for(i=0;i<n;i++)
                for(j=0;j<n;j++)
                        b[i][j]=sc.nextInt();
        int c[][]=new int[30][30];
        c=computeSum(a,b,n);
         System.out.println("The added array is: ");
        for(i=0;i<n;i++)
                {
                 for(j=0;j<n;j++)
                    { 
                    System.out.println(c[i][j]+"\t");
                    System.out.println();
                    }
                }
        }
        public static int [][] computeSum(int [][]a,int [][]b,int n)
        {
                int i,j;
                int c[][]=new int [30][30];
                for(i=0;i<n;i++)
                {
                 for(j=0;j<n;j++)
                    { 
                     c[i][j]=a[i][j]+b[i][j];
                    }

                }
                return c;       
        }     
}
        