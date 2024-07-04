package dijkstra;

import java.util.Scanner;

public class DijkstraTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of vertices - ");
		int v = sc.nextInt();
		DijkstraSPT g = new DijkstraSPT(v);
		g.accept(sc);
		g.display();
		System.out.println("Enter a dest vertex - ");
		g.dijkstraSPT(0, sc.nextInt());
		sc.close();

	}

}
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
//Enter a dest vertex - 
//5
//Dist of 0 from 0 = 0
//Dist of 1 from 0 = 4
//Dist of 2 from 0 = 12
//Dist of 3 from 0 = 19
//Dist of 4 from 0 = 21
//Dist of 5 from 0 = 11
//Dist of 6 from 0 = 9
//Dist of 7 from 0 = 8
//Dist of 8 from 0 = 14
//6 --> 5
//7 --> 6
//0 --> 7
//Shortest Distance 11

