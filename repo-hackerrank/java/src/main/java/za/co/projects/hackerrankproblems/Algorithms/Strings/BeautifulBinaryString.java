package Algorithms.Strings;

import java.util.Scanner;

public class BeautifulBinaryString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		in.nextInt();
		String B = in.next();
		int count = 0;
		while(B.contains("010"))
		{
			B = replace(B, B.indexOf("010"), "011");
			count++;
			//System.out.println("String is:" + B);
		}
		System.out.println(count);
		in.close();
	}
	
	static String replace(String str, int pos, String replacement)
	{
		StringBuilder output = new StringBuilder(str);
		output.replace(pos, pos + replacement.length(), replacement);
		return output.toString();
	}
}
