package Algorithms.Implementation;

import java.util.Scanner;

public class AbsolutePermutation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int x, c;
		for (int a0 = 0; a0 < t; a0++)
		{
			int n = in.nextInt();
			int k = in.nextInt();
			if (k == 0)
			{
				for (int i = 1; i <= n; i++)
				{
					System.out.print(i + " ");
				}
			}
			else if (n % (k * 2) == 0)
			{
				x = 0;
				c = 0;
				for (int i = 1; i <= n; i++)
				{
					if (c % k == 0)
					{
						x++;
					}
					if (x % 2 != 0)
					{
						System.out.print((i + k) + " ");
					}
					else
					{
						System.out.print((i - k) + " ");
					}
					c++;
				}
			}
			else
			{
				System.out.print("-1");
			}
			System.out.println();
		}
		
		in.close();
	}
}
