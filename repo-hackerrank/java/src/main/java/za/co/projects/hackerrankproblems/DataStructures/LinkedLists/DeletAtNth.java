package DataStructures.LinkedLists;

public class DeletAtNth
{
	Node Delete(Node head, int position)
	{
		Node node = head;
		if (position == 0)
		{
			head = head.next;
			return head;
		}
		else
		{
			while (--position > 0)
			{
				node = node.next;
			}
			node.next = node.next.next;
			return head;
		}
	}
}
