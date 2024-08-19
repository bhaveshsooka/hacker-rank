package Algorithms.Warmup;

import java.util.Scanner;

public class SimpleArraySum
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		in.nextLine();
		String[] Array = in.nextLine().split(" ");
		int sum = 0;
		for (int i = 0; i < Array.length; i++)
		{
			int value = Integer.parseInt(Array[i]);
			sum += value;
		}
		System.out.println(sum);

		in.close();
	}
}
