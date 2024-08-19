package DataStructures.LinkedLists;

public class PrintInReverse
{

	void ReversePrint(Node head)
	{
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node node = head;
		StringBuilder s = new StringBuilder();
		while (node != null)
		{
			s.insert(0, Integer.toString(node.data) + '\n');
			node = node.next;
		}
		System.out.print(s);
	}
}
