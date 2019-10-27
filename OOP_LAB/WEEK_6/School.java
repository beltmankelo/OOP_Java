package com.course.structure;
import java.io.*;
import java.util.Scanner;
	public class School extends House{
	int noc;
	String gl;
	public School()
	{
		noc=18;
		gl="Elementary";
	}
	public void set()
	{
		super.set();
		System.out.println("Enter the number of classrooms and grade");
		this.noc=sc.nextInt();
		this.gl=sc.next();

	}
	public int getnoc()
	{
		return this.noc;
	}
	public String get()
	{
		return this.gl;
	}
}

