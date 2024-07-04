package prims;

import java.util.Scanner;

public class PrimsTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of vertices - ");
		int v = sc.nextInt();
		PrimsMST g = new PrimsMST(v);
		g.accept(sc);
		g.display();
		g.primsMst(0);
		sc.close();

	}

}
//
//Enter no. of vertices - 9
//Enter no. of edges - 14
//Enter [src] [dest], Weight- 7 6 1
//Enter [src] [dest], Weight- 8 2 2
//Enter [src] [dest], Weight- 6 5 2
//Enter [src] [dest], Weight- 0 1 4
//Enter [src] [dest], Weight- 2 5 4
//Enter [src] [dest], Weight- 8 6 6
//Enter [src] [dest], Weight- 2 3 7
//Enter [src] [dest], Weight- 7 8 7
//Enter [src] [dest], Weight- 0 7 8
//Enter [src] [dest], Weight- 1 2 8
//Enter [src] [dest], Weight- 3 4 9
//Enter [src] [dest], Weight- 5 4 10
//Enter [src] [dest], Weight- 1 7 8
//Enter [src] [dest], Weight- 3 5 14
//x	4	x	x	x	x	x	8	x	
//4	x	8	x	x	x	x	8	x	
//x	8	x	7	x	4	x	x	2	
//x	x	7	x	9	14	x	x	x	
//x	x	x	9	x	10	x	x	x	
//x	x	4	14	10	x	2	x	x	
//x	x	x	x	x	2	x	1	6	
//8	8	x	x	x	x	1	x	7	
//x	x	2	x	x	x	6	7	x	
//-1 --> 0
//0 --> 1
//1 --> 2
//2 --> 3
//3 --> 4
//2 --> 5
//5 --> 6
//6 --> 7
//2 --> 8

