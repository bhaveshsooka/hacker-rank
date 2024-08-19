package DataStructures.LinkedLists;

public class GetNodeValue
{
	int GetNode(Node head, int n)
	{
		int count = 0;
		Node n1 = head;
		while (n1.next != null)
		{
			count++;
			n1 = n1.next;
		}

		int tofind = count - n;
		
		count = 0;
		while (count != tofind)
		{
			head = head.next;
			count++;
		}
		return head.data;
	}
}
