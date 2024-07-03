package adjListWeightedGraph;

import java.util.Scanner;

import adjListNonWeightedGraph.AdjListGraphImpl;

public class AdjListWGMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of vertices - ");
		int v = sc.nextInt();
		AdjListWeightedGraph g = new AdjListWeightedGraph(v);
		g.accept(sc);
		g.display();

		sc.close();

	}

}
