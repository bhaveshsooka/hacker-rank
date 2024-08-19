package Algorithms.Implementation;

import java.util.Scanner;

public class GridSearch
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++)
		{
			int R = in.nextInt();
			int C = in.nextInt();
			String G[] = new String[R];
			for (int G_i = 0; G_i < R; G_i++)
			{
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String P[] = new String[r];
			for (int P_i = 0; P_i < r; P_i++)
			{
				P[P_i] = in.next();
			}
			int count = 0;
			boolean result = false;
			for (int k = 0; k <= R - r; k++)
			{
				int end = c;
				int start = 0;
				while (end <= C)
				{
					if (G[k].substring(start, end).equals(P[0]))
					{
						for (int i = 1; i < r; i++)
						{
							if (G[k + i].substring(start, end).equals(P[i]))
								count++;
							if (count == r - 1)
								result = true;
						}
					}
					count = 0;
					end++;
					start++;
				}
			}
			if (result)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		in.close();
	}

}