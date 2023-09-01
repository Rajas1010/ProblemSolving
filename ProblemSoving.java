import java.util.*;
import java.util.stream.*;
import java.math.*;

public class ProblemSoving
{
	public static void main(String args[])
	{
		//System.out.println(isNumericPalindrome(-121)); 
		//
		//System.out.println(Arrays.toString(arrayPlusOne(new int[]{9,8,9})));
		//
		//System.out.println(Arrays.toString(arrayPlusOne(new int[]{9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9})));
		//
		//System.out.println(Arrays.toString(twoSum(new int[]{3,2,6,8,9,6,5}, 7)));
		//
		//System.out.println(romanToInt("MCMXCVIII"));
		//
		//System.out.println(isValidParentheses("()[]{}"));
		
	}
	
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
	
	
	public static int[] arrayPlusOne(int[] digits)
	{    
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
	
	
	public static int[] twoSum(int[] nums, int target) 
	{
        var result = new int[2];
        int step = 1;
        int i = 0;
        while (i < nums.length) 
		{
            if (step + i >= nums.length) 
			{
                step++;
                i = 0;
                continue;
            } 
			else if (nums[i] + nums[step + i] == target) 
			{
                result[0] = i;
                result[1] = i + step;
                break;
            }
            i++;
        }
        return result;
    }
	
	public static int romanToInt(String s) 
	{
        int num=0, ans=0;
        int length=s.length();
        for(int i=length-1;i>=0;i--)
        {
            switch(s.charAt(i))
            {
                case 'I': num=1;break;
                case 'V': num=5;break;
                case 'X': num=10;break;
                case 'L': num=50;break;
                case 'C': num=100;break;
                case 'D': num=500;break;
                case 'M': num=1000;break;
            }
            if(4*num<ans)
                ans-=num;
            else
                ans+=num;
        }
        return ans;
    }
	
	
	public static boolean isValidParentheses(String s) 
	{
        if (s.length() % 2 != 0)
			return false;
	
		char[] stack = new char[s.length()];
		int top = -1;
		for (int i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[')
				stack[++top] = c;
			else if (top == -1)
				return false; 
			else if (c == ')' && stack[top--] != '(')
				return false;
			else if (c == '}' && stack[top--] != '{')
				return false;
			else if (c == ']' && stack[top--] != '[')
				return false;
		}
    return top == -1;
    }
}