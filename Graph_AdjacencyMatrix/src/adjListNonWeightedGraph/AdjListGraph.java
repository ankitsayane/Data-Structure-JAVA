package adjListNonWeightedGraph;

import java.util.Scanner;

public class AdjListGraph {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of vertices - ");
		int v = sc.nextInt();
		AdjListGraphImpl g = new AdjListGraphImpl(v);
		g.accept(sc);
		g.display();
		
		sc.close();
	}

}
