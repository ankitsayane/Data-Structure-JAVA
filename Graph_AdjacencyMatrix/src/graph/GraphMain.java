package graph;

import java.util.Scanner;

public class GraphMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of vertices - ");
		int vc = sc.nextInt();
		
		GraphAdjacencyMatrix g = new GraphAdjacencyMatrix(vc);
		
		g.accept(sc);
		g.display();
		
		sc.close();
	}

}
