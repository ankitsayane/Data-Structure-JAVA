package graph;

import java.util.Scanner;

public class GraphAdjacencyMatrix {
	private int vertCount;
	private int edgeCount;
	private int[][] adjMat;
	
	public GraphAdjacencyMatrix(int vertCount) {
		this.edgeCount = 0;
		this.vertCount = vertCount;
		this.adjMat = new int[vertCount][vertCount];
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter no. of edges - ");
		edgeCount = sc.nextInt();
		for (int i = 0; i < edgeCount; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjMat[src][dest] = 1;
			adjMat[dest][src] = 1;
		}
	}
	
	public void display() {
		for (int i = 0; i < vertCount; i++) {
			for (int j = 0; j < vertCount; j++) {
				System.out.print(adjMat[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
}
