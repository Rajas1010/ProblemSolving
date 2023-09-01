import java.util.*;
import java.util.stream.*;
import java.math.*;

public class ArrayPlusOne
{
	public static void main(String args[])
	{
		//int a[]={9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
		//int a[]={8,9,9,9};
		int a[]={9,8,9};
		System.out.println(Arrays.toString(ArrayPlusOne.logic(a)));
		//System.out.println(a.length);
		/*String s=Arrays.toString(a);
		s=s.replaceAll("[, \\[\\]]","");
		BigInteger bi=new BigInteger(s);
		bi=bi.add(BigInteger.ONE);
		s=String.valueOf(bi);		
		int h[]=Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(h));
		*/
	}
	public static int[] logic(int[] digits)
	{
		//int h[]=Arrays.stream(String.valueOf(new BigInteger(Arrays.toString(x).replaceAll("[, \\[\\]]","")).add(BigInteger.ONE)).split("")).mapToInt(Integer::parseInt).toArray();
		//return h;
		
    
       for (int i = digits.length - 1; i >= 0; i--) 
	   {
			if (digits[i] < 9) 
			{
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
  

	}
}