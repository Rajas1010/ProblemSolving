import java.util.*;

public class ReorganizeString
{
	public static void main(String args[])
	{
		String s="blflxll";
		  String a[]=s.split("");
        String b[]=s.split("");
        ArrayList<String> l=new ArrayList<String>();
        Arrays.sort(a);
       // Arrays.sort(b,Collections.reverseOrder());
        int j=a.length-1;
        for(int i=0;i<a.length/2;i++)
        {
            l.add(a[i]);
			System.out.println(l.get(l.size()-1));
			System.out.println(a[j]);
            if(l.get(l.size()-1).equals(a[j])) {
			System.out.println("***");
break;			
			}
            else
                l.add(a[j]);
            j--;
        }
        if(s.length()%2==1) 
		{
			if(l.get(l.size()-1).equals(a[j])) l.add(0,a[j]);
			else l.add(a[j]);
		}
        String t="";
       for(String x:l)
       {
           t+=x;
       }
    System.out.println(t);

	}
}