package Algorithms.Implementation;

import java.util.Scanner;

public class ModifiedKaprekarNumbers
{
	static boolean CheckKaprekarNumber(long n)
	{
		if (n == 1)
			return true;
		//int d = String.valueOf(n).length();
		long SquareN = (long) Math.pow(n, 2);
		if (String.valueOf(SquareN).length() == 1)
			return false;
		
		
		long r;
		long l;
		long length = String.valueOf(SquareN).length();
		
		if (length % 2 == 0)
		{
			r = (long) (SquareN / Math.pow(10, length / 2));
			l = SquareN - (r * (long) (Math.pow(10, length / 2)));
		}
		else
		{
			long temp = (long) length / 2;
			r = (long) (SquareN / Math.pow(10, temp + 1));
			l = SquareN - (r * (long) (Math.pow(10, temp + 1)));
		}
		// System.out.println(SquareN + " " + l + " " + r);
		long test = 0;
		if (r == 0)
			return false;

		test = r + l;

		return test == n;
	}

	public static void main(String[] args)
	{
		String res = "";

		Scanner in = new Scanner(System.in);

		long p = in.nextInt();
		long q = in.nextInt();
		for (long i = p; i <= q; i++)
		{
			if (CheckKaprekarNumber(i))
				res += i + " ";
		}
		if (res.equals(""))
			System.out.println("INVALID RANGE");
		else
			System.out.println(res.trim());
		
		in.close();
	}
}
