package DataStructures.LinkedLists;

public class InsertAtNth
{
	Node InsertNth(Node head, int data, int position)
	{
		Node node = head;
		if (position == 0)
		{
			node = new Node();
			node.data = data;
			node.next = head;
			return node;
		}
		else
		{
			while (--position > 0)
			{
				node = node.next;
			}
			Node i = node.next;
			node.next = new Node();
			node.next.data = data;
			node.next.next = i;
			return head;
		}
	}
}
