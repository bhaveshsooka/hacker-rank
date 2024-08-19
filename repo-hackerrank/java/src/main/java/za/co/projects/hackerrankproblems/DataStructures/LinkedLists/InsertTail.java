package DataStructures.LinkedLists;

public class InsertTail
{
	Node Insert(Node head, int data)
	{
		// This is a "method-only" submission.
		// You only need to complete this method.
		if (head == null)
		{
			head = new Node();
			head.data = data;
			return head;
		}

		Node tmp = head;
		while (tmp.next != null)
		{
			tmp = tmp.next;
		}
		tmp.next = new Node();
		tmp.next.data = data;
		return head;
	}
}
