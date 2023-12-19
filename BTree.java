import java.util.*;
public class BTree
{
	public static void main(String args[])
	{
		Tree o=new Tree();
		System.out.print("Enter the root value : ");
		Tree.Node root=o.insert();
		System.out.println("the tree have :");
		o.pre(root);
	}
}
class Tree
{
	class Node
	{
		int data;
		Node left,right;
	}
	public Node insert()
	{
		Node newnode=new Node();
		Scanner in=new Scanner(System.in);
		int d=in.nextInt();
		if(d==-1) return null;
		newnode.data=d;
		System.out.print("enter the left of "+d+" : ");
		newnode.left=insert();
		System.out.print("enter the right of "+d+" : ");
		newnode.right=insert();
		return newnode;
	}
	public void pre(Node root)
	{
		if(root == null) return;
		else 
		{
			System.out.println(root.data);
			pre(root.left);
			pre(root.right);
		}
	}
}