package com.tester;

import java.util.Scanner;

import com.operations.BinarySearchTree;

public class BSTtester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			BinarySearchTree b = new BinarySearchTree();
			int choice;
			System.out.println("1. Add Element in BST\n"
					+ "2. Height of BST\n"
					+ "3. Max and Min in BST\n"
					+ "4. Exit");
			
			do {	
				System.out.print("Enter your choice - ");
				choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					System.out.print("Enter data - ");
					b.addNode(sc.nextInt());
					break;
				case 2:
					b.height();
					break;
				case 3:
					b.maxNode();
					b.minNode();
					break;
				}

			} while (choice != 4);

		}
	}
}
