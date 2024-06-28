package com.tester;

import com.operations.DoublyLinkedList;
import com.operations.LinkedList;

public class Tester {

	public static void main(String[] args) {
		LinkedList a = new DoublyLinkedList();
		
		a.insertAtFront(2);
		a.insertAtFront(6);
		a.insertAtRear(10);
		a.insertAtFront(1);
		a.deleteFromRear();
		a.show();
		a.insertAtRear(20);
		a.show();
		a.insertAtRear(30);
		a.deleteFromFront();
		a.deleteFromRear();
		a.show();

	}

}
