package Algorithms.Warmup;

import java.util.Scanner;

public class TimeConversion
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		String time = in.nextLine();
		int hours = Integer.parseInt(time.substring(0, 2));

		if (time.substring(time.length() - 2).equals("AM"))
		{
			if (hours == 12)
				System.out.println("00" + time.substring(2, time.length() - 2));
			else
				System.out.println(time.substring(0, time.length() - 2));
		}
		else
		{
			if (hours == 12)
				System.out.println("12" + time.substring(2, time.length() - 2));
			else
			{
				hours += 12;
				hours = hours % 24;
				if (hours < 10)
					System.out.println("0" + String.valueOf(hours) + time.substring(2, time.length() - 2));
				else
					System.out.println(String.valueOf(hours) + time.substring(2, time.length() - 2));
			}
		}

		in.close();
	}
}
