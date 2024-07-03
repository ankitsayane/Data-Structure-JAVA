package bfsdfs;

import java.util.Scanner;

public class BFStester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of vertices - ");
		int vc = sc.nextInt();
		
		BFSNonWeightedGraph g = new BFSNonWeightedGraph(vc);
		
		g.accept(sc);
		g.display();
		g.bfs(0);
		g.dfs(0);
		System.out.println("Connected Graph - "+g.isConnected());
		g.dfsSpanningTree(0);
		g.bfsSpanningTree(0);
		sc.close();
		
//		Enter no. of vertices - 6
//		Enter no. of edges - 7
//		0 1
//		0 2
//		0 3
//		1 2
//		1 4
//		3 4
//		3 5
//		0	1	1	1	0	0	
//		1	0	1	0	1	0	
//		1	1	0	0	0	0	
//		1	0	0	0	1	1	
//		0	1	0	1	0	0	
//		0	0	0	1	0	0	
//		BFS : 
//		0, 1, 2, 3, 4, 5, 
//		DFS : 
//		0, 3, 5, 4, 2, 1, 
//		DFS Spanning Tree : 
//			0 --> 1
//			0 --> 2
//			0 --> 3
//			3 --> 4
//			3 --> 5
//		BFS : 
//			0 --> 1
//			0 --> 2
//			0 --> 3
//			1 --> 4
//			3 --> 5

	}

}
