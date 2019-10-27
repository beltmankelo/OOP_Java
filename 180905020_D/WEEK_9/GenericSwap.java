import java.util.*
class Swap{
	T []a=new T[10]
	Swap(T []b)
	{
		a=b;
	}
	public <T>void swap(int i,int j)
	{
		T temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
class Driver{
	public static void main(String[] args) {
		<Integer>b=new <Integer>[10];
		for(i=0;i<10;i++)
		b[i]=i;	
		Swap s=new Swap(<Integer> b);
		s.swap(1,2);
	}
}