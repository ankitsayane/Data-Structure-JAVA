package warshalfloyd;

import java.util.Scanner;

public class WarshallTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no of vertices = ");
		int vert = sc.nextInt();

		WarshallFloyd k = new WarshallFloyd(vert);

		k.accept(sc);
		k.display();
		k.warshallFloyd();

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
//x	x	x	-1	x	
//x	-2	x	4	3	
//x	x	x	x	3	
//x	x	x	x	x	
//------------------
//0	3	5	2	5	
//x	0	x	-1	2	
//x	-2	0	-3	0	
//x	x	x	0	3	
//x	x	x	x	0

