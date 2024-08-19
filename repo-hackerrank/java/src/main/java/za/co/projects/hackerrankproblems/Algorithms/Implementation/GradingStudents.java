package Algorithms.Implementation;

import java.util.Scanner;

public class GradingStudents
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++)
		{
			int grade = in.nextInt();
			
			if(grade < 38)
				System.out.println(grade);
			else
			{
				int next = ((grade / 5) + 1) * 5;
				if(next - grade < 3)
					System.out.println(next);
				else
					System.out.println(grade);
			}
		}
		
		in.close();
	}
}
