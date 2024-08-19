package Algorithms.Implementation;

import java.util.Scanner;

public class Encryption
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		int L = s.replaceAll(" ", "").length();
		int cols = (int) Math.ceil(Math.sqrt(L));
		for (int i = 0; i < cols; i++)
		{
			int j = i;
			while (j < s.length())
			{
				System.out.print(s.substring(j, j + 1));
				j+=cols;
			}
			System.out.print(" ");
		}

		in.close();
	}
}
