public class spiral
{
	public static void main(String args[])
	{
		int k=3;
		String s="3435335";
		char max=' ',temp;
		int index=0;
		for(int j=0;j<k;j++)
		{
			for(int i=s.length()-1;i>j;i--)
				if(s.charAt(i)>max)
				{
					max=s.charAt(i);
					index=i;
				}
			temp=s.charAt(j);
			s=s.substring(0,index)+temp+s.substring(index+1);
			s=s.substring(0,j)+max+s.substring(j+1);
			max=0;
		}
		System.out.println(s);
	}
}
/*
inp k=4
str="1238567"->8231567->8731562->8761532->8765132
out=8765132

k=3
sttr=3435335
o=5543333

k=1
st=3435335
o=5435333
*/