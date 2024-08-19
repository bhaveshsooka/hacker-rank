package DataStructures.LinkedLists;

public class DeleteDuplicateNodes
{
	Node RemoveDuplicates(Node head)
	{
		if (head == null)
			return head;

		Node i = head;
		while (i.next != null)
		{
			Node j = i.next;
			if(i.data == j.data)
			{
				i.next = j.next;
			}
			else
			{
				i = i.next;
			}
		}
		return head;
	}
}
