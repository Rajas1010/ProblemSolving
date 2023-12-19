public class TriNumPtn
{
	public static void main(String args[])
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--) System.out.print(" ");
			for(int j=1;j<=i;j++) System.out.print(i+" ");
			System.out.println("");
		}
	}
}