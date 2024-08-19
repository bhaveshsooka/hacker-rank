package CrackingTheCodingInterview;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTablesRansomNote
{
	Map<String, Integer>	magazineMap;
	Map<String, Integer>	noteMap;

	public HashTablesRansomNote(String magazine, String note)
	{
		String[] magazineWords = magazine.split(" ");
		String[] noteWords = note.split(" ");
		magazineMap = new HashMap<>();
		noteMap = new HashMap<>();

		for (String magazineWord : magazineWords)
		{
			if (magazineMap.containsKey(magazineWord))
			{
				magazineMap.put(magazineWord, magazineMap.get(magazineWord) + 1);
			}
			else
				magazineMap.put(magazineWord, 1);
		}

		for (String noteWord : noteWords)
		{
			if (noteMap.containsKey(noteWord))
			{
				noteMap.put(noteWord, noteMap.get(noteWord) + 1);
			}
			else
				noteMap.put(noteWord, 1);
		}

	}

	public boolean solve()
	{
		for (String noteWord : noteMap.keySet())
		{
			for (int i = 0; i < noteMap.get(noteWord); i++)
			{
				if (magazineMap.containsKey(noteWord) && magazineMap.get(noteWord) > 0)
				{
					magazineMap.put(noteWord, magazineMap.get(noteWord) - 1);
				}
				else
					return false;
			}

		}
		return true;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		// Eat whitespace to beginning of next line
		scanner.nextLine();

		HashTablesRansomNote s = new HashTablesRansomNote(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");
		/*
		 * ArrayList<String> mag = new ArrayList<String>();
		 * 
		 * Scanner in = new Scanner(System.in);
		 * 
		 * int m = in.nextInt(); int n = in.nextInt();
		 * 
		 * for (int i = 0; i < m; i++) { mag.add(in.next()); }
		 * 
		 * boolean failed = false; for (int i = 0; i < n; i++) { String word =
		 * in.next(); if (!mag.contains(word)) { failed = true; break; } else {
		 * mag.remove(word); } } if (failed) System.out.println("No"); else
		 * System.out.println("Yes");
		 * 
		 * in.close();
		 */
	}
}
