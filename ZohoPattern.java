import java.util.*;
public class ZohoPattern
{
	public static void main(String args[])
	{	
		String s="Zohocorporationteam";
		int l=s.length()/3;
		if(s.length()%3==1)
		{
			for(int i=0;i<=l;i++)
			{
				if(i==0)
				{
					for(int j=0;j<=l;j++)
						System.out.print(s.charAt(j)+"  ");
					System.out.println("");
					System.out.println("");
				}
				
				else if(i==l)
				{
					for(int j=(l*2);j<s.length();j++)
						System.out.print(s.charAt(j)+"  ");
					System.out.println("");
				}
				
				else
				{
					for(int j=0;j<s.length()-(i*3)-1;j++)
						System.out.print(" ");
					System.out.println(s.charAt(l+i));
					System.out.println(" ");
				}
			}
		}
		else System.out.println("NO");
	}
}