package Algorithms.Implementation;

import java.util.Scanner;

public class BonAppetit
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int ActaulCost = 0;
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			int c = in.nextInt();
			if(i != k)
				ActaulCost += c;
		}
		
		int ChargedoAnna = in.nextInt();
		if(ActaulCost/2 == ChargedoAnna)
			System.out.println("Bon Appetit");
		else
			System.out.println((ChargedoAnna - ActaulCost/2));
		
		in.close();
	}
}
