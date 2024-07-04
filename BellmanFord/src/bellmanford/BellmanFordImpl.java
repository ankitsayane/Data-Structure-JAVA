package bellmanford;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class BellmanFordImpl {
	class Edge {
		private int src;
		private int dest;
		private int weight;

		public Edge(int src, int dest, int weight) {
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "Edge [" + src + " --> " + dest + "  (" + weight + ")]";
		}
	}

	private final int INF = 9999;
	private int vertexCount;
	private int edgeCount;
	private int[][] adjMat;
	private List<Edge> edgeList;

	public BellmanFordImpl(int vertexCount) {
		edgeCount = 0;
		edgeList = new ArrayList<>();
		this.vertexCount = vertexCount;
		adjMat = new int[vertexCount][vertexCount];
		for (int i = 0; i < vertexCount; i++) {
			for (int j = 0; j < vertexCount; j++) {
				adjMat[i][j] = INF;
			}
		}
	}

	public void accept(Scanner sc) {
		System.out.print("Enter no. of edges - ");
		edgeCount = sc.nextInt();
		for (int i = 0; i < edgeCount; i++) {
			System.out.print("Enter [src] [dest], Weight- ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int w = sc.nextInt();
			adjMat[src][dest] = w;
			adjMat[dest][src] = w;
			edgeList.add(new Edge(src, dest, w));
		}
	}

	public void display() {
		for (int i = 0; i < vertexCount; i++) {
			for (int j = 0; j < vertexCount; j++) {
				if (adjMat[i][j] == INF) {
					System.out.print("x\t");
				} else {
					System.out.print(adjMat[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
	
	public void updateDistance(int[] dist) {
		for(Edge e : edgeList) {
			int u = e.src;
			int v= e.dest;
			int w = e.weight;
			if(dist[u] != INF && dist[u]+w < dist[v]) {
				dist[v] = dist[u] + w;
			}
		}
	}
	
	public boolean isNegativeCycle(int[] dist) {
		for(Edge e : edgeList) {
			int u = e.src;
			int v= e.dest;
			int w = e.weight;
			if(dist[u] != INF && dist[u]+w < dist[v]) {
				return true;
			}
		}
		return false;
	}
	
	public void bellmanFord(int root) {
		// make distance of all vertices to INFINITY
		int[] dist = new int[vertexCount];
		Arrays.fill(dist, INF);
		// make starting vertex as 0
		dist[root] = 0;
		// repeat for V-1 times
		for(int i=1; i<vertexCount; i++) {
			updateDistance(dist);
		}
		if(isNegativeCycle(dist)) {
			throw new RuntimeException("Negative weight cycle in graph");
		}
		for(int i=0; i<vertexCount; i++) {
			System.out.println("Distance of vertex "+i+" from 0 = "+dist[i]);
		}
	}
}
