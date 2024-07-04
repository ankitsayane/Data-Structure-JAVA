package queue;

import java.util.Scanner;

public class CircularQueueTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Size of Queue - ");
		CircularQueue q = new CircularQueue(sc.nextInt());
		int choice;
		do {
			System.out.println("1. Enqueue  2. Dequeue  3. Print Queue  4. Exit");
			System.out.print("Enter your choice - ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter String value - ");
				q.add(sc.next());
				break;
			case 2:
				System.out.println("Element Removed - "+q.remove());
				break;
			case 3:
				System.out.println(q.toString());
				break;
			}

		} while (choice != 4);

		sc.close();
	}

}
