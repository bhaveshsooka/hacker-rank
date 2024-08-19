package DataStructures.LinkedLists;

public class CompareTwoLinkedLists
{
	int CompareLists(Node headA, Node headB)
	{
		// This is a "method-only" submission.
		// You only need to complete this method
		if(headA.data != headB.data)
			return 0;
		while(headA.next != null || headB.next != null)
		{
			headA = headA.next;
			headB = headB.next;
			
			if(headA != null && headB == null)
				return 0;
			if(headA == null && headB != null)
				return 0;
			if(headA.data != headB.data)
				return 0;
		}
		return 1;

	}
}
