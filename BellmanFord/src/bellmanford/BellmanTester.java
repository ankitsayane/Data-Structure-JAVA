package bellmanford;

import java.util.Scanner;

public class BellmanTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no of vertices = ");
		int vert = sc.nextInt();

		BellmanFordImpl k = new BellmanFordImpl(vert);
		
		k.accept(sc);
		k.display();
		k.bellmanFord(0);
		
		sc.close();
	}
}

//Enter no of vertices = 5
//Enter no. of edges - 7
//Enter [src] [dest], Weight- 3 4 3
//Enter [src] [dest], Weight- 2 4 3
//Enter [src] [dest], Weight- 2 3 4
//Enter [src] [dest], Weight- 2 1 -2
//Enter [src] [dest], Weight- 1 3 -1
//Enter [src] [dest], Weight- 0 2 5
//Enter [src] [dest], Weight- 0 1 6
//x	6	5	x	x	
//6	x	-2	-1	x	
//5	-2	x	4	3	
//x	-1	4	x	3	
//x	x	3	3	x	
//Distance of vertex 0 from 0 = 0
//Distance of vertex 1 from 0 = 3
//Distance of vertex 2 from 0 = 5
//Distance of vertex 3 from 0 = 2
//Distance of vertex 4 from 0 = 5
