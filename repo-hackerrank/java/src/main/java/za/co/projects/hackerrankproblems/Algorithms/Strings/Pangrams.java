package Algorithms.Strings;

import java.util.Scanner;

public class Pangrams
{
	public static void main(String[] args)
	{
		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		Scanner in = new Scanner(System.in);

		String s = in.nextLine().toLowerCase();
		for (char c : s.toCharArray())
		{
			if(c == ' ')
				continue;
			String i = String.valueOf(c);
			alphabet = alphabet.replaceAll(i, "");
		}
		
		if(alphabet.equals(""))
			System.out.println("pangram");
		else
			System.out.println("not pangram");

		in.close();
	}
}
