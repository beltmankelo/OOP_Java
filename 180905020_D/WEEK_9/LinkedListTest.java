import java.util.*;
class List<T>{
	T node;
	List<T> list;
	List(T node)
	{
		this.node=node;
	}
	void setlist(List<T> l)
	{
		list=l;
	}
	T getnode()
	{
		return node;
	}
	List<T> getlist()
	{
		return list;
	}

}
class Link<T>{
List<T> first=null;
void insert(List<T> node){
	node.setlist(first);
	first=node;
}
void remove()
{
	if(first.getnode()!=null)
		first=first.getlist();
	else
		first=null;
}
void disp(List<T> node)
{
	System.out.println("Value is:"+node.getnode());
	if(node.getlist()!=null)
		disp(node.getlist());
}
void display()
{
	disp(first);
}

}
class LinkedListTest{
	public static void main(String[] args) {
		Link<Double> i=new Link<>();
		i.insert(new List<Double>(1.0));
		i.insert(new List<Double>(2.0));
		i.insert(new List<Double>(4.30));
		i.display();
		i.remove();
		System.out.println("Removing");
		i.display();
	}
}