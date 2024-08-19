package Algorithms.Implementation;

import java.util.Scanner;

public class BiggerIsGreater
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			String w = in.next();
			String bigger = nextPermutation(w.toCharArray());
			
			if (bigger == null)
				System.out.println("no answer");
			else
				System.out.println(bigger);
		}

		in.close();
	}

	static String nextPermutation(char[] array)
	{
		// Find longest non-increasing suffix
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i])
			i--;
		// Now i is the head index of the suffix

		// Are we at the last permutation already?
		if (i <= 0)
			return null;

		// Let array[i - 1] be the pivot
		// Find rightmost element that exceeds the pivot
		int j = array.length - 1;
		while (array[j] <= array[i - 1])
			j--;
		// Now the value array[j] will become the new pivot
		// Assertion: j >= i

		// Swap the pivot with j
		char temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;

		// Reverse the suffix
		j = array.length - 1;
		while (i < j)
		{
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}

		// Successfully computed the next permutation
		return String.valueOf(array);
	}

}
