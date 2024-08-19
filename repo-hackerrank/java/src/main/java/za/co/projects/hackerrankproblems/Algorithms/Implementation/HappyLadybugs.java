package Algorithms.Implementation;

import java.util.Scanner;

public class HappyLadybugs
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt();
		for (int a0 = 0; a0 < Q; a0++)
		{
			in.nextInt();
			String b = in.next();

			int flag = 0;
			for (char j : b.toCharArray())
			{
				int total = CountCharInString(b, j);
				if (j != '_' && total == 1) // if any character other than '_'
				{				// is not paired
					flag = 1;
					break;
				}
			}
			
			if(!b.contains("_"))
			{
				for(int i = 1; i < b.length()-1; i++)
				{
					if(b.charAt(i) != b.charAt(i-1) && b.charAt(i) != b.charAt(i+1))
					{
						flag = 1;
						break;
					}
				}
			}
			
			if(flag == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		in.close();
	}

	static int CountCharInString(String str, char j)
	{
		int count = 0;
		for (char s : str.toCharArray())
		{
			if (s == j)
				count++;
		}
		return count;
	}
}
