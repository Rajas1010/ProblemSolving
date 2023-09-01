public class RepeatedSubstringPattern
{
	public static void main(String args[])
	{
		String s="abab";
		System.out.println((s+s).substring(1, (s.length()*2) - 1).contains(s));
	
		
	}
}