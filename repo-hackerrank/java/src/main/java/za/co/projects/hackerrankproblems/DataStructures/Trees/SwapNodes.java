package DataStructures.Trees;

import java.util.Scanner;

public class SwapNodes
{
	static public class Node
	{
		int		data;
		Node	left;
		Node	right;
		int		depth;
	}

	static Node	Root;
	static int	n;

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		Root = new Node();
		Root.data = 1;
		Root.depth = 1;

		n = in.nextInt();
		for (int i = 0; i < n; i++)
		{
			Node leftnode = new Node();
			leftnode.data = in.nextInt();

			Node rightnode = new Node();
			rightnode.data = in.nextInt();

			Node CurrentNode = FindNode(Root, (i + 1));
			if (CurrentNode != null)
			{
				if (leftnode.data != -1)
				{
					CurrentNode.left = leftnode;
					leftnode.depth = GetDepth(Root, leftnode.data, 1);
					//System.out.println("node " + leftnode.data + " has depth =" + leftnode.depth);
				}
				if (rightnode.data != -1)
				{
					CurrentNode.right = rightnode;
					rightnode.depth = GetDepth(Root, rightnode.data, 1);
					//System.out.println("node " + rightnode.data + " has depth =" + rightnode.depth);
				}
			}
		}

		int MaxHeight = MaxDepth(Root);
		// System.out.println("Height = " + MaxHeight);

		int t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			int k = in.nextInt();
			int NumSwaps = 0;
			while (NumSwaps <= MaxHeight)
			{
				NumSwaps += k;
				DoSwapForLevel(Root, NumSwaps);
			}
			inOrder(Root);
			System.out.println("");
		}

		in.close();
	}

	static int MaxDepth(Node node)
	{
		if (node == null)
			return 0;
		int lDepth = MaxDepth(node.left);
		int rDepth = MaxDepth(node.right);
		return Math.max(lDepth, rDepth) + 1;
	}

	static void inOrder(Node root)
	{
		if (root != null)
		{
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	static int GetDepth(Node root, int x, int level)
	{
		if (root == null)
			return 0;
		if (root.data == x)
			return level;
		return GetDepth(root.left, x, level + 1) | GetDepth(root.right, x, level + 1);
	}

	static Node FindNode(Node root, int x)
	{
		if (root == null)
			return null;
		if (x == root.data)
			return root;
		Node r = FindNode(root.left, x);
		if (r == null)
			r = FindNode(root.right, x);
		return r;
	}

	static void DoSwapForLevel(Node root, int k)
	{
		if (root == null)
			return;
		int rootdepth = root.depth;
		if (k == rootdepth)
		{
			root = DoSwap(root);
		}
		DoSwapForLevel(root.left, k);
		DoSwapForLevel(root.right, k);
	}

	static Node DoSwap(Node x)
	{
		Node tmpleft = x.left;
		x.left = x.right;
		x.right = tmpleft;
		return x;
	}

	static void Print(Node x)
	{
		if (x != null)
		{
			try
			{
				System.out.println("Node: " + String.valueOf(x.data));
				if (x.left == null)
				{
					System.out.println("Left Child: null");
				}
				else
				{
					System.out.println("Left Child: " + String.valueOf(x.left.data));
				}

				if (x.right == null)
				{
					System.out.println("Right Child: null");
				}
				else
				{
					System.out.println("Right Child: " + String.valueOf(x.right.data));
				}

				System.out.println("");
			}
			catch (NullPointerException e)
			{
				e.printStackTrace();
			}
			Print(x.left);
			Print(x.right);
		}
	}
}
