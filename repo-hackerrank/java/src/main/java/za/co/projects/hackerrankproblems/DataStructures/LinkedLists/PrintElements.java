package DataStructures.LinkedLists;

class Node
{
	int		data;
	Node	next;
	Node	prev;
}

public class PrintElements
{
	void Print(Node head)
	{
		while (head != null)
		{
			System.out.println(head.data);
			head = head.next;
		}

	}
}
