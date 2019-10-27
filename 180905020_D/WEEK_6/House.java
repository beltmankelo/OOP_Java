package com.course.structure;
import java.io.*;
import java.util.Scanner;
public class House extends Building{
	int nbe,nba;
	House()
	{
		nbe=nba=3;
	}
	void set()
	{
		super.set();
		System.out.println("Enter the number of bedrooms and bath for the house");
		this.nbe=sc.nextInt();
		this.nba=sc.nextInt();
	}
	public int getnbe()
	{
		return this.nbe;
	}
	public int getnba()
	{
		return this.nba;
	}
}