package Stats10Days;

import java.util.Scanner;

public class Day04GeometricDistributionI
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		String[] ratio = in.nextLine().split(" ");
		int i = in.nextInt();

		double p = Double.parseDouble(ratio[0]) / Double.parseDouble(ratio[1]);
		double q = 1 - p;

		double res = Math.pow(q, i-1);
		res *= p;

		System.out.printf("%.3f", res);

		in.close();
	}
}
