public class ChangeCase
{
	public static void main(String args[])
	{
		String s="tRaytuGFT";
		for(int i=0;i<s.length();i++)
			if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90) System.out.println((char)((int)s.charAt(i)+32));
			else if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122) System.out.println((char)((int)s.charAt(i)-32));
	}
}