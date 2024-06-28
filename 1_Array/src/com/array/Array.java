package com.array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.print("Enter size of array - ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int pos, ele;
		int sum=0;

		do {
			System.out.println("1. Insertion at specific position\n" + "2. Deletion from specific Position\n"
					+ "3. Delete element from array\n" + "4. Even and odd\n" + "5. Sum\n"
					+ "6. Min, Max and Second-Max\n" + "7. Exit");
			System.out.print("Enter your Choice - ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter a position - ");
				pos = sc.nextInt();
				System.out.print("Enter a element - ");
				ele = sc.nextInt();
				arr = ArrayOperations.insertion(arr, pos, ele);
				ArrayOperations.printArray(arr);
				break;
			case 2:
				System.out.println("Enter a position - ");
				pos = sc.nextInt();
				arr = ArrayOperations.deletionByIndex(arr, pos);
				ArrayOperations.printArray(arr);
				break;
			case 3:
				System.out.print("Enter a element to delete - ");
				ele = sc.nextInt();
				arr = ArrayOperations.deleteElement(arr, ele);
				ArrayOperations.printArray(arr);
				break;
			case 4:
				ArrayOperations.evenOdd(arr);
				break;
			case 5:
				sum = ArrayOperations.sumation(arr);
				System.out.println("Sum of array elements - "+sum);
				break;
			case 6:
				ArrayOperations.minMax(arr);
				break;
				
			}

		} while (choice != 7);
		sc.close();
	}

}
