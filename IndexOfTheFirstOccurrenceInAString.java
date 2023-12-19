import java.math.*;
public class IndexOfTheFirstOccurrenceInAString
{
	public static void main(String args[])
	{
		String h="1010";
		String n="1011";
		System.out.println(strStr(h,n));
	}
	 public static int strStr(String h, String n) {
     /*   if(h.length()<n.length())
            return -1;
        else if(h.length()==n.length())
        {
            if(h.equals(n))
                return 0;
            else
                return -1;
        }
        else
        {
            int j=0;
            for(int i=0;i<h.length();i++)//2
            {
				System.out.println(h.charAt(i)+"  "+n.charAt(j)+"  "+Integer.toString(j)+"  "+Integer.toString(n.length()-1));
                if(n.charAt(j)==h.charAt(i) && j<=n.length()-1)//c==c && 0=0, l==l &&1=1, d==d&2=2
                {
					System.out.println("if"+i);
                    if(j==n.length()-1)
                    {
                        return i-j;
                    }
                    j++;//1
                }
                else{
					System.out.println(i);
					i=i-j;
                    j=0;
					
                }
            }
        }
        return -1;*/
		
		BigInteger n1=new BigInteger(h,2);
       BigInteger n2=new BigInteger(n,2);
	   System.out.println(n1);
	   System.out.println(n2);
	   System.out.println(n1.add(n2).toString(2));
	  
	   return 0;
	   //🗹 ✓ ✔ 🗸 270
	   1F5F8
	   215C
    }
}