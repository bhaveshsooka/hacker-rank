package DataStructures.LinkedLists;

public class CycleDetection
{
	boolean hasCycle(Node head)
	{
		// Complete this function
		// Do not write the main method
		Node fast = head;
		Node slow = head;
		while (fast != null)
		{
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
			{
				return true;
			}
		}
		return false;
	}
}
