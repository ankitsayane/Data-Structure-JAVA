package dijkstra;

import java.util.Arrays;
import java.util.Scanner;

public class DijkstraSPT {
	private final int INF = 9999;
	private int vertexCount;
	private int edgeCount;
	private int[][] adjMat;

	public DijkstraSPT(int vertexCount) {
		edgeCount = 0;
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
	
	//	DIJKSTRA'S SPT IMPLEMENTATION
	public void dijkstraSPT(int root, int vert) {
		int count = 0;
		
		//dist of all vertices initialize to INF
		int[] dist = new int[vertexCount];
		Arrays.fill(dist, INF);
		//make parent of all vertices to -1
		int[] parent = new int[vertexCount];
		Arrays.fill(parent, -1);
		//initialize no of vertex added to spt
		boolean[] spt = new boolean[vertexCount];
		Arrays.fill(spt, false);
		
		//make starting vertex is 0
		dist[root] = 0;
		while(count != vertexCount) {
			// pick vertex with minimum key
			int u = getMin(dist, spt);
			// add it into spt
			spt[u] = true;
			count++;
			// update the dist for its neighbour
			for (int v = 0; v < vertexCount; v++) {
				if(adjMat[u][v] != INF && !spt[v] && dist[u] + adjMat[u][v] < dist[v]) {
					dist[v] = dist[u]+adjMat[u][v];
					parent[v] = u;
				}
			}
		}
		for (int i = 0; i < vertexCount; i++) {
			System.out.println("Dist of "+i+" from "+root+" = "+dist[i]);
		}
		int v = vert;
		int total = 0;
		while(v != 0) {
			System.out.println(parent[v]+" --> "+v);
			total = total + getWeight(parent[v], v);
			v = parent[v];
		}
		System.out.println("Shortest Distance "+total);
	}

	private int getMin(int[] dist, boolean[] spt) {
		int minKey = INF, minVert = -1;
		for (int v = 0; v < vertexCount; v++) {
			if(!spt[v] && dist[v] < minKey) {
				minKey = dist[v];
				minVert = v;
			}
		}
		return minVert;
	}
	
	//get weight of SPT
	public int getWeight(int src, int dest) {
		if(src == -1 && dest == -1) {
			return 0;
		}
		return adjMat[src][dest];
	}
}
