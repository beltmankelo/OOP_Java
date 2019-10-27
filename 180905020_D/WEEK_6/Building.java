package com.course.structure;
import java.io.*;
import java.util.Scanner;
 public class Building{
	double sqf;
	int st;
	Scanner sc =new Scanner(System.in);
	Building()
	{
		this.sqf=5000.00;
		this.st=3;
	}
	void set()
	{
		System.out.println("Enter the Area and Floors for the building");
		this.sqf=sc.nextDouble();
		this.st=sc.nextInt();
	}
	public double getsqf()
	{
		return this.sqf;
	}
	public int getst()
	{
		return this.st;
	}
}
