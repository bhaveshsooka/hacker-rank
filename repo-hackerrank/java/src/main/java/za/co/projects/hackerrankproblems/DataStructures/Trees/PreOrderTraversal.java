package DataStructures.Trees;

public class PreOrderTraversal
{
	void preOrder(Node root)
	{
		if (root != null)
		{
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
}
