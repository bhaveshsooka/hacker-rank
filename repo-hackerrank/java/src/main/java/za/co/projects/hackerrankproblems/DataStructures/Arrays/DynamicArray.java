package DataStructures.Arrays;

import java.util.*;

public class DynamicArray
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[] firstLine = in.nextLine().split((" "));
		int n = Integer.parseInt(firstLine[0]);
		int q = Integer.parseInt(firstLine[1]);

		ArrayList<ArrayList<Integer>> SeqList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++)
		{
			SeqList.add(new ArrayList<Integer>());
		}

		int LastAns = 0;
		// ArrayList<Integer> S1 = new ArrayList<Integer>();

		for (int arr_i = 0; arr_i < q; arr_i++)
		{
			String[] line = in.nextLine().split(" ");
			int x = Integer.parseInt(line[1]);
			int y = Integer.parseInt(line[2]);

			if (line[0].equals("1"))
			{
				int seq = (x ^ LastAns) % n;
				SeqList.get(seq).add(y);
			}
			else
			// f(line[0].equals("2"))
			{
				int seq = (x ^ LastAns) % n;
				LastAns = SeqList.get(seq).get(y % SeqList.get(seq).size());
				System.out.println(LastAns);
			}
		}
		in.close();
	}
}