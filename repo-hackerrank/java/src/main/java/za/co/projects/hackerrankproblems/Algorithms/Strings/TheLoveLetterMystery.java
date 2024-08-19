package Algorithms.Strings;

import java.util.Scanner;

public class TheLoveLetterMystery
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		for (int i = 0; i < num; i++)
		{
			String st = in.next();
			int count = 0;
			for (int j = 0, k = st.length() - 1; j < st.length() / 2; j++, k--)
				count = count + Math.abs((int) (st.charAt(j) - st.charAt(k)));
			System.out.println(count);
		}

		in.close();

	}
}
