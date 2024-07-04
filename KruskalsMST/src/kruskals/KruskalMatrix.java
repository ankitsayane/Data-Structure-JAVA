package kruskals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KruskalMatrix {
	class Edge{
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

	public KruskalMatrix(int vertexCount) {
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
	
	//Kruskal's MST
	public void kruskalMST() {
		List<Edge> mst = new ArrayList<>();
		edgeList.sort((e1, e2)-> e1.weight - e2.weight);
		
		int i=0;
		while(mst.size() < (vertexCount - 1)) {
			Edge e = edgeList.get(i);
			i++;
			mst.add(e);
			if(unionFind(mst)) {
				mst.remove(mst.size() - 1);
			}
		}
		mst.forEach(System.out::println);
	}

	private boolean unionFind(List<Edge> edges) {
		int[] parent = new int[vertexCount];
		Arrays.fill(parent, -1);
		for(Edge e : edges) {
			int sr = find(e.src, parent);
			int dr = find(e.dest, parent);
			if (sr == dr) {
				return true;
			}
			union(sr, dr, parent);
		}
		return false;
	}

	private void union(int sr, int dr, int[] parent) {
		parent[sr] = dr;
		
	}

	private int find(int v, int[] parent) {
		while(parent[v] != -1) {
			v = parent[v];
		}
		return v;
	}
}




