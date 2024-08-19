package Algorithms.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class FlatlandSpaceStations
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		String[] tokens_n = in.nextLine().split(" ");
		int nCities = Integer.valueOf(tokens_n[0]);
		int mSpaceStations = Integer.valueOf(tokens_n[1]);
		String[] c_temp = in.nextLine().split(" ");
		int[] spaceStationArr = new int[c_temp.length];
		for (int i = 0; i < c_temp.length; i++)
			spaceStationArr[i] = Integer.parseInt(c_temp[i]);

		Arrays.sort(spaceStationArr);

		int maxDistance = spaceStationArr[0];

		for (int i = 1; i < spaceStationArr.length; i++)
		{

			int distance = (spaceStationArr[i] - spaceStationArr[i - 1]) / 2;

			if (distance > maxDistance)
				maxDistance = distance;
		}

		// Check the distance of last spaceStation and last city.
		int lastSpaceStationDistance = nCities - 1 - spaceStationArr[mSpaceStations - 1];
		if (lastSpaceStationDistance > maxDistance)
		{
			maxDistance = lastSpaceStationDistance;
		}

		System.out.println(maxDistance);
		
		in.close();
	}
}
