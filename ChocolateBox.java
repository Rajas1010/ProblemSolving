 public class ChocolateBox
 {
 	public static void main(String args[])
 	{
		//for(int i=1;i<40;i++)
		//{
			int b=5,c=14,count=0;
			int temp=b;
			if(c>b)
			{                                  //
				do                            //
				{   count++;              //1 2
					c-=b;					// c=9,9-4=5
					if(temp==b)		//t f
						b=b-1;				//4
				}while(c>=temp);        //9>5, 5>5
			}
			else
				System.out.println(c);
			if(b!=temp)
			{
				if(count%2==0)
					System.out.println(c+1);
				else
					System.out.println(temp-c);
			}
		//}
 	}
 }