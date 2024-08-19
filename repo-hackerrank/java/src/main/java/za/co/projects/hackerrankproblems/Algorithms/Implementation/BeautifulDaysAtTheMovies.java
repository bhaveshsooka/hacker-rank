package Algorithms.Implementation;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		int count = 0;
		for (int x = i; x <= j; x++)
		{
			int xReversed = Integer.parseInt(Reverse(String.valueOf(x)));
			int absDifference = Math.abs(x - xReversed);
			if (absDifference % k == 0)
				count++;
		}
		System.out.println(count);
		
		in.close();
	}

	public static String Reverse(String str)
	{
		String ans = "";
		for (int i = str.length() - 1; i >= 0; i--)
		{
			ans += str.charAt(i);
		}
		return ans;
	}
}
