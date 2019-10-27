import java.io.*;
import java.util.Scanner;
abstract class Figure {
	double a,b;
	abstract double area () ;

}
class Rectangle extends Figure{
	
	Rectangle()
	{
	a=5;
	b=10;
	}
	double area()
	{
	return a*b;
	}
}
class Triangle extends Figure{
	Triangle()
	{
	a=5;
	b=10;
	}
	double area()
	{
	return 0.5*a*b;
	}
}
class Square extends Figure{
	Square()
	{
	a=b=5;
	}
	double area()
	{
	return a*a;
	}
}
class Shapes{
	public static void main(String[] args) {
		Rectangle Rec=new Rectangle();
		Square Sq=new Square();
		Triangle Tri=new Triangle();
		System.out.println("Areas through normal code "+Rec.area()+" "+Sq.area()+" "+Tri.area());
		System.out.println("Areas using dynamic polymorphism");
		Figure f;
		f=new Rectangle();
		System.out.println(f.area());
		f=Sq;
		System.out.println(f.area());
		f= new Triangle();
		System.out.println(f.area());
	}
}