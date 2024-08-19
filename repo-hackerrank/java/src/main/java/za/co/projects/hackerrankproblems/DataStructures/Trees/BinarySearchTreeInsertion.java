package DataStructures.Trees;

public class BinarySearchTreeInsertion
{
	static Node Insert(Node root, int value)
	{
		Node n = new Node();
		n.data = value;
		
		Node y = null;
		Node x = root;
		while (x != null)
		{
			y = x;
			if (n.data < x.data)
				x = x.left;
			else
				x = x.right;
		}
		if (y == null)
			return n;
		else if(value < y.data)
		{
			y.left = n;
			return root;
		}
		else
		{
			y.right = n;
			return root;
		}
	}
}
