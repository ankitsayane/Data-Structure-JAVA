package adjListWeightedGraph;

import java.util.LinkedList;
import java.util.Scanner;

public class AdjListWeightedGraph {
	class Edge{
		private int src;
		private int dest;
		private int weight;
		public Edge(int src, int dest, int weight) {
			super();
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
		@Override
		public String toString() {
			return "Edge [" + src + " --> " + dest + "  (" + weight + ")]";
		}
	}
	
	private int vertCount, edgeCount;
	private LinkedList<Edge>[] adjList;

	public AdjListWeightedGraph(int vertCount) {
		this.vertCount = vertCount;
		edgeCount = 0;
		adjList = new LinkedList[vertCount];
		for (int i = 0; i < vertCount; i++) {
			adjList[i] = new LinkedList<Edge>();
		}
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter no. of edges - ");
		edgeCount = sc.nextInt();
		for (int i = 0; i < edgeCount; i++) {
			System.out.print("Enter [src] [dest]  (Weight) - ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int w = sc.nextInt();
			adjList[src].add(new Edge(src, dest, w));
			adjList[dest].add(new Edge(dest, src, w));
		}
	}
	
	public void display() {
		for(int v=0; v<vertCount; v++) {
			System.out.print("vert "+v+" : ");
			for(Edge e : adjList[v]) {
				System.out.print(e + " --> ");
			}
			System.out.println();
		}
	}

}
