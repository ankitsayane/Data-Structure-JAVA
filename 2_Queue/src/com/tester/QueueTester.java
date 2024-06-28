package com.tester;

import java.util.Scanner;

import com.operations.Queue;
import com.operations.QueueOperations;

public class QueueTester {
	public static <T> void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
					
					Queue<T> queue = new  QueueOperations<T>();
					int choice;
					T ele;
					
					do {
						System.out.println("1. Enqueue\n"
								+ "2. Dequeue\n"
								+ "3. Show\n"
								+ "4. Exit");
						System.out.print("Enter your choice - ");
						choice = sc.nextInt();
						switch(choice) {
						case 1:
							System.out.print("Enter a element - ");
							ele =  (T) sc.next();
							queue.enQueue(ele);
							break;
						case 2:
							queue.deQueue();
							break;
						case 3:
							queue.show();
							break;
						}
						
					}while(choice != 4);
					
				}

			}

}
