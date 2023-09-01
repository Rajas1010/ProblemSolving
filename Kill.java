import java.util.*;
public class Kill
{
	public static void main(String args[])
	{
		int n=100,x=n,k=50;
		/*
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=i+1;
		int j=0;
		while(n!=1)
		{
			for(int i=0;i<k;i++)
			{
				j++;
				if(a[j-1]==0)
					i--;
				if(j==x)
					j=0;
			}
			if(j==0)
				a[x-1]=0;
			else
				a[j-1]=0;
			n--;
		}
		for(int i=0;i<x;i++)
			if(a[i]!=0)
			{
				System.out.println(a[i]);
				break;
			}
			*/
			
			
			 int winner = 0;
        for (int i = 1; i <= n; i++) winner = (winner + k) % i;
		System.out.println(winner + 1);
         
	}
}