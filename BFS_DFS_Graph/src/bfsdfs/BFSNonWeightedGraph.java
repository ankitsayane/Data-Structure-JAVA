package bfsdfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BFSNonWeightedGraph {

		private int vertCount;
		private int edgeCount;
		private int[][] adjMat;
		
		public BFSNonWeightedGraph(int vertCount) {
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
		
		public void bfs(int start) {
			System.out.println("BFS : ");
			boolean[] marked = new boolean[vertCount];
			Queue<Integer> q = new LinkedList<>();
			q.offer(start);
			marked[start] = true;
			while(!q.isEmpty()) {
				int trav = q.poll();
				System.out.print(trav + ", ");
				for (int dest = 0; dest < vertCount; dest++) {
					if(adjMat[trav][dest] != 0 && !marked[dest]) {
						q.offer(dest);
						marked[dest] = true;
					}
				}
			}
			System.out.println();
		}
		
		public void dfs(int start) {
			System.out.println("DFS : ");
			boolean[] marked = new boolean[vertCount];
			Stack<Integer> s = new Stack<>();
			s.push(start);
			marked[start] = true;
			while(!s.isEmpty()) {
				int trav = s.pop();
				System.out.print(trav + ", ");
				for (int dest = 0; dest < vertCount; dest++) {
					if(adjMat[trav][dest] != 0 && !marked[dest]) {
						s.push(dest);
						marked[dest] = true;
					}
				}
			}
			System.out.println();
		}
		
		public boolean isConnected() {
			int start = 0, count =0;
			System.out.println("DFS : ");
			boolean[] marked = new boolean[vertCount];
			Stack<Integer> s = new Stack<>();
			s.push(start);
			count++;
			marked[start] = true;
			while(!s.isEmpty()) {
				int trav = s.pop();
				for (int dest = 0; dest < vertCount; dest++) {
					if(adjMat[trav][dest] != 0 && !marked[dest]) {
						s.push(dest);
						marked[dest] = true;
						count++;
						if(count == vertCount) {
							return true;
						}
					}
				}
			}
			return false;
		}
		
		public void dfsSpanningTree(int start) {
			System.out.println("DFS Spanning Tree : ");
			boolean[] marked = new boolean[vertCount];
			Stack<Integer> s = new Stack<>();
			s.push(start);
			marked[start] = true;
			while(!s.isEmpty()) {
				int trav = s.pop();
				for (int dest = 0; dest < vertCount; dest++) {
					if(adjMat[trav][dest] != 0 && !marked[dest]) {
						s.push(dest);
						marked[dest] = true;
						System.out.println(trav + " --> "+dest);
					}
				}
			}
			System.out.println();
		}
		
		public void bfsSpanningTree(int root) {
			System.out.println("BFS : ");
			boolean[] marked = new boolean[vertCount];
			Queue<Integer> q = new LinkedList<>();
			q.offer(root);
			marked[root] = true;
			while(!q.isEmpty()) {
				int trav = q.poll();
				for (int dest = 0; dest < vertCount; dest++) {
					if(adjMat[trav][dest] != 0 && !marked[dest]) {
						q.offer(dest);
						marked[dest] = true;
						System.out.println(trav + " --> "+dest);
					}
				}
			}
			System.out.println();
		}

}
