package Algorithms.Strings;

import java.util.Scanner;

public class CaesarCipher
{
	public static void main(String[] args)
	{
		String lCase = "abcdefghijklmnopqrstuvwxyz";
		String uCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		Scanner in = new Scanner(System.in);
		in.nextInt();
		String s = in.next();
		int k = in.nextInt();

		for (char c : s.toCharArray())
		{
			int plaintext = -1;
			String list = "";
			if (lCase.contains(String.valueOf(c)))
			{
				plaintext = Lookup(c, lCase);
				list = lCase;
			}
			else if(uCase.contains(String.valueOf(c)))
			{
				plaintext = Lookup(c, uCase);
				list = uCase;
			}
			else
			{
				System.out.print(c);
				continue;
			}
			
			int ciphertext = (plaintext + k) % 26;
			
			char Cipher = list.charAt(ciphertext);
			System.out.print(Cipher);
		}

		in.close();
	}

	static int Lookup(char key, String list)
	{
		for (char c : list.toCharArray())
			if (key == c)
				return list.indexOf(c);
		return -1;
	}
}
