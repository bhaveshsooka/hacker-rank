package Algorithms.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TwoCharacters
{
	public static boolean repetetions(String s)
	{
		if (s.matches(".*(.)\\1.*"))
			return true;
		else
			return false;
	}

	public static ArrayList<String> pairs(ArrayList<Character> characters2)
	{
		ArrayList<String> pairs = new ArrayList<String>();
		for (int i = 0; i < characters2.size(); i++)
		{
			for (int j = i + 1; j < characters2.size(); j++)
			{
				pairs.add(characters2.get(i) + "" + characters2.get(j) + "");
			}
		}
		return pairs;

	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();

		int max = 0;
		if (length == 0)
		{
			max = 0;
		}
		String s = scan.next();
		char[] input = s.toCharArray();
		Set<Character> characters = new HashSet<>();
		for (int i = 0; i < input.length; i++)
		{
			characters.add(input[i]);
		}
		ArrayList<Character> characters2 = new ArrayList<Character>();
		characters2.addAll(characters);
		characters.clear();
		ArrayList<String> pairsab = pairs(characters2);
		// System.out.println(pairsab);

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < pairsab.size(); i++)
		{
			String pattern = "[^" + pairsab.get(i).charAt(0) + pairsab.get(i).charAt(1) + "]";
			String temp = new String();
			temp = s;
			temp = temp.replaceAll(pattern, "");
			if (repetetions(temp))
			{
				// Do Nothing
			}
			else
			{
				map.put(pairsab.get(i), temp.length());
			}
		}
		for (String string : map.keySet())
		{
			if (map.get(string) > max)
			{
				max = map.get(string);
			}
		}
		System.out.println(max);
		scan.close();

	}
}
