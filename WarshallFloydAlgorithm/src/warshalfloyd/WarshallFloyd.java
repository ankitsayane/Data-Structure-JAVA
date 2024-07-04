package warshalfloyd;

import java.util.Scanner;

public class WarshallFloyd {
	private final int INF = 9999;
	private int vertexCount;
	private int edgeCount;
	private int[][] adjMat;

	public WarshallFloyd(int vertexCount) {
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

	public void warshallFloyd() {
		// set initial dist matrix same as adjMat
		int[][] dist = new int[vertexCount][vertexCount];
		for (int s = 0; s < vertexCount; s++) {
			for (int d = 0; d < vertexCount; d++) {
				dist[s][d] = adjMat[s][d];
			}
			dist[s][s] = 0;
		}

		// consider i vertex in between s and d and find optimal path between s and d.
		for (int i = 0; i < vertexCount; i++) {
			for (int s = 0; s < vertexCount; s++) {
				for (int d = 0; d < dist.length; d++) {
					if (dist[s][i] != INF && dist[i][d] != INF && dist[s][i] + dist[i][d] < dist[s][d]) {
						dist[s][d] = dist[s][i] + dist[i][d];
					}
				}
			}
		}
		System.out.println("------------------------");
		for (int i = 0; i < vertexCount; i++) {
			for (int j = 0; j < vertexCount; j++) {
				if (dist[i][j] == INF) {
					System.out.print("x\t");
				} else {
					System.out.print(dist[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

}
