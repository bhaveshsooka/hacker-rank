package Stats10Days;

import java.util.Scanner;

public class Day05PoissonDistributionI
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		double e = Math.E;
		double lamba = Double.parseDouble(in.nextLine());
		int k = Integer.parseInt(in.nextLine());

		double res = (Math.pow(lamba, k) * Math.pow(e, lamba * -1)) / factorial(k);
		System.out.printf("%.3f", res);

		in.close();
	}

	static double factorial(int n)
	{
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		return factorial(n - 1) * n;
	}
}
