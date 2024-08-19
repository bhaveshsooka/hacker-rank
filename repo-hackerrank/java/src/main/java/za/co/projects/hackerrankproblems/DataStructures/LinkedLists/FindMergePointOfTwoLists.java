package DataStructures.LinkedLists;

public class FindMergePointOfTwoLists
{
	int FindMergeNode(Node headA, Node headB)
	{
		// Complete this function
		// Do not write the main method.
		int headALen = 0, headBLen = 0;
		Node headAcopy = headA, headBcopy = headB;
		while (headAcopy != null)
		{
			headAcopy = headAcopy.next;
			headALen++;
		}
		while (headBcopy != null)
		{
			headBcopy = headBcopy.next;
			headBLen++;
		}
		while (headALen > headBLen)
		{
			headA = headA.next;
			headALen--;
		}
		while (headBLen > headALen)
		{
			headB = headB.next;
			headBLen--;
		}
		while (headA != null)
		{
			if (headA == headB)
			{
				return headA.data;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return -1;
	}
}
