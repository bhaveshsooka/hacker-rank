package Stats10Days;

import java.util.Scanner;

public class Day00WeightedMean
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int sum = 0;
		int sumW = 0;

		int n = in.nextInt();
		int[] X = new int[n];
		for (int i = 0; i < n; i++)
		{
			X[i] = in.nextInt();
			
		}
		for (int i = 0; i < n; i++)
		{
			int w = in.nextInt();
			sum += X[i] * w;
			sumW += w;
		}
		
		float WeightedMean = (float) sum / (float) sumW;
		System.out.printf("%.1f\n", WeightedMean);

		in.close();
	}
}
