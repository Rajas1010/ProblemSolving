import java.util.*;
public class CountingBits
{
	public static void main(String args[])
	{
		int n=15;//input
		int a[]=new int [n+1];
		for(int i=0;i<=n;i++)
			a[i]=a[i/2]+(i%2);
		System.out.println(Arrays.toString(a));
	}
}