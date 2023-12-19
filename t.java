import java.util.*;

public class t
{
	public static void main(String args[])
	{
		/*String s="SanPandiAssert";
		for(int i=0;i<s.length();i++)
		{
			if((int)s.charAt(i)>=65&&(int)s.charAt(i)<=90)
			{
				System.out.println("");
				System.out.print((char)((int)s.charAt(i)+32));
			}
			
			if((int)s.charAt(i)>=97&&(int)s.charAt(i)<=122)
			{
				System.out.print((char)((int)s.charAt(i)-32));
			}
		}
		*/
		
		/*int a[]={2,8,9,7,4,2};
		int c=0;
		boolean b=true;
		//System.out.println(a.length);
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					b=false;
					break;
				}	
//System.out.println(i);
//System.out.println(j);				
				
			}
			if(b) c++;
			b=true;
		}
		if(a[0]==a[a.length-1]) c++;
		System.out.println(c);
		*/
		
		/*
		int a[]={2,4,9,7,11,13,25,31,6,8,10,24};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1) sum+=a[i];
		}
		System.out.println(sum);*/
		/*
		int a[]={13,10,9,6,21,15,14};
		int c=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) c++;
			}
		}
		System.out.println(c);*/
				String a[]={"13","10","9","6","21","15","14"};
				String b[]={"13","10","9","6"};
				int c=0;
				for(int i=0;i<b.length;i++)
				{
					for(int j=0;j<a.length;j++)
					{
						if(b[i].equals(a[j]))
							c++;
					}
				}
				System.out.println(c);

	}
}