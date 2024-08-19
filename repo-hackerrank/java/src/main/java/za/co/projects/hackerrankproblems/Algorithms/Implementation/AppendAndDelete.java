package Algorithms.Implementation;

import java.util.Scanner;

public class AppendAndDelete
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		String s = in.next();
		String t = in.next();
		int k = in.nextInt();

		int count = 0;

		while (s.length() != 0)
		{
			if (s.equals(t))
			{
				count = k;
				break;
			}

			if (t.startsWith(s))
			{
				if (k - count == t.replace(s, "").length())
				{

					break;
				}
			}

			s = s.substring(0, s.length() - 1);
			count++;

		}

		count += t.replace(s, "").length();

		if (count == k)
		{
			System.out.println("Yes");
		}
		else if (count >= k)
		{
			System.out.println("No");
		}
		else
		{
			if (s.length() == 0)
			{
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}

		in.close();
	}
}
