package Algorithms.Implementation;

import java.util.Scanner;

public class UtopianTree
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++)
		{
			int n = in.nextInt();
			int result = 1;
			boolean spring = true;
			while (n > 0)
			{
				if (spring)
					result *= 2;
				else
					result += 1;
				spring = !spring;
				n -= 1;
			}
			System.out.println(result);
		}

		in.close();
	}
}
