package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.Scanner;

public class StacksBalancedBrackets
{
	public static boolean isBalanced(String expression)
	{
		ArrayList<Character> Brackets = new ArrayList<Character>();
		for (int i = 0; i < expression.length(); i++)
		{
			if (expression.charAt(i) == '{' || expression.charAt(i) == '(' || expression.charAt(i) == '[')
				Brackets.add(expression.charAt(i));
			else
			{
				if(Brackets.isEmpty())
					return false;
				if(expression.charAt(i) == '}')
					if(Brackets.get(Brackets.size() - 1) == '{')
						Brackets.remove(Brackets.size() - 1);
				if(expression.charAt(i) == ')')
					if(Brackets.get(Brackets.size() - 1) == '(')
						Brackets.remove(Brackets.size() - 1);
				if(expression.charAt(i) == ']')
					if(Brackets.get(Brackets.size() - 1) == '[')
						Brackets.remove(Brackets.size() - 1);
			}
		}
		return Brackets.isEmpty();
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++)
		{
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
		in.close();
	}
}
