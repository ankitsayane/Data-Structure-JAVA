package weightedgraph;

import java.util.Scanner;

public class AdjMatrixGraph {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of vertices - ");
		int v = sc.nextInt();
		WeightedGraphMatrix g = new WeightedGraphMatrix(v);
		g.accept(sc);
		g.display();
		
		sc.close();
	}

}
