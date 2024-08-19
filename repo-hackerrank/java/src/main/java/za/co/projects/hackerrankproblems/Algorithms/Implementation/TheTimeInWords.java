package Algorithms.Implementation;

import java.util.Scanner;

public class TheTimeInWords
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();

		if (m == 0)
			System.out.println(numberToWord(h) + " o' clock");
		else if(m >= 1 && m <= 14 || m >= 16 && m <= 29)
			if(m ==1)
				System.out.println(numberToWord(m) + " minute past " + numberToWord(h));
			else
				System.out.println(numberToWord(m) + " minutes past " + numberToWord(h));
		else if (m == 15)
			System.out.println("quarter past " + numberToWord(h));
		else if(m == 30)
			System.out.println("half past " + numberToWord(h));
		else if(m >= 31 && m <= 44 || m >= 46 && m <= 59)
			if(m ==59)
				System.out.println(numberToWord(60 - m) + " minute to " + numberToWord(h+1));
			else
				System.out.println(numberToWord(60 - m) + " minutes to " + numberToWord(h+1));
		else if(m == 45)
			System.out.println("quarter to " + numberToWord(h+1));
		else
			System.out.println(numberToWord(h+1) + " o' clock");
		
		in.close();
	}

	public static String numberToWord(int num)
	{
		String out = "";
		String ones[] = { " ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen" };
		String tens[] = { " ", " ", " twenty", " thirty", " fourty", " fifty", " sixty", " seventy", " eighty", " ninety" };
		if (num > 19)
			out = tens[num / 10] + " " + ones[num % 10];
		else
			out = ones[num];
		return out.trim().replaceAll("  ", " ");
	}
}
