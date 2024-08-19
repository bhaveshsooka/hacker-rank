package ProjectEuler;

import java.util.Scanner;

public class LargestPrimeFactor
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++)
		{
			long n = in.nextLong();
			
			for (int i = 2; i <= Math.sqrt(n);)
			{
				if (n % i == 0)
				{
					n /= i;
					i = 2;
				}

				else
					++i;
			}
			System.out.println(n);
		}

		in.close();
	}
}
