package com.operations;

public class Tester {

	public static void main(String[] args) {
		LinkedList a = new CircularLinkedList();
		
		a.insertionAtFront(20);
		a.insertionAtFront(15);
		a.insertionAtFront(40);
		a.insertionAtEnd(25);
		a.display();
//		a.deleteFromFront();
		a.display();
//		a.remove(15);
//		a.deleteFromEnd();
		a.display();
		a.sort();
		a.display();
	}

}
