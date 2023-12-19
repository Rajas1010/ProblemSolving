import java.util.*;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique
{
	public static void main(String args[])
	{
		String s="aabbcc";
		 int[] freq = new int[26]; // Create an array to store character frequencies
        
        for (char c : s.toCharArray()) {
			//System.out.println(c);
            freq[c - 'a']++; // Count the frequency of each character
			//System.out.println(freq[c - 'a']);
        }
        //
        Arrays.sort(freq); // Sort frequencies in ascending order
        System.out.println(Arrays.toString(freq));
        int del = 0; // Initialize the deletion count
        
        for (int i = 24; i >= 0; i--) 
		{
			System.out.println("freq i i+1 :  "+i+"  "+freq[i]+"   "+freq[i+1]);
            if (freq[i] == 0) break; // No more characters with this frequency
            if (freq[i] >= freq[i + 1]) 
			{
                int prev = freq[i];
				System.out.println("prev  :  "+prev);
                freq[i] = Math.max(0, freq[i + 1] - 1);
				System.out.println("freq[i]  :  "+freq[i]);
                del += prev - freq[i]; // Update the deletion count
				System.out.println("del :  "+del);
            }
			System.out.println(Arrays.toString(freq));
        }
		System.out.println(del);
	}
}