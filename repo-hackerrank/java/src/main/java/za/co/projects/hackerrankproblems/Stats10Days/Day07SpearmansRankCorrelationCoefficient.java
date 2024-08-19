package Stats10Days;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Day07SpearmansRankCorrelationCoefficient
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		double[] X = new double[n];
		double[] Y = new double[n];
		for (int i = 0; i < n; i++)
		{
			X[i] = in.nextDouble();
		}
		for (int i = 0; i < n; i++)
		{
			Y[i] = in.nextDouble();
		}

		System.out.printf("%.3f", spearman(X, Y));

		in.close();
	}

	/* Calculates Spearman's rank correlation coefficient, */
	private static Double spearman(double[] X, double[] Y)
	{
		/* Error check */
		if (X == null || Y == null || X.length != Y.length)
		{
			return null;
		}

		/* Create Rank arrays */
		int[] rankX = getRanks(X);
		int[] rankY = getRanks(Y);

		/* Apply Spearman's formula */
		int n = X.length;
		double numerator = 0;
		for (int i = 0; i < n; i++)
		{
			numerator += Math.pow((rankX[i] - rankY[i]), 2);
		}
		numerator *= 6;
		return 1 - numerator / (n * ((n * n) - 1));
	}

	/* Returns a new array with ranks. Assumes unique array values. */
	public static int[] getRanks(double[] array)
	{
		int n = array.length;

		/* Create Pair[] and sort by values */
		Pair[] pair = new Pair[n];
		for (int i = 0; i < n; i++)
		{
			pair[i] = new Pair(i, array[i]);
		}
		Arrays.sort(pair, new PairValueComparator());

		/* Create and return ranks[] */
		int[] ranks = new int[n];
		int rank = 1;
		for (Pair p : pair)
		{
			ranks[p.index] = rank++;
		}
		return ranks;
	}

	/* A class to store 2 variables */
	public static class Pair
	{
		public final int	index;
		public final double	value;

		public Pair(int i, double v)
		{
			index = i;
			value = v;
		}
	}

	/* This lets us sort Pairs based on their value field */
	public static class PairValueComparator implements Comparator<Pair>
	{
		public int compare(Pair p1, Pair p2)
		{
			if (p1.value < p2.value)
			{
				return -1;
			}
			else if (p1.value > p2.value)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
}
