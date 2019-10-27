import java.util.*;
class Swap{
	public <T>void swap(T[] a,int i,int j)
	{
		T temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}


}
class Driver{
	public static void main(String[] args) {
		Integer b[]={1,2,3,4,5};
		Double c[]={1.1,2.2,3.3,4.4,5.5};
		//for(int i=0;i<10;i++)
		//b[i]=i;	
		Swap s=new Swap();
		s.swap(b,1,4);
		s.swap(c,1,2);
		System.out.println("Array is");
		for (Integer t:b)
			System.out.println(t);
		System.out.println("Array is");
		for (Double t:c)
			System.out.println(t);
	}
}