public class Swap2numWoUsingTempArithListArray
{
	public static void main(String args[])
	{
		int x=32,y=76;
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("x= "+x);
		System.out.println("y= "+ y);
	}
}