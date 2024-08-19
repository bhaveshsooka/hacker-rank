package Stats10Days;

import java.util.Scanner;

public class Day01StandardDeviation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		float mean = 0, standardDeviation = 0;
		int sum = 0;

		int n = in.nextInt();
		int[] X = new int[n];
		for (int i = 0; i < n; i++)
		{
			X[i] = in.nextInt();
			sum += X[i];
		}
		
		mean = (float) sum / (float) n;
		
		for (int i = 0; i < n; i++)
		{
			standardDeviation += Math.pow(X[i] - mean, 2);
		}
		
		standardDeviation /= n;
		standardDeviation = (float) Math.sqrt(standardDeviation);
		
		System.out.printf("%.1f", standardDeviation);

		in.close();
	}
}
