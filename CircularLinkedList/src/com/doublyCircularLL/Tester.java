package com.doublyCircularLL;

public class Tester {

	public static void main(String[] args) {
		DoublyLinkedList a = new CircularDoublyLL();
		a.addAtRear(12);
		a.addAtRear(15);
		a.addAtRear(10);
//		a.deleteFromFront();
//		a.deleteFromRear();
		a.display();
		a.deleteFromPosition(1);
		a.display();
		a.addAtPosition(20, 2);
		a.display();
		a.addAtPosition(2, 1);
		a.display();
		a.addAtPosition(50, 5);
		a.display();

	}

}
