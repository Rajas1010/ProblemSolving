import java.util.*;
public class NumericPalindrome 
{
    public static boolean isNumericPalindrome(int n) 
	{
        int reverse = 0;
        int temp = n;
        while (temp != 0) 
		{
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return n == reverse && n>=0;
    }
    public static void main(String[] args) 
	{
        System.out.println(isNumericPalindrome(-121)); 
    }
}
