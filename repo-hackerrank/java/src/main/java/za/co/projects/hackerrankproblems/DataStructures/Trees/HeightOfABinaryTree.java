package DataStructures.Trees;

public class HeightOfABinaryTree
{
	static int getHeight(Node root)
	{
		// Write your code here
		if (root == null)
			return -1;

		int lefth = getHeight(root.left);
		int righth = getHeight(root.right);

		if (lefth > righth)
			return lefth + 1;
		else
			return righth + 1;
	}
}
