package Algorithms.Implementation;

import java.util.Scanner;

public class StrangeCounter
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		long t = in.nextLong();
		long val = 3;
		while (t > val)
		{
			val =( 2 * val) + 3;
		}
		val += 1 - t;
		System.out.println(val);

		in.close();
	}
}
