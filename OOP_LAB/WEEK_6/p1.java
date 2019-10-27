package p1;

import java.io.*;

import java.util.*;

class Maximum{
	int max(int x,int y, int z)
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
	float max(float x, float y, float z){
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
	int max (int [][]a,int m, int n)
	{
		int big=a[0][0];
		int i,j;
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				if(a[i][j]>big)
					big=a[i][j];
		return big;

	}
}
