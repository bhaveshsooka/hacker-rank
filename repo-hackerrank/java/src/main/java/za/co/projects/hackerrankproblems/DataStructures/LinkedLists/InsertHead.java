package DataStructures.LinkedLists;

public class InsertHead
{
	Node Insert(Node head, int x)
	{
		if(head == null)
		{
			head = new Node();
			head.data = x;
			return head;
		}
		
		Node newNode = new Node();
		newNode.data = x;
		newNode.next = head;
		head = newNode;
		return head;
	}
}
