package com.tester;

import java.util.Scanner;

import com.operations.LinkedListQueue;
import com.operations.Queue;

public class QueueLinkedList {

	public static <A> void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Queue<A> list = new LinkedListQueue<A>();
			int choice;
			A data;
			do {
				System.out.println("1. Add to Queue\n"
						+ "2. Remove from Queue\n"
						+ "3. Display Queue\n"
						+ "4. Exit");
				System.out.print("Enter your choice - ");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.print("Enter node data - ");
					data = (A) sc.next();
					list.enQueue(data);
					break;
				case 2:
					list.deQueue();
					break;
				case 3:
					list.show();
					break;
				}

			} while (choice != 4);

		}
	}
}
