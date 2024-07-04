package prims;

import java.util.Arrays;
import java.util.Scanner;

public class PrimsMST {
	private final int INF = 9999;
	private int vertexCount;
	private int edgeCount;
	private int[][] adjMat;

	public PrimsMST(int vertexCount) {
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
	
	//	PRIMS MST IMPLEMENTATION
	public void primsMst(int root) {
		int count = 0;
		
		//keys of all vertices initialize to INF
		int[] keys = new int[vertexCount];
		Arrays.fill(keys, INF);
		//make parent of all vertices to -1
		int[] parent = new int[vertexCount];
		Arrays.fill(parent, -1);
		//initialize no of vertex added to mst
		boolean[] mst = new boolean[vertexCount];
		Arrays.fill(mst, false);
		
		//make starting vertex is 0
		keys[root] = 0;
		while(count != vertexCount) {
			// pick vertex with minimum key
			int u = getMin(keys, mst);
			// add it into mst
			mst[u] = true;
			count++;
			// update the key for its neighbour
			for (int v = 0; v < vertexCount; v++) {
				if(adjMat[u][v] != INF && !mst[v] && adjMat[u][v] < keys[v]) {
					keys[v] = adjMat[u][v];
					parent[v] = u;
				}
			}
		}
		for (int i = 0; i < vertexCount; i++) {
			System.out.println(parent[i]+" --> "+i);
		}
	}

	private int getMin(int[] keys, boolean[] mst) {
		int minKey = INF, minVert = -1;
		for (int v = 0; v < vertexCount; v++) {
			if(!mst[v] && keys[v] < minKey) {
				minKey = keys[v];
				minVert = v;
			}
		}
		return minVert;
	}
	
	//get weight of MST
	public int getWeight(int src, int dest) {
		if(src == -1 && dest == -1) {
			return 0;
		}
		return adjMat[src][dest];
	}
}
