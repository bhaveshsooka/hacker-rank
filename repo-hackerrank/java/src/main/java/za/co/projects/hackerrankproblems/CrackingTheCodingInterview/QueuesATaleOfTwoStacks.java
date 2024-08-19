package CrackingTheCodingInterview;

import java.util.Scanner;
import java.util.Stack;

public class QueuesATaleOfTwoStacks
{
	public static class MyQueue<T>
	{
		Stack<T>	stackNewestOnTop	= new Stack<T>();
		Stack<T>	stackOldestOnTop	= new Stack<T>();

		public void enqueue(T value)
		{ // Push onto newest stack
			stackNewestOnTop.add(value);
		}

		public T peek()
		{
			if(stackOldestOnTop.isEmpty())
				moveStack(stackNewestOnTop, stackOldestOnTop);
			return stackOldestOnTop.firstElement();
		}

		public T dequeue()
		{
			if(stackOldestOnTop.isEmpty())
				moveStack(stackNewestOnTop, stackOldestOnTop);
			T elem = stackOldestOnTop.remove(0);
			return elem;
		}
		
		private void moveStack(Stack<T> source, Stack<T> destination)
		{
			for (int i = 0; i < source.size(); i++)
			{
				destination.add(source.get(i));
			}
			source.clear();
		}
	}

	public static void main(String[] args)
	{
		MyQueue<Integer> queue = new MyQueue<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++)
		{
			int operation = scan.nextInt();
			if (operation == 1)
			{ // enqueue
				queue.enqueue(scan.nextInt());
			}
			else if (operation == 2)
			{ // dequeue
				queue.dequeue();
			}
			else if (operation == 3)
			{ // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}

}
