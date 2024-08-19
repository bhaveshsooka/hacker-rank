package Algorithms.Implementation;

import java.util.Scanner;

public class SaveThePrisoner
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		for (int i = 0; i < T; i++)
		{
			int N = in.nextInt();
			int M = in.nextInt();
			int S = in.nextInt();

			int ans = (M + (S - 1)) % N;
			if (ans == 0)
				ans = N;
			System.out.println(ans);
		}

		in.close();
	}
}
