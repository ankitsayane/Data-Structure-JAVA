package adjListNonWeightedGraph;

import java.util.LinkedList;
import java.util.Scanner;

public class AdjListGraphImpl {
	private int vertCount, edgeCount;
	private LinkedList<Integer>[] adjList;

	public AdjListGraphImpl(int vertCount) {
		this.vertCount = vertCount;
		edgeCount = 0;
		adjList = new LinkedList[vertCount];
		for (int i = 0; i < vertCount; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter no. of edges - ");
		edgeCount = sc.nextInt();
		for (int i = 0; i < edgeCount; i++) {
			System.out.print("Enter [src] [dest] - ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjList[src].add(dest);
			adjList[dest].add(src);
		}
	}
	
	public void display() {
		for(int v=0; v<vertCount; v++) {
			System.out.print("vert "+v+" : ");
			for(int dest : adjList[v]) {
				System.out.print(dest + " --> ");
			}
			System.out.println();
		}
	}
}
