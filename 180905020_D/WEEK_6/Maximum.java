package p1;

import java.io.*;

import java.util.*;

public class Maximum{
	public int max(int x,int y, int z)
	{
		if(x>y)
			if(x>z)
				return z;
			else 
				 return x;
		else if(y>z)
			return y;
		else 
			return z;
		
	}
	public float max(float x, float y, float z){
	if(x>y)
			if(x>z)
				return z;
			else 
				 return x;
		else if(y>z)
			return y;
		else 
			return z;


	}
	int max(int []a,int n)
	{
		int big=a[0];
		int i;
		for(i=1;i<n;i++)
			if(a[i]>big)
				big=a[i];
		return big;
	}
	int max (int [][]a)
	{
		int big=a[0][0];
		for(int []i:a)
			for(int j:i)
				if(j>big)
					big=j;
		return big;

	}
}
