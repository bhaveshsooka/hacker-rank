package DataStructures.LinkedLists;

public class ReverseLinkedList
{
	Node Reverse(Node head)
	{
		Node previous = null;
		Node Current = head;
		Node Next;
		while(Current != null)
		{
			Next = Current.next;
			Current.next = previous;
			previous = Current;
			Current = Next;
		}
		head = previous;
		return head;
	}
}
