package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BFSShortestReachInAGraph
{
	public static class Graph
	{
		List<List<Integer>>	adjList;
		int					size;

		public Graph(int size)
		{
			adjList = new ArrayList<>();
			this.size = size;
			while (size > 0)
			{
				adjList.add(new ArrayList<Integer>());
				size--;
			}
		}

		public void addEdge(int first, int second)
		{
			adjList.get(first).add(second);
			adjList.get(second).add(first);
		}

		public int[] shortestReach(int startId)
		{ // 0 indexed
			int[] dists = new int[size];
			Arrays.fill(dists, 999999);
			dists[startId] = 0;

			for (int i = 1; i < size; i++)
			{
				for (int u = 0; u < size; u++)
				{
					for (int v = 0; v < adjList.get(u).size(); v++)
					{
						relax(u, adjList.get(u).get(v), dists);
					}
				}
			}

			for (int i = 0; i < dists.length; i++)
			{
				if (dists[i] == 999999)
					dists[i] = -1;
			}
			return dists;
		}

		public static void relax(int u, int v, int[] distances)
		{
			if (distances[v] > distances[u] + 6)
				distances[v] = distances[u] + 6;
		}
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int queries = scanner.nextInt();

		for (int t = 0; t < queries; t++)
		{

			// Create a graph of size n where each edge weight is 6:
			Graph graph = new Graph(scanner.nextInt());
			int m = scanner.nextInt();

			// read and set edges
			for (int i = 0; i < m; i++)
			{
				int u = scanner.nextInt() - 1;
				int v = scanner.nextInt() - 1;

				// add each edge to the graph
				graph.addEdge(u, v);
			}

			// Find shortest reach from node s
			int startId = scanner.nextInt() - 1;
			int[] distances = graph.shortestReach(startId);

			for (int i = 0; i < distances.length; i++)
			{
				if (i != startId)
				{
					System.out.print(distances[i]);
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		scanner.close();
	}
}
