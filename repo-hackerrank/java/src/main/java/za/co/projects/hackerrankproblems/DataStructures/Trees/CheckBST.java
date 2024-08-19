package DataStructures.Trees;

import java.util.ArrayList;

public class CheckBST
{
	static ArrayList<Node> inOrderList = new ArrayList<Node>();
	static boolean checkBST(Node root)
	{
		if(root == null)
			return true;
		inOrder(root);
		
		for (int i = 1; i < inOrderList.size(); i++)
		{
			if(inOrderList.get(i-1).data >= inOrderList.get(i).data)
				return false;
		}
		return true;
	}
	
	static void inOrder(Node root)
	{
		if (root != null)
		{
			inOrder(root.left);
			inOrderList.add(root);
			inOrder(root.right);
		}
	}
}
