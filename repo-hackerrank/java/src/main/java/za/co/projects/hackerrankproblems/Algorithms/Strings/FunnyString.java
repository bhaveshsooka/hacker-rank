package Algorithms.Strings;

import java.util.Scanner;

public class FunnyString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			String s = in.next();
			StringBuilder r = new StringBuilder(s).reverse();
			
			boolean funny = true;
			for (int j = 1; j < s.length(); j++)
			{
				int x = Math.abs(s.charAt(j) - s.charAt(j - 1));
				int y = Math.abs(r.charAt(j) - r.charAt(j - 1));
				//System.out.println(x + " " + y);
				if(x != y)
				{
					funny = false;
					break;
				}
			}
			if(funny)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
		}

		in.close();
	}
}
