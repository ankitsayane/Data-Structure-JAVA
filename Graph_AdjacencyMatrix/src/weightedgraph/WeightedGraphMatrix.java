package weightedgraph;

import java.util.Scanner;

public class WeightedGraphMatrix {
	private final int INF = 9999;
	private int vertexCount;
	private int edgeCount;
	private int[][] adjMat;

	public WeightedGraphMatrix(int vertexCount) {
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
}




