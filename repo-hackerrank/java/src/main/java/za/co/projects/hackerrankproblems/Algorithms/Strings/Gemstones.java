package Algorithms.Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine());
		String s = in.nextLine();
		Set<Character> set = StrtoSet(s);

		for (int i = 1; i < n; i++)
		{
			s = in.nextLine();
			set.retainAll(StrtoSet(s));
		}

		System.out.println(set.size());
		in.close();
	}

	public static Set<Character> StrtoSet(String s)
	{
		Set<Character> ss = new HashSet<Character>(s.length());
		for (char c : s.toCharArray())
			ss.add(c);
		return ss;
	}
}
