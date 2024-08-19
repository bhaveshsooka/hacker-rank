package DataStructures.LinkedLists;

public class ReverseDoublyLinkedList
{
	Node Reverse(Node head)
	{
		if (head == null)
			return head;

		while (head != null)
		{
			Node i = head.prev;
			head.prev = head.next;
			head.next = i;
			if (head.prev == null)
			{
				return head;
			}
			head = head.prev;
		}
		return head;
	}
}
