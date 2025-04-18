package com.stack;

import java.util.Scanner;

import com.operations.Stack;
import com.operations.StackOperations;

public class StackTester {
	public static <T> void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Stack<T> stack = new StackOperations<T>();
			int choice;
			T ele;
			
			do {
				System.out.println("1. Push\n"
						+ "2. Pop\n"
						+ "3. Peek\n"
						+ "4. Show\n"
						+ "5. Exit");
				System.out.print("Enter your choice - ");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.print("Enter element - ");
					ele = (T) sc.next();
					stack.push(ele);
					break;
				case 2:
					stack.pop();
					break;
				case 3:
					ele = stack.peek();
					System.out.println("Top element = "+ele);
					break;
				case 4:
					stack.show();
					break;
				}
				
			}while(choice!=5);
		}
	}
}
