package DataStructures.Trees;

import java.util.ArrayList;

public class LevelOrderTraversal
{
	void LevelOrder(Node root)
    {
		ArrayList<Node> q = new ArrayList<Node>();
		if (root != null)
			q.add(root);
		while(!q.isEmpty())
		{
			System.out.print(q.get(0).data + " ");
			
			if(q.get(0).left != null)
				q.add(q.get(0).left);
			if(q.get(0).right != null)
				q.add(q.get(0).right);
			q.remove(0);
		}
    }
}
