package DataStructures.Trees;

public class HuffmanDecoding
{
	class Node
	{
		public int	frequency;	// the frequency of this tree
		public char	data;
		public Node	left, right;
	}

	void decode(String S, Node root)
	{
		int i = 0;
		while (i < S.length())
		{
			Node start = root;
			while (start.left != null && start.right != null)
			{
				if(S.charAt(i) == '1')
					start = start.right;
				else
					start = start.left;
				i++;
			}
			System.out.print(start.data);
		}
	}
}
