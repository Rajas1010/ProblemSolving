import java.util.*;

public class SlidingWindowMaximum
{
	public static void main(String args[])
	{
		int nums[]={7,2,4};
		int k=2;
		ArrayList<Integer> l=new ArrayList<Integer>(); 
        int t=0,temp=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(t<k)
            {
                if(temp<nums[i])
                {
                    temp=nums[i];
					System.out.println("temp "+temp);
					System.out.println("i"+i);
                }
				
				System.out.println("t "+ t);
				System.out.println("k "+k);
				t++;
            }
            else
            {
                l.add(temp);
                t=0;
                i-=(k-1);
				temp=nums[i];
            }
			System.out.println("list "+l);
        }
		l.add(temp);
		int a[]=new int[l.size()];
		for(int i=0;i<a.length;i++)
			a[i]=l.get(i);
       System.out.println(Arrays.toString(a));
	}
}