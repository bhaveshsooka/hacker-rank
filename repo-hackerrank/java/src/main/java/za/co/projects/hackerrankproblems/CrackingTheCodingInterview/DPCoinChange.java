package CrackingTheCodingInterview;

import java.util.Scanner;

public class DPCoinChange
{
	public static int makeChange(int m, int n, int[] Coinset)
	{
		if (n == 0)
			return 1;
		if (n < 0)
			return 0;
		if ((m <= 0) && (n >= 1))
			return 0;
		return makeChange(m - 1, n, Coinset) + makeChange(m, n - Coinset[m - 1], Coinset);
	}

	public static long makeChange(int[] coins, int money)
	{
		if (money == 0)
			return 1;

		long[] PossiblesForCoins = new long[money + 1];
		PossiblesForCoins[0] = 1;

		for (int coin : coins)
			for (int i = 0; i < PossiblesForCoins.length - coin; i++)
				PossiblesForCoins[i + coin] += PossiblesForCoins[i];

		return PossiblesForCoins[money];
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int coins[] = new int[m];
		for (int coins_i = 0; coins_i < m; coins_i++)
		{
			coins[coins_i] = in.nextInt();
		}
		System.out.println(makeChange(coins, n));

		in.close();
	}
}
