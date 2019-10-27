import java.io.*;
import java.util.Scanner;
import com.course.structure.School;
public class Developers{
	public static void main(String[] args) {
		School s=new School();
		s.set();
		System.out.println("\n\nDetails of each building");
		System.out.println("Area:"+s.getsqf()+"\nFloors:"+s.getst()+"\nBedrooms:"+s.getnbe()+"\nBathrooms:"+s.getnba()+"\nClassrooms:"+s.getnoc()+"\nGrade:"+s.get());
	}
}