package Algorithms.Implementation;

import java.util.Scanner;

public class JumpingOnTheClouds
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++)
		{
			c[c_i] = in.nextInt();
		}

		int cloud;
		int count = -1;
		for (cloud = 0; cloud < n; cloud++)
		{
			if (cloud == (n - 1))
				break;
			if ((cloud + 2 < n) && (c[cloud + 2] != 1))
				cloud++;
			count++;
		}
		if (cloud > 0)
			count++;
		System.out.println(count);

		in.close();
	}
}
